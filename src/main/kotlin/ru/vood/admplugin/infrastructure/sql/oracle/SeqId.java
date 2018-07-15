package ru.vood.admplugin.infrastructure.sql.oracle;

import java.math.BigDecimal;

public class SeqId {
    public static BigDecimal nextVal() {
        return BigDecimal.valueOf(123);
    }
}
