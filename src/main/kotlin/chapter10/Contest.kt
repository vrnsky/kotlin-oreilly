package chapter10

class Contest<T : Pet>(var vet: Vet<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) {
            scores.put(t, score)
        }
    }

    fun getWinners(): MutableSet<T> {
        val highScope = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()

        for ((t, score) in scores) {
            if (score == highScope) {
                winners.add(t)
            }
        }
        return winners
    }
}