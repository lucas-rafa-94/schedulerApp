package br.com.scheduler;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;

public class App extends HttpServlet {

    static Timer time;
    static ScheduleTask st;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        time = new Timer();
        st = new ScheduleTask();
        time.schedule(st, 0, 10000);

      }

    @Override
    public void destroy() {
        super.destroy();
        time.cancel();
        st.cancel();
    }
}


