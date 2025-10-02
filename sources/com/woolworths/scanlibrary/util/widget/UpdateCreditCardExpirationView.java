package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebViewDatabase;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.UpdateCreditCardView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewUpdateCreditcardBinding;
import com.woolworths.scanlibrary.util.payment.PayErrorAggregator;
import com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "IframeCallback", "UpdateCardListener", "Companion", "ViewModel", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UpdateCreditCardExpirationView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final ViewUpdateCreditcardBinding d;
    public final ViewModel e;
    public PayClient f;
    public UpdateCardListener g;
    public UpdateCreditCardView h;
    public CreditCardInstrument i;
    public final PayErrorAggregator j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView$Companion;", "", "", "ERROR_IFRAME_LOADING_FAILED", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView$IframeCallback;", "Lau/com/woolworths/pay/sdk/web/FormView$FormViewCallback;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IframeCallback implements FormView.FormViewCallback {
        public IframeCallback() {
        }

        public static int g(Boolean bool) {
            return (bool == null || bool.booleanValue()) ? 0 : 1;
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void a(FormFocusState formFocusState) {
            boolean zBooleanValue = formFocusState.f9191a.booleanValue();
            UpdateCreditCardExpirationView updateCreditCardExpirationView = UpdateCreditCardExpirationView.this;
            if (!zBooleanValue) {
                if (g(formFocusState.e) + g(formFocusState.f) == 2) {
                    UpdateCreditCardExpirationView.a(updateCreditCardExpirationView, R.string.sng_invalid_expiry_date);
                } else if (g(formFocusState.f) + g(formFocusState.e) + g(formFocusState.d) == 2) {
                    UpdateCreditCardExpirationView.a(updateCreditCardExpirationView, R.string.sng_invalid_credit_card_details);
                } else {
                    Boolean bool = formFocusState.e;
                    if (bool == null || !bool.equals(Boolean.FALSE)) {
                        Boolean bool2 = formFocusState.f;
                        if (bool2 == null || !bool2.equals(Boolean.FALSE)) {
                            Boolean bool3 = formFocusState.d;
                            if (bool3 == null || !bool3.equals(Boolean.FALSE)) {
                                UpdateCardListener updateCardListener = updateCreditCardExpirationView.g;
                                if (updateCardListener != null) {
                                    updateCardListener.c();
                                }
                            } else {
                                UpdateCreditCardExpirationView.a(updateCreditCardExpirationView, R.string.sng_invalid_cvv_message);
                            }
                        } else {
                            UpdateCreditCardExpirationView.a(updateCreditCardExpirationView, R.string.sng_invalid_expiry_year_message);
                        }
                    } else {
                        UpdateCreditCardExpirationView.a(updateCreditCardExpirationView, R.string.sng_invalid_expiry_month_message);
                    }
                }
            }
            UpdateCardListener updateCardListener2 = updateCreditCardExpirationView.g;
            if (updateCardListener2 != null) {
                updateCardListener2.a(formFocusState);
            }
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void b() throws Throwable {
            ViewModel viewModel = UpdateCreditCardExpirationView.this.e;
            if (viewModel != null) {
                viewModel.f.i(false);
            } else {
                Intrinsics.p("viewModel");
                throw null;
            }
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void c(boolean z, boolean z2) throws Throwable {
            ViewModel viewModel = UpdateCreditCardExpirationView.this.e;
            if (viewModel != null) {
                viewModel.e.i(z);
            } else {
                Intrinsics.p("viewModel");
                throw null;
            }
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void d(BaseError baseError) throws Throwable {
            UpdateCreditCardExpirationView updateCreditCardExpirationView = UpdateCreditCardExpirationView.this;
            ViewModel viewModel = updateCreditCardExpirationView.e;
            if (viewModel == null) {
                Intrinsics.p("viewModel");
                throw null;
            }
            viewModel.f.i(false);
            if (Intrinsics.c(baseError.getErrorMessage(), "Error loading iFrame.")) {
                ViewUpdateCreditcardBinding viewUpdateCreditcardBinding = updateCreditCardExpirationView.d;
                if (viewUpdateCreditcardBinding == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                viewUpdateCreditcardBinding.z.setVisibility(4);
            }
            updateCreditCardExpirationView.j.b(baseError);
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void e(String auditId, String paymentInstrumentId, String stepUpToken) {
            Intrinsics.h(auditId, "auditId");
            Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
            Intrinsics.h(stepUpToken, "stepUpToken");
            UpdateCardListener updateCardListener = UpdateCreditCardExpirationView.this.g;
            if (updateCardListener != null) {
                updateCardListener.b(paymentInstrumentId, stepUpToken);
            }
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void f(String fieldName, Boolean bool) {
            Intrinsics.h(fieldName, "fieldName");
            UpdateCardListener updateCardListener = UpdateCreditCardExpirationView.this.g;
            if (updateCardListener != null) {
                updateCardListener.t();
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView$UpdateCardListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UpdateCardListener {
        void a(FormFocusState formFocusState);

        void b(String str, String str2);

        void c();

        void d(PayError payError);

        void f(String str);

        void m();

        void t();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/UpdateCreditCardExpirationView$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewModel extends BaseObservable {
        public final ObservableBoolean e = new ObservableBoolean(false);
        public final ObservableBoolean f = new ObservableBoolean(false);

        public ViewModel() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCreditCardExpirationView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.j = new PayErrorAggregator(new PayErrorAggregator.ErrorGroupListener() { // from class: com.woolworths.scanlibrary.util.widget.UpdateCreditCardExpirationView$errorDelegate$1
            @Override // com.woolworths.scanlibrary.util.payment.PayErrorAggregator.ErrorGroupListener
            public final void a(List list) {
                int i = UpdateCreditCardExpirationView.k;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((PayError) obj).getPayErrorCode() == PayErrorCode.NETWORK_ERROR) {
                        arrayList.add(obj);
                    }
                }
                PayError payError = !arrayList.isEmpty() ? (PayError) arrayList.get(0) : (PayError) list.get(0);
                UpdateCreditCardExpirationView.UpdateCardListener updateCardListener = this.f21385a.g;
                if (updateCardListener != null) {
                    updateCardListener.d(payError);
                }
            }
        });
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int i = ViewUpdateCreditcardBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ViewUpdateCreditcardBinding viewUpdateCreditcardBinding = (ViewUpdateCreditcardBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.view_update_creditcard, null, false, null);
        this.d = viewUpdateCreditcardBinding;
        if (viewUpdateCreditcardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        addView(viewUpdateCreditcardBinding.h, -1, -2);
        ViewModel viewModel = new ViewModel();
        this.e = viewModel;
        ViewUpdateCreditcardBinding viewUpdateCreditcardBinding2 = this.d;
        if (viewUpdateCreditcardBinding2 != null) {
            viewUpdateCreditcardBinding2.L(viewModel);
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    public static final void a(UpdateCreditCardExpirationView updateCreditCardExpirationView, int i) {
        UpdateCardListener updateCardListener = updateCreditCardExpirationView.g;
        if (updateCardListener != null) {
            String string = updateCreditCardExpirationView.getContext().getString(i);
            Intrinsics.g(string, "getString(...)");
            updateCardListener.f(string);
        }
    }

    public final void b(PayClient payClient, UpdateCardListener updateCardListener, CreditCardInstrument instrument) throws Throwable {
        Intrinsics.h(instrument, "instrument");
        this.f = payClient;
        this.g = updateCardListener;
        this.i = instrument;
        ViewModel viewModel = this.e;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.f.i(true);
        ViewModel viewModel2 = this.e;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel2.e.i(false);
        WebViewDatabase.getInstance(getContext()).clearFormData();
        PayClient payClient2 = this.f;
        if (payClient2 == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        Context context = getContext();
        ViewUpdateCreditcardBinding viewUpdateCreditcardBinding = this.d;
        if (viewUpdateCreditcardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        View view = viewUpdateCreditcardBinding.y;
        CreditCardInstrument creditCardInstrument = this.i;
        if (creditCardInstrument == null) {
            Intrinsics.p("creditCardInstrument");
            throw null;
        }
        URL updateURL = creditCardInstrument.getUpdateURL();
        UpdateCreditCardView updateCreditCardView = new UpdateCreditCardView(context);
        FormView.a(updateCreditCardView, view, updateURL, payClient2.b, payClient2.d);
        this.h = updateCreditCardView;
        updateCreditCardView.setLayerType(1, null);
        UpdateCreditCardView updateCreditCardView2 = this.h;
        if (updateCreditCardView2 == null) {
            Intrinsics.p("updateCreditCardExpirationView");
            throw null;
        }
        updateCreditCardView2.setVerticalScrollBarEnabled(false);
        UpdateCreditCardView updateCreditCardView3 = this.h;
        if (updateCreditCardView3 == null) {
            Intrinsics.p("updateCreditCardExpirationView");
            throw null;
        }
        updateCreditCardView3.setOnTouchListener(new UpdateCreditCardExpirationView$initIframe$1());
        UpdateCreditCardView updateCreditCardView4 = this.h;
        if (updateCreditCardView4 == null) {
            Intrinsics.p("updateCreditCardExpirationView");
            throw null;
        }
        updateCreditCardView4.setCallback(new IframeCallback());
        ViewUpdateCreditcardBinding viewUpdateCreditcardBinding2 = this.d;
        if (viewUpdateCreditcardBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        viewUpdateCreditcardBinding2.z.removeAllViews();
        ViewUpdateCreditcardBinding viewUpdateCreditcardBinding3 = this.d;
        if (viewUpdateCreditcardBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        LinearLayout linearLayout = viewUpdateCreditcardBinding3.z;
        UpdateCreditCardView updateCreditCardView5 = this.h;
        if (updateCreditCardView5 != null) {
            linearLayout.addView(updateCreditCardView5);
        } else {
            Intrinsics.p("updateCreditCardExpirationView");
            throw null;
        }
    }
}
