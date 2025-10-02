package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Applier<N> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default void a(Object obj, Function2 function2) {
        function2.invoke(g(), obj);
    }

    void b(int i, int i2);

    default void c() {
    }

    default void d() {
        Object objG = g();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = objG instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) objG : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.k();
        }
    }

    void e(int i, int i2, int i3);

    void f(int i, Object obj);

    Object g();

    void h(int i, Object obj);

    void i(Object obj);

    void j();
}
