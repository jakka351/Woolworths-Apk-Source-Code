package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.databinding.FragmentStepUpBinding;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.StepUpView;
import com.woolworths.R;
import dagger.Lazy;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.ref.WeakReference;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class StepUpDialogFragment extends Hilt_StepUpDialogFragment {
    public WeakReference i;
    public URL j;
    public boolean k;
    public FragmentStepUpBinding l;
    public Lazy m;
    public PayClient n;

    public final StepUpView Q1() {
        return (StepUpView) this.i.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = FragmentStepUpBinding.E;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentStepUpBinding fragmentStepUpBinding = (FragmentStepUpBinding) ViewDataBinding.q(layoutInflater, R.layout.fragment_step_up, viewGroup, false, null);
        this.l = fragmentStepUpBinding;
        return fragmentStepUpBinding.h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.l.D.setEnabled(false);
        this.l.D.setOnClickListener(new o(this, 0));
        this.l.y.setOnClickListener(new o(this, 1));
        if (this.l.C != null || Q1() == null) {
            WeakReference weakReference = new WeakReference(this.n.b(view.getContext(), this.l.C, this.j));
            this.i = weakReference;
            ((StepUpView) weakReference.get()).setLayerType(1, null);
            Q1().setCallback(new FormView.FormViewCallback() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.StepUpDialogFragment.1
                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void a(FormFocusState formFocusState) {
                }

                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void b() {
                }

                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void c(boolean z, boolean z2) {
                    StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
                    stepUpDialogFragment.k = z;
                    stepUpDialogFragment.l.D.setEnabled(z);
                }

                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void d(BaseError baseError) {
                    StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
                    stepUpDialogFragment.l.z.h.setVisibility(0);
                    stepUpDialogFragment.l.B.setVisibility(8);
                    stepUpDialogFragment.l.A.setVisibility(4);
                    stepUpDialogFragment.l.z.z.setText(R.string.modal_cvv_iframe_session_expired);
                    ((DigitalPayForOrderPresenter) stepUpDialogFragment.m.get()).S();
                    stepUpDialogFragment.l.D.setEnabled(false);
                    ((InputMethodManager) stepUpDialogFragment.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(stepUpDialogFragment.getDialog().getWindow().getDecorView().getWindowToken(), 0);
                }

                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void e(String str, String creditCardInstrumentId, String stepUpToken) throws JSONException {
                    StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
                    stepUpDialogFragment.l.z.h.setVisibility(0);
                    stepUpDialogFragment.dismissAllowingStateLoss();
                    DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) stepUpDialogFragment.m.get();
                    digitalPayForOrderPresenter.getClass();
                    Intrinsics.h(creditCardInstrumentId, "creditCardInstrumentId");
                    Intrinsics.h(stepUpToken, "stepUpToken");
                    if (digitalPayForOrderPresenter.o()) {
                        digitalPayForOrderPresenter.D.put(creditCardInstrumentId, stepUpToken);
                        digitalPayForOrderPresenter.q0();
                    }
                }

                @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                public final void f(String str, Boolean bool) {
                    StepUpDialogFragment stepUpDialogFragment = StepUpDialogFragment.this;
                    if (stepUpDialogFragment.Q1() == null || !bool.booleanValue()) {
                        return;
                    }
                    Views.a((AppCompatActivity) stepUpDialogFragment.getActivity());
                    DigitalPayForOrderPresenter digitalPayForOrderPresenter = (DigitalPayForOrderPresenter) stepUpDialogFragment.m.get();
                    if (digitalPayForOrderPresenter.i()) {
                        Object obj = digitalPayForOrderPresenter.f4374a;
                        Intrinsics.e(obj);
                        ((DigitalPayForOrderContract.View) obj).u();
                    }
                    StepUpView stepUpViewQ1 = stepUpDialogFragment.Q1();
                    stepUpViewQ1.getClass();
                    stepUpViewQ1.d(new JSONObject());
                }
            });
            FragmentStepUpBinding fragmentStepUpBinding = this.l;
            fragmentStepUpBinding.B.removeView(fragmentStepUpBinding.C);
            this.l.B.addView(Q1());
        } else {
            Q1().b();
        }
        this.l.z.h.setVisibility(8);
        getDialog().getWindow().setSoftInputMode(16);
    }
}
