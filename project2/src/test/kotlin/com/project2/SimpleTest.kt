package com.project2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SimpleTest : FunSpec({
    test("simple test") {
        1 + 1 shouldBe 2
    }
})
