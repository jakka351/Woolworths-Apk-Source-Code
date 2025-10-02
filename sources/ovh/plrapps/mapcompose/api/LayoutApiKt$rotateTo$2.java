package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.TweenSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import ovh.plrapps.mapcompose.ui.state.MapState;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt$rotateTo$2", f = "LayoutApi.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LayoutApiKt$rotateTo$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ MapState q;
    public final /* synthetic */ float r;
    public final /* synthetic */ TweenSpec s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutApiKt$rotateTo$2(MapState mapState, float f, TweenSpec tweenSpec, Continuation continuation) {
        super(1, continuation);
        this.q = mapState;
        this.r = f;
        this.s = tweenSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LayoutApiKt$rotateTo$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LayoutApiKt$rotateTo$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        ZoomPanRotateState zoomPanRotateState = this.q.b;
        this.p = 1;
        Object objD = zoomPanRotateState.D(this.r, this.s, this);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }
}
