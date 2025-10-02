package androidx.work;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class SystemClock implements Clock {
    @Override // androidx.work.Clock
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
