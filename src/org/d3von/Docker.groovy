package org.d3von;

class Docker implements Serializable {

    def steps

    Docker(steps) {
        this.steps = steps
    }

    def images(){
        steps.sh(label: 'Docker list all images output', script: 'docker images', returnStdout: true)
        return this
    }
    
    def cleanUp(){
        steps.sh(label: 'Docker clean up output', script: 'docker images', returnStdout: true)
        return this
    }

    def build(){
        steps.sh(label: 'Docker build image output', script: 'docker images', returnStdout: true)
        return this
    }

    def push(){
        steps.sh(label: 'Docker push image output', script: 'docker images', returnStdout: true)
        return this
    }

    def pull(){
        steps.sh(label: 'Docker pull image output', script: 'docker pull nginx', returnStdout: true)
        return this
    }

    // def login(String username, String password, String registry){
        
    // }

}