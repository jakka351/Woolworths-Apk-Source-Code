package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$proceedPayment$2", f = "WPayForOrderViewModel.kt", l = {971, 967}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderViewModel$proceedPayment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ InputPayment A;
    public MutableStateFlow p;
    public WPayForOrderViewModel q;
    public InputPayment r;
    public Object s;
    public WPayForOrderContract.ViewState t;
    public ArrayList u;
    public ArrayList v;
    public InputPayment w;
    public MakePaymentInteractor x;
    public int y;
    public final /* synthetic */ WPayForOrderViewModel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderViewModel$proceedPayment$2(WPayForOrderViewModel wPayForOrderViewModel, InputPayment inputPayment, Continuation continuation) {
        super(2, continuation);
        this.z = wPayForOrderViewModel;
        this.A = inputPayment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderViewModel$proceedPayment$2(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderViewModel$proceedPayment$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[LOOP:1: B:19:0x0094->B:21:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f A[LOOP:4: B:35:0x0109->B:37:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x019c -> B:52:0x01a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$proceedPayment$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
