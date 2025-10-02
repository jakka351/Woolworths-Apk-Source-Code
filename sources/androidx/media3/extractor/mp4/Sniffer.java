package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class Sniffer {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3338a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (f3338a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.SniffFailure b(androidx.media3.extractor.ExtractorInput r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Sniffer.b(androidx.media3.extractor.ExtractorInput, boolean, boolean):androidx.media3.extractor.SniffFailure");
    }
}
