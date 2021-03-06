package com.simonevertsson.columbus.dummy;

import com.simonevertsson.columbus.Mapping;

public class IllegalAccessA {

  @Mapping(clazz = IllegalAccessB.class, field = "fieldC") // Maps correctly
  private final String fieldA;

  @Mapping(clazz = IllegalAccessB.class, field = "fieldD") // Throws exception since field is private
  private int fieldB;

  public IllegalAccessA(String a, int b) {
    this.fieldA = a;
    this.fieldB = b;
  }

  public String getFieldA() {
    return fieldA;
  }

  public int getFieldB() {
    return fieldB;
  }
}
