package androidx.compose.runtime;

import androidx.compose.runtime.collection.ScatterSetWrapper;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void a(Object obj);

    void c(ScatterSetWrapper scatterSetWrapper);

    boolean e(Set set);

    void f(ArrayList arrayList);

    void g();

    void i();

    Object j(ControlledComposition controlledComposition, int i, Function0 function0);

    boolean k();

    void m(Function0 function0);

    void n();

    boolean o();

    void p(Object obj);

    void s();

    void u();
}
