package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DisposableEffectImpl implements RememberObserver {
    public final Function1 d;
    public DisposableEffectResult e;

    public DisposableEffectImpl(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        this.e = (DisposableEffectResult) this.d.invoke(EffectsKt.f1636a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        DisposableEffectResult disposableEffectResult = this.e;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.e = null;
    }
}
