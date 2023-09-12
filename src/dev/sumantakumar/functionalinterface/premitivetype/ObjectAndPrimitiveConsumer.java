package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.ObjIntConsumer;

public class ObjectAndPrimitiveConsumer {
    public static void main(String[] args) {
        ObjIntConsumer<String> objectPrimitive = (o, p) -> System.out.println(o+p);

        objectPrimitive.accept("Sumant", 10);
    }
}
