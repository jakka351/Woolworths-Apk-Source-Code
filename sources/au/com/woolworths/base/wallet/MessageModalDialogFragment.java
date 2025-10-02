package au.com.woolworths.base.wallet;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/MessageModalDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Data", "Action", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MessageModalDialogFragment extends DialogFragment {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/MessageModalDialogFragment$Action;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Action);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Action(actionLabel=null, action=null)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/MessageModalDialogFragment$Companion;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/MessageModalDialogFragment$Data;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Data);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Data(title=null, message=null, primaryAction=null, secondaryAction=null)";
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        if (getContext() != null) {
            throw null;
        }
        AlertDialog alertDialogCreate = builder.create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
