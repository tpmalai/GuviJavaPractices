package GuviJavaPractices3;

class NormalTea {
    boolean isPrepared;
    boolean hasMilk;
    boolean hasSugar;

    public NormalTea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    public void addMilk() {
        if (isPrepared && !hasMilk) {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        } else if (!isPrepared) {
            System.out.println("Tea is not prepared yet. Please prepare tea first.");
        } else {
            System.out.println("Milk is already added to the tea.");
        }
    }

    public void addSugar() {
        if (isPrepared && !hasSugar) {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        } else if (!isPrepared) {
            System.out.println("Tea is not prepared yet. Please prepare tea first.");
        } else {
            System.out.println("Sugar is already added to the tea.");
        }
    }
}

class BlackTea extends NormalTea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing black tea with hot water and black tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Black tea is already prepared.");
        }
    }
}

class GreenTea extends NormalTea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing green tea with hot water and green tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Green tea is already prepared.");
        }
    }
}

class HerbalTea extends NormalTea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing herbal tea with hot water and herbal tea mix.");
            isPrepared = true;
        } else {
            System.out.println("Herbal tea is already prepared.");
        }
    }
}

public class TeaMain {
    public static void main(String[] args) {
        Tea basicTea = new Tea();
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        basicTea.prepareTea();
        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();
    }
}

