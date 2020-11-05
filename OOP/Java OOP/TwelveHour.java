class Number {

    private int limit = 0;
    private int value = 0;

    public Number(int limit) {
        this.limit = limit;
    }

    public int getValue() {
        return value;
    }

    public int getLimit() {
        return limit;
    }

    public void setValue(int newValue) {
        if (newValue < limit) {
            value = newValue;
        }
    }

    public void setLimit(int newLimit) {
        limit = newLimit;
    }

    public int increment() {
        value++;
        return value;
    }

}

class Clock {

    Number hours;
    Number minutes;
    Number seconds;
    String time;
    int value;

    boolean isDay = false;

    public Clock() {
        this.hours = new Number(12);
        this.minutes = new Number(60);
        this.seconds = new Number(60);
        this.time = "";
    }

    public void printTime() {
        System.out.println(time);
    }

    public void updateTime() {
        this.time = addValue(hours.getValue()) + ":" + addValue(minutes.getValue()) + ":" + addValue(seconds.getValue());
        this.time += isDay ? "PM" : "AM";
    }
    
    public String addValue(int newValue) {
        this.value = newValue;
        if (this.value < 10) {
            return "0" + value;
        }
    
        return "" + value;
        
    }

    public void timeTick() {
        seconds.increment();

        if (seconds.getValue() % seconds.getLimit() == 0) {
            seconds.setValue(0);
            minutes.increment();
        }

        

        if (minutes.getValue() % minutes.getLimit() == 0) {
            minutes.setValue(0);
            hours.increment();

            if (hours.getValue() % hours.getLimit() == 0) {
                hours.setValue(0);
                isDay = !isDay;
            }
        }


        updateTime();
    }
    
}
