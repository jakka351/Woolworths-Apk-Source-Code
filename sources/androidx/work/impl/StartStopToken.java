package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/StartStopToken;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartStopToken {

    /* renamed from: a, reason: collision with root package name */
    public final WorkGenerationalId f3931a;

    public StartStopToken(WorkGenerationalId id) {
        Intrinsics.h(id, "id");
        this.f3931a = id;
    }
}
