package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.text.Html;
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
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewAddCreditcardBinding;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/AddCreditCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lau/com/woolworths/pay/sdk/web/CardCaptureView;", "captureView", "", "setCardCaptureView", "(Lau/com/woolworths/pay/sdk/web/CardCaptureView;)V", "Lau/com/woolworths/pay/sdk/models/merchantprofile/MerchantProfile;", "merchantProfile", "setSupportedCardSchemes", "(Lau/com/woolworths/pay/sdk/models/merchantprofile/MerchantProfile;)V", "", "j", "Z", "getDelegateFormError", "()Z", "setDelegateFormError", "(Z)V", "delegateFormError", "AddCardListener", "Companion", "ViewModel", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AddCreditCardView extends FrameLayout {
    public PayClient d;
    public AddCardListener e;
    public final View f;
    public final ViewAddCreditcardBinding g;
    public final ViewModel h;
    public CardCaptureView i;

    /* renamed from: j, reason: from kotlin metadata */
    public boolean delegateFormError;
    public final AddCreditCardView$cardCaptureViewCallback$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/AddCreditCardView$AddCardListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AddCardListener {
        void A0();

        void H(Retryable retryable);

        void M(BaseError baseError);

        void P(String str, String str2);

        void f(String str);

        void m();

        void s0();

        void t();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/AddCreditCardView$Companion;", "", "", "CLIENT_REFERENCE", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/AddCreditCardView$ViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewModel extends BaseObservable {
        public final ObservableBoolean e = new ObservableBoolean(false);
        public final ObservableBoolean f = new ObservableBoolean(false);
        public final ObservableBoolean g = new ObservableBoolean(false);
        public final ObservableBoolean h = new ObservableBoolean(false);
        public final ObservableBoolean i = new ObservableBoolean(false);
        public final ObservableBoolean j = new ObservableBoolean(false);
        public final ObservableBoolean k = new ObservableBoolean(false);
        public final ObservableBoolean l = new ObservableBoolean(false);
        public final ObservableBoolean m = new ObservableBoolean(false);
        public final ObservableBoolean n = new ObservableBoolean(false);
        public final ObservableField o = new ObservableField("");
        public final ObservableBoolean p = new ObservableBoolean(false);

        public ViewModel() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.woolworths.scanlibrary.util.widget.AddCreditCardView$cardCaptureViewCallback$1] */
    public AddCreditCardView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int i = ViewAddCreditcardBinding.G;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ViewAddCreditcardBinding viewAddCreditcardBinding = (ViewAddCreditcardBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.view_add_creditcard, null, false, null);
        this.g = viewAddCreditcardBinding;
        if (viewAddCreditcardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        View view = viewAddCreditcardBinding.h;
        this.f = view;
        if (view == null) {
            Intrinsics.p("rootLayout");
            throw null;
        }
        addView(view, -1, -2);
        ViewModel viewModel = new ViewModel();
        this.h = viewModel;
        ViewAddCreditcardBinding viewAddCreditcardBinding2 = this.g;
        if (viewAddCreditcardBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        viewAddCreditcardBinding2.L(viewModel);
        Html.fromHtml(getContext().getString(R.string.sng_clear_form), 63);
        this.k = new FormView.FormViewCallback() { // from class: com.woolworths.scanlibrary.util.widget.AddCreditCardView$cardCaptureViewCallback$1
            public static int g(Boolean bool) {
                return (bool == null || bool.booleanValue()) ? 0 : 1;
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void a(FormFocusState formFocusState) throws Throwable {
                if (formFocusState.f9191a.booleanValue()) {
                    return;
                }
                int iG = g(formFocusState.c) + g(formFocusState.d) + g(formFocusState.e) + g(formFocusState.f);
                AddCreditCardView addCreditCardView = this.f21375a;
                if (iG >= 3) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_credit_card_details);
                    return;
                }
                if (g(formFocusState.f) + g(formFocusState.e) == 2) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_expiry_date);
                    return;
                }
                if (g(formFocusState.c) + g(formFocusState.d) + g(formFocusState.e) + g(formFocusState.f) == 2) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_credit_card_details);
                    return;
                }
                Boolean bool = formFocusState.c;
                if (bool != null && bool.equals(Boolean.FALSE)) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_card_number_message);
                    return;
                }
                Boolean bool2 = formFocusState.e;
                if (bool2 != null && bool2.equals(Boolean.FALSE)) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_expiry_month_message);
                    return;
                }
                Boolean bool3 = formFocusState.f;
                if (bool3 != null && bool3.equals(Boolean.FALSE)) {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_expiry_year_message);
                    return;
                }
                Boolean bool4 = formFocusState.d;
                if (bool4 == null || !bool4.equals(Boolean.FALSE)) {
                    AddCreditCardView.b(addCreditCardView);
                } else {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_cvv_message);
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void b() throws Throwable {
                AddCreditCardView addCreditCardView = this.f21375a;
                AddCreditCardView.ViewModel viewModel2 = addCreditCardView.h;
                if (viewModel2 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel2.j.i(false);
                if (addCreditCardView.e != null) {
                    return;
                }
                Intrinsics.p("addCardListener");
                throw null;
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void c(boolean z, boolean z2) throws Throwable {
                AddCreditCardView addCreditCardView = this.f21375a;
                AddCreditCardView.ViewModel viewModel2 = addCreditCardView.h;
                if (viewModel2 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel2.m.i(z);
                if (z) {
                    AddCreditCardView.b(addCreditCardView);
                } else {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_credit_card_details);
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void d(BaseError baseError) throws Throwable {
                AddCreditCardView addCreditCardView = this.f21375a;
                AddCreditCardView.ViewModel viewModel2 = addCreditCardView.h;
                if (viewModel2 == null) {
                    Intrinsics.p("viewModel");
                    throw null;
                }
                viewModel2.m.i(false);
                AddCreditCardView.AddCardListener addCardListener = addCreditCardView.e;
                if (addCardListener == null) {
                    Intrinsics.p("addCardListener");
                    throw null;
                }
                addCardListener.M(baseError);
                addCreditCardView.f();
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void e(String auditId, String paymentInstrumentId, String stepUpToken) {
                Intrinsics.h(auditId, "auditId");
                Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
                Intrinsics.h(stepUpToken, "stepUpToken");
                AddCreditCardView.AddCardListener addCardListener = this.f21375a.e;
                if (addCardListener != null) {
                    addCardListener.P(paymentInstrumentId, stepUpToken);
                } else {
                    Intrinsics.p("addCardListener");
                    throw null;
                }
            }

            @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
            public final void f(String fieldName, Boolean bool) throws Throwable {
                boolean zBooleanValue = bool.booleanValue();
                Intrinsics.h(fieldName, "fieldName");
                AddCreditCardView addCreditCardView = this.f21375a;
                if (zBooleanValue) {
                    AddCreditCardView.ViewModel viewModel2 = addCreditCardView.h;
                    if (viewModel2 == null) {
                        Intrinsics.p("viewModel");
                        throw null;
                    }
                    viewModel2.m.i(true);
                    AddCreditCardView.b(addCreditCardView);
                } else {
                    AddCreditCardView.e(addCreditCardView, R.string.sng_invalid_credit_card_details);
                }
                AddCreditCardView.AddCardListener addCardListener = addCreditCardView.e;
                if (addCardListener != null) {
                    addCardListener.t();
                } else {
                    Intrinsics.p("addCardListener");
                    throw null;
                }
            }
        };
    }

    public static final void b(AddCreditCardView addCreditCardView) throws Throwable {
        if (addCreditCardView.delegateFormError) {
            AddCardListener addCardListener = addCreditCardView.e;
            if (addCardListener != null) {
                addCardListener.A0();
                return;
            } else {
                Intrinsics.p("addCardListener");
                throw null;
            }
        }
        ViewModel viewModel = addCreditCardView.h;
        if (viewModel != null) {
            viewModel.n.i(false);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    public static final void e(AddCreditCardView addCreditCardView, int i) throws Throwable {
        String string = addCreditCardView.getContext().getString(i);
        Intrinsics.g(string, "getString(...)");
        if (addCreditCardView.delegateFormError) {
            AddCardListener addCardListener = addCreditCardView.e;
            if (addCardListener != null) {
                addCardListener.f(string);
                return;
            } else {
                Intrinsics.p("addCardListener");
                throw null;
            }
        }
        ViewModel viewModel = addCreditCardView.h;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.o.i(string);
        ViewModel viewModel2 = addCreditCardView.h;
        if (viewModel2 != null) {
            viewModel2.n.i(true);
        } else {
            Intrinsics.p("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCardCaptureView(CardCaptureView captureView) {
        captureView.setCallback(this.k);
        ViewAddCreditcardBinding viewAddCreditcardBinding = this.g;
        if (viewAddCreditcardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        LinearLayout linearLayout = viewAddCreditcardBinding.B;
        linearLayout.removeAllViews();
        linearLayout.addView(captureView, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCardInfoInput$lambda$3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0095, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSupportedCardSchemes(au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile r8) throws java.lang.Throwable {
        /*
            r7 = this;
            au.com.woolworths.pay.sdk.models.merchantprofile.CreditCardInfo r8 = r8.getCreditCardInfo()
            if (r8 == 0) goto L99
            java.lang.String[] r8 = r8.getAllowedNetworks()
            if (r8 == 0) goto L99
            int r0 = r8.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L99
            r2 = r8[r1]
            if (r2 == 0) goto L95
            int r3 = r2.hashCode()
            r4 = 0
            java.lang.String r5 = "viewModel"
            r6 = 1
            switch(r3) {
                case -1553624974: goto L7e;
                case 73257: goto L67;
                case 2012639: goto L50;
                case 2634817: goto L39;
                case 2016591933: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L95
        L21:
            java.lang.String r3 = "DINERS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            goto L95
        L2b:
            com.woolworths.scanlibrary.util.widget.AddCreditCardView$ViewModel r2 = r7.h
            if (r2 == 0) goto L35
            androidx.databinding.ObservableBoolean r2 = r2.h
            r2.i(r6)
            goto L95
        L35:
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r4
        L39:
            java.lang.String r3 = "VISA"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L95
        L42:
            com.woolworths.scanlibrary.util.widget.AddCreditCardView$ViewModel r2 = r7.h
            if (r2 == 0) goto L4c
            androidx.databinding.ObservableBoolean r2 = r2.e
            r2.i(r6)
            goto L95
        L4c:
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r4
        L50:
            java.lang.String r3 = "AMEX"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L59
            goto L95
        L59:
            com.woolworths.scanlibrary.util.widget.AddCreditCardView$ViewModel r2 = r7.h
            if (r2 == 0) goto L63
            androidx.databinding.ObservableBoolean r2 = r2.g
            r2.i(r6)
            goto L95
        L63:
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r4
        L67:
            java.lang.String r3 = "JCB"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L70
            goto L95
        L70:
            com.woolworths.scanlibrary.util.widget.AddCreditCardView$ViewModel r2 = r7.h
            if (r2 == 0) goto L7a
            androidx.databinding.ObservableBoolean r2 = r2.i
            r2.i(r6)
            goto L95
        L7a:
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r4
        L7e:
            java.lang.String r3 = "MASTERCARD"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L87
            goto L95
        L87:
            com.woolworths.scanlibrary.util.widget.AddCreditCardView$ViewModel r2 = r7.h
            if (r2 == 0) goto L91
            androidx.databinding.ObservableBoolean r2 = r2.f
            r2.i(r6)
            goto L95
        L91:
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r4
        L95:
            int r1 = r1 + 1
            goto Le
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.scanlibrary.util.widget.AddCreditCardView.setSupportedCardSchemes(au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile):void");
    }

    public final void f() {
        ViewModel viewModel = this.h;
        if (viewModel == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel.j.i(true);
        ViewModel viewModel2 = this.h;
        if (viewModel2 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel2.k.i(false);
        ViewModel viewModel3 = this.h;
        if (viewModel3 == null) {
            Intrinsics.p("viewModel");
            throw null;
        }
        viewModel3.l.i(false);
        WebViewDatabase.getInstance(getContext()).clearFormData();
        PayClient payClient = this.d;
        if (payClient == null) {
            Intrinsics.p("payClient");
            throw null;
        }
        ViewAddCreditcardBinding viewAddCreditcardBinding = this.g;
        if (viewAddCreditcardBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        Context context = viewAddCreditcardBinding.B.getContext();
        ViewAddCreditcardBinding viewAddCreditcardBinding2 = this.g;
        if (viewAddCreditcardBinding2 != null) {
            payClient.c(context, viewAddCreditcardBinding2.B, new PayResultCallback<CardCaptureView>() { // from class: com.woolworths.scanlibrary.util.widget.AddCreditCardView$initCardCapture$1
                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                public final void A(Retryable retryable) {
                    Intrinsics.h(retryable, "retryable");
                    AddCreditCardView.AddCardListener addCardListener = this.d.e;
                    if (addCardListener != null) {
                        addCardListener.H(retryable);
                    } else {
                        Intrinsics.p("addCardListener");
                        throw null;
                    }
                }

                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                public final void k0(Object obj) {
                    CardCaptureView view = (CardCaptureView) obj;
                    Intrinsics.h(view, "view");
                    AddCreditCardView addCreditCardView = this.d;
                    addCreditCardView.i = view;
                    addCreditCardView.setCardCaptureView(view);
                }

                @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                public final void v(PayError payError) throws Throwable {
                    Intrinsics.h(payError, "payError");
                    AddCreditCardView addCreditCardView = this.d;
                    AddCreditCardView.ViewModel viewModel4 = addCreditCardView.h;
                    if (viewModel4 == null) {
                        Intrinsics.p("viewModel");
                        throw null;
                    }
                    viewModel4.j.i(false);
                    AddCreditCardView.ViewModel viewModel5 = addCreditCardView.h;
                    if (viewModel5 != null) {
                        viewModel5.k.i(true);
                    } else {
                        Intrinsics.p("viewModel");
                        throw null;
                    }
                }
            });
        } else {
            Intrinsics.p("viewBinding");
            throw null;
        }
    }

    public final boolean getDelegateFormError() {
        return this.delegateFormError;
    }

    public final void setDelegateFormError(boolean z) {
        this.delegateFormError = z;
    }
}
