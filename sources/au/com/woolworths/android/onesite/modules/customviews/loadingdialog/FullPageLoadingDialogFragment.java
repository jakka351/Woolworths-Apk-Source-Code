package au.com.woolworths.android.onesite.modules.customviews.loadingdialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/loadingdialog/FullPageLoadingDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FullPageLoadingDialogFragment extends DialogFragment {
    public FullPageLoadingDialogFragment() {
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext());
        Window window = dialog.getWindow();
        Intrinsics.e(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(new ProgressBar(dialog.getContext()));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        return dialog;
    }
}
