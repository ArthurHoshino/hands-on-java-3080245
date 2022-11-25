package bank;

public class Account {

  private int id;
  private String type;
  private double balace;

  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalace(balance);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalace() {
    return this.balace;
  }

  public void setBalace(double balace) {
    this.balace = balace;
  }

  public void deposit(double amount) {
  }

  public void withdraw(double amount) {
  }

}
