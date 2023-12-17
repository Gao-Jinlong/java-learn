enum Color {
  RED {
    public void colorInfo() {
      System.out.println("Red Color");
    }

    @Override
    void abstractMethod() {
      System.out.println("Abstract method called for RED");
    }
  },
  GREEN {
    public void colorInfo() {
      System.out.println("Green Color");
    }

    @Override
    void abstractMethod() {
      System.out.println("Abstract method called for GREEN");
    }
  },
  BLUE {
    public void colorInfo() {
      System.out.println("Blue Color");
    }

    @Override
    void abstractMethod() {
      System.out.println("Abstract method called for BLUE");
    }
  };

  private Color() {
    System.out.println("Constructor called for: " + this.toString());
  }

  public void colorInfo() {
    System.out.println("Universal Color");
  }

  abstract void abstractMethod(); // 每个枚举都要实现的抽象方法
}

public class EnumTest {
  public static void main(String[] args) {
    Color[] enumArray = Color.values();

    for (Color col : enumArray) {
      System.out.println(col + "at index" + col.ordinal());
    }

    System.out.println(Color.valueOf("RED"));
  }
}
