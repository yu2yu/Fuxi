package com.yy.pattern.yushui.builder;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO KFC套餐
 * @createTime 2022-07-26 14:35:00
 */
public class KFC {

    // 套餐必点
    private String hamburger;
    private String chips;

    //套餐选点
    private String chicken;
    private String cola;
    private String pizza;

    private KFC(Builder builder) {
        this.hamburger = builder.hamburger;
        this.chips = builder.chips;
        this.chicken = builder.chicken;
        this.cola = builder.cola;
        this.pizza = builder.pizza;
    }

    public static class Builder{
        // 套餐必点
        private String hamburger;
        private String chips;

        //套餐选点
        private String chicken;
        private String cola;
        private String pizza;


        public Builder setHamburger(String hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        public Builder setChips(String chips) {
            this.chips = chips;
            return this;
        }

        public Builder setChicken(String chicken) {
            this.chicken = chicken;
            return this;
        }

        public Builder setCola(String cola) {
            this.cola = cola;
            return this;
        }

        public Builder setPizza(String pizza) {
            this.pizza = pizza;
            return this;
        }

        public KFC getKFC(){
            return new KFC(this);
        }
    }
}
