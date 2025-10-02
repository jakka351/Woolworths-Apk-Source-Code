package com.woolworths.scanlibrary.ui.payment.addfirstcard;

import androidx.activity.result.ActivityResultLauncher;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity$showGooglePayCardScanView$1", f = "AddPaymentActivity.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AddPaymentActivity$showGooglePayCardScanView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ActivityResultLauncher p;
    public int q;
    public final /* synthetic */ AddPaymentActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentActivity$showGooglePayCardScanView$1(AddPaymentActivity addPaymentActivity, Continuation continuation) {
        super(2, continuation);
        this.r = addPaymentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentActivity$showGooglePayCardScanView$1(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentActivity$showGooglePayCardScanView$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActivityResultLauncher activityResultLauncher;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AddPaymentActivity addPaymentActivity = this.r;
                ActivityResultLauncher activityResultLauncher2 = addPaymentActivity.L;
                GooglePayManager googlePayManager = addPaymentActivity.K;
                if (googlePayManager == null) {
                    Intrinsics.p("googlePayManager");
                    throw null;
                }
                this.p = activityResultLauncher2;
                this.q = 1;
                obj = googlePayManager.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                activityResultLauncher = activityResultLauncher2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activityResultLauncher = this.p;
                ResultKt.b(obj);
            }
            activityResultLauncher.a(obj, null);
        } catch (Exception e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.u), "GooglePay card scan failed: " + e.getMessage() + " / " + e.getCause(), null, 12);
        }
        return Unit.f24250a;
    }
}
