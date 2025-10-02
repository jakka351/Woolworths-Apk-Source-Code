package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2", f = "EverydayExtraFinalGlanceBottomSheetViewModel.kt", l = {97, 114, 130}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraFinalGlanceBottomSheetViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2(EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraFinalGlanceBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r1.z(r11, r10) != r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r1.z(r11, r10) != r4) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel r0 = r10.q
            kotlinx.coroutines.channels.BufferedChannel r1 = r0.i
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r2 = r0.f
            kotlinx.coroutines.flow.MutableStateFlow r3 = r0.g
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r10.p
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L28
            if (r5 == r8) goto L24
            if (r5 == r7) goto L17
            if (r5 != r6) goto L1c
        L17:
            kotlin.ResultKt.b(r11)
            goto Ldf
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto L39
        L28:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.feature.rewards.everydayextras.signup.finalglance.EverydayExtrasFinalGlanceInteractorImpl r11 = r0.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.String r5 = r0.k     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r10.p = r8     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.Object r11 = r11.a(r5, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r11 != r4) goto L39
            goto Lde
        L39:
            au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeData r11 = (au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeData) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            boolean r5 = r11 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r8 = 0
            if (r5 == 0) goto L55
            au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding r11 = (au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action r5 = au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics.Finalglance.Action.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r2.g(r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r5 = androidx.lifecycle.ViewModelKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1 r9 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r9.<init>(r0, r11, r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            kotlinx.coroutines.BuildersKt.c(r5, r8, r8, r9, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto Ldf
        L55:
            boolean r5 = r11 instanceof au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r5 == 0) goto L69
            au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog r11 = (au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r5 = androidx.lifecycle.ViewModelKt.a(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeAlert$1 r9 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeAlert$1     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r9.<init>(r0, r11, r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            kotlinx.coroutines.BuildersKt.c(r5, r8, r8, r9, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto Ldf
        L69:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r11.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            throw r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L6f au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
        L6f:
            au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action r11 = au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics.Finalglance.Action.f
            r2.g(r11)
            java.lang.Object r11 = r3.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState r11 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState) r11
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState$Content r11 = r11.b()
            if (r11 == 0) goto L93
        L80:
            java.lang.Object r0 = r3.getValue()
            r2 = r0
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState r2 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState) r2
            au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState r2 = au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState.g
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState$Content r2 = au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState.Content.c(r11, r2)
            boolean r0 = r3.d(r0, r2)
            if (r0 == 0) goto L80
        L93:
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$Actions$ShowError r11 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$Actions$ShowError
            r0 = 2132017848(0x7f1402b8, float:1.9673986E38)
            r2 = 2132017847(0x7f1402b7, float:1.9673984E38)
            r11.<init>(r0, r2)
            r10.p = r6
            java.lang.Object r11 = r1.z(r11, r10)
            if (r11 != r4) goto Ldf
            goto Lde
        La7:
            au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics$Finalglance$Action r11 = au.com.woolworths.analytics.rewards.everydayextrasignup.EdxFinalglanceAnalytics.Finalglance.Action.f
            r2.g(r11)
            java.lang.Object r11 = r3.getValue()
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState r11 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState) r11
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState$Content r11 = r11.b()
            if (r11 == 0) goto Lcb
        Lb8:
            java.lang.Object r0 = r3.getValue()
            r2 = r0
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState r2 = (au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState) r2
            au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState r2 = au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState.g
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$ViewState$Content r2 = au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract.ViewState.Content.c(r11, r2)
            boolean r0 = r3.d(r0, r2)
            if (r0 == 0) goto Lb8
        Lcb:
            au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$Actions$ShowError r11 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract$Actions$ShowError
            r0 = 2132017845(0x7f1402b5, float:1.967398E38)
            r2 = 2132017844(0x7f1402b4, float:1.9673978E38)
            r11.<init>(r0, r2)
            r10.p = r7
            java.lang.Object r11 = r1.z(r11, r10)
            if (r11 != r4) goto Ldf
        Lde:
            return r4
        Ldf:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onCtaClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
