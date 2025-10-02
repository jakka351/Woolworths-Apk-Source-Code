package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import au.com.woolworths.android.onesite.databinding.FragmentErrorDialogBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ErrorDialogFragment extends DialogFragment {
    public FragmentErrorDialogBinding d;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        int i = FragmentErrorDialogBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentErrorDialogBinding fragmentErrorDialogBinding = (FragmentErrorDialogBinding) ViewDataBinding.q(layoutInflater, R.layout.fragment_error_dialog, null, false, null);
        this.d = fragmentErrorDialogBinding;
        fragmentErrorDialogBinding.y.setOnClickListener(new o(this, 2));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d.A.setText(arguments.getString("key_content_text", getString(R.string.payment_times_out)));
            this.d.y.setText(arguments.getString("key_button_text", getString(R.string.return_to_payment)));
            int i2 = arguments.getInt("key_icon_colour", 0);
            if (i2 != 0) {
                this.d.z.setColorFilter(i2);
            }
        }
        builder.setView(this.d.h);
        builder.setCancelable(false);
        return builder.create();
    }
}
