package au.com.woolworths.base.shopapp.utils;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import au.com.woolworths.base.shopapp.databinding.FragmentProgressDialogBinding;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ProgressDialogFragment extends DialogFragment {
    public String d = null;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            int i = getArguments().getInt("loading_message", 0);
            if (i != 0) {
                this.d = getString(i);
            } else {
                this.d = null;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        int i = FragmentProgressDialogBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentProgressDialogBinding fragmentProgressDialogBinding = (FragmentProgressDialogBinding) ViewDataBinding.q(layoutInflater, R.layout.fragment_progress_dialog, null, false, null);
        fragmentProgressDialogBinding.L(this.d);
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(fragmentProgressDialogBinding.h);
        return dialog;
    }
}
