package ovh.plrapps.mapcompose.api;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.api.LayoutApiKt$scrollTo$2$1", f = "LayoutApi.kt", l = {314}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class LayoutApiKt$scrollTo$2$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ ZoomPanRotateState q;
    public final /* synthetic */ double r;
    public final /* synthetic */ double s;
    public final /* synthetic */ double t;
    public final /* synthetic */ AnimationSpec u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutApiKt$scrollTo$2$1(ZoomPanRotateState zoomPanRotateState, double d, double d2, double d3, AnimationSpec animationSpec, Continuation continuation) {
        super(1, continuation);
        this.q = zoomPanRotateState;
        this.r = d;
        this.s = d2;
        this.t = d3;
        this.u = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LayoutApiKt$scrollTo$2$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LayoutApiKt$scrollTo$2$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
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
        this.p = 1;
        Object objE = this.q.E(this.r, this.s, this.t, this.u, this);
        return objE == coroutineSingletons ? coroutineSingletons : objE;
    }
}
