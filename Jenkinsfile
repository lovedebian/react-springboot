pipeline {
    agent any

    tools {
        mvn 'MAVEN'
    }

    stages {
        stage("build") {
            steps {
                sh 'cd api && mvn -s settings.xml -DskipTests install'
            }
        }
    }
} 
