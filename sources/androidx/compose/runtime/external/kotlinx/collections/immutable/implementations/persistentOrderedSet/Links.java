package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Links {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1685a;
    public final Object b;

    public Links(Object obj, Object obj2) {
        this.f1685a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Links() {
        EndOfChain endOfChain = EndOfChain.f1687a;
        this(endOfChain, endOfChain);
    }

    public Links(Object obj) {
        this(obj, EndOfChain.f1687a);
    }
}
