package GuviJavaPractices3;

class TeaBase {
     boolean isPrepared;
     boolean hasMilk;
     boolean hasSugar;

    public TeaBase() {
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

class EarlGreyTea extends TeaBase {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Earl Grey tea with hot water and Earl Grey tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Earl Grey tea is already prepared.");
        }
    }
}

class ChamomileTea extends TeaBase {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Chamomile tea with hot water and Chamomile tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Chamomile tea is already prepared.");
        }
    }
}

class PeppermintTea extends TeaBase {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Peppermint tea with hot water and Peppermint tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Peppermint tea is already prepared.");
        }
    }
}

public class PolyMorphismTea {
    public static void main(String[] args) {
        TeaBase[] teas = new TeaBase[4];
        teas[0] = new TeaBase();
        teas[1] = new EarlGreyTea();
        teas[2] = new ChamomileTea();
        teas[3] = new PeppermintTea();

        for (TeaBase tea : teas) {
            tea.prepareTea();
        }
    }
}

