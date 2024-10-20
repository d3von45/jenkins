package org.d3von;

class Docker extends PipelineBase {

    Docker(steps) {
        super(steps)
    }

    def images(){
        this.sh(label: 'Docker list all images output', script: 'docker images', returnStdout: true)
        return this
    }
    
    def cleanUp(){
        this.sh(label: 'Docker clean up output', script: 'docker images', returnStdout: true)
        return this
    }

    def build(){
        this.sh(label: 'Docker build image output', script: 'docker images', returnStdout: true)
        return this
    }

    def push(){
        this.sh(label: 'Docker push image output', script: 'docker images', returnStdout: true)
        return this
    }

    def pull(){
        this.sh(label: 'Docker pull image output', script: 'docker pull nginx', returnStdout: true)
        return this
    }

    // def login(String username, String password, String registry){
        
    // }

}