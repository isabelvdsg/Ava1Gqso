package app;

import io.jooby.Jooby;
import io.jooby.ServerOptions;

public class App extends Jooby {

  public App() {
    String portStr = System.getenv("PORT");
    if (portStr == null) {
      portStr = "8080";
    }
    setServerOptions(new ServerOptions().setPort(Integer.parseInt(portStr)));
  }

  {

    mvc(new Controller());
    mvc(new Soma());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}


 


