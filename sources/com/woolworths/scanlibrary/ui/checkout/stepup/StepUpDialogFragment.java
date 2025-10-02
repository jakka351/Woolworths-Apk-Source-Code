package com.woolworths.scanlibrary.ui.checkout.stepup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewDatabase;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.BaseObservable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.StepUpView;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.FragmentStepupDialogBinding;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment$requestStepUp$1;
import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;
import com.woolworths.scanlibrary.util.extensions.ContextExtKt;
import com.woolworths.scanlibrary.util.payment.InfoBarError;
import com.woolworths.scanlibrary.util.payment.PayErrorAggregator;
import dagger.android.support.AndroidSupportInjection;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "StepUpViewCallback", "StepUpViewModel", "StepUpListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StepUpDialogFragment extends DialogFragment {
    public URL d;
    public FragmentStepupDialogBinding e;
    public WeakReference g;
    public PayFragment$requestStepUp$1 h;
    public PayClient i;
    public final StepUpViewModel f = new StepUpViewModel();
    public final PayErrorAggregator j = new PayErrorAggregator(new PayErrorAggregator.ErrorGroupListener() { // from class: com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment$errorDelegate$1
        @Override // com.woolworths.scanlibrary.util.payment.PayErrorAggregator.ErrorGroupListener
        public final void a(List list) throws Throwable {
            StepUpDialogFragment stepUpDialogFragment = this.f21242a;
            StepUpDialogFragment.StepUpViewModel stepUpViewModel = stepUpDialogFragment.f;
            Context context = stepUpDialogFragment.getContext();
            PayError payError = (context == null || ContextExtKt.a(context)) ? (PayError) list.get(0) : new StepUpDialogFragment$createConnectionFailureError$1();
            stepUpViewModel.i.i(false);
            stepUpViewModel.j.i(false);
            PayFragment$requestStepUp$1 payFragment$requestStepUp$1 = stepUpDialogFragment.h;
            if (payFragment$requestStepUp$1 != null) {
                Intrinsics.h(payError, "payError");
                ((PayContract.Presenter) payFragment$requestStepUp$1.f21235a.Q1()).I(payError);
            }
            stepUpDialogFragment.dismiss();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$Companion;", "", "", "KEY_STEPUP_URL", "Ljava/lang/String;", "TAG", "ERROR_IFRAME_LOADING_FAILED", "ERROR_NO_CONNECTION", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$StepUpListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface StepUpListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$StepUpViewCallback;", "Lau/com/woolworths/pay/sdk/web/FormView$FormViewCallback;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StepUpViewCallback implements FormView.FormViewCallback {
        public StepUpViewCallback() {
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void a(FormFocusState formFocusState) {
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void b() throws Throwable {
            StepUpDialogFragment.this.f.j.i(false);
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void c(boolean z, boolean z2) throws Throwable {
            StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
            StepUpViewModel stepUpViewModel = stepUpDialogFragment.f;
            stepUpViewModel.i.i(z);
            if (z) {
                stepUpViewModel.h.i(false);
                FragmentActivity activity = stepUpDialogFragment.getActivity();
                if (activity != null) {
                    ActivityExtKt.a(activity);
                }
            }
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void d(BaseError baseError) {
            boolean zC = Intrinsics.c(baseError.getErrorMessage(), "Error loading iFrame.");
            StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
            if (zC) {
                FragmentStepupDialogBinding fragmentStepupDialogBinding = stepUpDialogFragment.e;
                if (fragmentStepupDialogBinding == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                fragmentStepupDialogBinding.z.setVisibility(4);
            }
            PayErrorCode payErrorCode = baseError.getPayErrorCode();
            PayError stepUpDialogFragment$createConnectionFailureError$1 = baseError;
            if (payErrorCode == PayErrorCode.NETWORK_ERROR) {
                Context context = stepUpDialogFragment.getContext();
                stepUpDialogFragment$createConnectionFailureError$1 = baseError;
                if (context != null) {
                    stepUpDialogFragment$createConnectionFailureError$1 = baseError;
                    if (!ContextExtKt.a(context)) {
                        stepUpDialogFragment$createConnectionFailureError$1 = new StepUpDialogFragment$createConnectionFailureError$1();
                    }
                }
            }
            stepUpDialogFragment.j.b(stepUpDialogFragment$createConnectionFailureError$1);
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void e(String auditId, String paymentInstrumentId, String stepUpToken) {
            Intrinsics.h(auditId, "auditId");
            Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
            Intrinsics.h(stepUpToken, "stepUpToken");
            StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
            PayFragment$requestStepUp$1 payFragment$requestStepUp$1 = stepUpDialogFragment.h;
            if (payFragment$requestStepUp$1 != null) {
                ((PayContract.Presenter) payFragment$requestStepUp$1.f21235a.Q1()).G(paymentInstrumentId, stepUpToken);
            }
            stepUpDialogFragment.dismiss();
        }

        @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
        public final void f(String fieldName, Boolean bool) {
            Intrinsics.h(fieldName, "fieldName");
            FragmentActivity activity = StepUpDialogFragment.this.getActivity();
            if (activity != null) {
                ActivityExtKt.a(activity);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/stepup/StepUpDialogFragment$StepUpViewModel;", "Landroidx/databinding/BaseObservable;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StepUpViewModel extends BaseObservable {
        public final ObservableField e = new ObservableField("");
        public final ObservableField f = new ObservableField("");
        public final ObservableField g = new ObservableField("");
        public final ObservableBoolean h = new ObservableBoolean(false);
        public final ObservableBoolean i = new ObservableBoolean(false);
        public final ObservableBoolean j = new ObservableBoolean(false);
        public final ObservableField k = new ObservableField(InfoBarError.f);

        public StepUpViewModel() {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.h(context, "context");
        AndroidSupportInjection.a(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("key_stepup_url") : null;
        Intrinsics.f(serializable, "null cannot be cast to non-null type java.net.URL");
        this.d = (URL) serializable;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_stepup_dialog, viewGroup);
        int i = FragmentStepupDialogBinding.E;
        FragmentStepupDialogBinding fragmentStepupDialogBinding = (FragmentStepupDialogBinding) DataBindingUtil.f2545a.b(null, viewInflate, R.layout.fragment_stepup_dialog);
        this.e = fragmentStepupDialogBinding;
        if (fragmentStepupDialogBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        fragmentStepupDialogBinding.L(this.f);
        setCancelable(false);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        StepUpView stepUpView;
        StepUpView stepUpView2;
        StepUpView stepUpView3;
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        StepUpViewModel stepUpViewModel = this.f;
        ObservableField observableField = stepUpViewModel.e;
        CharSequence charSequence = (CharSequence) observableField.e;
        if (charSequence == null || StringsKt.D(charSequence)) {
            observableField.i(getString(R.string.sng_step_up_cvv_message));
        }
        if (this.g == null) {
            PayClient payClient = this.i;
            if (payClient == null) {
                Intrinsics.p("payClient");
                throw null;
            }
            Context context = view.getContext();
            FragmentStepupDialogBinding fragmentStepupDialogBinding = this.e;
            if (fragmentStepupDialogBinding == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            View view2 = fragmentStepupDialogBinding.A;
            URL url = this.d;
            if (url == null) {
                Intrinsics.p("stepUpUrl");
                throw null;
            }
            WeakReference weakReference = new WeakReference(payClient.b(context, view2, url));
            this.g = weakReference;
            StepUpView stepUpView4 = (StepUpView) weakReference.get();
            if (stepUpView4 != null) {
                stepUpView4.setLayerType(1, null);
            }
            WeakReference weakReference2 = this.g;
            if (weakReference2 != null && (stepUpView3 = (StepUpView) weakReference2.get()) != null) {
                stepUpView3.setVerticalScrollBarEnabled(false);
            }
            WeakReference weakReference3 = this.g;
            if (weakReference3 != null && (stepUpView2 = (StepUpView) weakReference3.get()) != null) {
                stepUpView2.setCallback(new StepUpViewCallback());
            }
            WeakReference weakReference4 = this.g;
            if (weakReference4 != null && (stepUpView = (StepUpView) weakReference4.get()) != null) {
                stepUpView.setOnTouchListener(new StepUpDialogFragment$setupCvvIframe$1());
            }
            FragmentStepupDialogBinding fragmentStepupDialogBinding2 = this.e;
            if (fragmentStepupDialogBinding2 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            fragmentStepupDialogBinding2.z.removeView(fragmentStepupDialogBinding2.A);
            FragmentStepupDialogBinding fragmentStepupDialogBinding3 = this.e;
            if (fragmentStepupDialogBinding3 == null) {
                Intrinsics.p("viewBinding");
                throw null;
            }
            FrameLayout frameLayout = fragmentStepupDialogBinding3.z;
            WeakReference weakReference5 = this.g;
            frameLayout.addView(weakReference5 != null ? (StepUpView) weakReference5.get() : null, 0);
            stepUpViewModel.j.i(true);
            WebViewDatabase.getInstance(getActivity()).clearFormData();
        }
    }
}
