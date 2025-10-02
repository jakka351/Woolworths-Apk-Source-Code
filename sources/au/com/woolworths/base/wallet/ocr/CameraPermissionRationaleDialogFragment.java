package au.com.woolworths.base.wallet.ocr;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/CameraPermissionRationaleDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraPermissionRationaleDialogFragment extends DialogFragment {
    public CameraPermissionRationaleDialogHandler d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/CameraPermissionRationaleDialogFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "INTENT_RATIONALE_DIALOG_INFO", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static CameraPermissionRationaleDialogFragment a(int i, String str, boolean z) {
            if ((i & 2) != 0) {
                str = null;
            }
            CameraPermissionRationaleDialogFragment cameraPermissionRationaleDialogFragment = new CameraPermissionRationaleDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("INTENT_RATIONALE_DIALOG_INFO", new RationaleDialogInfo(null, str, z));
            cameraPermissionRationaleDialogFragment.setArguments(bundle);
            return cameraPermissionRationaleDialogFragment;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        CameraPermissionRationaleDialogHandler cameraPermissionRationaleDialogHandler = this.d;
        if (cameraPermissionRationaleDialogHandler != null) {
            cameraPermissionRationaleDialogHandler.onDismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity != null) {
            this.d = activity instanceof CameraPermissionRationaleDialogHandler ? (CameraPermissionRationaleDialogHandler) activity : null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        String string2;
        Bundle arguments = getArguments();
        RationaleDialogInfo rationaleDialogInfo = arguments != null ? (RationaleDialogInfo) arguments.getParcelable("INTENT_RATIONALE_DIALOG_INFO") : null;
        if (rationaleDialogInfo == null || (string = rationaleDialogInfo.d) == null) {
            string = getString(R.string.rewards_wallet_request_camera_permission_title);
            Intrinsics.g(string, "getString(...)");
        }
        if (rationaleDialogInfo == null || (string2 = rationaleDialogInfo.e) == null) {
            string2 = getString(R.string.rewards_wallet_request_camera_permission_message);
            Intrinsics.g(string2, "getString(...)");
        }
        final boolean z = rationaleDialogInfo != null ? rationaleDialogInfo.f : false;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(requireContext()).setTitle(string).setMessage(string2).setPositiveButton(z ? R.string.permission_settings : R.string.ok, new DialogInterface.OnClickListener() { // from class: au.com.woolworths.base.wallet.ocr.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z2 = z;
                CameraPermissionRationaleDialogFragment cameraPermissionRationaleDialogFragment = this;
                if (!z2) {
                    CameraPermissionRationaleDialogHandler cameraPermissionRationaleDialogHandler = cameraPermissionRationaleDialogFragment.d;
                    if (cameraPermissionRationaleDialogHandler != null) {
                        cameraPermissionRationaleDialogHandler.x4();
                        return;
                    }
                    return;
                }
                FragmentActivity activity = cameraPermissionRationaleDialogFragment.getActivity();
                if (activity != null) {
                    ActivityExtKt.b(activity);
                }
                CameraPermissionRationaleDialogHandler cameraPermissionRationaleDialogHandler2 = cameraPermissionRationaleDialogFragment.d;
                if (cameraPermissionRationaleDialogHandler2 != null) {
                    cameraPermissionRationaleDialogHandler2.w0();
                }
            }
        }).setNegativeButton(R.string.cancel, new au.com.woolworths.base.wallet.digipay.framesview.a(this, 1)).create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
