package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class JoinedKey {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1641a;
    public final Object b;

    public JoinedKey(Integer num, Object obj) {
        this.f1641a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return this.f1641a.equals(joinedKey.f1641a) && Intrinsics.c(this.b, joinedKey.b);
    }

    public final int hashCode() {
        int iHashCode = this.f1641a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.f1641a);
        sb.append(", right=");
        return android.support.v4.media.session.a.s(sb, this.b, ')');
    }
}
