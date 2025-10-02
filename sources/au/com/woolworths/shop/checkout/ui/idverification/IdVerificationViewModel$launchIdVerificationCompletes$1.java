package au.com.woolworths.shop.checkout.ui.idverification;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel$launchIdVerificationCompletes$1", f = "IdVerificationViewModel.kt", l = {86, 88, 94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IdVerificationViewModel$launchIdVerificationCompletes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ IdVerificationViewModel q;
    public final /* synthetic */ Uri r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationViewModel$launchIdVerificationCompletes$1(IdVerificationViewModel idVerificationViewModel, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.q = idVerificationViewModel;
        this.r = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdVerificationViewModel$launchIdVerificationCompletes$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IdVerificationViewModel$launchIdVerificationCompletes$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r2.emit(r0, r10) == r3) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel r0 = r10.q
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.g
            kotlinx.coroutines.flow.SharedFlowImpl r2 = r0.i
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r10.p
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L2a
            if (r4 == r7) goto L26
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto Lb6
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto L75
        L26:
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto L5f
        L2a:
            kotlin.ResultKt.b(r11)
            kotlinx.coroutines.flow.MutableStateFlow r11 = r0.h
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState r4 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState$Content$Loading r8 = au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState.Content.Loading.f10805a
            r4.<init>(r8)
            r11.setValue(r4)
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationInteractor r11 = r0.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            android.net.Uri r4 = r10.r     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.String r8 = "guid"
            java.lang.String r4 = r4.getQueryParameter(r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r4 != 0) goto L47
            java.lang.String r4 = ""
        L47:
            r10.p = r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r11.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r7.getClass()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationInteractor$completeIdVerification$2 r8 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationInteractor$completeIdVerification$2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r9 = 0
            r8.<init>(r11, r4, r9)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.f(r7, r8, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r11 != r3) goto L5f
            goto L90
        L5f:
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse r11 = (au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            boolean r4 = r11 instanceof au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r4 == 0) goto L7d
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationContract$Action$VerificationSuccess r4 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationContract$Action$VerificationSuccess     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess r11 = (au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r4.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r10.p = r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.Object r11 = r2.emit(r4, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r11 != r3) goto L75
            goto L90
        L75:
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r11 = r0.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActions$IdVerificationSuccessImpression r0 = au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActions.IdVerificationSuccessImpression.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r11.c(r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            goto Lb6
        L7d:
            boolean r0 = r11 instanceof au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r0 == 0) goto L91
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationContract$Action$VerificationFailed r0 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationContract$Action$VerificationFailed     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail r11 = (au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r0.<init>(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r10.p = r5     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            java.lang.Object r11 = r2.emit(r0, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            if (r11 != r3) goto Lb6
        L90:
            return r3
        L91:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            r11.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
            throw r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L97 au.com.woolworths.android.onesite.network.NoConnectivityException -> La7
        L97:
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState r11 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState$Content$Error r0 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState$Content$Error
            au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage$Error$ServerError r2 = au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage.Error.ServerError.f8920a
            r0.<init>(r2)
            r11.<init>(r0)
            r1.setValue(r11)
            goto Lb6
        La7:
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState r11 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState$Content$Error r0 = new au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState$Content$Error
            au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage$Error$ConnectionError r2 = au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage.Error.ConnectionError.f8919a
            r0.<init>(r2)
            r11.<init>(r0)
            r1.setValue(r11)
        Lb6:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel$launchIdVerificationCompletes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
