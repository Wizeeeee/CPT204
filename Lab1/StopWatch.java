package Lab1;

public class StopWatch {
    private long startTime;  // 计时开始时间（毫秒）
    private long endTime;    // 计时结束时间（毫秒）

    // 无参构造器，初始化开始和结束时间为当前时间
    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    // 获取开始时间
    public long getStartTime() {
        return startTime;
    }

    // 获取结束时间
    public long getEndTime() {
        return endTime;
    }

    // 重置并开始计时
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // 停止计时
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // 获取已过时间（毫秒）
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
