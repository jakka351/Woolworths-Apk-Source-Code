package au.com.woolworths.auth.auth0.rewards;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardDataKt;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardUpdate;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1", f = "RewardsAppTokenAuthenticator.kt", l = {164, 177, 191}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsAppTokenAuthenticator$requestAccessToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    public RewardsAppTokenAuthenticator p;
    public Ref.ObjectRef q;
    public int r;
    public final /* synthetic */ RewardsAppTokenAuthenticator s;
    public final /* synthetic */ RewardsTokenInfo t;
    public final /* synthetic */ Ref.ObjectRef u;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenAndCardInfo;", "<unused var>", "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1$1", f = "RewardsAppTokenAuthenticator.kt", l = {171}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function4<FlowCollector<? super RewardsTokenAndCardInfo>, Throwable, Long, Continuation<? super Boolean>, Object> {
        public int p;
        public /* synthetic */ long q;

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long jLongValue = ((Number) obj3).longValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
            anonymousClass1.q = jLongValue;
            return anonymousClass1.invokeSuspend(Unit.f24250a);
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "newTokenInfo", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenAndCardInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1$2", f = "RewardsAppTokenAuthenticator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<RewardsTokenAndCardInfo, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ RewardsAppTokenAuthenticator q;
        public final /* synthetic */ Ref.ObjectRef r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.q = rewardsAppTokenAuthenticator;
            this.r = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, this.r, continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((RewardsTokenAndCardInfo) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            RewardsTokenAndCardInfo rewardsTokenAndCardInfo = (RewardsTokenAndCardInfo) this.p;
            RewardsAccountInteractor rewardsAccountInteractorC = this.q.c();
            rewardsAccountInteractorC.setTokenData(rewardsTokenAndCardInfo.f4399a);
            RewardsCardUpdate rewardsCardUpdate = rewardsTokenAndCardInfo.b;
            if (rewardsCardUpdate != null) {
                RewardsCardData cardData = rewardsAccountInteractorC.getB();
                rewardsAccountInteractorC.setCardData(cardData != null ? RewardsCardDataKt.b(cardData, rewardsCardUpdate) : null);
            }
            this.r.d = rewardsTokenAndCardInfo.f4399a.getAccessToken();
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppTokenAuthenticator$requestAccessToken$1(RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, RewardsTokenInfo rewardsTokenInfo, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.s = rewardsAppTokenAuthenticator;
        this.t = rewardsTokenInfo;
        this.u = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsAppTokenAuthenticator$requestAccessToken$1(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAppTokenAuthenticator$requestAccessToken$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if (r2 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$requestAccessToken$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
