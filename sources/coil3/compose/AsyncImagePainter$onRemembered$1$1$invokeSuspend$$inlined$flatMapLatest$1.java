package coil3.compose;

import coil3.compose.AsyncImagePainter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0015\u0010\u0005\u001a\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bH\n¨\u0006\t"}, d2 = {"<anonymous>", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.compose.AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1", f = "AsyncImagePainter.kt", l = {189}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super AsyncImagePainter.Input>, Unit, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AsyncImagePainter s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1(AsyncImagePainter asyncImagePainter, Continuation continuation) {
        super(3, continuation);
        this.s = asyncImagePainter;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1 asyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1 = new AsyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1(this.s, (Continuation) obj3);
        asyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1.q = (FlowCollector) obj;
        asyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1.r = obj2;
        return asyncImagePainter$onRemembered$1$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            MutableStateFlow mutableStateFlow = this.s.u;
            this.p = 1;
            if (FlowKt.u(flowCollector, mutableStateFlow, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
