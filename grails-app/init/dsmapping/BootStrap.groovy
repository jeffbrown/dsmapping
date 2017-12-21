package dsmapping

class BootStrap {

    def init = { servletContext ->
        new Person(name: 'DS1').save()
    }

    def destroy = {
    }
}
