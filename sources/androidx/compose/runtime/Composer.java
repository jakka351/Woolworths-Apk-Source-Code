package androidx.compose.runtime;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.tooling.CompositionData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Composer {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final Composer$Companion$Empty$1 f1624a = new Composer$Companion$Empty$1();
    }

    void A(Object obj);

    void B(MovableContent movableContent, Object obj);

    void C();

    RecomposeScopeImpl D();

    void E();

    void F(int i);

    Object G();

    CompositionData H();

    default boolean I(Object obj) {
        return n(obj);
    }

    void J(int i, Object obj);

    void K(Function0 function0);

    /* renamed from: L */
    int getP();

    void M();

    void N();

    void a(Object obj, Function2 function2);

    void b(boolean z);

    boolean c();

    PersistentCompositionLocalMap d();

    void e();

    void f();

    void g(Function0 function0);

    void h(Object obj);

    void i();

    void j();

    void k(RecomposeScope recomposeScope);

    void l();

    ComposerImpl.CompositionContextImpl m();

    boolean n(Object obj);

    void o(int i);

    default boolean p(boolean z) {
        return p(z);
    }

    default boolean q(float f) {
        return q(f);
    }

    default boolean r(int i) {
        return r(i);
    }

    default boolean s(long j) {
        return s(j);
    }

    default boolean t(double d) {
        return t(d);
    }

    /* renamed from: u */
    boolean getO();

    ComposerImpl v(int i);

    Applier w();

    Object x(CompositionLocal compositionLocal);

    CoroutineContext y();

    boolean z(int i, boolean z);
}
