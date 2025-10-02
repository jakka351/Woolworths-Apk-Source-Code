package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FlowExtKt {
    public static final MutableState a(StateFlow stateFlow, Composer composer) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.x(LocalLifecycleOwnerKt.f2808a);
        Lifecycle.State state = Lifecycle.State.g;
        Object value = stateFlow.getValue();
        Lifecycle d = lifecycleOwner.getD();
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
        Object[] objArr = {stateFlow, d, state, emptyCoroutineContext};
        boolean zI = composer.I(d) | composer.r(state.ordinal()) | composer.I(emptyCoroutineContext) | composer.I(stateFlow);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            Object flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(d, state, emptyCoroutineContext, stateFlow, null);
            composer.A(flowExtKt$collectAsStateWithLifecycle$1$1);
            objG = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        return SnapshotStateKt.j(value, objArr, (Function2) objG, composer);
    }
}
