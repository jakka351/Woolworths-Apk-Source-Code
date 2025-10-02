package au.com.woolworths.android.onesite.modules.checkout.paypal;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.braintreepayments.api.BraintreeClient;
import com.braintreepayments.api.BrowserSwitchResult;
import com.braintreepayments.api.DataCollector;
import com.braintreepayments.api.PayPalClient;
import com.braintreepayments.api.PayPalVaultRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/paypal/BraintreeResultActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BraintreeResultActivity extends FragmentActivity {
    public static final /* synthetic */ int x = 0;
    public final Lazy t = LazyKt.b(new androidx.lifecycle.a(this, 8));
    public BraintreeClient u;
    public PayPalClient v;
    public String w;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Lazy lazy = this.t;
        if (((String) lazy.getD()) == null) {
            finish();
            return;
        }
        String str = (String) lazy.getD();
        Intrinsics.e(str);
        BraintreeClient braintreeClient = new BraintreeClient(this, str);
        this.u = braintreeClient;
        this.v = new PayPalClient(braintreeClient);
        BraintreeClient braintreeClient2 = this.u;
        if (braintreeClient2 == null) {
            Intrinsics.p("client");
            throw null;
        }
        new DataCollector(braintreeClient2).a(this, new a(this));
        PayPalClient payPalClient = this.v;
        if (payPalClient != null) {
            payPalClient.f(this, new PayPalVaultRequest(), new a(this));
        } else {
            Intrinsics.p("paypal");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        BraintreeClient braintreeClient = this.u;
        if (braintreeClient == null) {
            Intrinsics.p("client");
            throw null;
        }
        BrowserSwitchResult browserSwitchResultA = braintreeClient.a(this);
        if (browserSwitchResultA != null) {
            if (browserSwitchResultA.f13712a != 1) {
                browserSwitchResultA = null;
            }
            if (browserSwitchResultA != null) {
                PayPalClient payPalClient = this.v;
                if (payPalClient != null) {
                    payPalClient.d(browserSwitchResultA, new a(this));
                } else {
                    Intrinsics.p("paypal");
                    throw null;
                }
            }
        }
    }
}
