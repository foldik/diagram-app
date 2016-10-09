package com.foldik.domain.request;

import java.math.BigDecimal;

public class Point {

    private BigDecimal x;
    private BigDecimal y;

    public Point() {
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }
}
