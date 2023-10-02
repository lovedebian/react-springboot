pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage("build") {
            steps {
                sh 'cd api && mvn -s settings.xml -DskipTests install'
            }
        }
    }
} 
