@Library('mysharedLibrary') _

def gitCheckout(String gitUrl, String credId, String gitBranch) {
    echo "URL: ${gitUrl}"
    checkout([$class: 'GitSCM',
              branches: [[name: gitBranch]],
              doGenerateSubmoduleConfigurations: false,
              extensions: [],
              userRemoteConfigs: [[url: gitUrl, credentialsId: credId]]
    ])
}


