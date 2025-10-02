package coil3;

import coil3.intercept.RealInterceptorChain;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.size.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    public int p;
    public final /* synthetic */ ImageRequest q;
    public final /* synthetic */ RealImageLoader r;
    public final /* synthetic */ Size s;
    public final /* synthetic */ EventListener t;
    public final /* synthetic */ Image u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(ImageRequest imageRequest, RealImageLoader realImageLoader, Size size, EventListener eventListener, Image image, Continuation continuation) {
        super(2, continuation);
        this.q = imageRequest;
        this.r = realImageLoader;
        this.s = size;
        this.t = eventListener;
        this.u = image;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$result$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        List list = this.r.d.f13039a;
        boolean z = this.u != null;
        ImageRequest imageRequest = this.q;
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(imageRequest, list, 0, imageRequest, this.s, this.t, z);
        this.p = 1;
        Object objB = realInterceptorChain.b(this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
