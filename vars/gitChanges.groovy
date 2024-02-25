def call() {
    def changes = currentBuild.changeSets.collect { cs ->
        cs.items.collect { item -> "- ${item.msg} [${item.author.fullName}]" }
    }.flatten().join("\n")
    return changes ? "\n\nChanges:\n$changes" : "\n\nNo Changes."
}