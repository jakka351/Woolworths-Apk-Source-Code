package coil3.intercept;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.fetch.SourceFetchResult;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    public int p;
    public final /* synthetic */ EngineInterceptor q;
    public final /* synthetic */ Ref.ObjectRef r;
    public final /* synthetic */ Ref.ObjectRef s;
    public final /* synthetic */ ImageRequest t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Ref.ObjectRef v;
    public final /* synthetic */ EventListener w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, ImageRequest imageRequest, Object obj, Ref.ObjectRef objectRef3, EventListener eventListener, Continuation continuation) {
        super(2, continuation);
        this.q = engineInterceptor;
        this.r = objectRef;
        this.s = objectRef2;
        this.t = imageRequest;
        this.u = obj;
        this.v = objectRef3;
        this.w = eventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$execute$executeResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
        SourceFetchResult sourceFetchResult = (SourceFetchResult) this.r.d;
        ComponentRegistry componentRegistry = (ComponentRegistry) this.s.d;
        Options options = (Options) this.v.d;
        this.p = 1;
        Object objB = EngineInterceptor.b(this.q, sourceFetchResult, componentRegistry, this.t, this.u, options, this.w, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
