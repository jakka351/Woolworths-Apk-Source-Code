package au.com.woolworths.shop.checkout.ui.details;

import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onIdVerificationCompleteResult$2", f = "CheckoutDetailsViewModel.kt", l = {234, 247}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CheckoutDetailsViewModel$onIdVerificationCompleteResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutDetailsViewModel q;
    public final /* synthetic */ IdVerificationCompleteResponse r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel$onIdVerificationCompleteResult$2(CheckoutDetailsViewModel checkoutDetailsViewModel, IdVerificationCompleteResponse idVerificationCompleteResponse, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutDetailsViewModel;
        this.r = idVerificationCompleteResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutDetailsViewModel$onIdVerificationCompleteResult$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutDetailsViewModel$onIdVerificationCompleteResult$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel r2 = r5.q
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L5b
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L2e
        L1e:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.Job r6 = r2.h
            if (r6 == 0) goto L2e
            r5.p = r4
            java.lang.Object r6 = r6.join(r5)
            if (r6 != r0) goto L2e
            goto L5a
        L2e:
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse r6 = r5.r
            boolean r1 = r6 instanceof au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess
            if (r1 == 0) goto L43
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract$Actions$LaunchSnackBar r1 = new au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract$Actions$LaunchSnackBar
            au.com.woolworths.android.onesite.models.text.PlainText r4 = new au.com.woolworths.android.onesite.models.text.PlainText
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess r6 = (au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteSuccess) r6
            java.lang.String r6 = r6.d
            r4.<init>(r6)
            r1.<init>(r4)
            goto L50
        L43:
            boolean r1 = r6 instanceof au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail
            if (r1 == 0) goto L5e
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract$Actions$LaunchIdVerificationBottomSheet r1 = new au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract$Actions$LaunchIdVerificationBottomSheet
            au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail r6 = (au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteFail) r6
            au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet r6 = r6.d
            r1.<init>(r6, r4)
        L50:
            kotlinx.coroutines.flow.SharedFlowImpl r6 = r2.i
            r5.p = r3
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L5e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onIdVerificationCompleteResult$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
