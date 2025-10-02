package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.SystemClock;

/* loaded from: classes2.dex */
final class WifiLockManager {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerWrapper f3027a;
    public boolean b;

    public static final class WifiLockManagerInternal {
        public WifiLockManagerInternal(Context context) {
        }
    }

    public WifiLockManager(Context context, Looper looper, SystemClock systemClock) {
        new WifiLockManagerInternal(context.getApplicationContext());
        this.f3027a = systemClock.b(looper, null);
    }

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }
}
