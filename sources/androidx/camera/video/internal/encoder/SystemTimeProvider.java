package androidx.camera.video.internal.encoder;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SystemTimeProvider implements TimeProvider {
    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public final long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public final long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
