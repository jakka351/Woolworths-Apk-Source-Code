package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class SessionResetPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f363a;

    public SessionResetPolicy(Quirks quirks) {
        this.f363a = quirks.a(Preview3AThreadCrashQuirk.class);
    }
}
