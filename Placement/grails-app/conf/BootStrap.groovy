import placement.Status
import placement.Student
import placement.Placement_opportunity

class BootStrap {

    def init = { servletContext ->
        def appliedsta = new Status(code:'Applied', description:'Student has applied').save();
        def notinvitesta = new Status(code:'Not invited for interview', description:'Student has not been invited for an interview').save();
        def invitesta = new Status(code:'Invited for Interview', description:'Student has been invited for an interview').save();
        def notoffsta = new Status(code:'Not Offered', description:'Student has not been offered a place').save();
        def offsta = new Status(code:'Offered', description:'Student has been offered a place').save();
        def acceptsta = new Status(code:'Accepted', description:'Student has accepted a placement').save();
        def rejectsta = new Status(code:'Rejected', description:'Student has rejected a placement').save();


        def johnstu = new Student(applications:'1', course_code:'3456',name:'John Smith', notes:'Job within home living area ').save();
        def hannahstu = new Student(applications:'4', course_code:'3091',name:'Hannah Proctor', notes:'').save();
        def amystu = new Student(applications:'2', course_code:'3091',name:'Amy Harris', notes:'Job within home living area ').save();
        def matthewstu = new Student(applications:'3', course_code:'3091',name:'Matthew Jackson', notes:' ').save();
        def stevestu = new Student(applications:'1', course_code:'3456',name:'Steve Jones', notes:' ').save();

        def cyber1place = new Placement_opportunity(applications:'3',company_name:'Cyber Computers', job_title:'Support Analyst',status:'Open').save();
        def JTtechplace = new Placement_opportunity(applications:'1',company_name:'JT Technology', job_title:'Technician',status:'Open').save();
        def cyber2place = new Placement_opportunity(applications:'10',company_name:'Cyber Computers', job_title:'Database Administrator',status:'Closed').save();
        def capitalsolplace = new Placement_opportunity(applications:'5',company_name:'Capital Solutions', job_title:'Software Engineer',status:'Open').save();
        def eazytechplace = new Placement_opportunity(applications:'8',company_name:'Eazy Tech', job_title:'Technician',status:'Closed').save();

    }
    def destroy = {
    }
}
