package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SourceInformationSlotTableGroupIdentity;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SourceInformationSlotTableGroupIdentity {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1669a;
    public final int b;

    public SourceInformationSlotTableGroupIdentity(Object obj, int i) {
        this.f1669a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceInformationSlotTableGroupIdentity)) {
            return false;
        }
        SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
        return Intrinsics.c(this.f1669a, sourceInformationSlotTableGroupIdentity.f1669a) && this.b == sourceInformationSlotTableGroupIdentity.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f1669a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb.append(this.f1669a);
        sb.append(", index=");
        return YU.a.l(sb, this.b, ')');
    }
}
