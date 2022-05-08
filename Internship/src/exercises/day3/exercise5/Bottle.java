package exercises.day3.exercise5;

public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(double totalCapacity, double availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        if (availableLiquid < 0) {
            this.availableLiquid = 0d;
        } else if (availableLiquid > totalCapacity) {
            this.availableLiquid = totalCapacity;
        } else {
            this.availableLiquid = availableLiquid;
        }
        this.open = open;
    }

    public boolean bottleHasMoreLiquid() {
        return availableLiquid != 0.0;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String bottleOpener() {
        if (!open) {
            open = true;
            return "Bottle is opened";
        }
        return "Bottle is already opened";
    }

    public String bottleCloser() {
        if (open) {
            open = false;
            return "Bottle is closed";
        }
        return "Bottle is already closed";
    }

    public String bottleLiquidDrinker(double drinkQuantity) {
        if (availableLiquid == 0.0) {
            return "There is no liquid to be drunk from the bottle!";
        }
        if (!open) {
            return "No liquid can be drunk from the bottle while the bottle is closed!";
        }
        if (drinkQuantity > availableLiquid) {
            return "You can't drink more liquid that is available in the bottle!";
        }
        availableLiquid = availableLiquid - drinkQuantity;
        return "The quantity of " + drinkQuantity + " has been drunk " +
                "and the quantity of " + availableLiquid + " is available";

    }

}

