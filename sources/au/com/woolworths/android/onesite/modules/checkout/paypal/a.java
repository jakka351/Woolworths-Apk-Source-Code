package au.com.woolworths.android.onesite.modules.checkout.paypal;

import android.content.Intent;
import com.braintreepayments.api.DataCollectorCallback;
import com.braintreepayments.api.PayPalAccountNonce;
import com.braintreepayments.api.PayPalBrowserSwitchResultCallback;
import com.braintreepayments.api.PayPalFlowStartedCallback;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DataCollectorCallback, PayPalFlowStartedCallback, PayPalBrowserSwitchResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BraintreeResultActivity f4301a;

    @Override // com.braintreepayments.api.PayPalBrowserSwitchResultCallback
    public void a(PayPalAccountNonce payPalAccountNonce, Exception exc) {
        int i = BraintreeResultActivity.x;
        Intent intentPutExtra = new Intent().putExtra("nonce", payPalAccountNonce);
        BraintreeResultActivity braintreeResultActivity = this.f4301a;
        braintreeResultActivity.setResult(-1, intentPutExtra.putExtra("device_data", braintreeResultActivity.w));
        braintreeResultActivity.finish();
    }

    @Override // com.braintreepayments.api.DataCollectorCallback
    public void b(String str) {
        this.f4301a.w = str;
    }

    public void c(Exception exc) {
        int i = BraintreeResultActivity.x;
        if (exc != null) {
            BraintreeResultActivity braintreeResultActivity = this.f4301a;
            braintreeResultActivity.setResult(0);
            braintreeResultActivity.finish();
        }
    }
}
