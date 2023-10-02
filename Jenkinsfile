pipeline {
    agent any

    tools {
        maven 'MAVEN'
    }

    stages {
        stage("build") {
            steps {
                sh 'cd api && mvn -s settings.xml -DskipTests install'
            }
        }
    }
} 
