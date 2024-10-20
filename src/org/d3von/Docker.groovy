package org.d3von;

class Docker implements Serializable {

    def steps

    Docker(steps) {
        this.steps = steps
    }

    def images(){
        final String outputs = steps.sh(label: 'Docker list all images output', script: 'docker images', returnStdout: true)
        print outputs
        steps.echo outputs
        print "hello world!"
        return this
    }
    
    def cleanUp(){
        final String outputs = steps.sh(label: 'Docker clean up output', script: 'docker images', returnStdout: true)
        print outputs
        return this
    }

    def build(){
        final String outputs = steps.sh(label: 'Docker build image output', script: 'docker images', returnStdout: true)
        print outputs
        return this
    }

    def push(){
        final String outputs = steps.sh(label: 'Docker push image output', script: 'docker images', returnStdout: true)
        print outputs
        return this
    }

    def pull(){
        final String outputs = steps.sh(label: 'Docker pull image output', script: 'docker pull nginx', returnStdout: true)
        print outputs
        return this
    }

    // def login(String username, String password, String registry){
        
    // }

}