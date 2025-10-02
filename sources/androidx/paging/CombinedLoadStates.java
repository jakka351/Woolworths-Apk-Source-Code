package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/CombinedLoadStates;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CombinedLoadStates {

    /* renamed from: a, reason: collision with root package name */
    public final LoadState f3529a;
    public final LoadState b;
    public final LoadState c;
    public final LoadStates d;
    public final LoadStates e;

    public CombinedLoadStates(LoadState refresh, LoadState prepend, LoadState append, LoadStates source, LoadStates loadStates) {
        Intrinsics.h(refresh, "refresh");
        Intrinsics.h(prepend, "prepend");
        Intrinsics.h(append, "append");
        Intrinsics.h(source, "source");
        this.f3529a = refresh;
        this.b = prepend;
        this.c = append;
        this.d = source;
        this.e = loadStates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedLoadStates.class != obj.getClass()) {
            return false;
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        return Intrinsics.c(this.f3529a, combinedLoadStates.f3529a) && Intrinsics.c(this.b, combinedLoadStates.b) && Intrinsics.c(this.c, combinedLoadStates.c) && Intrinsics.c(this.d, combinedLoadStates.d) && Intrinsics.c(this.e, combinedLoadStates.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3529a.hashCode() * 31)) * 31)) * 31)) * 31;
        LoadStates loadStates = this.e;
        return iHashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f3529a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
