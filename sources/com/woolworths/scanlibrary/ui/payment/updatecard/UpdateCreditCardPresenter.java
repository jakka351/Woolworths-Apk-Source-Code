package com.woolworths.scanlibrary.ui.payment.updatecard;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.UpdateCreditCardScreenTracking;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.domain.payment.b;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardContract$View;", "Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardContract$Presenter;", "UpdateCardCallback", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCreditCardPresenter extends BasePresenter<UpdateCreditCardContract.View> implements UpdateCreditCardContract.Presenter {
    public final Lazy c;
    public final UpdateCardCallback d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/updatecard/UpdateCreditCardPresenter$UpdateCardCallback;", "Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView$UpdateCardListener;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class UpdateCardCallback implements UpdateCreditCardExpirationView.UpdateCardListener {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21291a;

            static {
                int[] iArr = new int[PayErrorCode.values().length];
                try {
                    iArr[PayErrorCode.FORM_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PayErrorCode.NETWORK_ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f21291a = iArr;
            }
        }

        public UpdateCardCallback() {
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void a(FormFocusState formFocusState) {
            ((UpdateCreditCardContract.View) UpdateCreditCardPresenter.this.f21139a).g(formFocusState);
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void b(String paymentInstrumentId, String stepUpToken) {
            Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
            Intrinsics.h(stepUpToken, "stepUpToken");
            MvpView mvpView = UpdateCreditCardPresenter.this.f21139a;
            ((UpdateCreditCardContract.View) mvpView).x1(false);
            ((UpdateCreditCardContract.View) mvpView).H2();
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void c() {
            ((UpdateCreditCardContract.View) UpdateCreditCardPresenter.this.f21139a).b("");
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void d(PayError error) {
            Intrinsics.h(error, "error");
            MvpView mvpView = UpdateCreditCardPresenter.this.f21139a;
            ((UpdateCreditCardContract.View) mvpView).x1(false);
            int i = WhenMappings.f21291a[error.getPayErrorCode().ordinal()];
            if (i == 1 || i == 2) {
                ((UpdateCreditCardContract.View) mvpView).K();
            } else {
                ((UpdateCreditCardContract.View) mvpView).q0();
            }
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void f(String str) {
            ((UpdateCreditCardContract.View) UpdateCreditCardPresenter.this.f21139a).b(str);
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void m() {
            ((UpdateCreditCardContract.View) UpdateCreditCardPresenter.this.f21139a).x1(true);
        }

        @Override // com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView.UpdateCardListener
        public final void t() {
            ((UpdateCreditCardContract.View) UpdateCreditCardPresenter.this.f21139a).v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCreditCardPresenter(UpdateCreditCardContract.View view, DefaultTokenProvider defaultTokenProvider, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = LazyKt.b(new b(6));
        this.d = new UpdateCardCallback();
        analyticsAggregator.a(new UpdateCreditCardScreenTracking("Update Card Screen"));
    }

    @Override // com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardContract.Presenter
    /* renamed from: p0, reason: from getter */
    public final UpdateCardCallback getD() {
        return this.d;
    }
}
