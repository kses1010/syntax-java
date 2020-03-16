package syntax.chapter7.page315;

public class Tv {
    private boolean power;
    private int channel;

    public void power() {
        power = !power;
    }

    public void channelUp() {
        ++channel;
    }

    public void channelDown() {
        --channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }
}
