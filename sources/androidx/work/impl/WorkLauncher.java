package androidx.work.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/work/impl/WorkLauncher;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WorkLauncher {
    void a(StartStopToken startStopToken, int i);

    default void b(StartStopToken workSpecId) {
        Intrinsics.h(workSpecId, "workSpecId");
        a(workSpecId, -512);
    }
}
