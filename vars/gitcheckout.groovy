
def call(String gitUrl, String credId, String gitBranch) {
    echo "URL: ${gitUrl}"
    checkout([$class: 'GitSCM',
              branches: [[name: gitBranch]],
              doGenerateSubmoduleConfigurations: false,
              extensions: [],
              submoduleCfg: [],
              userRemoteConfigs: [[url: gitUrl, credentialsId: credId]]
    ])
}

