package ru.xdpi.contactlenses

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform