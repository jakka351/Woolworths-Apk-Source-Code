package coil.intercept;

import coil.EventListener;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.p
            coil.intercept.EngineInterceptor r2 = r11.q
            coil.request.ImageRequest r3 = r11.r
            r8 = 1
            if (r1 == 0) goto L1a
            if (r1 != r8) goto L12
            kotlin.ResultKt.b(r12)
            r1 = r11
            goto L2e
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.ResultKt.b(r12)
            r11.p = r8
            java.lang.Object r4 = r11.s
            coil.request.Options r5 = r11.t
            coil.EventListener r6 = r11.u
            r7 = r11
            java.lang.Object r12 = coil.intercept.EngineInterceptor.c(r2, r3, r4, r5, r6, r7)
            r1 = r7
            if (r12 != r0) goto L2e
            return r0
        L2e:
            coil.intercept.EngineInterceptor$ExecuteResult r12 = (coil.intercept.EngineInterceptor.ExecuteResult) r12
            coil.memory.MemoryCacheService r0 = r2.c
            coil.request.CachePolicy r2 = r3.n
            boolean r2 = r2.e
            r4 = 0
            r5 = 0
            coil.memory.MemoryCache$Key r6 = r1.v
            if (r2 != 0) goto L3f
        L3c:
            r0 = r4
            r2 = r0
            goto L80
        L3f:
            coil.RealImageLoader r0 = r0.f13003a
            coil.memory.MemoryCache r0 = r0.e()
            if (r0 == 0) goto L3c
            if (r6 != 0) goto L4a
            goto L3c
        L4a:
            android.graphics.drawable.Drawable r2 = r12.f12997a
            boolean r7 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r7 == 0) goto L53
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L54
        L53:
            r2 = r5
        L54:
            if (r2 == 0) goto L3c
            android.graphics.Bitmap r2 = r2.getBitmap()
            if (r2 != 0) goto L5d
            goto L3c
        L5d:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            boolean r9 = r12.b
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r10 = "coil#is_sampled"
            r7.put(r10, r9)
            java.lang.String r9 = r12.d
            if (r9 == 0) goto L76
            java.lang.String r10 = "coil#disk_cache_key"
            r7.put(r10, r9)
        L76:
            coil.memory.MemoryCache$Value r9 = new coil.memory.MemoryCache$Value
            r9.<init>(r2, r7)
            r0.c(r6, r9)
            r2 = r4
            r0 = r8
        L80:
            android.graphics.drawable.Drawable r4 = r12.f12997a
            r7 = r6
            coil.decode.DataSource r6 = r12.c
            if (r0 == 0) goto L89
        L87:
            r0 = r8
            goto L8b
        L89:
            r7 = r5
            goto L87
        L8b:
            java.lang.String r8 = r12.d
            boolean r9 = r12.b
            android.graphics.Bitmap$Config[] r12 = coil.util.Utils.f13033a
            coil.intercept.Interceptor$Chain r12 = r1.w
            boolean r5 = r12 instanceof coil.intercept.RealInterceptorChain
            if (r5 == 0) goto La0
            coil.intercept.RealInterceptorChain r12 = (coil.intercept.RealInterceptorChain) r12
            boolean r12 = r12.g
            if (r12 == 0) goto La0
            r10 = r0
        L9e:
            r5 = r3
            goto La2
        La0:
            r10 = r2
            goto L9e
        La2:
            coil.request.SuccessResult r3 = new coil.request.SuccessResult
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$intercept$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
