package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkProgress;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class WorkProgress {

    /* renamed from: a, reason: collision with root package name */
    public final String f3988a;
    public final Data b;

    public WorkProgress(String workSpecId, Data progress) {
        Intrinsics.h(workSpecId, "workSpecId");
        Intrinsics.h(progress, "progress");
        this.f3988a = workSpecId;
        this.b = progress;
    }

    /* renamed from: a, reason: from getter */
    public final Data getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getF3988a() {
        return this.f3988a;
    }
}
