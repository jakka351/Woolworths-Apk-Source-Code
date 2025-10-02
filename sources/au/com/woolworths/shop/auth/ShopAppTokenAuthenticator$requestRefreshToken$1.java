package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.models.authentication.RefreshResult;
import au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry;
import au.com.woolworths.shop.auth.data.MemberData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1", f = "ShopAppTokenAuthenticator.kt", l = {167, 173, 185, 190}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShopAppTokenAuthenticator$requestRefreshToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Member q;
    public final /* synthetic */ ShopAppTokenAuthenticator r;
    public final /* synthetic */ Ref.ObjectRef s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Throwable, Continuation<? super Boolean>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((RefreshTokenFlowRetry) this.receiver).a((Throwable) obj, (Continuation) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "refreshResult", "Lau/com/woolworths/android/onesite/models/authentication/RefreshResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$2", f = "ShopAppTokenAuthenticator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<RefreshResult, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Ref.ObjectRef q;
        public final /* synthetic */ ShopAppTokenAuthenticator r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef objectRef, ShopAppTokenAuthenticator shopAppTokenAuthenticator, Continuation continuation) {
            super(2, continuation);
            this.q = objectRef;
            this.r = shopAppTokenAuthenticator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, this.r, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((RefreshResult) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            RefreshResult refreshResult = (RefreshResult) this.p;
            this.q.d = refreshResult.access_token;
            ShopAccountInteractor shopAccountInteractor = this.r.f;
            synchronized (shopAccountInteractor) {
                Member memberN = shopAccountInteractor.n();
                if (memberN != null) {
                    memberN.setAccessToken(refreshResult.access_token);
                    memberN.setRefreshToken(refreshResult.refresh_token);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    String expires_in = refreshResult.expires_in;
                    Intrinsics.g(expires_in, "expires_in");
                    memberN.setExpirySinceEpoch(jCurrentTimeMillis + timeUnit.toMillis(Long.parseLong(expires_in)));
                    memberN.setShopperId(refreshResult.shopperid);
                    String strJ = shopAccountInteractor.e.j(shopAccountInteractor.n());
                    AccountRepository accountRepository = shopAccountInteractor.b;
                    Intrinsics.e(strJ);
                    accountRepository.a(strJ);
                    FirebaseAnalyticsLogger firebaseAnalyticsLogger = shopAccountInteractor.c;
                    String shopperId = memberN.getShopperId();
                    Intrinsics.g(shopperId, "getShopperId(...)");
                    firebaseAnalyticsLogger.a(shopperId);
                    shopAccountInteractor.d.b(memberN.getShopperId());
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/shop/auth/data/MemberData;", "<unused var>", "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$3", f = "ShopAppTokenAuthenticator.kt", l = {179}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function4<FlowCollector<? super MemberData>, Throwable, Long, Continuation<? super Boolean>, Object> {
        public int p;
        public /* synthetic */ long q;

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long jLongValue = ((Number) obj3).longValue();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(4, (Continuation) obj4);
            anonymousClass3.q = jLongValue;
            return anonymousClass3.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            boolean z = true;
            if (i == 0) {
                ResultKt.b(obj);
                long j = this.q;
                if (j < 3) {
                    this.p = 1;
                    if (DelayKt.b((j * 300) + 300, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    z = false;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "memberData", "Lau/com/woolworths/shop/auth/data/MemberData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$4", f = "ShopAppTokenAuthenticator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<MemberData, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Ref.ObjectRef q;
        public final /* synthetic */ ShopAppTokenAuthenticator r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref.ObjectRef objectRef, ShopAppTokenAuthenticator shopAppTokenAuthenticator, Continuation continuation) {
            super(2, continuation);
            this.q = objectRef;
            this.r = shopAppTokenAuthenticator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.q, this.r, continuation);
            anonymousClass4.p = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((MemberData) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass4.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            MemberData memberData = (MemberData) this.p;
            this.q.d = memberData.getAccessToken();
            ShopAccountInteractor shopAccountInteractor = this.r.f;
            synchronized (shopAccountInteractor) {
                Member memberN = shopAccountInteractor.n();
                if (memberN != null) {
                    memberN.setAccessToken(memberData.getAccessToken());
                    memberN.setExpirySinceEpoch(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(Long.parseLong(memberData.getExpiresIn())));
                    memberN.setShopperId(memberData.getShopperId());
                    String strJ = shopAccountInteractor.e.j(shopAccountInteractor.n());
                    AccountRepository accountRepository = shopAccountInteractor.b;
                    Intrinsics.e(strJ);
                    accountRepository.a(strJ);
                    FirebaseAnalyticsLogger firebaseAnalyticsLogger = shopAccountInteractor.c;
                    String shopperId = memberN.getShopperId();
                    Intrinsics.g(shopperId, "getShopperId(...)");
                    firebaseAnalyticsLogger.a(shopperId);
                    shopAccountInteractor.d.b(memberN.getShopperId());
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppTokenAuthenticator$requestRefreshToken$1(Member member, ShopAppTokenAuthenticator shopAppTokenAuthenticator, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.q = member;
        this.r = shopAppTokenAuthenticator;
        this.s = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopAppTokenAuthenticator$requestRefreshToken$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShopAppTokenAuthenticator$requestRefreshToken$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.h(r2, r4, r20) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.h(r6, r2, r20) == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
    
        if (au.com.woolworths.shop.auth.ShopAppTokenAuthenticator.c(r1, r2, r4, r20) == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.auth.ShopAppTokenAuthenticator$requestRefreshToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
