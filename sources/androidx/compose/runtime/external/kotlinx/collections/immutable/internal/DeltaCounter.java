package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeltaCounter {

    /* renamed from: a, reason: collision with root package name */
    public int f1686a = 0;

    public final void a(int i) {
        this.f1686a += i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.f1686a == ((DeltaCounter) obj).f1686a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1686a);
    }

    public final String toString() {
        return a.l(new StringBuilder("DeltaCounter(count="), this.f1686a, ')');
    }
}
