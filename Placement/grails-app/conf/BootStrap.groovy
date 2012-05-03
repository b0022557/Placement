import placement.Status

class BootStrap {

    def init = { servletContext ->
        def appliedsta = new Status(code:'Applied', description:'Student has applied').save();
        def notinvitesta = new Status(code:'Not invited for interview', description:'Student has not been invited for an interview').save();
        def invitesta = new Status(code:'Invited for Interview', description:'Student has been invited for an interview').save();
        def notoffsta = new Status(code:'Not Offered', description:'Student has not been offered a place').save();
        def offsta = new Status(code:'Offered', description:'Student has been offered a place').save();
        def acceptsta = new Status(code:'Accepted', description:'Student has accepted a placement').save();
        def rejectsta = new Status(code:'Rejected', description:'Student has rejected a placement').save();


    }
    def destroy = {
    }
}
