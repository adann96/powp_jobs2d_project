package edu.kis.powp.jobs2d.drivers.adapter;

public class SetPositionCommand {
    public interface DriverCommand {
        public void setPosition(int x, int y);
        public void operateTo(int x, int y);
    }

}
