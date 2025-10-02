package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.pay.sdk.web.StepUpView;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ DialogFragment e;

    public /* synthetic */ o(DialogFragment dialogFragment, int i) {
        this.d = i;
        this.e = dialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                StepUpDialogFragment stepUpDialogFragment = (StepUpDialogFragment) this.e;
                Callback.g(view);
                try {
                    if (stepUpDialogFragment.Q1() != null && stepUpDialogFragment.k) {
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
                    return;
                } finally {
                }
            case 1:
                StepUpDialogFragment stepUpDialogFragment2 = (StepUpDialogFragment) this.e;
                Callback.g(view);
                try {
                    stepUpDialogFragment2.dismissAllowingStateLoss();
                    DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = (DigitalPayForOrderPresenter) stepUpDialogFragment2.m.get();
                    if (digitalPayForOrderPresenter2.i()) {
                        Object obj2 = digitalPayForOrderPresenter2.f4374a;
                        Intrinsics.e(obj2);
                        ((DigitalPayForOrderContract.View) obj2).y();
                    }
                    digitalPayForOrderPresenter2.N = false;
                    digitalPayForOrderPresenter2.I(null);
                    Views.a((AppCompatActivity) stepUpDialogFragment2.getActivity());
                    return;
                } finally {
                }
            default:
                ErrorDialogFragment errorDialogFragment = (ErrorDialogFragment) this.e;
                Callback.g(view);
                try {
                    errorDialogFragment.dismissAllowingStateLoss();
                    return;
                } finally {
                }
        }
    }
}
