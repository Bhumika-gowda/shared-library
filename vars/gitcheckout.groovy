def call(String gitUrl, String CredID, string gitBranch) {
    echo "URL: ${gitURl}"
    checkout( [$class: 'GitSCM',
                            branches: [[name: ${gitBranch}]],
                            doGenerateSubmodulesConfigurations: false,
                            extensions: [],
                            submodulecfg: [],
                            userRemoteConfigs: [[url: ${gitUrl},
                                                 credentialsID: ${CredID}]]])    
                        
}