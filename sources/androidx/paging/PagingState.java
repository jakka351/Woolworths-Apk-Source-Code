package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/PagingState;", "", "Key", "Value", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PagingState<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    public final List f3583a;
    public final Integer b;
    public final PagingConfig c;
    public final int d;

    public PagingState(List list, Integer num, PagingConfig pagingConfig, int i) {
        this.f3583a = list;
        this.b = num;
        this.c = pagingConfig;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) obj;
        return Intrinsics.c(this.f3583a, pagingState.f3583a) && Intrinsics.c(this.b, pagingState.b) && Intrinsics.c(this.c, pagingState.c) && this.d == pagingState.d;
    }

    public final int hashCode() {
        int iHashCode = this.f3583a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.f3583a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return YU.a.l(sb, this.d, ')');
    }
}
