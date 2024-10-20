package org.d3von;

class File implements Serializable {
    
    def steps

    File(steps) {
        this.steps = steps
    }
    
    def copy(String file, String destination) {
        return steps.sh("if [ -f \"${file}\" ]; then cp \"${file}\" \"${destination}\"; fi ")
    }

    def move(String file, String destination) {
        return steps.sh("if [ -f \"${file}\" ]; then mv \"${file}\" \"${destination}\"; fi ")
    }

    def remove(String file) {
        return steps.sh("if [ -f \"${file}\" ]; then rm \"${file}\"; fi ")
    }

    def dos2unix(String file) {
        return steps.sh("dos2unix \"${file}\" ")
    }
}