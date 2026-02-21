// -- Override -- //

class College {
  void department() {
    System.out.println("General Department");
  }
}

class ComputerScience extends College {
  @Override
  void department() {
    System.out.println("General Department");
  }
}

class ME extends College {
  @Override
  void department() {
    System.out.println("General Department");
  }
}

public class Override_Method {
  public static void main(String[] args) {
    College c;
    c = new ComputerScience();
    c.department();
    c = new ME();
    c.department();
  }
}