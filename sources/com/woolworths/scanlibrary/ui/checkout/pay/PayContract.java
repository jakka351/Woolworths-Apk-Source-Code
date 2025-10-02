package com.woolworths.scanlibrary.ui.checkout.pay;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.checkout.pay.PayPresenter;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract;", "", "View", "Presenter", "PayViewEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PayContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "", "StepUpRequestEvent", "MoveToNextEvent", "ShowExitCodeEvent", "PaymentFailLimitExceedEvent", "PaymentFailureEvent", "TransferToPosFailureEvent", "GenericPaymentFailureEvent", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$GenericPaymentFailureEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$MoveToNextEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$PaymentFailLimitExceedEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$PaymentFailureEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$ShowExitCodeEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$StepUpRequestEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$TransferToPosFailureEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PayViewEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$GenericPaymentFailureEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GenericPaymentFailureEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final GenericPaymentFailureEvent f21229a = new GenericPaymentFailureEvent();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$MoveToNextEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MoveToNextEvent extends PayViewEvent {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$PaymentFailLimitExceedEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentFailLimitExceedEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21230a;

            public PaymentFailLimitExceedEvent(String description) {
                Intrinsics.h(description, "description");
                this.f21230a = description;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentFailLimitExceedEvent) && Intrinsics.c(this.f21230a, ((PaymentFailLimitExceedEvent) obj).f21230a);
            }

            public final int hashCode() {
                return this.f21230a.hashCode();
            }

            public final String toString() {
                return a.h("PaymentFailLimitExceedEvent(description=", this.f21230a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$PaymentFailureEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentFailureEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21231a;

            public PaymentFailureEvent(String description) {
                Intrinsics.h(description, "description");
                this.f21231a = description;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentFailureEvent) && Intrinsics.c(this.f21231a, ((PaymentFailureEvent) obj).f21231a);
            }

            public final int hashCode() {
                return this.f21231a.hashCode();
            }

            public final String toString() {
                return a.h("PaymentFailureEvent(description=", this.f21231a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$ShowExitCodeEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowExitCodeEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final ExitDTO f21232a;

            public ShowExitCodeEvent(ExitDTO exitDTO) {
                this.f21232a = exitDTO;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$StepUpRequestEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StepUpRequestEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final URL f21233a;

            public StepUpRequestEvent(URL url) {
                this.f21233a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StepUpRequestEvent) && Intrinsics.c(this.f21233a, ((StepUpRequestEvent) obj).f21233a);
            }

            public final int hashCode() {
                return this.f21233a.hashCode();
            }

            public final String toString() {
                return "StepUpRequestEvent(url=" + this.f21233a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent$TransferToPosFailureEvent;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$PayViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TransferToPosFailureEvent extends PayViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21234a;

            public TransferToPosFailureEvent(String description) {
                Intrinsics.h(description, "description");
                this.f21234a = description;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TransferToPosFailureEvent) && Intrinsics.c(this.f21234a, ((TransferToPosFailureEvent) obj).f21234a);
            }

            public final int hashCode() {
                return this.f21234a.hashCode();
            }

            public final String toString() {
                return a.h("TransferToPosFailureEvent(description=", this.f21234a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void G(String str, String str2);

        void I(PayError payError);

        void O();

        void O0();

        void R0();

        /* renamed from: S */
        MutableLiveData getM();

        /* renamed from: U0 */
        boolean getP();

        void d1(PaymentInstrument paymentInstrument);

        void e1();

        long k();

        void k0();

        /* renamed from: r */
        Cart getC();

        boolean s();

        void w();

        void x(List list);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void D4(PayFragment.PaymentErrorStatus paymentErrorStatus, String str);

        void E4();

        void F3();

        void G3();

        void V2(boolean z);

        void X0();

        void a(int i);

        void i1(boolean z);

        void j0(URL url);

        void o(PaymentInstrument paymentInstrument);

        void p(PayPresenter.TenderStatus tenderStatus);

        void s3();

        void w2();

        void x0();
    }
}
