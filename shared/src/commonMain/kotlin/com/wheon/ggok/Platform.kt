package com.wheon.ggok

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform