package androidx.media3.common;

import androidx.camera.core.impl.b;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TrackGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f2879a;
    public final String b;
    public final int c;
    public final Format[] d;
    public int e;

    static {
        Util.E(0);
        Util.E(1);
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.b(formatArr.length > 0);
        this.b = str;
        this.d = formatArr;
        this.f2879a = formatArr.length;
        int iH = MimeTypes.h(formatArr[0].n);
        this.c = iH == -1 ? MimeTypes.h(formatArr[0].m) : iH;
        String str2 = formatArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = formatArr[0].f | 16384;
        for (int i2 = 1; i2 < formatArr.length; i2++) {
            String str3 = formatArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i2, "languages", formatArr[0].d, formatArr[i2].d);
                return;
            } else {
                if (i != (formatArr[i2].f | 16384)) {
                    a(i2, "role flags", Integer.toBinaryString(formatArr[0].f), Integer.toBinaryString(formatArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        StringBuilder sbV = YU.a.v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbV.append(str3);
        sbV.append("' (track ");
        sbV.append(i);
        sbV.append(")");
        Log.d("TrackGroup", "", new IllegalStateException(sbV.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.b.equals(trackGroup.b) && Arrays.equals(this.d, trackGroup.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + b.c(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
