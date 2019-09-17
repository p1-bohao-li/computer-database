package com.excilys.cdb.domain;

import java.sql.Timestamp;
import java.util.Objects;

public final class Computer {
  private long id;
  private String name;
  private Timestamp introduced;
  private Timestamp discontinued;
  private Company company;

  public Computer() {

  }

  public Computer(long id, String name, Timestamp introduced, Timestamp discontinued,
      Company company) {
    super();
    this.id = id;
    this.name = name;
    this.introduced = introduced;
    this.discontinued = discontinued;
    this.company = company;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Timestamp getIntroduced() {
    return introduced;
  }

  public void setIntroduced(Timestamp introduced) {
    this.introduced = introduced;
  }

  public Timestamp getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(Timestamp discontinued) {
    this.discontinued = discontinued;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  @Override
  public String toString() {
    return "Computer [id=" + id + ", name=" + name + ", introduced=" + introduced
        + ", discontinued=" + discontinued + ", company=" + company + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Computer)) {
      return false;
    }
    Computer other = (Computer) obj;
    return id == other.id;
  }
}
