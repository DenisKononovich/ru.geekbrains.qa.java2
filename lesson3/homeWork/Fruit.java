/**
 * JavaCore. Homework 2. Fruit
 *
 * @author Denis Kononovich
 * @version 01.12.21
 */

package ru.geekbrains.qa.java2.lesson3.homeWork;

public class Fruit {
    private int amount;
    private float weight;

    public Fruit (float weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}