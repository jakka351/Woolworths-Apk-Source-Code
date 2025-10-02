package com.woolworths.scanlibrary.ui.checkout.pay;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.TenderAddCardTracking;
import com.woolworths.scanlibrary.analytics.TenderChangePaymentMethodTracking;
import com.woolworths.scanlibrary.analytics.TenderDeleteCardTracking;
import com.woolworths.scanlibrary.analytics.TenderUpdateCardTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.databinding.CustomInstrumentListsViewBinding;
import com.woolworths.scanlibrary.databinding.FragmentInstrumentListBinding;
import com.woolworths.scanlibrary.databinding.FragmentTenderPayBinding;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayPresenter;
import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.payment.addcard.MerchantImage;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.GooglePay;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.PayAtCheckout;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.extensions.PaymentInstrumentExtKt;
import com.woolworths.scanlibrary.util.payment.InfoBarError;
import com.woolworths.scanlibrary.util.widget.CircularProgressDrawable;
import com.woolworths.scanlibrary.util.widget.InstrumentListView;
import com.woolworths.scanlibrary.util.widget.InstrumentListView$getInstrumentAdapter$1;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseFragment;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$View;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListInterface$InstrumentListCallback;", "<init>", "()V", "PaymentListener", "ViewModel", "PaymentErrorStatus", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PayFragment extends DaggerBaseFragment<PayContract.Presenter> implements PayContract.View, InstrumentListInterface.InstrumentListCallback {
    public View l;
    public PaymentListener m;
    public FragmentTenderPayBinding n;
    public ViewModel o;
    public boolean p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment$Companion;", "", "", "TAG_INSTRUMENT", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment$PaymentErrorStatus;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentErrorStatus {
        public static final PaymentErrorStatus g;
        public static final PaymentErrorStatus h;
        public static final PaymentErrorStatus i;
        public static final PaymentErrorStatus j;
        public static final PaymentErrorStatus k;
        public static final PaymentErrorStatus l;
        public static final PaymentErrorStatus m;
        public static final PaymentErrorStatus n;
        public static final PaymentErrorStatus o;
        public static final PaymentErrorStatus p;
        public static final PaymentErrorStatus q;
        public static final /* synthetic */ PaymentErrorStatus[] r;
        public static final /* synthetic */ EnumEntries s;
        public final int d;
        public final int e;
        public final InfoBarError f;

        static {
            InfoBarError infoBarError = InfoBarError.f;
            PaymentErrorStatus paymentErrorStatus = new PaymentErrorStatus("GENERIC_FAILURE", 0, R.string.sng_error_header_payment_failed, R.string.sng_error_payment_generic_failure, infoBarError);
            g = paymentErrorStatus;
            PaymentErrorStatus paymentErrorStatus2 = new PaymentErrorStatus("STEP_UP_VALIDATION_FAILURE", 1, R.string.sng_error_header_validation_failed, R.string.sng_error_step_up_failed, infoBarError);
            h = paymentErrorStatus2;
            PaymentErrorStatus paymentErrorStatus3 = new PaymentErrorStatus("CARD_EXPIRE_1_OF_1", 2, R.string.sng_error_header_payment_card_expired, R.string.sng_error_message_payment_card_expired_1_of_1, infoBarError);
            i = paymentErrorStatus3;
            PaymentErrorStatus paymentErrorStatus4 = new PaymentErrorStatus("CARD_EXPIRE_2_OF_2", 3, R.string.sng_error_header_payment_card_expired, R.string.sng_error_message_payment_card_expired_2_of_2, infoBarError);
            j = paymentErrorStatus4;
            InfoBarError infoBarError2 = InfoBarError.h;
            PaymentErrorStatus paymentErrorStatus5 = new PaymentErrorStatus("PAYMENT_FAILURE_EXCEED_LIMIT", 4, R.string.sng_error_header_information, R.string.sng_error_fetch_instrument_failed_new, infoBarError2);
            k = paymentErrorStatus5;
            PaymentErrorStatus paymentErrorStatus6 = new PaymentErrorStatus("SERVER_ERROR_MESSAGE", 5, R.string.sng_error_header_warning, R.string.sng_error_payment_generic_failure, InfoBarError.g);
            l = paymentErrorStatus6;
            PaymentErrorStatus paymentErrorStatus7 = new PaymentErrorStatus("DIGI_PAY_FAILURE_ERROR_MESSAGE", 6, R.string.sng_error_header_information, R.string.sng_error_payment_generic_failure, infoBarError2);
            m = paymentErrorStatus7;
            PaymentErrorStatus paymentErrorStatus8 = new PaymentErrorStatus("FETCH_INSTRUMENTS_FAILED", 7, R.string.sng_error_header_information, R.string.sng_error_fetch_instrument_failed_new, infoBarError2);
            n = paymentErrorStatus8;
            PaymentErrorStatus paymentErrorStatus9 = new PaymentErrorStatus("NO_PAYMENT_INSTRUMENT_AVAILABLE", 8, R.string.sng_error_header_no_payment_card, R.string.sng_error_message_no_payment_card, infoBarError2);
            o = paymentErrorStatus9;
            PaymentErrorStatus paymentErrorStatus10 = new PaymentErrorStatus("ZERO_AMOUNT_PAYMENT", 9, R.string.sng_error_header_zero_payment, R.string.sng_error_message_zero_payment, infoBarError2);
            p = paymentErrorStatus10;
            PaymentErrorStatus paymentErrorStatus11 = new PaymentErrorStatus("TRANSFER_TO_POS_FAILED", 10, R.string.sng_error_header_information, R.string.sng_label_try_again, infoBarError);
            q = paymentErrorStatus11;
            PaymentErrorStatus[] paymentErrorStatusArr = {paymentErrorStatus, paymentErrorStatus2, paymentErrorStatus3, paymentErrorStatus4, paymentErrorStatus5, paymentErrorStatus6, paymentErrorStatus7, paymentErrorStatus8, paymentErrorStatus9, paymentErrorStatus10, paymentErrorStatus11};
            r = paymentErrorStatusArr;
            s = EnumEntriesKt.a(paymentErrorStatusArr);
        }

        public PaymentErrorStatus(String str, int i2, int i3, int i4, InfoBarError infoBarError) {
            this.d = i3;
            this.e = i4;
            this.f = infoBarError;
        }

        public static PaymentErrorStatus valueOf(String str) {
            return (PaymentErrorStatus) Enum.valueOf(PaymentErrorStatus.class, str);
        }

        public static PaymentErrorStatus[] values() {
            return (PaymentErrorStatus[]) r.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment$PaymentListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PaymentListener {
        void u1(ExitDTO exitDTO);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayFragment$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewModel extends BaseObservable {
        public final ObservableField q;
        public boolean s;
        public PayPresenter.TenderStatus e = PayPresenter.TenderStatus.i;
        public final ObservableField f = new ObservableField();
        public final ObservableField g = new ObservableField();
        public final ObservableBoolean h = new ObservableBoolean(false);
        public final ObservableField i = new ObservableField(InfoBarError.f);
        public final ObservableBoolean j = new ObservableBoolean(true);
        public final ObservableBoolean k = new ObservableBoolean(false);
        public final ObservableBoolean l = new ObservableBoolean(true);
        public final ObservableBoolean m = new ObservableBoolean(true);
        public final ObservableField n = new ObservableField();
        public final ObservableBoolean o = new ObservableBoolean(false);
        public final ObservableBoolean p = new ObservableBoolean(true);
        public final ObservableBoolean r = new ObservableBoolean(true);
        public final ObservableBoolean t = new ObservableBoolean(false);
        public final ObservableBoolean u = new ObservableBoolean(true);

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[PayPresenter.TenderStatus.values().length];
                try {
                    iArr[5] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PayPresenter.TenderStatus tenderStatus = PayPresenter.TenderStatus.d;
                    iArr[6] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public ViewModel() {
            this.q = new ObservableField(PayFragment.this.getString(R.string.sng_label_loading_payment_information));
        }

        public final void i(boolean z) {
            PayFragment payFragment = PayFragment.this;
            if (payFragment.getChildFragmentManager().G("instrument_list") != null) {
                Fragment fragmentG = payFragment.getChildFragmentManager().G("instrument_list");
                Intrinsics.f(fragmentG, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment");
                FragmentInstrumentListBinding fragmentInstrumentListBinding = ((InstrumentListFragment) fragmentG).l;
                if (fragmentInstrumentListBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                InstrumentListView instrumentListView = fragmentInstrumentListBinding.z;
                CustomInstrumentListsViewBinding customInstrumentListsViewBinding = instrumentListView.f;
                if (customInstrumentListsViewBinding != null) {
                    customInstrumentListsViewBinding.y.setAdapter(new InstrumentListView$getInstrumentAdapter$1(false, z, true, z, instrumentListView, instrumentListView.e));
                } else {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
            }
        }

        public final void j() throws Throwable {
            this.m.i(true);
            i(false);
            PayFragment payFragment = PayFragment.this;
            FragmentTenderPayBinding fragmentTenderPayBinding = payFragment.n;
            Intrinsics.e(fragmentTenderPayBinding);
            fragmentTenderPayBinding.H.setVisibility(0);
            payFragment.p = true;
            payFragment.n2(false);
            payFragment.I1().b(new TenderChangePaymentMethodTracking("Change Payment Method"));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PayPresenter.TenderStatus.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus = PayPresenter.TenderStatus.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus2 = PayPresenter.TenderStatus.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus3 = PayPresenter.TenderStatus.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus4 = PayPresenter.TenderStatus.d;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus5 = PayPresenter.TenderStatus.d;
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PayPresenter.TenderStatus tenderStatus6 = PayPresenter.TenderStatus.d;
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void A4(PaymentInstrument instrument) {
        Intrinsics.h(instrument, "instrument");
        int i = UpdateCreditCardActivity.L;
        Pair[] pairArr = {new Pair("key_instrument", (CreditCardInstrument) instrument), new Pair("key_total_amount", null)};
        Intent intent = new Intent(requireContext(), (Class<?>) UpdateCreditCardActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 2)));
        startActivityForResult(intent, 4003);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void D4(PaymentErrorStatus errorStatus, String message) throws Throwable {
        Intrinsics.h(errorStatus, "errorStatus");
        Intrinsics.h(message, "message");
        String string = getString(errorStatus.d);
        Intrinsics.g(string, "getString(...)");
        if (message.length() == 0) {
            message = getString(errorStatus.e);
        }
        Intrinsics.e(message);
        InfoBarError infoBarError = errorStatus.f;
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.f.i(string);
        ViewModel viewModel2 = this.o;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel2.g.i(message);
        ViewModel viewModel3 = this.o;
        if (viewModel3 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel3.h.i(true);
        ViewModel viewModel4 = this.o;
        if (viewModel4 != null) {
            viewModel4.i.i(infoBarError);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void E4() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.sng_msg_instrument_unavailable);
            Intrinsics.g(string, "getString(...)");
            String string2 = getString(R.string.sng_label_retry);
            Intrinsics.g(string2, "getString(...)");
            AppCompatActivityExtKt.d(activity, string, string2, new c(this, 11));
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void F3() {
        MvpView.o0(this, new String[]{getString(R.string.sng_msg_wapple_verifying_payment)});
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void F4(boolean z) {
        int i = AddPaymentActivity.M;
        Pair[] pairArr = {new Pair("extra_payment_instrument_available", Boolean.valueOf(z))};
        Intent intent = new Intent(requireContext(), (Class<?>) AddPaymentActivity.class);
        intent.addFlags(0);
        intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 1)));
        startActivityForResult(intent, 4001);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void G3() {
        m2();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void G4(PaymentInstrument instrument) throws Throwable {
        Intrinsics.h(instrument, "instrument");
        o2(instrument);
        FragmentTenderPayBinding fragmentTenderPayBinding = this.n;
        Intrinsics.e(fragmentTenderPayBinding);
        fragmentTenderPayBinding.H.setVisibility(8);
        if (instrument instanceof CreditCardInstrument) {
            FragmentTenderPayBinding fragmentTenderPayBinding2 = this.n;
            Intrinsics.e(fragmentTenderPayBinding2);
            TextView textView = fragmentTenderPayBinding2.J;
            String string = requireContext().getString(R.string.sng_card_suffix);
            Intrinsics.g(string, "getString(...)");
            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) instrument;
            a.B(new Object[]{creditCardInstrument.getCardSuffix()}, 1, string, textView);
            FragmentTenderPayBinding fragmentTenderPayBinding3 = this.n;
            Intrinsics.e(fragmentTenderPayBinding3);
            ImageView imageView = fragmentTenderPayBinding3.I;
            Context contextRequireContext = requireContext();
            MerchantImage.Companion companion = MerchantImage.f;
            String scheme = creditCardInstrument.getScheme();
            Intrinsics.g(scheme, "getScheme(...)");
            companion.getClass();
            Drawable drawable = contextRequireContext.getDrawable(MerchantImage.Companion.a(scheme).e);
            Intrinsics.e(drawable);
            imageView.setImageDrawable(drawable);
            String string2 = requireContext().getString(R.string.sng_card_suffix);
            Intrinsics.g(string2, "getString(...)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{creditCardInstrument.getCardSuffix()}, 1));
            String scheme2 = creditCardInstrument.getScheme();
            Intrinsics.g(scheme2, "getScheme(...)");
            i2(MerchantImage.Companion.a(scheme2).e, str);
            FragmentTenderPayBinding fragmentTenderPayBinding4 = this.n;
            Intrinsics.e(fragmentTenderPayBinding4);
            TextView cardStatusWarning = fragmentTenderPayBinding4.A;
            Intrinsics.g(cardStatusWarning, "cardStatusWarning");
            cardStatusWarning.setVisibility(PaymentInstrumentExtKt.c(creditCardInstrument) ? 0 : 8);
            Context context = getContext();
            if (context != null) {
                FragmentTenderPayBinding fragmentTenderPayBinding5 = this.n;
                Intrinsics.e(fragmentTenderPayBinding5);
                fragmentTenderPayBinding5.A.setText(PaymentInstrumentExtKt.b(creditCardInstrument, context));
            }
            i1(!creditCardInstrument.isExpired());
        } else if (instrument instanceof GooglePay) {
            i2(0, null);
            ViewModel viewModel = this.o;
            if (viewModel == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel.n.i(getString(R.string.sng_label_pay_with_google_pay));
            viewModel.r.i(false);
            viewModel.t.i(false);
            FragmentTenderPayBinding fragmentTenderPayBinding6 = this.n;
            Intrinsics.e(fragmentTenderPayBinding6);
            fragmentTenderPayBinding6.A.setVisibility(8);
        } else if (instrument instanceof PayAtCheckout) {
            PayAtCheckout payAtCheckout = (PayAtCheckout) instrument;
            i2(payAtCheckout.e, payAtCheckout.d);
            i1(true);
            FragmentTenderPayBinding fragmentTenderPayBinding7 = this.n;
            Intrinsics.e(fragmentTenderPayBinding7);
            fragmentTenderPayBinding7.A.setVisibility(8);
            ViewModel viewModel2 = this.o;
            if (viewModel2 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel2.e = PayPresenter.TenderStatus.d;
            viewModel2.n.i(getString(R.string.sng_label_checkout_at_register));
            viewModel2.r.i(false);
            viewModel2.t.i(false);
        }
        h2().y0(instrument);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final String L3() {
        return "";
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final boolean P1(List paymentInstruments) {
        Intrinsics.h(paymentInstruments, "paymentInstruments");
        return ((long) paymentInstruments.size()) < ((PayContract.Presenter) Q1()).k();
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void V2(boolean z) {
        h2().f0(z);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void X0() throws Throwable {
        ViewModel viewModel = this.o;
        if (viewModel != null) {
            viewModel.h.i(false);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void a(int i) {
        h2().a(i);
    }

    public final InstrumentListInterface.InstrumentListContainer h2() {
        ActivityResultCaller activityResultCallerG = getChildFragmentManager().G("instrument_list");
        Intrinsics.f(activityResultCallerG, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListContainer");
        return (InstrumentListInterface.InstrumentListContainer) activityResultCallerG;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void i1(boolean z) throws Throwable {
        ViewModel viewModel = this.o;
        if (viewModel != null) {
            viewModel.o.i(z);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    public final void i2(int i, String str) {
        FragmentTenderPayBinding fragmentTenderPayBinding = this.n;
        Intrinsics.e(fragmentTenderPayBinding);
        a.B(new Object[0], 0, str, fragmentTenderPayBinding.J);
        FragmentTenderPayBinding fragmentTenderPayBinding2 = this.n;
        Intrinsics.e(fragmentTenderPayBinding2);
        fragmentTenderPayBinding2.I.setImageDrawable(requireContext().getDrawable(i));
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void j0(URL url) throws Throwable {
        Intrinsics.h(url, "url");
        StepUpDialogFragment stepUpDialogFragment = new StepUpDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_stepup_url", url);
        stepUpDialogFragment.setArguments(bundle);
        String string = getString(R.string.sng_step_up_cvv_message_with_warning);
        Intrinsics.g(string, "getString(...)");
        stepUpDialogFragment.f.e.i(string);
        stepUpDialogFragment.h = new PayFragment$requestStepUp$1(this);
        FragmentActivity activity = getActivity();
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        Intrinsics.e(supportFragmentManager);
        stepUpDialogFragment.show(supportFragmentManager, "dialog.stepup");
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, com.woolworths.scanlibrary.base.mvp.MvpView
    public final void k1(MvpPresenter mvpPresenter) {
        this.d = (PayContract.Presenter) mvpPresenter;
    }

    public final void m2() {
        PaymentListener paymentListener = this.m;
        if (paymentListener == null) {
            Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
        paymentListener.u1(new ExitDTO(((PayContract.Presenter) Q1()).getC().getC(), ((PayContract.Presenter) Q1()).s(), ((PayContract.Presenter) Q1()).getC().getD(), null, ((PayContract.Presenter) Q1()).getC().getN(), 8));
    }

    public final void n2(boolean z) throws Throwable {
        ViewModel viewModel = this.o;
        if (viewModel != null) {
            viewModel.p.i(z);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void o(PaymentInstrument paymentInstrument) throws Throwable {
        Intrinsics.h(paymentInstrument, "paymentInstrument");
        o2(paymentInstrument);
        G4(paymentInstrument);
    }

    public final void o2(PaymentInstrument paymentInstrument) throws Throwable {
        if (paymentInstrument instanceof CreditCardInstrument) {
            ViewModel viewModel = this.o;
            if (viewModel == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            ObservableField observableField = viewModel.q;
            String string = getString(R.string.sng_card_details_suffix);
            Intrinsics.g(string, "getString(...)");
            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) paymentInstrument;
            observableField.i(String.format(string, Arrays.copyOf(new Object[]{creditCardInstrument.getCardSuffix()}, 1)));
            ViewModel viewModel2 = this.o;
            if (viewModel2 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel2.r.i(!creditCardInstrument.isExpired());
            ViewModel viewModel3 = this.o;
            if (viewModel3 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel3.s = creditCardInstrument.isExpired();
        } else {
            ViewModel viewModel4 = this.o;
            if (viewModel4 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel4.s = false;
        }
        ((PayContract.Presenter) Q1()).d1(paymentInstrument);
        n2(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4001) {
            if (i2 == -1) {
                h2().q();
            }
            I1().b(new TenderAddCardTracking("Add Card - Tender"));
        } else {
            if (i != 4003) {
                return;
            }
            h2().q();
            I1().b(new TenderUpdateCardTracking("Update Card - Tender"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        super.onAttach(context);
        if (context instanceof PaymentListener) {
            this.m = (PaymentListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement ManualBarCodeEntryListener");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        String string;
        CircularProgressDrawable circularProgressDrawableCreate;
        Intrinsics.h(inflater, "inflater");
        boolean z = false;
        FragmentTenderPayBinding fragmentTenderPayBinding = (FragmentTenderPayBinding) DataBindingUtil.c(inflater, R.layout.fragment_tender_pay, viewGroup, false, null);
        this.n = fragmentTenderPayBinding;
        Intrinsics.e(fragmentTenderPayBinding);
        this.l = fragmentTenderPayBinding.h;
        FragmentTenderPayBinding fragmentTenderPayBinding2 = this.n;
        Intrinsics.e(fragmentTenderPayBinding2);
        fragmentTenderPayBinding2.L(((PayContract.Presenter) Q1()).getC());
        this.o = new ViewModel();
        FragmentTenderPayBinding fragmentTenderPayBinding3 = this.n;
        Intrinsics.e(fragmentTenderPayBinding3);
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        fragmentTenderPayBinding3.M(viewModel);
        Cart cartR = ((PayContract.Presenter) Q1()).getC();
        ViewModel viewModel2 = this.o;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        ObservableField observableField = viewModel2.n;
        if (cartR.E() && ((PayContract.Presenter) Q1()).getP()) {
            z = true;
        }
        if (z) {
            String string2 = getString(R.string.sng_label_pay_now_amount);
            Intrinsics.g(string2, "getString(...)");
            string = String.format(string2, Arrays.copyOf(new Object[]{cartR.getK()}, 1));
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((PayContract.Presenter) Q1()).s() ? getString(R.string.sng_label_checkout_at_pos) : getString(R.string.sng_label_checkout_at_register);
            Intrinsics.e(string);
        }
        observableField.i(string);
        if (((PayContract.Presenter) Q1()).getP() && (circularProgressDrawableCreate = new CircularProgressDrawable.Builder().setRingWidth(4).setRingColor(requireContext().getColor(R.color.sng_scanner_timer_progress_color)).create()) != null) {
            circularProgressDrawableCreate.setIndeterminate(true);
        }
        FragmentTenderPayBinding fragmentTenderPayBinding4 = this.n;
        Intrinsics.e(fragmentTenderPayBinding4);
        RelativeLayout relativeLayout = fragmentTenderPayBinding4.H;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 19));
        }
        ((PayContract.Presenter) Q1()).getM().f(getViewLifecycleOwner(), new androidx.compose.runtime.livedata.a(this, 6));
        View view = this.l;
        if (view != null) {
            return view;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.woolworths.scanlibrary.ui.checkout.CheckOutActivity");
        CheckOutActivity checkOutActivity = (CheckOutActivity) activity;
        FragmentTenderPayBinding fragmentTenderPayBinding = this.n;
        Intrinsics.e(fragmentTenderPayBinding);
        Toolbar toolbar = fragmentTenderPayBinding.C.y;
        Intrinsics.g(toolbar, "toolbar");
        checkOutActivity.setSupportActionBar(toolbar);
        ActionBar supportActionBar = checkOutActivity.getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.u();
        ActionBar supportActionBar2 = checkOutActivity.getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.t();
        ActionBar supportActionBar3 = checkOutActivity.getSupportActionBar();
        Intrinsics.e(supportActionBar3);
        supportActionBar3.s(true);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void p(PayPresenter.TenderStatus tenderStatus) throws Throwable {
        String string;
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.e = tenderStatus;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        if (viewModel.s) {
            i1(false);
        } else {
            i1(true);
        }
        n2(true);
        if (this.p) {
            ViewModel viewModel2 = this.o;
            if (viewModel2 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel2.j();
        }
        ViewModel viewModel3 = this.o;
        if (viewModel3 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel3.k.i(true);
        switch (tenderStatus.ordinal()) {
            case 0:
                ViewModel viewModel4 = this.o;
                if (viewModel4 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel4.n.i(((PayContract.Presenter) Q1()).s() ? getString(R.string.sng_label_checkout_at_pos) : getString(R.string.sng_label_checkout_at_register));
                viewModel4.r.i(false);
                viewModel4.t.i(false);
                viewModel4.j.i(false);
                return;
            case 1:
                ViewModel viewModel5 = this.o;
                if (viewModel5 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel5.n.i(getString(R.string.sng_label_checkout_at_register));
                viewModel5.r.i(false);
                viewModel5.t.i(false);
                viewModel5.j.i(false);
                return;
            case 2:
                ViewModel viewModel6 = this.o;
                if (viewModel6 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel6.n.i(getString(R.string.sng_label_checkout_at_register));
                viewModel6.r.i(false);
                viewModel6.t.i(false);
                viewModel6.j.i(true);
                return;
            case 3:
                ViewModel viewModel7 = this.o;
                if (viewModel7 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel7.n.i(getString(R.string.sng_label_checkout_at_register));
                viewModel7.r.i(false);
                viewModel7.t.i(false);
                viewModel7.j.i(false);
                return;
            case 4:
                ViewModel viewModel8 = this.o;
                if (viewModel8 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel8.n.i(getString(R.string.sng_label_checkout_at_register));
                viewModel8.r.i(false);
                viewModel8.j.i(false);
                viewModel8.t.i(false);
                viewModel8.l.i(false);
                h2().r();
                return;
            case 5:
                ViewModel viewModel9 = this.o;
                if (viewModel9 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                ObservableField observableField = viewModel9.n;
                boolean zE = ((PayContract.Presenter) Q1()).getC().E();
                if (zE) {
                    String string2 = getString(R.string.sng_label_pay_now_amount);
                    Intrinsics.g(string2, "getString(...)");
                    string = String.format(string2, Arrays.copyOf(new Object[]{((PayContract.Presenter) Q1()).getC().getK()}, 1));
                } else {
                    if (zE) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = getString(R.string.sng_label_checkout_at_register);
                    Intrinsics.g(string, "getString(...)");
                }
                observableField.i(string);
                viewModel9.r.i(((PayContract.Presenter) Q1()).getC().E());
                return;
            case 6:
                ViewModel viewModel10 = this.o;
                if (viewModel10 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel10.n.i(getString(R.string.sng_button_confirm_amount));
                viewModel10.r.i(false);
                viewModel10.t.i(false);
                viewModel10.j.i(false);
                viewModel10.l.i(false);
                viewModel10.k.i(false);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void q1() {
        I1().b(new TenderDeleteCardTracking("Delete Card - Tender"));
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final boolean r1() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void s3() {
        MvpView.o0(this, new String[]{getString(R.string.sng_msg_wapple_transfer_to_pos)});
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void v2(List fetchedCreditCardInstrumentList) throws Throwable {
        Intrinsics.h(fetchedCreditCardInstrumentList, "fetchedCreditCardInstrumentList");
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.u.i(!fetchedCreditCardInstrumentList.isEmpty());
        ViewModel viewModel2 = this.o;
        if (viewModel2 != null) {
            viewModel2.r.i(!fetchedCreditCardInstrumentList.isEmpty());
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void w() throws Throwable {
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.t.i(false);
        ((PayContract.Presenter) Q1()).w();
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void w2() {
        if (getChildFragmentManager().G("instrument_list") == null && ((PayContract.Presenter) Q1()).getP()) {
            FragmentTransaction fragmentTransactionE = getChildFragmentManager().e();
            fragmentTransactionE.j(R.id.paymentInstrumentFragmentHolder, InstrumentListFragment.Companion.a(true, false, false, true), "instrument_list");
            fragmentTransactionE.d();
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface.InstrumentListCallback
    public final void x(List paymentInstruments) throws Throwable {
        Intrinsics.h(paymentInstruments, "paymentInstruments");
        ViewModel viewModel = this.o;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.t.i(true);
        ((PayContract.Presenter) Q1()).x(paymentInstruments);
        if (this.p) {
            ViewModel viewModel2 = this.o;
            if (viewModel2 == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel2.j();
            this.p = false;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.View
    public final void x0() {
        b2(new h(20));
    }
}
