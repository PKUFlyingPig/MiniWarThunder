package settings;

public class Settings {
    public static final int frameWidth = 1280;
    public static final int frameHeight = 720;

    public static final int minWidth = 5;
    public static final int maxWidth = 10;
    public static final int minHeight = 5;
    public static final int maxHeight = 10;   // 地图大小限制
    public static final double scaleConstant = 0.8; // 表示地图最大占据屏幕长和宽的多少百分比

    public static final int defaultBlockSize = 80;
    public static final int defaultTankRadius = 20; // 指在scaling=1的前提下，地图和坦克的默认大小
}
