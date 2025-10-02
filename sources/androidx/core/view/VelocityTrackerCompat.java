package androidx.core.view;

import android.view.VelocityTracker;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class VelocityTrackerCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f2486a = Collections.synchronizedMap(new WeakHashMap());

    @RequiresApi
    public static class Api34Impl {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface VelocityTrackableMotionEventAxis {
    }
}
