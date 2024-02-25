def call() {
    def buildNum = buildNum()
    def changes = gitChanges()
    def branch = gitBranch()
    return """
BuildNum: ${buildNum}
Branch: ${branch}
${changes}
"""
}