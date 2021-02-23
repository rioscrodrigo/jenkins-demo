pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rioscrodrigo/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}