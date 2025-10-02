package ovh.plrapps.mapcompose.api;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.MutexImpl;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt", f = "LayoutApi.kt", l = {249}, m = "getLayoutSizeFlow")
/* loaded from: classes8.dex */
final class LayoutApiKt$getLayoutSizeFlow$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        int i = this.q | Integer.MIN_VALUE;
        this.q = i;
        MutexImpl mutexImpl = LayoutApiKt.f26931a;
        int i2 = i - Integer.MIN_VALUE;
        this.q = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        final ZoomPanRotateState zoomPanRotateState = null;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return SnapshotStateKt.m(new Function0<IntSize>() { // from class: ovh.plrapps.mapcompose.api.LayoutApiKt$getLayoutSizeFlow$2$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new IntSize(zoomPanRotateState.t());
            }
        });
    }
}
