package au.com.woolworths.base.wallet.digipay.framesview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureErrorDialogInvalidForm;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardCaptureErrorDialogInvalidForm extends DialogFragment {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureErrorDialogInvalidForm$Companion;", "", "", "TAG", "Ljava/lang/String;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(requireActivity()).setTitle(getString(R.string.card_capture_invalid_form_error_dialog_title)).setMessage(getString(R.string.card_capture_invalid_form_error_message)).setPositiveButton(getString(R.string.card_capture_invalid_form_error_button_text), new a(this, 0)).create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
