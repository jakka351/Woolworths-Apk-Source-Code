package androidx.media3.common.util;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@SuppressLint
@UnstableApi
/* loaded from: classes2.dex */
public final class CodecSpecificDataUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2907a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : Matrix.MATRIX_TYPE_RANDOM_LT), Integer.valueOf(i4)};
        int i5 = Util.f2928a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(java.lang.String r11, java.lang.String[] r12, androidx.media3.common.ColorInfo r13) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.b(java.lang.String, java.lang.String[], androidx.media3.common.ColorInfo):android.util.Pair");
    }
}
