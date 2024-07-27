package org.d3von;

class Docker implements Serializable {

    def steps

    Docker(steps) {
        this.steps = steps
    }

    def images(){
        return steps.sh("docker images")
    }
    
    def cleanUp(){
        return steps.sh("docker rmi -f \$(docker images -aq) && docker system prune -f")
    }

    def build(String path, String imageName, String tag){
        return steps.sh("docker build -t ${imageName}:${tag} -f ${path} .")
    }

    def push(String imageName, String tag){
        return steps.sh("docker push ${imageName}:${tag}")
    }

    def pull(String imageName, String tag){
        return steps.sh("docker pull ${imageName}:${tag}")
    }

    // def login(String username, String password, String registry){
        
    // }

}