package placement

import org.springframework.dao.DataIntegrityViolationException

class Placement_opportunityController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [placement_opportunityInstanceList: Placement_opportunity.list(params), placement_opportunityInstanceTotal: Placement_opportunity.count()]
    }

    def create() {
        [placement_opportunityInstance: new Placement_opportunity(params)]
    }

    def save() {
        def placement_opportunityInstance = new Placement_opportunity(params)
        if (!placement_opportunityInstance.save(flush: true)) {
            render(view: "create", model: [placement_opportunityInstance: placement_opportunityInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), placement_opportunityInstance.id])
        redirect(action: "show", id: placement_opportunityInstance.id)
    }

    def show() {
        def placement_opportunityInstance = Placement_opportunity.get(params.id)
        if (!placement_opportunityInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "list")
            return
        }

        [placement_opportunityInstance: placement_opportunityInstance]
    }

    def edit() {
        def placement_opportunityInstance = Placement_opportunity.get(params.id)
        if (!placement_opportunityInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "list")
            return
        }

        [placement_opportunityInstance: placement_opportunityInstance]
    }

    def update() {
        def placement_opportunityInstance = Placement_opportunity.get(params.id)
        if (!placement_opportunityInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (placement_opportunityInstance.version > version) {
                placement_opportunityInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'placement_opportunity.label', default: 'Placement_opportunity')] as Object[],
                          "Another user has updated this Placement_opportunity while you were editing")
                render(view: "edit", model: [placement_opportunityInstance: placement_opportunityInstance])
                return
            }
        }

        placement_opportunityInstance.properties = params

        if (!placement_opportunityInstance.save(flush: true)) {
            render(view: "edit", model: [placement_opportunityInstance: placement_opportunityInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), placement_opportunityInstance.id])
        redirect(action: "show", id: placement_opportunityInstance.id)
    }

    def delete() {
        def placement_opportunityInstance = Placement_opportunity.get(params.id)
        if (!placement_opportunityInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "list")
            return
        }

        try {
            placement_opportunityInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'placement_opportunity.label', default: 'Placement_opportunity'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
