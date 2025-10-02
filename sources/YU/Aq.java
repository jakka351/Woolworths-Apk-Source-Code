package YU;

/* loaded from: classes.dex */
public class Aq {

    /* renamed from: a, reason: collision with root package name */
    public static int f3a = 8610;

    static {
        J.a("\txu\u007fA{\b");
        J.a("\tsmcY+");
        J.a("\u00043*i");
    }

    public static long a(long j) {
        if (j == 0) {
            return 0L;
        }
        long j2 = j | (j >>> 1);
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        return j6 - (j6 >>> 1);
    }

    public static String b(float[] fArr, float f, float f2) {
        int length = fArr.length;
        StringBuilder sb = new StringBuilder();
        float f3 = (f2 - f) / 60;
        for (int i = 0; i < length; i++) {
            char cFloor = (char) (((int) Math.floor((fArr[i] - f) / f3)) + 65);
            if (fArr[i] == f2) {
                cFloor = (char) 125;
            }
            if (cFloor == '\\') {
                cFloor = '.';
            } else if (cFloor == '.') {
                cFloor = '\\';
            }
            sb.append(cFloor);
        }
        return sb.toString();
    }
}
