package coil;

import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.target.ViewTarget;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ImageRequest r;
    public final /* synthetic */ RealImageLoader s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(RealImageLoader realImageLoader, ImageRequest imageRequest, Continuation continuation) {
        super(2, continuation);
        this.r = imageRequest;
        this.s = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.s, this.r, continuation);
        realImageLoader$execute$2.q = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$execute$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        CoroutineScope coroutineScope = (CoroutineScope) this.q;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcherT = MainDispatcherLoader.f24726a.T();
        RealImageLoader realImageLoader = this.s;
        ImageRequest imageRequest = this.r;
        Deferred deferredA = BuildersKt.a(coroutineScope, mainCoroutineDispatcherT, new RealImageLoader$execute$2$job$1(realImageLoader, imageRequest, null), 2);
        if (imageRequest.c instanceof ViewTarget) {
            Utils.c(null);
            throw null;
        }
        this.p = 1;
        Object objAwait = deferredA.await(this);
        return objAwait == coroutineSingletons ? coroutineSingletons : objAwait;
    }
}
