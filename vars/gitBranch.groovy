def call() {
    return env.BRANCH_NAME ?: "NO_BRANCH"
}