package au.com.woolworths.auth.auth0.rewards;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsTokenAndCardInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$refreshAccessToken$2", f = "RewardsAppTokenAuthenticator.kt", l = {282}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsAppTokenAuthenticator$refreshAccessToken$2 extends SuspendLambda implements Function2<FlowCollector<? super RewardsTokenAndCardInfo>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RewardsAppTokenAuthenticator r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppTokenAuthenticator$refreshAccessToken$2(RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, String str, Continuation continuation) {
        super(2, continuation);
        this.r = rewardsAppTokenAuthenticator;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RewardsAppTokenAuthenticator$refreshAccessToken$2 rewardsAppTokenAuthenticator$refreshAccessToken$2 = new RewardsAppTokenAuthenticator$refreshAccessToken$2(this.r, this.s, continuation);
        rewardsAppTokenAuthenticator$refreshAccessToken$2.q = obj;
        return rewardsAppTokenAuthenticator$refreshAccessToken$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAppTokenAuthenticator$refreshAccessToken$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.io.IOException {
        /*
            r10 = this;
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator r0 = r10.r
            kotlin.Lazy r1 = r0.i
            com.google.gson.Gson r2 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r10.p
            r5 = 1
            if (r4 == 0) goto L1c
            if (r4 != r5) goto L14
            kotlin.ResultKt.b(r11)
            goto Lfb
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.q
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            au.com.woolworths.android.onesite.appdata.AppConfig r6 = r0.b
            java.lang.String r6 = r6.d()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "rewards/token"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r4.h(r6)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r6 = r0.f
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r7 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.j
            boolean r6 = r6.c(r7)
            if (r6 == 0) goto L5f
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r6 = r0.c()
            java.lang.String r7 = "access$getRewardsAccountInteractor(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r7)
            au.com.woolworths.android.onesite.modules.common.Region r6 = au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt.a(r6)
            au.com.woolworths.android.onesite.modules.common.Region r7 = au.com.woolworths.android.onesite.modules.common.Region.i
            if (r6 != r7) goto L5f
            r6 = r5
            goto L60
        L5f:
            r6 = 0
        L60:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "x-auth0-ready"
            r4.c(r7, r6)
            okhttp3.RequestBody$Companion r6 = okhttp3.RequestBody.f26692a
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "refreshToken"
            java.lang.String r9 = r10.s
            r7.<init>(r8, r9)
            java.util.Map r7 = kotlin.collections.MapsKt.i(r7)
            java.lang.String r7 = r2.j(r7)
            java.lang.String r8 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r8)
            okhttp3.MediaType r8 = au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticatorKt.f4608a
            r6.getClass()
            okhttp3.RequestBody$Companion$toRequestBody$3 r6 = okhttp3.RequestBody.Companion.b(r7, r8)
            r4.f(r6)
            okhttp3.Request r6 = new okhttp3.Request
            r6.<init>(r4)
            java.lang.Object r4 = r1.getD()
            okhttp3.OkHttpClient r4 = (okhttp3.OkHttpClient) r4
            okhttp3.internal.connection.RealCall r4 = r4.a(r6)
            okhttp3.Response r4 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r4)
            okhttp3.ResponseBody r6 = r4.j
            kotlin.jvm.internal.Intrinsics.e(r6)
            java.lang.String r6 = r6.d()
            kotlin.coroutines.CoroutineContext r7 = r10.getE()
            boolean r7 = kotlinx.coroutines.JobKt.h(r7)
            if (r7 == 0) goto Lfb
            boolean r7 = r4.s
            if (r7 == 0) goto Ld9
            au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$toTokenInfo$1 r0 = new au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$toTokenInfo$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r0 = r2.f(r6, r0)
            au.com.woolworths.android.onesite.network.Component r0 = (au.com.woolworths.android.onesite.network.Component) r0
            java.lang.Object r0 = r0.b()
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenData r0 = (au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenData) r0
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenAndCardInfo r0 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenDataKt.a(r0)
            r10.p = r5
            java.lang.Object r11 = r11.emit(r0, r10)
            if (r11 != r3) goto Lfb
            return r3
        Ld9:
            int r11 = r4.g
            r2 = 401(0x191, float:5.62E-43)
            if (r11 != r2) goto Lef
            java.lang.Object r11 = r1.getD()
            okhttp3.OkHttpClient r11 = (okhttp3.OkHttpClient) r11
            okhttp3.Dispatcher r11 = r11.f26688a
            r11.a()
            r11 = 0
            r0.d(r11)
            goto Lfb
        Lef:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Refresh access token failed: "
            java.lang.String r0 = YU.a.A(r0, r6)
            r11.<init>(r0)
            throw r11
        Lfb:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator$refreshAccessToken$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
