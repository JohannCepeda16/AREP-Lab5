package edu.escuelaing.arep;

import static spark.Spark.*;

public class SecureAppSpark {

  public static void main(String[] args) {
    port(getPort());
    get("/hello", (req, res) -> "hello wolrld");
    System.out.println("Hello World!");
  }

  private static int getPort() {
    if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;
  }
}
