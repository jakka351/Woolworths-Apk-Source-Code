package com.woolworths.scanlibrary.ui.payment.addfirstcard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.FormError;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.woolworths.scanlibrary.analytics.Screens;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.payment.b;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract;
import com.woolworths.scanlibrary.ui.payment.analytics.AddPaymentTracking;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import com.woolworths.scanlibrary.util.payment.PayErrorAggregator;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentContract$View;", "Lcom/woolworths/scanlibrary/ui/payment/addfirstcard/AddPaymentContract$Presenter;", "Lcom/woolworths/scanlibrary/util/widget/AddCreditCardView$AddCardListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentPresenter extends BasePresenter<AddPaymentContract.View> implements AddPaymentContract.Presenter, AddCreditCardView.AddCardListener {
    public final DefaultTokenProvider c;
    public final FeatureToggleManager d;
    public final AnalyticsManager e;
    public final FirebaseCrashlytics f;
    public final Lazy g;
    public final PayErrorAggregator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentPresenter(AddPaymentContract.View view, DefaultTokenProvider defaultTokenProvider, FeatureToggleManager featureToggleManager, AnalyticsManager analyticsManager, FirebaseCrashlytics firebaseCrashlytics) {
        super(view);
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.c = defaultTokenProvider;
        this.d = featureToggleManager;
        this.e = analyticsManager;
        this.f = firebaseCrashlytics;
        this.g = LazyKt.b(new b(4));
        this.h = new PayErrorAggregator(new PayErrorAggregator.ErrorGroupListener() { // from class: com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentPresenter$errorDelegate$1
            @Override // com.woolworths.scanlibrary.util.payment.PayErrorAggregator.ErrorGroupListener
            public final void a(List list) {
                PayError payError = (PayError) list.get(0);
                AddPaymentPresenter addPaymentPresenter = this.f21284a;
                AddPaymentContract.View view2 = (AddPaymentContract.View) addPaymentPresenter.f21139a;
                view2.N3(false);
                if (!(payError instanceof FormError)) {
                    view2.N1();
                    return;
                }
                if (!addPaymentPresenter.d.c(ScanAndGoFeature.f)) {
                    view2.N1();
                    return;
                }
                FormError formError = (FormError) payError;
                String str = "Ref: Ad-" + formError.getAuditId() + "-Fc-" + formError.getFormErrorCode();
                view2.y3(str);
                FirebaseCrashlytics firebaseCrashlytics2 = addPaymentPresenter.f;
                firebaseCrashlytics2.a("E/AddCardError: ".concat(str));
                firebaseCrashlytics2.b(new Exception("AddCardError: ".concat(str)));
            }
        });
        view.k1(this);
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void A0() {
        ((AddPaymentContract.View) this.f21139a).j1();
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void H(Retryable retryable) {
        Intrinsics.h(retryable, "retryable");
        ((DefaultRetryService) this.g.getD()).a(this.c, retryable, new c(this, 16));
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void M(BaseError baseError) {
        this.h.b(baseError);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract.Presenter
    public final AddPaymentPresenter N0() {
        return this;
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void P(String paymentInstrumentId, String stepUpToken) {
        Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
        Intrinsics.h(stepUpToken, "stepUpToken");
        AddPaymentContract.View view = (AddPaymentContract.View) this.f21139a;
        view.N3(false);
        view.q4();
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void W0() {
        this.e.a(Screens.e);
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void f(String str) {
        ((AddPaymentContract.View) this.f21139a).b(str);
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void m() {
        ((AddPaymentContract.View) this.f21139a).N3(true);
        this.e.c(AddPaymentTracking.e);
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void s0() {
        if (this.d.c(ScanAndGoFeature.g)) {
            ((AddPaymentContract.View) this.f21139a).C4();
        }
    }

    @Override // com.woolworths.scanlibrary.util.widget.AddCreditCardView.AddCardListener
    public final void t() {
        ((AddPaymentContract.View) this.f21139a).v();
    }
}
