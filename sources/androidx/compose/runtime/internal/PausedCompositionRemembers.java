package androidx.compose.runtime.internal;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PausedCompositionRemembers implements RememberObserver {
    public final Set d;
    public final MutableVector e = new MutableVector(new RememberObserverHolder[16], 0);

    public PausedCompositionRemembers(Set set) {
        this.d = set;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        MutableVector mutableVector = this.e;
        Object[] objArr = mutableVector.d;
        int i = mutableVector.f;
        for (int i2 = 0; i2 < i; i2++) {
            RememberObserver rememberObserver = ((RememberObserverHolder) objArr[i2]).f1662a;
            this.d.remove(rememberObserver);
            rememberObserver.c();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
    }
}
