package org.d3von;

class Docker extends PipelineBase {

    def steps

    Docker(steps) {
        this.steps = steps
    }

    def images(){
        sh(label: 'Docker list all images output', script: 'docker images', returnStdout: true)
        return this
    }
    
    def cleanUp(){
        sh(label: 'Docker clean up output', script: 'docker images', returnStdout: true)
        return this
    }

    def build(){
        sh(label: 'Docker build image output', script: 'docker images', returnStdout: true)
        return this
    }

    def push(){
        sh(label: 'Docker push image output', script: 'docker images', returnStdout: true)
        return this
    }

    def pull(){
        steps.sh(label: 'Docker pull image output', script: 'docker pull nginx', returnStdout: true)
        return this
    }

    // def login(String username, String password, String registry){
        
    // }

}