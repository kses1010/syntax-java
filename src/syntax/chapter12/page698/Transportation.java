package syntax.chapter12.page698;

public enum Transportation {
    BUS(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    PLAIN(300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected final int BASIC_FARE; // protected 로 해야 각 상수에서 접근가능

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }

    abstract int fare(int distance);
}
