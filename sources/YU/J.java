package YU;

/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f11a;

    public static /* synthetic */ String a(String str) {
        if (f11a == null) {
            f11a = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 90) % 63;
                f11a[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ f11a[i3])));
        }
        return new String(cArr);
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            int i3 = 1;
            while (i2 < length && cCharAt == str.charAt(i2)) {
                i3++;
                i2++;
            }
            if (i3 > 1) {
                sb.append(String.valueOf(i3));
            }
            sb.append(cCharAt);
            i = i2;
        }
        return sb.toString();
    }
}
