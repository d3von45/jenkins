import org.d3von.Docker

def call(){
    def docker = new org.d3von.Docker(this)
    docker.images().push().cleanUp().pull()
}