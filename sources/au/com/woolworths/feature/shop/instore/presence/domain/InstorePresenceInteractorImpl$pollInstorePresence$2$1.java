package au.com.woolworths.feature.shop.instore.presence.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$pollInstorePresence$2$1", f = "InstorePresenceInteractor.kt", l = {73, 83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstorePresenceInteractorImpl$pollInstorePresence$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public InstorePresenceAnalyticsProvider p;
    public InstorePresenceAnalyticsProvider q;
    public int r;
    public final /* synthetic */ InstorePresenceInteractorImpl s;
    public final /* synthetic */ long t;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$pollInstorePresence$2$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String str = (String) obj;
            ((InstorePresenceInteractorImpl) this.receiver).getClass();
            return Boolean.valueOf(!(str == null || StringsKt.D(str)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceInteractorImpl$pollInstorePresence$2$1(InstorePresenceInteractorImpl instorePresenceInteractorImpl, long j, Continuation continuation) {
        super(2, continuation);
        this.s = instorePresenceInteractorImpl;
        this.t = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstorePresenceInteractorImpl$pollInstorePresence$2$1(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((InstorePresenceInteractorImpl$pollInstorePresence$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(2:7|8))(8:9|28|10|17|(1:19)(1:23)|24|(3:30|13|(5:16|17|(0)(0)|24|(0)))|26))|12|30|13|(0)|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:10:0x001e, B:17:0x0041, B:19:0x0045), top: B:28:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[PHI: r0
  0x004c: PHI (r0v1 au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider) = 
  (r0v2 au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider)
  (r0v9 au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider)
 binds: [B:22:0x004b, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:30:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl r2 = r12.s
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider r7 = r2.j
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r12.r
            r9 = 2
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L22
            if (r0 == r10) goto L1a
            if (r0 != r9) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider r0 = r12.q
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceAnalyticsProvider r1 = r12.p
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Exception -> L4b
            goto L41
        L22:
            kotlin.ResultKt.b(r13)
        L25:
            au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$pollInstorePresence$2$1$1 r0 = new au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$pollInstorePresence$2$1$1     // Catch: java.lang.Exception -> L4a
            java.lang.Class<au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl> r3 = au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl.class
            java.lang.String r4 = "validateStoreIdForUserInstorePresence"
            java.lang.String r5 = "validateStoreIdForUserInstorePresence(Ljava/lang/String;)Z"
            r6 = 0
            r1 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L4a
            r12.p = r7     // Catch: java.lang.Exception -> L4a
            r12.q = r7     // Catch: java.lang.Exception -> L4a
            r12.r = r10     // Catch: java.lang.Exception -> L4a
            java.io.Serializable r13 = r2.p(r0, r12)     // Catch: java.lang.Exception -> L4a
            if (r13 != r8) goto L3f
            goto L7d
        L3f:
            r0 = r7
            r1 = r0
        L41:
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r13 = (au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store) r13     // Catch: java.lang.Exception -> L4b
            if (r13 == 0) goto L4c
            java.lang.String r13 = r13.getNo()     // Catch: java.lang.Exception -> L4b
            goto L4d
        L4a:
            r1 = r7
        L4b:
            r0 = r1
        L4c:
            r13 = r11
        L4d:
            r0.b = r13
            timber.log.Timber$Forest r13 = timber.log.Timber.f27013a
            java.lang.String r0 = r7.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "user.location: presentStoreByGeoLocation -> "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = " pollPeriodMs: "
            r1.append(r0)
            long r3 = r12.t
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r13.h(r0, r1)
            r12.p = r11
            r12.q = r11
            r12.r = r9
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.b(r3, r12)
            if (r13 != r8) goto L25
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl$pollInstorePresence$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
