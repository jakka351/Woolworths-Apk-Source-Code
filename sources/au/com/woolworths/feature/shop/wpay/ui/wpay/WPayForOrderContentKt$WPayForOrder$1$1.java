package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.foundation.ScrollState;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$WPayForOrder$1$1", f = "WPayForOrderContent.kt", l = {159, 170}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class WPayForOrderContentKt$WPayForOrder$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ScrollState r;
    public final /* synthetic */ PaymentInstrumentsResponse s;
    public final /* synthetic */ Map t;
    public final /* synthetic */ Map u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WPayForOrderContentKt$WPayForOrder$1$1(String str, ScrollState scrollState, PaymentInstrumentsResponse paymentInstrumentsResponse, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.q = str;
        this.r = scrollState;
        this.s = paymentInstrumentsResponse;
        this.t = map;
        this.u = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WPayForOrderContentKt$WPayForOrder$1$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WPayForOrderContentKt$WPayForOrder$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r5.f(0, new androidx.compose.animation.core.SpringSpec(null, 7), r10) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r5.f(r6, new androidx.compose.animation.core.SpringSpec(null, 7), r10) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r10.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L15:
            kotlin.ResultKt.b(r11)
            goto La4
        L1a:
            kotlin.ResultKt.b(r11)
            java.lang.String r11 = r10.q
            r1 = 7
            r4 = 0
            androidx.compose.foundation.ScrollState r5 = r10.r
            r6 = 0
            if (r11 == 0) goto L37
            r10.p = r3
            androidx.compose.runtime.saveable.SaverKt$Saver$1 r11 = androidx.compose.foundation.ScrollState.i
            androidx.compose.animation.core.SpringSpec r11 = new androidx.compose.animation.core.SpringSpec
            r11.<init>(r4, r1)
            java.lang.Object r11 = r5.f(r6, r11, r10)
            if (r11 != r0) goto La4
            goto La3
        L37:
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse r11 = r10.s
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse$Success r11 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse.Success) r11
            au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardSection r11 = r11.f8303a
            java.util.List r11 = r11.b
            java.util.Iterator r11 = r11.iterator()
            r3 = r6
        L44:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r11.next()
            au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem) r7
            boolean r8 = r7 instanceof au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem.AddGiftCard
            if (r8 == 0) goto L55
            goto L75
        L55:
            boolean r8 = r7 instanceof au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem.LinkedGiftCard
            java.util.Map r9 = r10.u
            if (r8 == 0) goto L66
            au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem$LinkedGiftCard r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem.LinkedGiftCard) r7
            java.lang.String r7 = r7.f8291a
            java.lang.Object r7 = r9.get(r7)
            if (r7 == 0) goto L75
            goto L7f
        L66:
            boolean r8 = r7 instanceof au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem.UnlinkedGiftCard
            if (r8 == 0) goto L78
            au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem$UnlinkedGiftCard r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.GiftCardItem.UnlinkedGiftCard) r7
            java.lang.String r7 = r7.f8292a
            java.lang.Object r7 = r9.get(r7)
            if (r7 == 0) goto L75
            goto L7f
        L75:
            int r3 = r3 + 1
            goto L44
        L78:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L7e:
            r3 = -1
        L7f:
            if (r3 < 0) goto La4
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r3)
            java.util.Map r3 = r10.t
            java.lang.Object r11 = r3.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L94
            int r6 = r11.intValue()
        L94:
            r10.p = r2
            androidx.compose.runtime.saveable.SaverKt$Saver$1 r11 = androidx.compose.foundation.ScrollState.i
            androidx.compose.animation.core.SpringSpec r11 = new androidx.compose.animation.core.SpringSpec
            r11.<init>(r4, r1)
            java.lang.Object r11 = r5.f(r6, r11, r10)
            if (r11 != r0) goto La4
        La3:
            return r0
        La4:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContentKt$WPayForOrder$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
