package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.ui.unit.IntOffset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final MutableState a(StateFlow stateFlow, Composer composer) {
        return SnapshotStateKt__SnapshotFlowKt.a(stateFlow, composer);
    }

    public static final MutableVector b() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.b;
        MutableVector mutableVector = (MutableVector) snapshotThreadLocal.a();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.b(mutableVector2);
        return mutableVector2;
    }

    public static final State c(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f1668a;
        return new DerivedSnapshotState(snapshotMutationPolicy, function0);
    }

    public static final State d(Function0 function0) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f1668a;
        return new DerivedSnapshotState(null, function0);
    }

    public static final MutableState e(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(obj, snapshotMutationPolicy);
    }

    public static MutableState f(Object obj) {
        return new ParcelableSnapshotMutableState(obj, StructuralEqualityPolicy.f1671a);
    }

    public static final SnapshotMutationPolicy g() {
        return NeverEqualPolicy.f1650a;
    }

    public static final MutableState h(Composer composer, Object obj, Function2 function2) {
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = f(obj);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        boolean zI = composer.I(function2);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null);
            composer.A(objG2);
        }
        EffectsKt.e(composer, Unit.f24250a, (Function2) objG2);
        return mutableState;
    }

    public static final MutableState i(IntOffset intOffset, Double d, Double d2, Double d3, Function2 function2, Composer composer) {
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = f(intOffset);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        boolean zI = composer.I(function2);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new SnapshotStateKt__ProduceStateKt$produceState$4$1(function2, mutableState, null);
            composer.A(objG2);
        }
        Function2 function22 = (Function2) objG2;
        CoroutineContext coroutineContextY = composer.y();
        boolean zN = composer.n(d) | composer.n(d2) | composer.n(d3);
        Object objG3 = composer.G();
        if (zN || objG3 == composer$Companion$Empty$1) {
            objG3 = new LaunchedEffectImpl(coroutineContextY, function22);
            composer.A(objG3);
        }
        return mutableState;
    }

    public static final MutableState j(Object obj, Object[] objArr, Function2 function2, Composer composer) {
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = f(obj);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zI = composer.I(function2);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(function2, mutableState, null);
            composer.A(objG2);
        }
        EffectsKt.g(objArrCopyOf, (Function2) objG2, composer);
        return mutableState;
    }

    public static final SnapshotMutationPolicy k() {
        return ReferentialEqualityPolicy.f1660a;
    }

    public static final MutableState l(Object obj, Composer composer) {
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = f(obj);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        mutableState.setValue(obj);
        return mutableState;
    }

    public static final Flow m(Function0 function0) {
        return SnapshotStateKt__SnapshotFlowKt.b(function0);
    }

    public static final SnapshotMutationPolicy n() {
        return StructuralEqualityPolicy.f1671a;
    }
}
