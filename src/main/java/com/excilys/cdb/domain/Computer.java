package com.excilys.cdb.domain;

import java.sql.Timestamp;

public final class Computer {
  private long id;
  private String name;
  private Timestamp introduced;
  private Timestamp discontinued;
  private Company company;

  public Computer() {}

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
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }

    Computer other = (Computer) obj;
    if (id != other.id) {
      return false;
    }

    return true;
  }

}
