def call(MessageType type) {
    def buildNum = buildNum()
    def changes = gitChanges()
    def branch = gitBranch()
    return """
Type: ${type.color}
BuildNum: ${buildNum}
Branch: ${branch}
${changes}
"""
}