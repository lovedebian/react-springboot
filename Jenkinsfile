pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                sh 'cd api && mvn -s settings.xml -DskipTests install'
            }
        }
    }
} 
