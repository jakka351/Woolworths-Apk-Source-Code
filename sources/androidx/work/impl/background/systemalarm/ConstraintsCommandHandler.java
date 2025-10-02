package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;

@RestrictTo
/* loaded from: classes2.dex */
class ConstraintsCommandHandler {
    public static final String d = Logger.g("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Clock f3953a;
    public final int b;
    public final WorkConstraintsTracker c;

    public ConstraintsCommandHandler(Context context, Clock clock, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f3953a = clock;
        this.b = i;
        this.c = new WorkConstraintsTracker(systemAlarmDispatcher.h.j);
    }
}
