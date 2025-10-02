package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import android.webkit.WebView;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                PaymentFlowTypeData paymentFlowTypeData = (PaymentFlowTypeData) this.e;
                AddCreditCardViewModel.Factory factory = (AddCreditCardViewModel.Factory) obj;
                Intrinsics.h(factory, "factory");
                return factory.a(paymentFlowTypeData);
            default:
                final MutableState mutableState = (MutableState) this.e;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt$AddCreditCardModal$4$invoke$lambda$14$lambda$13$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        MutableState mutableState2 = mutableState;
                        WebView webView = (WebView) mutableState2.getD();
                        if (webView != null) {
                            webView.destroy();
                        }
                        mutableState2.setValue(null);
                    }
                };
        }
    }
}
