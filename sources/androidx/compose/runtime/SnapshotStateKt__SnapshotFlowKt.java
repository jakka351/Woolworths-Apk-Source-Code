package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final MutableState a(StateFlow stateFlow, Composer composer) {
        Object value = stateFlow.getValue();
        Object obj = EmptyCoroutineContext.d;
        boolean zI = composer.I(obj) | composer.I(stateFlow);
        Object objG = composer.G();
        Object obj2 = Composer.Companion.f1624a;
        if (zI || objG == obj2) {
            objG = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(stateFlow, null);
            composer.A(objG);
        }
        Function2 function2 = (Function2) objG;
        Object objG2 = composer.G();
        if (objG2 == obj2) {
            objG2 = SnapshotStateKt.f(value);
            composer.A(objG2);
        }
        MutableState mutableState = (MutableState) objG2;
        boolean zI2 = composer.I(function2);
        Object objG3 = composer.G();
        if (zI2 || objG3 == obj2) {
            objG3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(function2, mutableState, null);
            composer.A(objG3);
        }
        EffectsKt.f(stateFlow, obj, (Function2) objG3, composer);
        return mutableState;
    }

    public static final Flow b(Function0 function0) {
        return FlowKt.B(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(function0, null));
    }
}
