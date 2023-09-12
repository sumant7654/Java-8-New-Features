package dev.sumantakumar.constructorreference;

class Sample {
    Sample() {
        System.out.println("Sample Constructor Creation and Object Creation");
    }
}

interface Interf {
    public Sample get();
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {

       // Using Lambda Expression
        Interf i = () -> {
            Sample s = new Sample();
            return s;
        };
        Sample sample = i.get();


        // Using Constructor reference

        Interf i2 = Sample::new;

        Sample sample1 = i2.get();

    }
}
