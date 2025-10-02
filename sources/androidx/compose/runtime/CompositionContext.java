package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public abstract void a(CompositionImpl compositionImpl, ComposableLambdaImpl composableLambdaImpl);

    public abstract void b(MovableContentStateReference movableContentStateReference);

    public void c() {
    }

    public abstract boolean d();

    /* renamed from: e */
    public abstract boolean getB();

    /* renamed from: f */
    public abstract boolean getC();

    public PersistentCompositionLocalMap g() {
        return CompositionContextKt.f1629a;
    }

    /* renamed from: h */
    public abstract int getF1626a();

    /* renamed from: i */
    public abstract CoroutineContext getW();

    /* renamed from: j */
    public CompositionObserverHolder getD() {
        return null;
    }

    public abstract void k(MovableContentStateReference movableContentStateReference);

    public abstract void l(CompositionImpl compositionImpl);

    public abstract void m(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier applier);

    public MovableContentState n(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void o(Set set) {
    }

    public void p(ComposerImpl composerImpl) {
    }

    public abstract void q(CompositionImpl compositionImpl);

    public void r() {
    }

    public void s(Composer composer) {
    }

    public abstract void t(CompositionImpl compositionImpl);
}
