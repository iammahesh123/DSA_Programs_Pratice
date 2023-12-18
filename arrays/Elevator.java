public class Elevator {
    public static void findFloorSequence(String currentDirection, int currentFloor, int[] floorRequests) {
        if (!(currentDirection.equals("UP") || currentDirection.equals("DN"))) {
            System.out.println("Invalid input");
            return;
        }

        if (currentFloor <= 0 || currentFloor >= 15) {
            System.out.println("Invalid input");
            return;
        }

        for (int floor : floorRequests) {
            if (floor < 0 || floor >= 15) {
                System.out.println("Invalid input");
                return;
            }
        }

        if (currentDirection.equals("UP")) {
            for (int i = currentFloor + 1; i < 15; i++) {
                if (contains(floorRequests, i)) {
                    System.out.println(i);
                }
            }
            for (int i = currentFloor; i >= 0; i--) {
                if (contains(floorRequests, i)) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = currentFloor - 1; i >= 0; i--) {
                if (contains(floorRequests, i)) {
                    System.out.println(i);
                }
            }
            for (int i = currentFloor; i < 15; i++) {
                if (contains(floorRequests, i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String currentDirection = "UP";
        int currentFloor = 6;
        int[] floorRequests = {3, 10, 7, 8};

        findFloorSequence(currentDirection, currentFloor, floorRequests);
    }
}