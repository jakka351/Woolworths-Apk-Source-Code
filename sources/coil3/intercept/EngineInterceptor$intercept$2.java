package coil3.intercept;

import android.content.Context;
import coil3.EventListener;
import coil3.Image;
import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.Interceptor;
import coil3.memory.MemoryCache;
import coil3.memory.MemoryCacheService;
import coil3.request.ImageRequest;
import coil3.request.Options;
import coil3.request.SuccessResult;
import coil3.util.AndroidSystemCallbacks;
import coil3.util.UtilsKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {66}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
    public int p;
    public final /* synthetic */ EngineInterceptor q;
    public final /* synthetic */ ImageRequest r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Options t;
    public final /* synthetic */ EventListener u;
    public final /* synthetic */ MemoryCache.Key v;
    public final /* synthetic */ Interceptor.Chain w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation continuation) {
        super(2, continuation);
        this.q = engineInterceptor;
        this.r = imageRequest;
        this.s = obj;
        this.t = options;
        this.u = eventListener;
        this.v = key;
        this.w = chain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$intercept$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        boolean z;
        MemoryCache memoryCacheD;
        MemoryCache.Key key = this.v;
        EngineInterceptor engineInterceptor = this.q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            EngineInterceptor engineInterceptor2 = this.q;
            ImageRequest imageRequest = this.r;
            Object obj2 = this.s;
            Options options = this.t;
            EventListener eventListener = this.u;
            this.p = 1;
            objC = EngineInterceptor.c(engineInterceptor2, imageRequest, obj2, options, eventListener, this);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objC = obj;
        }
        EngineInterceptor.ExecuteResult executeResult = (EngineInterceptor.ExecuteResult) objC;
        AndroidSystemCallbacks androidSystemCallbacks = engineInterceptor.b;
        synchronized (androidSystemCallbacks) {
            try {
                RealImageLoader realImageLoader = (RealImageLoader) androidSystemCallbacks.d.get();
                if (realImageLoader == null) {
                    androidSystemCallbacks.a();
                } else if (androidSystemCallbacks.e == null) {
                    Context context = realImageLoader.f13050a.f13051a;
                    androidSystemCallbacks.e = context;
                    context.registerComponentCallbacks(androidSystemCallbacks);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MemoryCacheService memoryCacheService = engineInterceptor.d;
        ImageRequest imageRequest2 = this.r;
        if (key == null || !imageRequest2.j.e || !executeResult.f13109a.a() || (memoryCacheD = memoryCacheService.f13115a.d()) == null) {
            z = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(executeResult.b));
            String str = executeResult.d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            memoryCacheD.c(key, new MemoryCache.Value(executeResult.f13109a, linkedHashMap));
            z = true;
        }
        Image image = executeResult.f13109a;
        ImageRequest imageRequest3 = this.r;
        DataSource dataSource = executeResult.c;
        if (!z) {
            key = null;
        }
        MemoryCache.Key key2 = key;
        String str2 = executeResult.d;
        boolean z2 = executeResult.b;
        Interceptor.Chain chain = this.w;
        Function1 function1 = UtilsKt.f13156a;
        return new SuccessResult(image, imageRequest3, dataSource, key2, str2, z2, (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).g);
    }
}
