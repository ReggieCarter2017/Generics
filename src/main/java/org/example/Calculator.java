package org.example;

public class Calculator {
    public static <T extends Number, E extends Number> Number sum(T n1, E n2)
    {
        return new Number() {
            @Override
            public int intValue() {
                return n1.intValue() + n2.intValue();
            }

            @Override
            public long longValue() {
                return n1.longValue() + n2.longValue();
            }

            @Override
            public float floatValue() {
                return n1.floatValue() + n2. floatValue();
            }

            @Override
            public double doubleValue() {
                return n1.doubleValue() + n2.doubleValue();
            }
        };
    }

    public static <T extends Number, E extends Number> Number multiply(T n1, E n2)
    {
        return new Number() {
            @Override
            public int intValue() {
                return n1.intValue() * n2.intValue();
            }

            @Override
            public long longValue() {
                return n1.longValue() * n2.longValue();
            }

            @Override
            public float floatValue() {
                return n1.floatValue() * n2. floatValue();
            }

            @Override
            public double doubleValue() {
                return n1.doubleValue() * n2.doubleValue();
            }
        };
    }

    public static <T extends Number, E extends Number> Number divide(T n1, E n2)
    {
        return new Number() {
            @Override
            public int intValue() {
                return n1.intValue() / n2.intValue();
            }

            @Override
            public long longValue() {
                return n1.longValue() / n2.longValue();
            }

            @Override
            public float floatValue() {
                return n1.floatValue() / n2. floatValue();
            }

            @Override
            public double doubleValue() {
                return n1.doubleValue() / n2.doubleValue();
            }
        };
    }

    public static <T extends Number, E extends Number> Number subtract(T n1, E n2)
    {
        return new Number() {
            @Override
            public int intValue() {
                return n1.intValue() - n2.intValue();
            }

            @Override
            public long longValue() {
                return n1.longValue() - n2.longValue();
            }

            @Override
            public float floatValue() {
                return n1.floatValue() - n2. floatValue();
            }

            @Override
            public double doubleValue() {
                return n1.doubleValue() - n2.doubleValue();
            }
        };
    }

}
