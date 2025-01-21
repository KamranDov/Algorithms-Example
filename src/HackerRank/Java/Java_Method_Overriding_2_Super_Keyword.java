package HackerRank.Java;

public class Java_Method_Overriding_2_Super_Keyword {
    public static void main(String[] args) {
        Vehicle vehicle = new MotorCycle();
        vehicle.foo();

    }

    static class MotorCycle extends Vehicle {
        public void foo() {
            super.foo();
            System.out.println("""
                    Hello I am a motorcycle, I am a cycle with an engine.
                    My ancestor is a cycle who is a vehicle with pedals.
                    """);
        }
    }

    static class Vehicle {
        void foo() {
        }
    }
}
