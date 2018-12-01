package com.yul2ya.ykaChaos

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YkaChaosApplication

fun main(args: Array<String>) {
    runApplication<YkaChaosApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
