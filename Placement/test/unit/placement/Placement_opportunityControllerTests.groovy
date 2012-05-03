package placement



import org.junit.*
import grails.test.mixin.*

@TestFor(Placement_opportunityController)
@Mock(Placement_opportunity)
class Placement_opportunityControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/placement_opportunity/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.placement_opportunityInstanceList.size() == 0
        assert model.placement_opportunityInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.placement_opportunityInstance != null
    }

    void testSave() {
        controller.save()

        assert model.placement_opportunityInstance != null
        assert view == '/placement_opportunity/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/placement_opportunity/show/1'
        assert controller.flash.message != null
        assert Placement_opportunity.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/placement_opportunity/list'


        populateValidParams(params)
        def placement_opportunity = new Placement_opportunity(params)

        assert placement_opportunity.save() != null

        params.id = placement_opportunity.id

        def model = controller.show()

        assert model.placement_opportunityInstance == placement_opportunity
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/placement_opportunity/list'


        populateValidParams(params)
        def placement_opportunity = new Placement_opportunity(params)

        assert placement_opportunity.save() != null

        params.id = placement_opportunity.id

        def model = controller.edit()

        assert model.placement_opportunityInstance == placement_opportunity
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/placement_opportunity/list'

        response.reset()


        populateValidParams(params)
        def placement_opportunity = new Placement_opportunity(params)

        assert placement_opportunity.save() != null

        // test invalid parameters in update
        params.id = placement_opportunity.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/placement_opportunity/edit"
        assert model.placement_opportunityInstance != null

        placement_opportunity.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/placement_opportunity/show/$placement_opportunity.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        placement_opportunity.clearErrors()

        populateValidParams(params)
        params.id = placement_opportunity.id
        params.version = -1
        controller.update()

        assert view == "/placement_opportunity/edit"
        assert model.placement_opportunityInstance != null
        assert model.placement_opportunityInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/placement_opportunity/list'

        response.reset()

        populateValidParams(params)
        def placement_opportunity = new Placement_opportunity(params)

        assert placement_opportunity.save() != null
        assert Placement_opportunity.count() == 1

        params.id = placement_opportunity.id

        controller.delete()

        assert Placement_opportunity.count() == 0
        assert Placement_opportunity.get(placement_opportunity.id) == null
        assert response.redirectedUrl == '/placement_opportunity/list'
    }
}
