package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class DolbyVisionConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f3232a;

    public DolbyVisionConfig(String str) {
        this.f3232a = str;
    }

    public static DolbyVisionConfig a(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.H(2);
        int iU = parsableByteArray.u();
        int i = iU >> 1;
        int iU2 = ((parsableByteArray.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbS = YU.a.s(str);
        sbS.append(i < 10 ? ".0" : ".");
        sbS.append(i);
        return new DolbyVisionConfig(YU.a.n(sbS, iU2 < 10 ? ".0" : ".", iU2));
    }
}
