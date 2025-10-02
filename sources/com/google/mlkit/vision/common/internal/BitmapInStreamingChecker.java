package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.common.InputImage;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes6.dex */
public class BitmapInStreamingChecker {
    public static final GmsLogger c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f16002a = new LinkedList();
    public long b = -1;

    public final void a(InputImage inputImage) {
        if (inputImage.f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.f16002a;
        linkedList.add(lValueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j = this.b;
        if (j == -1 || jElapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
            this.b = jElapsedRealtime;
            c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
