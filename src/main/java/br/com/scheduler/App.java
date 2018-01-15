package br.com.scheduler;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;

public class App extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        Timer time = new Timer();
        ScheduleTask st = new ScheduleTask();
        time.schedule(st, 0, 10000);

      }
}


