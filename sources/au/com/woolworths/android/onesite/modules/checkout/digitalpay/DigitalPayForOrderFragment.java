package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.modules.checkout.ConfirmDialogFragment;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentBreakdownState;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.AddedGiftCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredZeroBalanceGiftCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.SavedCreditCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.SavedGiftCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardNumberStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardPinStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.UIStatus;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.subjects.PublishSubject;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderFragment;", "Lau/com/woolworths/android/onesite/modules/BaseFragment;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$View;", "<init>", "()V", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DigitalPayForOrderFragment extends Hilt_DigitalPayForOrderFragment implements DigitalPayForOrderContract.View {
    public PayClient A;
    public FeatureToggleManager B;
    public final ActivityResultLauncher D;
    public FragmentPayForOrderDigitalBinding m;
    public SavedCreditCardRecyclerViewAdapter n;
    public ExpiredCreditCardRecyclerViewAdapter o;
    public SavedGiftCardRecyclerViewAdapter p;
    public ExpiredZeroBalanceGiftCardRecyclerViewAdapter q;
    public AddedGiftCardRecyclerViewAdapter r;
    public String s;
    public final h v;
    public final h w;
    public Lazy x;
    public SchedulersProvider y;
    public AnalyticsManager z;
    public final ViewModelLazy l = new ViewModelLazy(Reflection.f24268a.b(CheckoutViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public final DigitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1 t = new TextWatcher() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable s) {
            Intrinsics.h(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.h(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.h(s, "s");
            String string = s.toString();
            DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
            if (Intrinsics.c(string, digitalPayForOrderFragment.s)) {
                return;
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = digitalPayForOrderFragment.m;
            if (fragmentPayForOrderDigitalBinding == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding.H.K.removeTextChangedListener(this);
            String strA = GiftCardUtils.a(s.toString());
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = digitalPayForOrderFragment.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.H.K.setText(strA);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = digitalPayForOrderFragment.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.H.K.setSelection(strA.length());
            digitalPayForOrderFragment.s = strA;
            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).r();
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = digitalPayForOrderFragment.m;
            if (fragmentPayForOrderDigitalBinding4 != null) {
                fragmentPayForOrderDigitalBinding4.H.K.addTextChangedListener(this);
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
    };
    public final DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1 u = new TextWatcher() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void afterTextChanged(android.text.Editable r11) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.h(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.h(charSequence, "charSequence");
            ((DigitalPayForOrderPresenter) this.d.b2().get()).Z();
        }
    };
    public final PublishSubject C = new PublishSubject();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderFragment$Companion;", "", "", "SCROLL_TO_TOP_DELAY", "J", "FULL_SCROLL_DELAY", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.h] */
    public DigitalPayForOrderFragment() {
        final int i = 0;
        this.v = new View.OnFocusChangeListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.h
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i) {
                    case 0:
                        if (z) {
                            return;
                        }
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = digitalPayForOrderFragment.m;
                        if (fragmentPayForOrderDigitalBinding == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        if (fragmentPayForOrderDigitalBinding.H.K.getText() != null) {
                            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = digitalPayForOrderFragment.m;
                            if (fragmentPayForOrderDigitalBinding2 == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            EditText editText = fragmentPayForOrderDigitalBinding2.H.K;
                            editText.setText(ProductInfoFormatter.a(editText.getText().toString()));
                            return;
                        }
                        return;
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get();
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = digitalPayForOrderFragment2.m;
                        if (fragmentPayForOrderDigitalBinding3 == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        String cardNumber = fragmentPayForOrderDigitalBinding3.H.E.getText().toString();
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = digitalPayForOrderFragment2.m;
                        if (fragmentPayForOrderDigitalBinding4 == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        String pin = fragmentPayForOrderDigitalBinding4.H.F.getText().toString();
                        digitalPayForOrderPresenter.getClass();
                        Intrinsics.h(cardNumber, "cardNumber");
                        Intrinsics.h(pin, "pin");
                        if (digitalPayForOrderPresenter.i()) {
                            GiftCardNumberStatus giftCardNumberStatusB = GiftCardUtils.b(cardNumber, digitalPayForOrderPresenter.f.g(), digitalPayForOrderPresenter.u);
                            GiftCardPinStatus giftCardPinStatusC = GiftCardUtils.c(pin);
                            GiftCardNumberStatus giftCardNumberStatus = GiftCardNumberStatus.f;
                            UIStatus uIStatus = UIStatus.d;
                            boolean z2 = true;
                            if ((giftCardNumberStatusB == giftCardNumberStatus || giftCardNumberStatusB == GiftCardNumberStatus.g || giftCardNumberStatusB == GiftCardNumberStatus.k || giftCardNumberStatusB == GiftCardNumberStatus.h || giftCardNumberStatusB == GiftCardNumberStatus.i) && (giftCardPinStatusC == GiftCardPinStatus.h || giftCardPinStatusC == GiftCardPinStatus.g || giftCardPinStatusC == GiftCardPinStatus.i)) {
                                Object obj = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj);
                                DigitalPayForOrderContract.View view2 = (DigitalPayForOrderContract.View) obj;
                                Object obj2 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj2);
                                String strL3 = ((DigitalPayForOrderContract.View) obj2).l3();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view2.e2(strL3, z2);
                                Object obj3 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj3);
                                ((DigitalPayForOrderContract.View) obj3).O2(uIStatus);
                                Object obj4 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj4);
                                ((DigitalPayForOrderContract.View) obj4).g3(uIStatus);
                            } else if (giftCardNumberStatusB == GiftCardNumberStatus.e) {
                                Object obj5 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj5);
                                DigitalPayForOrderContract.View view3 = (DigitalPayForOrderContract.View) obj5;
                                Object obj6 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj6);
                                String strA3 = ((DigitalPayForOrderContract.View) obj6).a3();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view3.e2(strA3, z2);
                                Object obj7 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj7);
                                ((DigitalPayForOrderContract.View) obj7).O2(uIStatus);
                            } else if (giftCardPinStatusC == GiftCardPinStatus.e) {
                                Object obj8 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj8);
                                ((DigitalPayForOrderContract.View) obj8).g3(uIStatus);
                                Object obj9 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj9);
                                DigitalPayForOrderContract.View view4 = (DigitalPayForOrderContract.View) obj9;
                                Object obj10 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj10);
                                String strM1 = ((DigitalPayForOrderContract.View) obj10).m1();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view4.e2(strM1, z2);
                            }
                            digitalPayForOrderPresenter.Z();
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        this.w = new View.OnFocusChangeListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.h
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i2) {
                    case 0:
                        if (z) {
                            return;
                        }
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = digitalPayForOrderFragment.m;
                        if (fragmentPayForOrderDigitalBinding == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        if (fragmentPayForOrderDigitalBinding.H.K.getText() != null) {
                            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = digitalPayForOrderFragment.m;
                            if (fragmentPayForOrderDigitalBinding2 == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            EditText editText = fragmentPayForOrderDigitalBinding2.H.K;
                            editText.setText(ProductInfoFormatter.a(editText.getText().toString()));
                            return;
                        }
                        return;
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get();
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = digitalPayForOrderFragment2.m;
                        if (fragmentPayForOrderDigitalBinding3 == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        String cardNumber = fragmentPayForOrderDigitalBinding3.H.E.getText().toString();
                        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = digitalPayForOrderFragment2.m;
                        if (fragmentPayForOrderDigitalBinding4 == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        String pin = fragmentPayForOrderDigitalBinding4.H.F.getText().toString();
                        digitalPayForOrderPresenter.getClass();
                        Intrinsics.h(cardNumber, "cardNumber");
                        Intrinsics.h(pin, "pin");
                        if (digitalPayForOrderPresenter.i()) {
                            GiftCardNumberStatus giftCardNumberStatusB = GiftCardUtils.b(cardNumber, digitalPayForOrderPresenter.f.g(), digitalPayForOrderPresenter.u);
                            GiftCardPinStatus giftCardPinStatusC = GiftCardUtils.c(pin);
                            GiftCardNumberStatus giftCardNumberStatus = GiftCardNumberStatus.f;
                            UIStatus uIStatus = UIStatus.d;
                            boolean z2 = true;
                            if ((giftCardNumberStatusB == giftCardNumberStatus || giftCardNumberStatusB == GiftCardNumberStatus.g || giftCardNumberStatusB == GiftCardNumberStatus.k || giftCardNumberStatusB == GiftCardNumberStatus.h || giftCardNumberStatusB == GiftCardNumberStatus.i) && (giftCardPinStatusC == GiftCardPinStatus.h || giftCardPinStatusC == GiftCardPinStatus.g || giftCardPinStatusC == GiftCardPinStatus.i)) {
                                Object obj = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj);
                                DigitalPayForOrderContract.View view2 = (DigitalPayForOrderContract.View) obj;
                                Object obj2 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj2);
                                String strL3 = ((DigitalPayForOrderContract.View) obj2).l3();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view2.e2(strL3, z2);
                                Object obj3 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj3);
                                ((DigitalPayForOrderContract.View) obj3).O2(uIStatus);
                                Object obj4 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj4);
                                ((DigitalPayForOrderContract.View) obj4).g3(uIStatus);
                            } else if (giftCardNumberStatusB == GiftCardNumberStatus.e) {
                                Object obj5 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj5);
                                DigitalPayForOrderContract.View view3 = (DigitalPayForOrderContract.View) obj5;
                                Object obj6 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj6);
                                String strA3 = ((DigitalPayForOrderContract.View) obj6).a3();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view3.e2(strA3, z2);
                                Object obj7 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj7);
                                ((DigitalPayForOrderContract.View) obj7).O2(uIStatus);
                            } else if (giftCardPinStatusC == GiftCardPinStatus.e) {
                                Object obj8 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj8);
                                ((DigitalPayForOrderContract.View) obj8).g3(uIStatus);
                                Object obj9 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj9);
                                DigitalPayForOrderContract.View view4 = (DigitalPayForOrderContract.View) obj9;
                                Object obj10 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj10);
                                String strM1 = ((DigitalPayForOrderContract.View) obj10).m1();
                                if (!digitalPayForOrderPresenter.Q() && !digitalPayForOrderPresenter.K()) {
                                    z2 = false;
                                }
                                view4.e2(strM1, z2);
                            }
                            digitalPayForOrderPresenter.Z();
                            return;
                        }
                        return;
                }
            }
        };
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                this.d.C.onNext(result);
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.D = activityResultLauncherRegisterForActivityResult;
    }

    public static final void i2(DigitalPayForOrderFragment digitalPayForOrderFragment) throws JSONException {
        digitalPayForOrderFragment.R1().c(DigipayActions.B);
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
        if (digitalPayForOrderPresenter.e0 == null) {
            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).q0();
            return;
        }
        Object obj = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).u();
        Runnable runnable = digitalPayForOrderPresenter.e0;
        Intrinsics.e(runnable);
        runnable.run();
    }

    public static final void m2(DigitalPayForOrderFragment digitalPayForOrderFragment) {
        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = digitalPayForOrderFragment.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout addNewGiftCardDetailsLinearLayout = fragmentPayForOrderDigitalBinding.H.B;
        Intrinsics.g(addNewGiftCardDetailsLinearLayout, "addNewGiftCardDetailsLinearLayout");
        boolean z = addNewGiftCardDetailsLinearLayout.getVisibility() == 0;
        if (digitalPayForOrderPresenter.i()) {
            NewGiftCardData newGiftCardData = digitalPayForOrderPresenter.v;
            if (newGiftCardData == null) {
                digitalPayForOrderPresenter.s0(z);
                return;
            }
            digitalPayForOrderPresenter.u.add(newGiftCardData);
            digitalPayForOrderPresenter.v = null;
            Object obj = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).f1();
            Object obj2 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).a4();
            Object obj3 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).z4();
            Object obj4 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj4);
            ((DigitalPayForOrderContract.View) obj4).L1();
            if (digitalPayForOrderPresenter.K()) {
                Object obj5 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).u4();
            } else {
                Object obj6 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj6);
                ((DigitalPayForOrderContract.View) obj6).E3();
            }
            digitalPayForOrderPresenter.F = true;
            digitalPayForOrderPresenter.E = false;
        }
    }

    public static final void n2(DigitalPayForOrderFragment digitalPayForOrderFragment) {
        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = digitalPayForOrderFragment.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout addNewGiftCardDetailsLinearLayout = fragmentPayForOrderDigitalBinding.H.B;
        Intrinsics.g(addNewGiftCardDetailsLinearLayout, "addNewGiftCardDetailsLinearLayout");
        digitalPayForOrderPresenter.s0(addNewGiftCardDetailsLinearLayout.getVisibility() == 0);
    }

    public static final void o2(final DigitalPayForOrderFragment digitalPayForOrderFragment) {
        digitalPayForOrderFragment.R1().c(DigipayActions.y);
        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
        String string = digitalPayForOrderFragment.getString(R.string.unlink_paypal);
        Intrinsics.g(string, "getString(...)");
        String string2 = digitalPayForOrderFragment.getString(R.string.confirm_delete_paypal_link);
        Intrinsics.g(string2, "getString(...)");
        ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new Action() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.g
            @Override // io.reactivex.functions.Action
            public final void run() {
                final DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) this.d.b2().get();
                final ArrayList arrayList = digitalPayForOrderPresenter.w;
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                if (digitalPayForOrderPresenter.i()) {
                    Object obj = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj);
                    ((DigitalPayForOrderContract.View) obj).Q0(R.string.deleting_paypal_link);
                }
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PayPalInstrument payPalInstrument = (PayPalInstrument) it.next();
                    atomicInteger.incrementAndGet();
                    PayClient payClient = digitalPayForOrderPresenter.m;
                    Intrinsics.e(payPalInstrument);
                    BasePayEmptyResultCallback basePayEmptyResultCallback = new BasePayEmptyResultCallback(digitalPayForOrderPresenter.i, digitalPayForOrderPresenter.j) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$deleteAllSavedPayPalAccounts$1
                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void d2() {
                            if (atomicInteger.decrementAndGet() == 0) {
                                arrayList.clear();
                                DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                digitalPayForOrderPresenter2.z = null;
                                if (digitalPayForOrderPresenter2.i()) {
                                    Object obj2 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj2);
                                    ((DigitalPayForOrderContract.View) obj2).y();
                                    digitalPayForOrderPresenter2.D0();
                                    Object obj3 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj3);
                                    ((DigitalPayForOrderContract.View) obj3).T1();
                                    digitalPayForOrderPresenter2.v0();
                                }
                            }
                        }

                        @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                        public final void v(PayError payError) {
                            Intrinsics.h(payError, "payError");
                            Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                            if (atomicInteger.decrementAndGet() == 0) {
                                DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                if (digitalPayForOrderPresenter2.i()) {
                                    Object obj2 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj2);
                                    ((DigitalPayForOrderContract.View) obj2).y();
                                    Object obj3 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj3);
                                    Object obj4 = digitalPayForOrderPresenter2.f4374a;
                                    Intrinsics.e(obj4);
                                    ((DigitalPayForOrderContract.View) obj3).D1(((DigitalPayForOrderContract.View) obj4).z1());
                                }
                            }
                        }
                    };
                    payClient.getClass();
                    payClient.a(payPalInstrument.getInstrumentId(), basePayEmptyResultCallback);
                }
            }
        }, ConfirmDialogFragment.SourceScreens.f);
        FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
        confirmDialogFragmentA.Q1(parentFragmentManager);
    }

    public static final void p2(DigitalPayForOrderFragment digitalPayForOrderFragment) {
        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
        ArrayList arrayList = digitalPayForOrderPresenter.w;
        if (digitalPayForOrderPresenter.i()) {
            digitalPayForOrderPresenter.l.c(DigipayActions.x);
            Object obj = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).n4();
            if (!digitalPayForOrderPresenter.E && !digitalPayForOrderPresenter.F) {
                if (digitalPayForOrderPresenter.W()) {
                    Object obj2 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj2);
                    DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj2;
                    Object obj3 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj3);
                    view.e2(((DigitalPayForOrderContract.View) obj3).G(), digitalPayForOrderPresenter.Q() || digitalPayForOrderPresenter.K());
                }
                digitalPayForOrderPresenter.y0();
                return;
            }
            digitalPayForOrderPresenter.Y();
            String str = digitalPayForOrderPresenter.z;
            if (str != null && !StringsKt.D(str)) {
                digitalPayForOrderPresenter.z = null;
                digitalPayForOrderPresenter.D0();
                digitalPayForOrderPresenter.z0();
                return;
            }
            digitalPayForOrderPresenter.x();
            if (arrayList != null && !arrayList.isEmpty()) {
                digitalPayForOrderPresenter.z = ((PayPalInstrument) arrayList.get(0)).getInstrumentId();
                digitalPayForOrderPresenter.D0();
                digitalPayForOrderPresenter.z0();
            } else if (digitalPayForOrderPresenter.i()) {
                Object obj4 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj4);
                SingleCache singleCache = new SingleCache(((DigitalPayForOrderContract.View) obj4).o3());
                digitalPayForOrderPresenter.c0 = singleCache;
                DigitalPayForOrderPresenter$createLinkPayPalObserver$1 digitalPayForOrderPresenter$createLinkPayPalObserver$1 = new DigitalPayForOrderPresenter$createLinkPayPalObserver$1(digitalPayForOrderPresenter);
                singleCache.a(digitalPayForOrderPresenter$createLinkPayPalObserver$1);
                digitalPayForOrderPresenter.b.d(digitalPayForOrderPresenter$createLinkPayPalObserver$1);
                Object obj5 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).Q0(R.string.tokenising_pay_pal_message);
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String A() {
        String string = getString(R.string.unable_to_fetch_gift_card_balance_multiple);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void A0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.K.requestFocus();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText editText = fragmentPayForOrderDigitalBinding2.H.K;
        if (editText != null) {
            ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void B2(boolean z) {
        if (!z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding.F.M.setChecked(false);
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.F.M.setEnabled(z);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String B3() {
        String string = getString(R.string.multipleZeroBalanceGiftCard);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String B4() {
        String string = getString(R.string.gift_card_save_failure);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void C0(UIStatus uIStatus) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText paymentAmountEditText = fragmentPayForOrderDigitalBinding.H.K;
        Intrinsics.g(paymentAmountEditText, "paymentAmountEditText");
        u2(paymentAmountEditText, uIStatus);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void D1(String errorText) {
        Intrinsics.h(errorText, "errorText");
        R1().j(DigipayActions.C, TrackingMetadata.Companion.a(TrackableValue.k0, errorText));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.h0.y.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.h0.z.setText(errorText);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            fragmentPayForOrderDigitalBinding3.n0.postDelayed(new b(this, 0), 1000L);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void D2(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = this.p == null || ((DigitalPayForOrderPresenter) b2().get()).n();
        if (this.n != null && !((DigitalPayForOrderPresenter) b2().get()).m()) {
            z3 = false;
        }
        if (!z4 || !z3) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding.A.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.Y.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.E.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 != null) {
                fragmentPayForOrderDigitalBinding4.O.setVisibility(0);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.O.setVisibility(8);
        if (z && z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
            if (fragmentPayForOrderDigitalBinding6 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding6.E.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
            if (fragmentPayForOrderDigitalBinding7 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding7.Y.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
            if (fragmentPayForOrderDigitalBinding8 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding8.E.setGravity(19);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
            if (fragmentPayForOrderDigitalBinding9 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding9.Y.setGravity(21);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
            if (fragmentPayForOrderDigitalBinding10 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding10.A.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding11 = this.m;
            if (fragmentPayForOrderDigitalBinding11 != null) {
                fragmentPayForOrderDigitalBinding11.A.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding12 = this.m;
            if (fragmentPayForOrderDigitalBinding12 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding12.E.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding13 = this.m;
            if (fragmentPayForOrderDigitalBinding13 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding13.Y.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding14 = this.m;
            if (fragmentPayForOrderDigitalBinding14 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding14.E.setGravity(17);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding15 = this.m;
            if (fragmentPayForOrderDigitalBinding15 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding15.A.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding16 = this.m;
            if (fragmentPayForOrderDigitalBinding16 != null) {
                fragmentPayForOrderDigitalBinding16.A.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        if (z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding17 = this.m;
            if (fragmentPayForOrderDigitalBinding17 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding17.E.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding18 = this.m;
            if (fragmentPayForOrderDigitalBinding18 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding18.Y.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding19 = this.m;
            if (fragmentPayForOrderDigitalBinding19 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding19.Y.setGravity(17);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding20 = this.m;
            if (fragmentPayForOrderDigitalBinding20 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding20.A.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding21 = this.m;
            if (fragmentPayForOrderDigitalBinding21 != null) {
                fragmentPayForOrderDigitalBinding21.A.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding22 = this.m;
        if (fragmentPayForOrderDigitalBinding22 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding22.A.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding23 = this.m;
        if (fragmentPayForOrderDigitalBinding23 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding23.E.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding24 = this.m;
        if (fragmentPayForOrderDigitalBinding24 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding24.Y.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding25 = this.m;
        if (fragmentPayForOrderDigitalBinding25 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding25.E.setGravity(19);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding26 = this.m;
        if (fragmentPayForOrderDigitalBinding26 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding26.Y.setGravity(21);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding27 = this.m;
        if (fragmentPayForOrderDigitalBinding27 != null) {
            fragmentPayForOrderDigitalBinding27.A.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void E() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout addNewGiftCardDetailsLinearLayout = fragmentPayForOrderDigitalBinding.H.B;
        Intrinsics.g(addNewGiftCardDetailsLinearLayout, "addNewGiftCardDetailsLinearLayout");
        addNewGiftCardDetailsLinearLayout.setVisibility(0);
        X(true);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void E0(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.N.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseFragment
    public final int E1() {
        return R.layout.fragment_pay_for_order_digital;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void E3() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.H.D.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String F() {
        String string = getString(R.string.update_expired_card_failed);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String F1() {
        String string = getString(R.string.singleExpiredCreditCardMessage);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String F2() {
        String string = getString(R.string.outstanding_balance_message);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String G() {
        String string = getString(R.string.collapse_error_message);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1] */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void G0(String expiredZeroBalanceMessage) {
        Intrinsics.h(expiredZeroBalanceMessage, "expiredZeroBalanceMessage");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.T.getAdapter() == null) {
            if (this.q == null) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
                ?? r4 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredZeroBalanceGiftCards$1
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                        digitalPayForOrderFragment.R1().c(DigipayActions.j);
                        String string = digitalPayForOrderFragment.getString(R.string.digipay_delete_card_title);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = digitalPayForOrderFragment.getString(R.string.confirm_delete_gift_card);
                        Intrinsics.g(string2, "getString(...)");
                        ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new j(digitalPayForOrderFragment, i, 3), ConfirmDialogFragment.SourceScreens.h);
                        FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
                        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                        confirmDialogFragmentA.Q1(parentFragmentManager);
                    }
                };
                ExpiredZeroBalanceGiftCardRecyclerViewAdapter expiredZeroBalanceGiftCardRecyclerViewAdapter = new ExpiredZeroBalanceGiftCardRecyclerViewAdapter();
                expiredZeroBalanceGiftCardRecyclerViewAdapter.i = digitalPayForOrderPresenter;
                expiredZeroBalanceGiftCardRecyclerViewAdapter.g = digitalPayForOrderPresenter.s;
                expiredZeroBalanceGiftCardRecyclerViewAdapter.h = r4;
                expiredZeroBalanceGiftCardRecyclerViewAdapter.E(true);
                this.q = expiredZeroBalanceGiftCardRecyclerViewAdapter;
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.T.setAdapter(this.q);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.T.setLayoutManager(new LinearLayoutManager(getActivity()));
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            ViewCompat.H(fragmentPayForOrderDigitalBinding4.T);
        } else {
            ExpiredZeroBalanceGiftCardRecyclerViewAdapter expiredZeroBalanceGiftCardRecyclerViewAdapter2 = this.q;
            Intrinsics.e(expiredZeroBalanceGiftCardRecyclerViewAdapter2);
            expiredZeroBalanceGiftCardRecyclerViewAdapter2.l();
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.T.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.S.z.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 != null) {
            fragmentPayForOrderDigitalBinding7.S.y.setText(expiredZeroBalanceMessage);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final boolean H1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout addNewGiftCardDetailsLinearLayout = fragmentPayForOrderDigitalBinding.H.B;
        Intrinsics.g(addNewGiftCardDetailsLinearLayout, "addNewGiftCardDetailsLinearLayout");
        return addNewGiftCardDetailsLinearLayout.getVisibility() == 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void H3(String str) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.d0.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.I.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.c0.setText(str);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.c0.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.b0.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.X.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.J.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding8.L.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
        if (fragmentPayForOrderDigitalBinding9 != null) {
            fragmentPayForOrderDigitalBinding9.I.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String I0() {
        String string;
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText cardNumberEditText = fragmentPayForOrderDigitalBinding.H.E;
        Intrinsics.g(cardNumberEditText, "cardNumberEditText");
        Editable text = cardNumberEditText.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I2() {
        /*
            r5 = this;
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.AddedGiftCardRecyclerViewAdapter r0 = r5.r
            if (r0 == 0) goto L4a
            kotlin.jvm.internal.Intrinsics.e(r0)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r1 = r5.m
            r2 = 0
            java.lang.String r3 = "fragmentBinding"
            if (r1 == 0) goto L46
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r1 = r1.H
            android.widget.LinearLayout r1 = r1.B
            java.lang.String r4 = "addNewGiftCardDetailsLinearLayout"
            kotlin.jvm.internal.Intrinsics.g(r1, r4)
            int r1 = r1.getVisibility()
            r4 = 1
            if (r1 != 0) goto L1f
            goto L30
        L1f:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r1 = r5.m
            if (r1 == 0) goto L42
            android.widget.LinearLayout r1 = r1.B
            java.lang.String r2 = "addEditGiftCardsLinearLayout"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L32
        L30:
            r1 = r4
            goto L33
        L32:
            r1 = 0
        L33:
            boolean r2 = r0.i
            if (r1 == r2) goto L4a
            r0.i = r1
            int r1 = r0.i()
            int r1 = r1 - r4
            r0.m(r1)
            return
        L42:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L46:
            kotlin.jvm.internal.Intrinsics.p(r3)
            throw r2
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment.I2():void");
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void I3() {
        Views.a((AppCompatActivity) getActivity());
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.F.D.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.z.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_selector);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void I4(PaymentBreakdownState paymentBreakdownState) {
        String str = paymentBreakdownState.e;
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.k0.setText(paymentBreakdownState.b);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.i0.setText(paymentBreakdownState.c);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.i0.setEnabled(paymentBreakdownState.f4278a);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.l0.setText(paymentBreakdownState.d);
        if (str == null || StringsKt.D(str)) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 != null) {
                fragmentPayForOrderDigitalBinding5.a0.setVisibility(8);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.a0.setText(str);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 != null) {
            fragmentPayForOrderDigitalBinding7.a0.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String J0() {
        String string = getString(R.string.failed_to_delete_gift_card);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void J2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.Y.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.E.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            fragmentPayForOrderDigitalBinding3.O.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void K0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.B.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void L() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.y.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void L1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.L.setChecked(false);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.L.setEnabled(false);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void M0(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.J.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$2] */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void M1(String expiredMessage) {
        Intrinsics.h(expiredMessage, "expiredMessage");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.Q.getAdapter() == null) {
            if (this.o == null) {
                PayClient payClient = this.A;
                if (payClient == null) {
                    Intrinsics.p("payClient");
                    throw null;
                }
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
                ?? r5 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$1
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                        digitalPayForOrderFragment.R1().c(DigipayActions.t);
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
                        String string = digitalPayForOrderFragment.getString(R.string.digipay_delete_card_title);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = digitalPayForOrderFragment.getString(R.string.digipay_confirm_delete_credit_card);
                        Intrinsics.g(string2, "getString(...)");
                        ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new j(digitalPayForOrderFragment, i, 2), ConfirmDialogFragment.SourceScreens.i);
                        FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
                        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                        confirmDialogFragmentA.Q1(parentFragmentManager);
                    }
                };
                ?? r6 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showExpiredCreditCards$2
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).i0(i);
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).t0(true);
                    }
                };
                ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter = new ExpiredCreditCardRecyclerViewAdapter();
                expiredCreditCardRecyclerViewAdapter.l = payClient;
                expiredCreditCardRecyclerViewAdapter.k = digitalPayForOrderPresenter;
                expiredCreditCardRecyclerViewAdapter.g = digitalPayForOrderPresenter.p;
                expiredCreditCardRecyclerViewAdapter.h = r5;
                expiredCreditCardRecyclerViewAdapter.i = r6;
                expiredCreditCardRecyclerViewAdapter.E(true);
                this.o = expiredCreditCardRecyclerViewAdapter;
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.Q.setAdapter(this.o);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.Q.setLayoutManager(new LinearLayoutManager(getActivity()));
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            ViewCompat.H(fragmentPayForOrderDigitalBinding4.Q);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding5.Q.setItemAnimator(null);
        } else {
            ExpiredCreditCardRecyclerViewAdapter expiredCreditCardRecyclerViewAdapter2 = this.o;
            Intrinsics.e(expiredCreditCardRecyclerViewAdapter2);
            expiredCreditCardRecyclerViewAdapter2.l();
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.Q.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.R.z.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 != null) {
            fragmentPayForOrderDigitalBinding8.R.y.setText(expiredMessage);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final LinearLayout M2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout creditCardCaptureHostView = fragmentPayForOrderDigitalBinding.F.C;
        Intrinsics.g(creditCardCaptureHostView, "creditCardCaptureHostView");
        return creditCardCaptureHostView;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String M3() {
        String string = getString(R.string.cardCaptureInitialisationFailText);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String N0() {
        String string = getString(R.string.unable_to_fetch_gift_card_balance_single);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void O(UIStatus uIStatus) {
        if (uIStatus == UIStatus.d) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding != null) {
                fragmentPayForOrderDigitalBinding.H.H.setBackground(ResourcesCompat.c(R.drawable.checkout_error_edittext_background, null, getResources()));
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.H.setBackground(ResourcesCompat.c(R.drawable.background_payment_add_giftcard_icon, null, getResources()));
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void O2(UIStatus uIStatus) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText cardNumberEditText = fragmentPayForOrderDigitalBinding.H.E;
        Intrinsics.g(cardNumberEditText, "cardNumberEditText");
        u2(cardNumberEditText, uIStatus);
        if (uIStatus == UIStatus.d) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 != null) {
                fragmentPayForOrderDigitalBinding2.H.z.setBackground(ResourcesCompat.c(R.drawable.checkout_left_error_edittext_background, null, getResources()));
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            fragmentPayForOrderDigitalBinding3.H.z.setBackground(ResourcesCompat.c(R.drawable.background_payment_add_giftcard_icon, null, getResources()));
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String P0() {
        String string = getString(R.string.gift_card_expired_message);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final Context P3() {
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        return contextRequireContext;
    }

    public final void Q1() {
        ((DigitalPayForOrderPresenter) b2().get()).t();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.M.setChecked(false);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void Q3() {
        Views.a((AppCompatActivity) getActivity());
    }

    public final AnalyticsManager R1() {
        AnalyticsManager analyticsManager = this.z;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String R2() {
        String string = getString(R.string.amount_exceed_gift_card_balance);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void R3(URL url) {
        StepUpDialogFragment stepUpDialogFragment = new StepUpDialogFragment();
        stepUpDialogFragment.j = url;
        stepUpDialogFragment.setCancelable(false);
        stepUpDialogFragment.show(getParentFragmentManager(), "Checkout.StepUpDialogFragment");
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void S1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.I.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.H.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void S2() {
        String string = getString(R.string.payment_times_out);
        String string2 = getString(R.string.return_to_payment);
        int iA = ResourcesCompat.a(R.color.red_error, null, getResources());
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_content_text", string);
        bundle.putString("key_button_text", string2);
        bundle.putInt("key_icon_colour", iA);
        errorDialogFragment.setArguments(bundle);
        FragmentTransaction fragmentTransactionE = getParentFragmentManager().e();
        fragmentTransactionE.g(0, errorDialogFragment, "Checkout.ErrorDialogFragment", 1);
        fragmentTransactionE.e();
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void T() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.Z.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.G.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            fragmentPayForOrderDigitalBinding3.P.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void T1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.d0.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.I.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.c0.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.c0.setText((CharSequence) null);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.b0.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.J.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.X.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding8.L.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
        if (fragmentPayForOrderDigitalBinding9 != null) {
            fragmentPayForOrderDigitalBinding9.I.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_selector);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String T2() {
        String string = getString(R.string.digipay_invalid_credit_card_expiry_date);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void T3(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.I.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String U() {
        String string;
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText cardPinEditText = fragmentPayForOrderDigitalBinding.H.F;
        Intrinsics.g(cardPinEditText, "cardPinEditText");
        Editable text = cardPinEditText.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final boolean U0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout errorWrapperLinearLayout = fragmentPayForOrderDigitalBinding.F.z.y;
        Intrinsics.g(errorWrapperLinearLayout, "errorWrapperLinearLayout");
        return errorWrapperLinearLayout.getVisibility() == 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void U1(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.E.setText("");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.F.setText("");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.H.K.setText("");
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding4.H.F.setOnFocusChangeListener(null);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding5.H.E.setOnFocusChangeListener(null);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
            if (fragmentPayForOrderDigitalBinding6 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding6.H.E.clearFocus();
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
            if (fragmentPayForOrderDigitalBinding7 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding7.H.F.clearFocus();
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
            if (fragmentPayForOrderDigitalBinding8 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding8.H.K.clearFocus();
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
            if (fragmentPayForOrderDigitalBinding9 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            EditText editText = fragmentPayForOrderDigitalBinding9.H.F;
            h hVar = this.w;
            editText.setOnFocusChangeListener(hVar);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
            if (fragmentPayForOrderDigitalBinding10 != null) {
                fragmentPayForOrderDigitalBinding10.H.E.setOnFocusChangeListener(hVar);
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final boolean U2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout creditCardCaptureView = fragmentPayForOrderDigitalBinding.F.D;
        Intrinsics.g(creditCardCaptureView, "creditCardCaptureView");
        return creditCardCaptureView.getVisibility() == 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void U3(UIStatus uIStatus) {
        if (uIStatus == UIStatus.d) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding != null) {
                fragmentPayForOrderDigitalBinding.H.I.setBackground(ResourcesCompat.c(R.drawable.checkout_error_edittext_background, null, getResources()));
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.I.setBackground(ResourcesCompat.c(R.drawable.background_payment_add_giftcard_icon, null, getResources()));
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void V() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.C.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void V1(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.A.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String V3() {
        String string = getString(R.string.specify_pay_gift_card_amount);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void W(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.G.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void W0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.H.F.setEnabled(false);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String W1() {
        String string = getString(R.string.singleZeroBalanceGiftCard);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(boolean r5) {
        /*
            r4 = this;
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            r1 = 0
            java.lang.String r2 = "fragmentBinding"
            if (r0 == 0) goto L4c
            android.widget.LinearLayout r0 = r0.C
            r3 = 0
            r0.setVisibility(r3)
            if (r5 != 0) goto L38
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L34
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r5 = r5.H
            android.widget.LinearLayout r5 = r5.B
            java.lang.String r0 = "addNewGiftCardDetailsLinearLayout"
            kotlin.jvm.internal.Intrinsics.g(r5, r0)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L23
            goto L38
        L23:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L30
            android.widget.LinearLayout r5 = r5.C
            r0 = 2131231022(0x7f08012e, float:1.8078113E38)
            r5.setBackgroundResource(r0)
            goto L44
        L30:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L34:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L38:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L48
            android.widget.LinearLayout r5 = r5.C
            r0 = 2131231033(0x7f080139, float:1.8078136E38)
            r5.setBackgroundResource(r0)
        L44:
            r4.I2()
            return
        L48:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L4c:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment.X(boolean):void");
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void Y0() {
        Views.a((AppCompatActivity) getActivity());
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.B.setVisibility(8);
        a4();
        I2();
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void Y1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.A.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String Y2() {
        String string = getString(R.string.invalid_gift_card_type);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void Z() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        NestedScrollView nestedScrollView = fragmentPayForOrderDigitalBinding.n0;
        if (fragmentPayForOrderDigitalBinding != null) {
            nestedScrollView.scrollTo(0, fragmentPayForOrderDigitalBinding.D.getBottom());
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String Z0() {
        if (!isVisible()) {
            return "";
        }
        String string = getString(R.string.payment_unknown_failure);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String Z1() {
        String string = getString(R.string.digipay_credit_card_not_accepted);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final boolean Z2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            return fragmentPayForOrderDigitalBinding.H.K.isEnabled();
        }
        Intrinsics.p("fragmentBinding");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void Z3(long j) {
        ((CheckoutViewModel) this.l.getD()).l.f(new CheckoutContract.Action.LaunchOrderConfirmation(j));
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void a0(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.g0.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void a1(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.A.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.Y.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.E.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.O.setVisibility(0);
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 != null) {
                fragmentPayForOrderDigitalBinding5.A.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 != null) {
            fragmentPayForOrderDigitalBinding6.A.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String a2() {
        String string = getString(R.string.linking_pay_pal_failed);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String a3() {
        String string = getString(R.string.invalid_gift_card_number);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void a4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.y.y.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.A.z.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String b0() {
        String string = getString(R.string.multipleExpiredGiftCardsMessage);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    public final Lazy b2() {
        Lazy lazy = this.x;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.p("payForOrderPresenterLazy");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void b3() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.T.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.S.z.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void b4() {
        g2();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.H.K.isEnabled()) {
            return;
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.F.setNextFocusDownId(R.id.paymentAmountEditText);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText editText = fragmentPayForOrderDigitalBinding3.H.K;
        DigitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1 digitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1 = this.t;
        editText.removeTextChangedListener(digitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.H.K.addTextChangedListener(digitalPayForOrderFragment$addGiftCardPaymentAmountTextWatcher$1);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.H.K.setOnFocusChangeListener(null);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.H.K.setOnFocusChangeListener(this.v);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 != null) {
            fragmentPayForOrderDigitalBinding7.H.K.setEnabled(true);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void c0(boolean z) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.Z.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.G.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.P.setVisibility(0);
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 != null) {
                fragmentPayForOrderDigitalBinding4.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 != null) {
            fragmentPayForOrderDigitalBinding5.B.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String c1() {
        String string = getString(R.string.duplicate_gift_card);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String c2() {
        String string = getString(R.string.actionRequiredMessage);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String c3() {
        if (!isVisible()) {
            return "";
        }
        String string = getString(R.string.giftcard_balance_too_many_request);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void d0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.d0.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.L.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$2] */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void d1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.C.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding2.U.getAdapter() == null) {
            if (this.p == null) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
                ?? r4 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$1
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        if (i >= 0) {
                            DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
                            digitalPayForOrderPresenter2.Z();
                            if (digitalPayForOrderPresenter2.Q() && i < digitalPayForOrderPresenter2.t.size() && digitalPayForOrderPresenter2.n()) {
                                if (!digitalPayForOrderPresenter2.F && !digitalPayForOrderPresenter2.E) {
                                    digitalPayForOrderPresenter2.y0();
                                    if (digitalPayForOrderPresenter2.W()) {
                                        digitalPayForOrderPresenter2.b0(new l(digitalPayForOrderPresenter2, 0), 100L);
                                    }
                                } else if ("NEW_CREDIT_CARD_INSTRUMENT_ID".equals(digitalPayForOrderPresenter2.y)) {
                                    digitalPayForOrderPresenter2.j0(i, false);
                                } else {
                                    CardCaptureView cardCaptureView = digitalPayForOrderPresenter2.x;
                                    if (cardCaptureView == null) {
                                        digitalPayForOrderPresenter2.j0(i, true);
                                    } else {
                                        digitalPayForOrderPresenter2.K = new m(digitalPayForOrderPresenter2, i);
                                        cardCaptureView.loadUrl("javascript:queryFormStatus()");
                                        digitalPayForOrderPresenter2.h0(new androidx.core.content.res.a(i, 1, digitalPayForOrderPresenter2));
                                    }
                                }
                            }
                            if (i >= ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).t.size() || ((SavedGiftCardData) ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).t.get(i)).isSelectedForPayment()) {
                                return;
                            }
                            Views.a((AppCompatActivity) digitalPayForOrderFragment.getActivity());
                        }
                    }
                };
                ?? r5 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$updateSavedGiftCards$2
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                        digitalPayForOrderFragment.R1().c(DigipayActions.j);
                        String string = digitalPayForOrderFragment.getString(R.string.digipay_delete_card_title);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = digitalPayForOrderFragment.getString(R.string.confirm_delete_gift_card);
                        Intrinsics.g(string2, "getString(...)");
                        ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new j(digitalPayForOrderFragment, i, 4), ConfirmDialogFragment.SourceScreens.h);
                        FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
                        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                        confirmDialogFragmentA.Q1(parentFragmentManager);
                    }
                };
                SavedGiftCardRecyclerViewAdapter savedGiftCardRecyclerViewAdapter = new SavedGiftCardRecyclerViewAdapter();
                savedGiftCardRecyclerViewAdapter.j = digitalPayForOrderPresenter;
                savedGiftCardRecyclerViewAdapter.g = digitalPayForOrderPresenter.t;
                savedGiftCardRecyclerViewAdapter.h = r4;
                savedGiftCardRecyclerViewAdapter.i = r5;
                savedGiftCardRecyclerViewAdapter.E(true);
                this.p = savedGiftCardRecyclerViewAdapter;
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.U.setAdapter(this.p);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding4.U.setLayoutManager(new LinearLayoutManager(getActivity()));
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            ViewCompat.H(fragmentPayForOrderDigitalBinding5.U);
        } else {
            SavedGiftCardRecyclerViewAdapter savedGiftCardRecyclerViewAdapter2 = this.p;
            Intrinsics.e(savedGiftCardRecyclerViewAdapter2);
            savedGiftCardRecyclerViewAdapter2.l();
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 != null) {
            fragmentPayForOrderDigitalBinding6.U.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void d2() {
        new AlertDialog.Builder(requireContext()).setTitle(R.string.session_expired).setMessage(R.string.cannot_proceed_to_payment_message).setPositiveButton(R.string.return_to_trolley, new e(this, 2)).setCancelable(false).create().show();
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String d4() {
        String string = getString(R.string.updating_credit_card_message);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String e1() {
        String string = getString(R.string.digipay_invalid_credit_card_number);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e2(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "errorMessage"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            r1 = 0
            java.lang.String r2 = "fragmentBinding"
            if (r0 == 0) goto L70
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBinding r0 = r0.A
            android.widget.LinearLayout r0 = r0.z
            r3 = 8
            r0.setVisibility(r3)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            if (r0 == 0) goto L6c
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r0 = r0.y
            android.widget.LinearLayout r0 = r0.y
            r3 = 0
            r0.setVisibility(r3)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            if (r0 == 0) goto L68
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r0 = r0.y
            android.widget.TextView r0 = r0.z
            r0.setText(r5)
            if (r6 != 0) goto L4c
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L48
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r5 = r5.H
            android.widget.LinearLayout r5 = r5.B
            java.lang.String r6 = "addNewGiftCardDetailsLinearLayout"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L4d
            goto L4c
        L48:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L4c:
            r3 = 1
        L4d:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L64
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r5 = r5.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r5 = r5.y
            android.widget.LinearLayout r5 = r5.y
            if (r3 == 0) goto L5d
            r6 = 2131231007(0x7f08011f, float:1.8078083E38)
            goto L60
        L5d:
            r6 = 2131231008(0x7f080120, float:1.8078085E38)
        L60:
            r5.setBackgroundResource(r6)
            return
        L64:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L68:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L6c:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L70:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment.e2(java.lang.String, boolean):void");
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void e4(boolean z, boolean z2, boolean z3) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.F.C.getChildCount() > 0) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            if (fragmentPayForOrderDigitalBinding2.F.C.getChildAt(0) instanceof CardCaptureView) {
                if (!z && U2()) {
                    I3();
                    Q1();
                    return;
                }
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
                if (fragmentPayForOrderDigitalBinding3 == null) {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
                fragmentPayForOrderDigitalBinding3.F.D.setVisibility(0);
                if (!z2 && !z3) {
                    FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
                    if (fragmentPayForOrderDigitalBinding4 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentPayForOrderDigitalBinding4.z.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
                    FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
                    if (fragmentPayForOrderDigitalBinding5 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentPayForOrderDigitalBinding5.F.D.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                } else if (z3 && z2) {
                    FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
                    if (fragmentPayForOrderDigitalBinding6 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentPayForOrderDigitalBinding6.F.D.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
                } else if (z2) {
                    FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
                    if (fragmentPayForOrderDigitalBinding7 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentPayForOrderDigitalBinding7.F.D.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
                } else {
                    FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
                    if (fragmentPayForOrderDigitalBinding8 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    fragmentPayForOrderDigitalBinding8.F.D.setBackgroundResource(R.drawable.background_payment_instrument_white_all_rounded_default);
                }
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
                if (fragmentPayForOrderDigitalBinding9 != null) {
                    fragmentPayForOrderDigitalBinding9.n0.postDelayed(new b(this, 1), 50L);
                } else {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void f1() {
        U1(false);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.L.setChecked(false);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.I.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.H.H.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.H.y.y.setVisibility(8);
        UIStatus uIStatus = UIStatus.e;
        C0(uIStatus);
        O2(uIStatus);
        g3(uIStatus);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void f2(String str) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.E.z.setText(str);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String f4() {
        String string = getString(R.string.digipay_invalid_credit_card_expiry_year);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void g1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.K.getAdapter() == null) {
            q2();
        } else {
            SavedCreditCardRecyclerViewAdapter savedCreditCardRecyclerViewAdapter = this.n;
            Intrinsics.e(savedCreditCardRecyclerViewAdapter);
            savedCreditCardRecyclerViewAdapter.l();
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.K.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void g2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.H.L.setEnabled(true);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void g3(UIStatus uIStatus) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText cardPinEditText = fragmentPayForOrderDigitalBinding.H.F;
        Intrinsics.g(cardPinEditText, "cardPinEditText");
        u2(cardPinEditText, uIStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g4(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "errorMessage"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            r1 = 0
            java.lang.String r2 = "fragmentBinding"
            if (r0 == 0) goto L60
            au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBinding r0 = r0.F
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r0 = r0.z
            android.widget.LinearLayout r0 = r0.y
            r3 = 0
            r0.setVisibility(r3)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            if (r0 == 0) goto L5c
            au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBinding r0 = r0.F
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r0 = r0.z
            android.widget.TextView r0 = r0.z
            r0.setText(r5)
            if (r6 != 0) goto L3d
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L39
            au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBinding r5 = r5.F
            android.widget.LinearLayout r5 = r5.D
            java.lang.String r6 = "creditCardCaptureView"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L3e
            goto L3d
        L39:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L3d:
            r3 = 1
        L3e:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L58
            au.com.woolworths.android.onesite.databinding.IncludeAddNewCreditCardDigitalBinding r5 = r5.F
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r5 = r5.z
            android.widget.LinearLayout r5 = r5.y
            if (r3 == 0) goto L4e
            r6 = 2131231007(0x7f08011f, float:1.8078083E38)
            goto L51
        L4e:
            r6 = 2131231008(0x7f080120, float:1.8078085E38)
        L51:
            r5.setBackgroundResource(r6)
            r4.Z()
            return
        L58:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L5c:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L60:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment.g4(java.lang.String, boolean):void");
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void h0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.U.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void h1(boolean z, boolean z2) {
        boolean z3 = this.n == null || ((DigitalPayForOrderPresenter) b2().get()).m();
        if ((this.p != null && !((DigitalPayForOrderPresenter) b2().get()).n()) || !z3) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding.Z.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.G.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 != null) {
                fragmentPayForOrderDigitalBinding3.P.setVisibility(0);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.P.setVisibility(8);
        if (z && z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding5.B.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
            if (fragmentPayForOrderDigitalBinding6 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding6.G.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
            if (fragmentPayForOrderDigitalBinding7 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding7.Z.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
            if (fragmentPayForOrderDigitalBinding8 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding8.G.setGravity(19);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
            if (fragmentPayForOrderDigitalBinding9 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding9.Z.setGravity(21);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
            if (fragmentPayForOrderDigitalBinding10 != null) {
                fragmentPayForOrderDigitalBinding10.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding11 = this.m;
            if (fragmentPayForOrderDigitalBinding11 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding11.B.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding12 = this.m;
            if (fragmentPayForOrderDigitalBinding12 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding12.G.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding13 = this.m;
            if (fragmentPayForOrderDigitalBinding13 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding13.Z.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding14 = this.m;
            if (fragmentPayForOrderDigitalBinding14 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding14.G.setGravity(17);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding15 = this.m;
            if (fragmentPayForOrderDigitalBinding15 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            LinearLayout addNewGiftCardDetailsLinearLayout = fragmentPayForOrderDigitalBinding15.H.B;
            Intrinsics.g(addNewGiftCardDetailsLinearLayout, "addNewGiftCardDetailsLinearLayout");
            if (addNewGiftCardDetailsLinearLayout.getVisibility() == 0) {
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding16 = this.m;
                if (fragmentPayForOrderDigitalBinding16 == null) {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
                fragmentPayForOrderDigitalBinding16.H.B.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding17 = this.m;
                if (fragmentPayForOrderDigitalBinding17 != null) {
                    fragmentPayForOrderDigitalBinding17.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                    return;
                } else {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding18 = this.m;
            if (fragmentPayForOrderDigitalBinding18 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding18.H.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding19 = this.m;
            if (fragmentPayForOrderDigitalBinding19 != null) {
                fragmentPayForOrderDigitalBinding19.B.setBackgroundResource(R.drawable.background_payment_instrument_all_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        if (z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding20 = this.m;
            if (fragmentPayForOrderDigitalBinding20 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding20.B.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding21 = this.m;
            if (fragmentPayForOrderDigitalBinding21 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding21.G.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding22 = this.m;
            if (fragmentPayForOrderDigitalBinding22 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding22.Z.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding23 = this.m;
            if (fragmentPayForOrderDigitalBinding23 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding23.Z.setGravity(17);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding24 = this.m;
            if (fragmentPayForOrderDigitalBinding24 != null) {
                fragmentPayForOrderDigitalBinding24.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding25 = this.m;
        if (fragmentPayForOrderDigitalBinding25 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding25.B.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding26 = this.m;
        if (fragmentPayForOrderDigitalBinding26 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding26.G.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding27 = this.m;
        if (fragmentPayForOrderDigitalBinding27 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding27.Z.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding28 = this.m;
        if (fragmentPayForOrderDigitalBinding28 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding28.G.setGravity(19);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding29 = this.m;
        if (fragmentPayForOrderDigitalBinding29 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding29.Z.setGravity(21);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding30 = this.m;
        if (fragmentPayForOrderDigitalBinding30 != null) {
            fragmentPayForOrderDigitalBinding30.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    public final SchedulersProvider h2() {
        SchedulersProvider schedulersProvider = this.y;
        if (schedulersProvider != null) {
            return schedulersProvider;
        }
        Intrinsics.p("schedulersProvider");
        throw null;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String i3() {
        if (!isVisible()) {
            return "";
        }
        String string = getString(R.string.iframe_session_expired);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String j2() {
        String string;
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText paymentAmountEditText = fragmentPayForOrderDigitalBinding.H.K;
        Intrinsics.g(paymentAmountEditText, "paymentAmountEditText");
        Editable text = paymentAmountEditText.getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void j3() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.K.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void k0(String message) {
        Intrinsics.h(message, "message");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        DigitalPayForOrderErrorState digitalPayForOrderErrorState = DigitalPayForOrderErrorState.f;
        digitalPayForOrderErrorState.e = new PlainText(message);
        fragmentPayForOrderDigitalBinding.L(digitalPayForOrderErrorState);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void l2() {
        if (this.n != null) {
            q2();
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String l3() {
        String string = getString(R.string.invalid_gift_card_details);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String l4() {
        String string = getString(R.string.multipleExpiredCreditCardsMessage);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String m1() {
        String string = getString(R.string.invalid_gift_card_pin);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void n0() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.z.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void n1() {
        U1(false);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String n3() {
        String string = getString(R.string.gift_card_zero_balance);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void n4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.V.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final SingleObserveOn o3() {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
        f fVar = new f(this, 0);
        digitalPayForOrderPresenter.getClass();
        return new SingleFlatMap(new SingleFlatMap(digitalPayForOrderPresenter.f.a(), new f(new n(fVar, 2), 6)), new f(new k(digitalPayForOrderPresenter, 2), 7)).h(h2().d()).f(h2().b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
        Context contextRequireContext = requireContext();
        if (PaymentFailureHelper.GlobalErrorLabelProvider.b == null) {
            Context applicationContext = contextRequireContext.getApplicationContext();
            PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider = new PaymentFailureHelper.GlobalErrorLabelProvider();
            globalErrorLabelProvider.f4289a = applicationContext.getResources();
            PaymentFailureHelper.GlobalErrorLabelProvider.b = globalErrorLabelProvider;
        }
        PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider2 = PaymentFailureHelper.GlobalErrorLabelProvider.b;
        Intrinsics.g(globalErrorLabelProvider2, "getInstance(...)");
        digitalPayForOrderPresenter.getClass();
        digitalPayForOrderPresenter.T = globalErrorLabelProvider2;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = (FragmentPayForOrderDigitalBinding) DataBindingUtil.c(inflater, R.layout.fragment_pay_for_order_digital, viewGroup, false, null);
        this.m = fragmentPayForOrderDigitalBinding;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.D(getViewLifecycleOwner());
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentPayForOrderDigitalBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        ViewExtKt.b(view, new androidx.navigation.compose.h(1, (byte) 0));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.E.setText(Html.fromHtml(getString(R.string.addNewCreditCardText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.Y.setText(Html.fromHtml(getString(R.string.manageCreditCardText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.G.setText(Html.fromHtml(getString(R.string.addNewGiftCardText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.Z.setText(Html.fromHtml(getString(R.string.manageGiftCardText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.X.setText(Html.fromHtml(getString(R.string.link_paypal_account)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding8.M.setText(Html.fromHtml(getString(R.string.delete_paypal_account)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
        if (fragmentPayForOrderDigitalBinding9 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding9.F.B.setText(Html.fromHtml(getString(R.string.clear_form)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
        if (fragmentPayForOrderDigitalBinding10 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding10.H.G.setText(Html.fromHtml(getString(R.string.clear_form)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding11 = this.m;
        if (fragmentPayForOrderDigitalBinding11 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding11.P.setText(Html.fromHtml(getString(R.string.doneWithManageText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding12 = this.m;
        if (fragmentPayForOrderDigitalBinding12 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding12.O.setText(Html.fromHtml(getString(R.string.doneWithManageText)));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding13 = this.m;
        if (fragmentPayForOrderDigitalBinding13 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i = 7;
        fragmentPayForOrderDigitalBinding13.F.K.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding14 = this.m;
        if (fragmentPayForOrderDigitalBinding14 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i2 = 8;
        fragmentPayForOrderDigitalBinding14.z.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding15 = this.m;
        if (fragmentPayForOrderDigitalBinding15 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i3 = 9;
        fragmentPayForOrderDigitalBinding15.E.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding16 = this.m;
        if (fragmentPayForOrderDigitalBinding16 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i4 = 10;
        fragmentPayForOrderDigitalBinding16.F.B.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding17 = this.m;
        if (fragmentPayForOrderDigitalBinding17 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i5 = 11;
        fragmentPayForOrderDigitalBinding17.Y.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding18 = this.m;
        if (fragmentPayForOrderDigitalBinding18 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i6 = 12;
        fragmentPayForOrderDigitalBinding18.O.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding19 = this.m;
        if (fragmentPayForOrderDigitalBinding19 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i7 = 0;
        fragmentPayForOrderDigitalBinding19.G.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding20 = this.m;
        if (fragmentPayForOrderDigitalBinding20 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i8 = 1;
        fragmentPayForOrderDigitalBinding20.C.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding21 = this.m;
        if (fragmentPayForOrderDigitalBinding21 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i9 = 2;
        fragmentPayForOrderDigitalBinding21.H.G.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding22 = this.m;
        if (fragmentPayForOrderDigitalBinding22 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText editText = fragmentPayForOrderDigitalBinding22.H.F;
        h hVar = this.w;
        editText.setOnFocusChangeListener(hVar);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding23 = this.m;
        if (fragmentPayForOrderDigitalBinding23 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding23.H.E.setOnFocusChangeListener(hVar);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding24 = this.m;
        if (fragmentPayForOrderDigitalBinding24 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i10 = 0;
        fragmentPayForOrderDigitalBinding24.F.M.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.d
            public final /* synthetic */ DigitalPayForOrderFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i10) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.b;
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
                        digitalPayForOrderPresenter.l.c(z ? DigipayActions.q : DigipayActions.r);
                        digitalPayForOrderPresenter.C = z;
                        break;
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.b;
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get()).Z();
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get();
                        digitalPayForOrderPresenter2.l.c(z ? DigipayActions.f : DigipayActions.g);
                        NewGiftCardData newGiftCardData = digitalPayForOrderPresenter2.v;
                        if (newGiftCardData != null) {
                            newGiftCardData.setSaveForLater(z);
                            break;
                        }
                        break;
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding25 = this.m;
        if (fragmentPayForOrderDigitalBinding25 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i11 = 1;
        fragmentPayForOrderDigitalBinding25.H.L.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.d
            public final /* synthetic */ DigitalPayForOrderFragment b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i11) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.b;
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get()).Z();
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment.b2().get();
                        digitalPayForOrderPresenter.l.c(z ? DigipayActions.q : DigipayActions.r);
                        digitalPayForOrderPresenter.C = z;
                        break;
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.b;
                        ((DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get()).Z();
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment2.b2().get();
                        digitalPayForOrderPresenter2.l.c(z ? DigipayActions.f : DigipayActions.g);
                        NewGiftCardData newGiftCardData = digitalPayForOrderPresenter2.v;
                        if (newGiftCardData != null) {
                            newGiftCardData.setSaveForLater(z);
                            break;
                        }
                        break;
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding26 = this.m;
        if (fragmentPayForOrderDigitalBinding26 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i12 = 3;
        fragmentPayForOrderDigitalBinding26.Z.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding27 = this.m;
        if (fragmentPayForOrderDigitalBinding27 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i13 = 4;
        fragmentPayForOrderDigitalBinding27.P.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding28 = this.m;
        if (fragmentPayForOrderDigitalBinding28 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i14 = 5;
        fragmentPayForOrderDigitalBinding28.M.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding29 = this.m;
        if (fragmentPayForOrderDigitalBinding29 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i15 = 6;
        fragmentPayForOrderDigitalBinding29.I.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding30 = this.m;
        if (fragmentPayForOrderDigitalBinding30 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i16 = 13;
        fragmentPayForOrderDigitalBinding30.V.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding31 = this.m;
        if (fragmentPayForOrderDigitalBinding31 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i17 = 14;
        fragmentPayForOrderDigitalBinding31.h0.y.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding32 = this.m;
        if (fragmentPayForOrderDigitalBinding32 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        final int i18 = 15;
        fragmentPayForOrderDigitalBinding32.i0.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.c
            public final /* synthetic */ DigitalPayForOrderFragment e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.m2(digitalPayForOrderFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        DigitalPayForOrderFragment digitalPayForOrderFragment2 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.n2(digitalPayForOrderFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        DigitalPayForOrderFragment digitalPayForOrderFragment3 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment3.b2().get()).u();
                            return;
                        } finally {
                        }
                    case 3:
                        DigitalPayForOrderFragment digitalPayForOrderFragment4 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment4.R1().c(DigipayActions.i);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).Z();
                            if (digitalPayForOrderFragment4.p != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment4.b2().get()).u0();
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        DigitalPayForOrderFragment digitalPayForOrderFragment5 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment5.b2().get()).u0();
                            return;
                        } finally {
                        }
                    case 5:
                        DigitalPayForOrderFragment digitalPayForOrderFragment6 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.o2(digitalPayForOrderFragment6);
                            return;
                        } finally {
                        }
                    case 6:
                        DigitalPayForOrderFragment digitalPayForOrderFragment7 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.p2(digitalPayForOrderFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        DigitalPayForOrderFragment digitalPayForOrderFragment8 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment8.b2().get()).T(true);
                            return;
                        } finally {
                        }
                    case 8:
                        DigitalPayForOrderFragment digitalPayForOrderFragment9 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) digitalPayForOrderFragment9.b2().get();
                            digitalPayForOrderPresenter.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter.k0(false);
                            return;
                        } finally {
                        }
                    case 9:
                        DigitalPayForOrderFragment digitalPayForOrderFragment10 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get()).Z();
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) digitalPayForOrderFragment10.b2().get();
                            digitalPayForOrderPresenter2.l.c(DigipayActions.p);
                            digitalPayForOrderPresenter2.k0(false);
                            return;
                        } finally {
                        }
                    case 10:
                        DigitalPayForOrderFragment digitalPayForOrderFragment11 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment11.R1().c(DigipayActions.s);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment11.b2().get()).Z();
                            digitalPayForOrderFragment11.Q1();
                            return;
                        } finally {
                        }
                    case 11:
                        DigitalPayForOrderFragment digitalPayForOrderFragment12 = this.e;
                        Callback.g(view2);
                        try {
                            digitalPayForOrderFragment12.R1().c(DigipayActions.w);
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).Z();
                            if (digitalPayForOrderFragment12.n != null) {
                                ((DigitalPayForOrderPresenter) digitalPayForOrderFragment12.b2().get()).t0(false);
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        DigitalPayForOrderFragment digitalPayForOrderFragment13 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).Z();
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment13.b2().get()).t0(false);
                            return;
                        } finally {
                        }
                    case 13:
                        DigitalPayForOrderFragment digitalPayForOrderFragment14 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment14.b2().get()).Z();
                            return;
                        } finally {
                        }
                    case 14:
                        DigitalPayForOrderFragment digitalPayForOrderFragment15 = this.e;
                        Callback.g(view2);
                        try {
                            ((DigitalPayForOrderPresenter) digitalPayForOrderFragment15.b2().get()).Z();
                            return;
                        } finally {
                        }
                    default:
                        DigitalPayForOrderFragment digitalPayForOrderFragment16 = this.e;
                        Callback.g(view2);
                        try {
                            DigitalPayForOrderFragment.i2(digitalPayForOrderFragment16);
                            return;
                        } finally {
                        }
                }
            }
        });
        n4();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding33 = this.m;
        if (fragmentPayForOrderDigitalBinding33 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view2 = fragmentPayForOrderDigitalBinding33.h;
        Intrinsics.g(view2, "getRoot(...)");
        return view2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        y();
        super.onDestroyView();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText editText = fragmentPayForOrderDigitalBinding.H.F;
        DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1 digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1 = this.u;
        editText.removeTextChangedListener(digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.E.removeTextChangedListener(digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1);
        ((DigitalPayForOrderPresenter) b2().get()).a();
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
        digitalPayForOrderPresenter.x = null;
        digitalPayForOrderPresenter.O = null;
        digitalPayForOrderPresenter.U = true;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
        digitalPayForOrderPresenter.f4374a = this;
        ObservableObserveOn observableObserveOnF = digitalPayForOrderPresenter.d.getE().f(digitalPayForOrderPresenter.i.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new f(new k(digitalPayForOrderPresenter, 3), 8), new f(new k(digitalPayForOrderPresenter, 4), 9));
        observableObserveOnF.a(lambdaObserver);
        CompositeDisposable compositeDisposable = digitalPayForOrderPresenter.b;
        compositeDisposable.d(lambdaObserver);
        digitalPayForOrderPresenter.G = 0;
        digitalPayForOrderPresenter.H = 0;
        digitalPayForOrderPresenter.D.clear();
        if (digitalPayForOrderPresenter.i()) {
            Object obj = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).n1();
            Object obj2 = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).Y0();
            if (digitalPayForOrderPresenter.P()) {
                Object obj3 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).h1(true, digitalPayForOrderPresenter.Q());
            } else {
                Object obj4 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).X(digitalPayForOrderPresenter.K());
            }
        }
        digitalPayForOrderPresenter.v = null;
        digitalPayForOrderPresenter.u.clear();
        digitalPayForOrderPresenter.F = true;
        digitalPayForOrderPresenter.E = false;
        digitalPayForOrderPresenter.t();
        Object obj5 = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj5);
        ((DigitalPayForOrderContract.View) obj5).B2(false);
        Object obj6 = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj6);
        ((DigitalPayForOrderContract.View) obj6).l2();
        digitalPayForOrderPresenter.u();
        if (digitalPayForOrderPresenter.i()) {
            digitalPayForOrderPresenter.G = 1;
            digitalPayForOrderPresenter.t0(false);
        }
        if (digitalPayForOrderPresenter.i()) {
            digitalPayForOrderPresenter.H = 1;
            digitalPayForOrderPresenter.u0();
        }
        digitalPayForOrderPresenter.Z();
        SingleCache singleCache = digitalPayForOrderPresenter.c0;
        if (singleCache != null) {
            DigitalPayForOrderPresenter$createLinkPayPalObserver$1 digitalPayForOrderPresenter$createLinkPayPalObserver$1 = new DigitalPayForOrderPresenter$createLinkPayPalObserver$1(digitalPayForOrderPresenter);
            singleCache.a(digitalPayForOrderPresenter$createLinkPayPalObserver$1);
            compositeDisposable.d(digitalPayForOrderPresenter$createLinkPayPalObserver$1);
        } else {
            SingleCache singleCache2 = digitalPayForOrderPresenter.a0;
            if (singleCache2 != null) {
                DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1 digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1 = new DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1(digitalPayForOrderPresenter);
                singleCache2.a(digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1);
                compositeDisposable.d(digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1);
            } else {
                SingleFlatMap singleFlatMap = digitalPayForOrderPresenter.b0;
                if (singleFlatMap != null) {
                    DigitalPayForOrderPresenter$createPayForOrderObserver$1 digitalPayForOrderPresenter$createPayForOrderObserver$1 = new DigitalPayForOrderPresenter$createPayForOrderObserver$1(digitalPayForOrderPresenter);
                    singleFlatMap.a(digitalPayForOrderPresenter$createPayForOrderObserver$1);
                    compositeDisposable.d(digitalPayForOrderPresenter$createPayForOrderObserver$1);
                } else {
                    digitalPayForOrderPresenter.f0();
                    if (digitalPayForOrderPresenter.i()) {
                        if (digitalPayForOrderPresenter.M == null) {
                            digitalPayForOrderPresenter.B();
                        } else if (digitalPayForOrderPresenter.X()) {
                            digitalPayForOrderPresenter.v0();
                            digitalPayForOrderPresenter.Z = true;
                            if (digitalPayForOrderPresenter.i()) {
                                Object obj7 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj7);
                                ((DigitalPayForOrderContract.View) obj7).a0(false);
                            }
                            digitalPayForOrderPresenter.q0();
                        } else {
                            digitalPayForOrderPresenter.v0();
                            digitalPayForOrderPresenter.Z = false;
                            if (digitalPayForOrderPresenter.i()) {
                                Object obj8 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj8);
                                ((DigitalPayForOrderContract.View) obj8).a0(true);
                            }
                            digitalPayForOrderPresenter.z();
                        }
                    }
                }
            }
        }
        digitalPayForOrderPresenter.l.a(Screens.h);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EditText editText = fragmentPayForOrderDigitalBinding.H.F;
        DigitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1 digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1 = this.u;
        editText.addTextChangedListener(digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.H.E.addTextChangedListener(digitalPayForOrderFragment$newGiftCardNumberAndPinTextWatcher$1);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void p0(CardCaptureView cardCaptureView) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout creditCardCaptureHostView = fragmentPayForOrderDigitalBinding.F.C;
        Intrinsics.g(creditCardCaptureHostView, "creditCardCaptureHostView");
        if (creditCardCaptureHostView.getChildCount() != 0) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.F.C.removeViewAt(0);
        }
        if (cardCaptureView != null) {
            cardCaptureView.setLayerType(1, null);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.F.C.addView(cardCaptureView, 0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding4.F.C.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding5.F.F.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
            if (fragmentPayForOrderDigitalBinding6 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding6.F.L.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
            if (fragmentPayForOrderDigitalBinding7 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding7.F.y.setVisibility(0);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
            if (fragmentPayForOrderDigitalBinding8 != null) {
                fragmentPayForOrderDigitalBinding8.F.H.setVisibility(8);
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void p3(String warningMessage) {
        Intrinsics.h(warningMessage, "warningMessage");
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.j0.z.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.j0.y.setText(warningMessage);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void p4(boolean z, boolean z2) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.B.setVisibility(0);
        if (!z && !z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.C.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.H.B.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
        } else if (z2 && z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding4.H.B.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
        } else if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
            if (fragmentPayForOrderDigitalBinding5 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding5.H.B.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
        } else {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
            if (fragmentPayForOrderDigitalBinding6 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding6.H.B.setBackgroundResource(R.drawable.background_payment_instrument_white_all_rounded_default);
        }
        I2();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2] */
    public final void q2() {
        PayClient payClient = this.A;
        if (payClient == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
        ?? r4 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$1
            @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
            public final void a(int i) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) this.d.b2().get();
                ArrayList arrayList = digitalPayForOrderPresenter2.q;
                PaymentServicesInteractor paymentServicesInteractor = digitalPayForOrderPresenter2.f;
                digitalPayForOrderPresenter2.Z();
                if (digitalPayForOrderPresenter2.i() && digitalPayForOrderPresenter2.m() && paymentServicesInteractor.e()) {
                    boolean z = true;
                    if (!digitalPayForOrderPresenter2.F && !digitalPayForOrderPresenter2.E) {
                        if (digitalPayForOrderPresenter2.W()) {
                            Object obj = digitalPayForOrderPresenter2.f4374a;
                            Intrinsics.e(obj);
                            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj;
                            Object obj2 = digitalPayForOrderPresenter2.f4374a;
                            Intrinsics.e(obj2);
                            String strG = ((DigitalPayForOrderContract.View) obj2).G();
                            if (!digitalPayForOrderPresenter2.Q() && !digitalPayForOrderPresenter2.K()) {
                                z = false;
                            }
                            view.e2(strG, z);
                        }
                        digitalPayForOrderPresenter2.y0();
                        return;
                    }
                    if (i >= arrayList.size()) {
                        return;
                    }
                    String instrumentId = ((CreditCardInstrument) arrayList.get(i)).getInstrumentId();
                    Intrinsics.g(instrumentId, "getInstrumentId(...)");
                    if (instrumentId.equals(digitalPayForOrderPresenter2.y)) {
                        digitalPayForOrderPresenter2.y = null;
                        Object obj3 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj3);
                        ((DigitalPayForOrderContract.View) obj3).g1();
                        digitalPayForOrderPresenter2.v0();
                        digitalPayForOrderPresenter2.z0();
                        return;
                    }
                    digitalPayForOrderPresenter2.y = instrumentId;
                    digitalPayForOrderPresenter2.z = null;
                    digitalPayForOrderPresenter2.D0();
                    digitalPayForOrderPresenter2.z0();
                    Object obj4 = digitalPayForOrderPresenter2.f4374a;
                    Intrinsics.e(obj4);
                    ((DigitalPayForOrderContract.View) obj4).g1();
                    Object obj5 = digitalPayForOrderPresenter2.f4374a;
                    Intrinsics.e(obj5);
                    ((DigitalPayForOrderContract.View) obj5).D2(digitalPayForOrderPresenter2.R(), digitalPayForOrderPresenter2.O());
                    Object obj6 = digitalPayForOrderPresenter2.f4374a;
                    Intrinsics.e(obj6);
                    ((DigitalPayForOrderContract.View) obj6).I3();
                    digitalPayForOrderPresenter2.t();
                    if (digitalPayForOrderPresenter2.F && paymentServicesInteractor.l()) {
                        Object obj7 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj7);
                        ((DigitalPayForOrderContract.View) obj7).Y0();
                        if (digitalPayForOrderPresenter2.P()) {
                            Object obj8 = digitalPayForOrderPresenter2.f4374a;
                            Intrinsics.e(obj8);
                            ((DigitalPayForOrderContract.View) obj8).h1(true, digitalPayForOrderPresenter2.Q());
                        } else {
                            Object obj9 = digitalPayForOrderPresenter2.f4374a;
                            Intrinsics.e(obj9);
                            ((DigitalPayForOrderContract.View) obj9).X(digitalPayForOrderPresenter2.K());
                        }
                    }
                    digitalPayForOrderPresenter2.v0();
                }
            }
        };
        ?? r5 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$createSavedCreditCardRecyclerViewAdapter$2
            @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
            public final void a(int i) {
                DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                digitalPayForOrderFragment.R1().c(DigipayActions.t);
                String string = digitalPayForOrderFragment.getString(R.string.digipay_delete_card_title);
                Intrinsics.g(string, "getString(...)");
                String string2 = digitalPayForOrderFragment.getString(R.string.digipay_confirm_delete_credit_card);
                Intrinsics.g(string2, "getString(...)");
                ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new j(digitalPayForOrderFragment, i, 0), ConfirmDialogFragment.SourceScreens.i);
                FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
                Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                confirmDialogFragmentA.Q1(parentFragmentManager);
            }
        };
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        SavedCreditCardRecyclerViewAdapter savedCreditCardRecyclerViewAdapter = new SavedCreditCardRecyclerViewAdapter();
        savedCreditCardRecyclerViewAdapter.l = payClient;
        savedCreditCardRecyclerViewAdapter.k = digitalPayForOrderPresenter;
        savedCreditCardRecyclerViewAdapter.g = digitalPayForOrderPresenter.q;
        savedCreditCardRecyclerViewAdapter.h = r4;
        savedCreditCardRecyclerViewAdapter.i = r5;
        savedCreditCardRecyclerViewAdapter.j = appCompatActivity;
        savedCreditCardRecyclerViewAdapter.E(true);
        this.n = savedCreditCardRecyclerViewAdapter;
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.K.setAdapter(savedCreditCardRecyclerViewAdapter);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.K.setLayoutManager(new LinearLayoutManager(getActivity()));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            ViewCompat.H(fragmentPayForOrderDigitalBinding3.K);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String q3() {
        String string = getString(R.string.digipay_invalid_credit_card_expiry_month);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void r3() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.j0.z.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void r4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.Q.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 != null) {
            fragmentPayForOrderDigitalBinding2.R.z.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String s0() {
        String string = getString(R.string.digipay_invalid_credit_card_details);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void s1() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.h0.y.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void t1() {
        new AlertDialog.Builder(requireContext()).setTitle(R.string.digipay_fatal_error_title).setMessage(R.string.digipay_fatal_error_body).setPositiveButton(R.string.retry, new e(this, 0)).setNegativeButton(R.string.cancel, new e(this, 1)).setCancelable(false).create().show();
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void t2(String errorMessage, boolean z) {
        Intrinsics.h(errorMessage, "errorMessage");
        p0(null);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.F.z.y.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.F.F.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.F.L.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.F.y.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.F.C.setVisibility(8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.F.D.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.F.H.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding8.z.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
        if (z) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
            if (fragmentPayForOrderDigitalBinding9 != null) {
                fragmentPayForOrderDigitalBinding9.F.D.setBackgroundResource(R.drawable.background_payment_instrument_no_rounded_default);
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
        if (fragmentPayForOrderDigitalBinding10 != null) {
            fragmentPayForOrderDigitalBinding10.F.D.setBackgroundResource(R.drawable.background_payment_instrument_bottom_rounded_default);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "warningMessage"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            r1 = 0
            java.lang.String r2 = "fragmentBinding"
            if (r0 == 0) goto L70
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutErrorNoRoundedBinding r0 = r0.y
            android.widget.LinearLayout r0 = r0.y
            r3 = 8
            r0.setVisibility(r3)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            if (r0 == 0) goto L6c
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBinding r0 = r0.A
            android.widget.LinearLayout r0 = r0.z
            r3 = 0
            r0.setVisibility(r3)
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r0 = r4.m
            if (r0 == 0) goto L68
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r0 = r0.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBinding r0 = r0.A
            android.widget.TextView r0 = r0.y
            r0.setText(r5)
            if (r6 != 0) goto L4c
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L48
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r5 = r5.H
            android.widget.LinearLayout r5 = r5.B
            java.lang.String r6 = "addNewGiftCardDetailsLinearLayout"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L4d
            goto L4c
        L48:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L4c:
            r3 = 1
        L4d:
            au.com.woolworths.android.onesite.databinding.FragmentPayForOrderDigitalBinding r5 = r4.m
            if (r5 == 0) goto L64
            au.com.woolworths.android.onesite.databinding.IncludeAddNewGiftCardDigitalBinding r5 = r5.H
            au.com.woolworths.android.onesite.databinding.IncludeCheckoutWarningBinding r5 = r5.A
            android.widget.LinearLayout r5 = r5.z
            if (r3 == 0) goto L5d
            r6 = 2131231009(0x7f080121, float:1.8078087E38)
            goto L60
        L5d:
            r6 = 2131231010(0x7f080122, float:1.8078089E38)
        L60:
            r5.setBackgroundResource(r6)
            return
        L64:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L68:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L6c:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L70:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment.u0(java.lang.String, boolean):void");
    }

    public final void u2(View view, UIStatus uIStatus) {
        if (uIStatus == UIStatus.d) {
            view.setBackground(ResourcesCompat.c(R.drawable.checkout_error_edittext_background, null, getResources()));
        } else {
            view.setBackground(ResourcesCompat.c(R.drawable.background_payment_add_giftcard_sub_view, null, getResources()));
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String u3() {
        String string = getString(R.string.singleExpiredGiftCardMessage);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showAddedGiftCards$1] */
    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void u4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        if (fragmentPayForOrderDigitalBinding.H.D.getAdapter() == null) {
            if (this.r == null) {
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) b2().get();
                ?? r4 = new RecyclerViewListener.View() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderFragment$showAddedGiftCards$1
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
                    public final void a(int i) {
                        DigitalPayForOrderFragment digitalPayForOrderFragment = this.d;
                        digitalPayForOrderFragment.R1().c(DigipayActions.m);
                        String string = digitalPayForOrderFragment.getString(R.string.digipay_delete_card_title);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = digitalPayForOrderFragment.getString(R.string.confirm_delete_new_gift_card);
                        Intrinsics.g(string2, "getString(...)");
                        ConfirmDialogFragment confirmDialogFragmentA = ConfirmDialogFragment.Companion.a(string, string2, new j(digitalPayForOrderFragment, i, 1), ConfirmDialogFragment.SourceScreens.g);
                        FragmentManager parentFragmentManager = digitalPayForOrderFragment.getParentFragmentManager();
                        Intrinsics.g(parentFragmentManager, "getParentFragmentManager(...)");
                        confirmDialogFragmentA.Q1(parentFragmentManager);
                    }
                };
                AddedGiftCardRecyclerViewAdapter addedGiftCardRecyclerViewAdapter = new AddedGiftCardRecyclerViewAdapter();
                addedGiftCardRecyclerViewAdapter.j = digitalPayForOrderPresenter;
                addedGiftCardRecyclerViewAdapter.g = digitalPayForOrderPresenter.u;
                addedGiftCardRecyclerViewAdapter.h = r4;
                addedGiftCardRecyclerViewAdapter.E(true);
                this.r = addedGiftCardRecyclerViewAdapter;
            }
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.H.D.setAdapter(this.r);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.H.D.setLayoutManager(new LinearLayoutManager(getActivity()));
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            ViewCompat.H(fragmentPayForOrderDigitalBinding4.H.D);
        } else {
            AddedGiftCardRecyclerViewAdapter addedGiftCardRecyclerViewAdapter2 = this.r;
            Intrinsics.e(addedGiftCardRecyclerViewAdapter2);
            addedGiftCardRecyclerViewAdapter2.l();
        }
        I2();
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 != null) {
            fragmentPayForOrderDigitalBinding5.H.D.setVisibility(0);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void v0(String str, boolean z, boolean z2) {
        String string;
        if (z2) {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
            if (fragmentPayForOrderDigitalBinding == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding.I.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_error);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
            if (fragmentPayForOrderDigitalBinding2 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding2.f0.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
            if (fragmentPayForOrderDigitalBinding3 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            fragmentPayForOrderDigitalBinding3.e0.y.setVisibility(8);
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
            if (fragmentPayForOrderDigitalBinding4 != null) {
                fragmentPayForOrderDigitalBinding4.b0.setBackgroundColor(requireActivity().getColor(R.color.checkoutErrorBorder));
                return;
            } else {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
        }
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding5.I.setBackgroundResource(R.drawable.background_payment_instrument_top_rounded_selector);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding6 = this.m;
        if (fragmentPayForOrderDigitalBinding6 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding6.I.setSelected(z);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding7 = this.m;
        if (fragmentPayForOrderDigitalBinding7 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding7.f0.setVisibility(z ? 0 : 8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding8 = this.m;
        if (fragmentPayForOrderDigitalBinding8 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding8.e0.y.setVisibility(z ? 0 : 8);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding9 = this.m;
        if (fragmentPayForOrderDigitalBinding9 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding9.e0.z.setText(str);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding10 = this.m;
        if (fragmentPayForOrderDigitalBinding10 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding10.b0.setBackgroundColor(requireActivity().getColor(z ? R.color.selected_instrument_border : R.color.payment_instrument_border));
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding11 = this.m;
        if (fragmentPayForOrderDigitalBinding11 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        LinearLayout linearLayout = fragmentPayForOrderDigitalBinding11.I;
        CharSequence text = fragmentPayForOrderDigitalBinding11.c0.getText();
        if (text == null || StringsKt.D(text)) {
            string = getString(R.string.add_paypal_account);
            Intrinsics.g(string, "getString(...)");
        } else {
            FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding12 = this.m;
            if (fragmentPayForOrderDigitalBinding12 == null) {
                Intrinsics.p("fragmentBinding");
                throw null;
            }
            if (fragmentPayForOrderDigitalBinding12.I.isSelected()) {
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding13 = this.m;
                if (fragmentPayForOrderDigitalBinding13 == null) {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
                CharSequence text2 = fragmentPayForOrderDigitalBinding13.c0.getText();
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding14 = this.m;
                if (fragmentPayForOrderDigitalBinding14 == null) {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
                string = getString(R.string.selected_pay_with_paypal_content_description, text2, fragmentPayForOrderDigitalBinding14.e0.z.getText());
                Intrinsics.g(string, "getString(...)");
            } else {
                FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding15 = this.m;
                if (fragmentPayForOrderDigitalBinding15 == null) {
                    Intrinsics.p("fragmentBinding");
                    throw null;
                }
                string = getString(R.string.not_selected_pay_with_paypal_content_description, fragmentPayForOrderDigitalBinding15.c0.getText());
                Intrinsics.g(string, "getString(...)");
            }
        }
        linearLayout.setContentDescription(string);
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String v1() {
        String string = getString(R.string.more_than_order_value);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String v3() {
        String string = getString(R.string.failed_to_delete_credit_card);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void v4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.z.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void x2() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.F.z.y.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String y1() {
        String string = getString(R.string.invalid_gift_card_details);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String y4() {
        String string = getString(R.string.digipay_invalid_credit_card_cvv);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void z() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding != null) {
            fragmentPayForOrderDigitalBinding.H.F.setEnabled(true);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final String z1() {
        String string = getString(R.string.fail_to_deleting_paypal_link);
        Intrinsics.g(string, "getString(...)");
        return string;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void z2(String str) {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.J.setText(str);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.I.setVisibility(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 != null) {
            fragmentPayForOrderDigitalBinding3.H.H.setVisibility(8);
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View
    public final void z4() {
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding = this.m;
        if (fragmentPayForOrderDigitalBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding.H.K.setEnabled(false);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding2 = this.m;
        if (fragmentPayForOrderDigitalBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding2.H.F.setNextFocusDownId(0);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding3 = this.m;
        if (fragmentPayForOrderDigitalBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding3.H.K.removeTextChangedListener(this.t);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding4 = this.m;
        if (fragmentPayForOrderDigitalBinding4 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentPayForOrderDigitalBinding4.H.K.setOnFocusChangeListener(null);
        FragmentPayForOrderDigitalBinding fragmentPayForOrderDigitalBinding5 = this.m;
        if (fragmentPayForOrderDigitalBinding5 != null) {
            fragmentPayForOrderDigitalBinding5.H.K.setText("");
        } else {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
    }
}
