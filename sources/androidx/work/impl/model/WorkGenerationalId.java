package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WorkGenerationalId {

    /* renamed from: a, reason: collision with root package name */
    public final String f3985a;
    public final int b;

    public WorkGenerationalId(String workSpecId, int i) {
        Intrinsics.h(workSpecId, "workSpecId");
        this.f3985a = workSpecId;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return Intrinsics.c(this.f3985a, workGenerationalId.f3985a) && this.b == workGenerationalId.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f3985a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f3985a);
        sb.append(", generation=");
        return YU.a.l(sb, this.b, ')');
    }
}
