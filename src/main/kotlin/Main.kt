
    interface IRadio {
        fun radioOn() {
            val OnRadio: Double
        }

        fun musicON() {
            val OnMusic: String
        }
    }

    interface IVideo {
        fun musicON() {
            val ONmusic: String
        }
    }

    class Radio: IRadio {
        override fun radioOn() {
            println("SuperRadio " + $OnRadio + " On!")
        }
    }

    class SuperRadio: IRadio {
        override fun radioOn() {
            println("SuperRadio " + $OnRadio + " On!")
        }
    }

    class SpaceRadio: IRadio {
        override fun radioOn() {
            println("SpaceRadio " + $OnRadio + " On!")
        }
    }

    class Car: IRadio, IVideo {
        override fun radioOn() {
            println("Car " + $OnRadio + " On!")
        }

        override fun musicON() {
            println("Car " + $ONmusic + " On!")
        }
    }

    interface IPhotoEngine

    interface ILightEngine

    class MobilePhone: IRadio, IVideo, IPhotoEngine, ILightEngine

    class familyCar: IRadio {
        override fun radioOn() {
            println("IRadio " + $OnRadio + " On!")
        }
    }

