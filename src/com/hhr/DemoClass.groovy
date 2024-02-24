class DemoClass implements Serializable {
    def getBuildNum() {
        return env.BUILD_NUMBER
    }
}