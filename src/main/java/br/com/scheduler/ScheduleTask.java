package br.com.scheduler;

import java.util.Date;
import java.util.TimerTask;

public class ScheduleTask extends TimerTask {

    Date now;

    public void run() {
        now = new Date();
        //Codigo e logica de execucao de algo
        System.out.println("Tempo de execucao " + now);
    }
}