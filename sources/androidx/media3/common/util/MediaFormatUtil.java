package androidx.media3.common.util;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class MediaFormatUtil {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(YU.a.d(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
