def call(Mao config) {
    echo "BRANCH: ${config.branch}"
    checkout([$class: 'GitSCM',
                            doGenerateSubmodulesConfigurations: false,
                            extensions: [],
                            userRemoteConfigs: [[url: config.url,
                            credentialsID: config.credentialsId]]])    
