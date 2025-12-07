pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "Cloning Repository..."
                git branch: 'main', url: 'https://github.com/Mohamed-Ayman28/Task4_Cloud.git'
            }
        }

        stage('Compile') {
            steps {
                echo "Compiling Java files..."

                sh '''
                    mkdir -p build/classes
                    
                    javac -cp "libs/junit-platform-console-standalone.jar" \
                        -d build/classes \
                        $(find src/main/java -name "*.java") \
                        $(find src/test/java -name "*.java")
                '''
            }
        }

        stage('Run Tests') {
            steps {
                echo "Executing JUnit Tests..."
                sh '''
                    mkdir -p test-results

                    java -jar libs/junit-platform-console-standalone.jar \
                        -cp build/classes \
                        --scan-class-path \
                        --reports-dir=test-results
                '''
            }
        }

        stage('Publish Test Report') {
            steps {
                echo "Publishing JUnit XML reports..."
                junit 'test-results/**/*.xml'
            }
        }
    }

    post {
        success { echo "Pipeline completed successfully ✔" }
        failure { echo "Pipeline failed ❌" }
    }
}
