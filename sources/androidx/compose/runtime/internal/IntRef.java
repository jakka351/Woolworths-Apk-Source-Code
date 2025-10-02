package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRef {

    /* renamed from: a, reason: collision with root package name */
    public int f1689a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f1689a);
        sb.append(")@");
        int iHashCode = hashCode();
        CharsKt.b(16);
        String string = Integer.toString(iHashCode, 16);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
