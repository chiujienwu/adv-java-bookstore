package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

public interface Product {

    public double getCost();

    public int getQuantityOnHand();

    public String getTitle();

    public void order(int quantity);

    public LocalDate getReleaseDate();

    public String getFormattedReleaseDate();

}
