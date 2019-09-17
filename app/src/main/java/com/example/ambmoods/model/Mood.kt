package com.example.ambmoods.model

import com.example.ambmoods.R
import kotlin.random.Random

sealed class Mood {
    abstract val labelId: Int
    abstract val playListId: String

    sealed class WorkSpace : Mood() {
        object Garden : WorkSpace() {
            override val labelId: Int = R.string.garden_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object Drive : WorkSpace() {
            override val labelId: Int = R.string.drive_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object Dinner : WorkSpace() {
            override val labelId: Int = R.string.dinner_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object Shops : WorkSpace() {
            override val labelId: Int = R.string.shops_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object CoffeeShops : WorkSpace() {
            override val labelId: Int = R.string.coffeeshops_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object Office : WorkSpace() {
            override val labelId: Int = R.string.office_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }
    }

    sealed class LifeStyle : Mood() {
        object Sleep : LifeStyle() {
            override val labelId: Int = R.string.sleep_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:2HDiP4Lo2Gk0RifooAh3fZ",
                    "spotify:album:0JLN7JryQ2T7lBEYIrSQF1",
                    "spotify:playlist:6qJlgixP98OEaEKNilohZY",
                    "spotify:playlist:40cwXRImcYfwTkOhVND8wI"

                ).random()
        }

        object Study : LifeStyle() {
            override val labelId: Int = R.string.study_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:569ASLkAaigoLJKsXl17US",
                    "spotify:playlist:2kt6VK0QWc57NMjM0Xr9rl",
                    "spotify:playlist:1J5b9GiV6kt1zAg2jVEjL1",
                    "spotify:playlist:21J20PgNUj49fSp2UOfawo"

                ).random()
        }

        object Meditate : LifeStyle() {
            override val labelId: Int = R.string.meditate_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:37i9dQZF1DX1tuUiirhaT3",
                    "spotify:playlist:4Vha98vGwpbrwmK2MSN8DP",
                    "spotify:playlist:6Qx0S7gXF82ASG9gzkx9OH",
                    "spotify:playlist:0WOPBTjndUYmprtr6ecnou"

                ).random()
        }

        object Cook : LifeStyle() {
            override val labelId: Int = R.string.cook_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:333Xr2XybpM5xvQVKIqo11",
                    "spotify:playlist:03CyKoRhh8WeRr6ogaPeGj",
                    "spotify:playlist:6wH8cOP2B4KIkCXqfOcZ0i",
                    "spotify:playlist:6c3gSpwttSiTbbz3hyhJdj"

                ).random()
        }

        object Walk : LifeStyle() {
            override val labelId: Int = R.string.walk_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:2dAsXvXqCrCKqzHAqgjgTD",
                    "spotify:playlist:7eL32ibFzR8L7urIDgeJr5",
                    "spotify:playlist:4vTDfeFmRUuVsrqAuPnRo6",
                    "spotify:playlist:6qR7tnZXJSv817Dve3SRwk"

                ).random()
        }

        object Read : LifeStyle() {
            override val labelId: Int = R.string.read_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:2dAsXvXqCrCKqzHAqgjgTD",
                    "spotify:playlist:7eL32ibFzR8L7urIDgeJr5",
                    "spotify:playlist:4vTDfeFmRUuVsrqAuPnRo6",
                    "spotify:playlist:6qR7tnZXJSv817Dve3SRwk"

                ).random()
        }

    }

    sealed class Styles : Mood() {
        object Acustic : Styles() {
            override val labelId: Int = R.string.acustic_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:5KnVU46dHz2R8mL2tx3sVw",
                    "spotify:playlist:5R2m9eOp3qHEB8L4jJZuu9",
                    "spotify:playlist:6t6F9P0Px60adgycWbkcjN",
                    "spotify:playlist:53V4vnNrvKlxFQcGQAumQa"

                ).random()
        }

        object Guitar : Styles() {
            override val labelId: Int = R.string.guitar_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:2YLm3GHX94qgr4IEkc71I1",
                    "spotify:playlist:4AAz609nBkLrHqf5JjBWAA",
                    "spotify:playlist:20uTWRLp82iDEGpT6o1t7x",
                    "spotify:playlist:6jyS3PEdIn9LpB8xULTGfK"

                ).random()
        }

        object Piano : Styles() {
            override val labelId: Int = R.string.piano_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:2plfmtL0emjINP5nzziG5G",
                    "spotify:playlist:0E95O9vPEa6UVGtGGxs238",
                    "spotify:playlist:0MG0DEYvd8d6EhvmlJHDA9",
                    "spotify:playlist:62paYyUDreCL0yKTKXxJtF"

                ).random()
        }

        object Atmospheric : Styles() {
            override val labelId: Int = R.string.atmospheric_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:37i9dQZF1DX4TnpT6vw5rE",
                    "spotify:playlist:2WBTp6nf5UBcgpBlJkpLz3",
                    "spotify:playlist:4CSH3npngMPeaXggFucLio",
                    "spotify:playlist:2d4Vxodgz9fVkvBhM4LUuH"

                ).random()
        }

        object Classic : Styles() {
            override val labelId: Int = R.string.classic_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:4G5JSCSOc9zHB6VbuqxiUq",
                    "spotify:playlist:6yHmntDyff0AtmmVY92FVy",
                    "spotify:playlist:2P9B1Q7i99ZMascN0r5HS4",
                    "spotify:playlist:6oC7xJsUQUwqnKJxkjVQoo"

                ).random()
        }

        object Chillout : Styles() {
            override val labelId: Int = R.string.chillout_label_id
            override val playListId: String
                get() = listOf(
                    "spotify:playlist:3TApnH5ZUT5yYnqbusCm6L",
                    "spotify:playlist:1kqBP6eE24L0agNpnTIKtc",
                    "spotify:playlist:6J2leTsmG1cuAl5FYrgcew",
                    "spotify:playlist:23NJnmWYaInhYaxYxlpt4M"

                ).random()
        }

    }

    sealed class AroundMe : Mood() {
        object Zone : AroundMe() {
            override val labelId: Int = R.string.zone_label_id
            override val playListId: String = "spotify:album:72kpe1XKFChnsAk76rvKgJ"
        }
    }
}


