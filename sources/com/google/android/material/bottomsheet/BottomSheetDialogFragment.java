package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes6.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(int i, View view) {
            if (i == 5) {
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            boolean z = ((BottomSheetDialog) dialog).f().L;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            boolean z = ((BottomSheetDialog) dialog).f().L;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }
}
