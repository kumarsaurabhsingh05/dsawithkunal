package oops.polymorphism;

public class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class AxisBank extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.8f;
    }
}
class HdfcBank extends Bank {
    @Override
    float getRateOfInterest() {
        return 8.0f;
    }
}

class SBIBank extends Bank {
    @Override
    float getRateOfInterest() {
        return 8.2f;
    }
}
class Main {
    public static void main(String[] args) {
        Bank axis = new AxisBank();
        System.out.println(axis.getRateOfInterest());
        Bank hdfc = new HdfcBank();
        System.out.println(hdfc.getRateOfInterest());
        Bank sbi = new SBIBank();
        System.out.println(sbi.getRateOfInterest());
    }
}
