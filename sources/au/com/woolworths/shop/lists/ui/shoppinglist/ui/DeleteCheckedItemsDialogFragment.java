package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/DeleteCheckedItemsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeleteCheckedItemsDialogFragment extends DialogFragment {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/DeleteCheckedItemsDialogFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        final int i = 0;
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity()).setTitle(R.string.shop_lists_delete_checked_dialog_title).setMessage(R.string.shop_lists_delete_checked_dialog_message).setPositiveButton(R.string.shop_lists_delete_checked_dialog_positive, new DialogInterface.OnClickListener(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.ui.a
            public final /* synthetic */ DeleteCheckedItemsDialogFragment e;

            {
                this.e = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        KeyEventDispatcher.Component componentRequireActivity = this.e.requireActivity();
                        Intrinsics.f(componentRequireActivity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener");
                        ((DeleteCheckedItemsDialogListener) componentRequireActivity).h(true);
                        break;
                    default:
                        KeyEventDispatcher.Component componentRequireActivity2 = this.e.requireActivity();
                        Intrinsics.f(componentRequireActivity2, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener");
                        ((DeleteCheckedItemsDialogListener) componentRequireActivity2).h(false);
                        break;
                }
            }
        });
        final int i2 = 1;
        AlertDialog alertDialogCreate = positiveButton.setNegativeButton(R.string.shop_lists_delete_checked_dialog_negative, new DialogInterface.OnClickListener(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.ui.a
            public final /* synthetic */ DeleteCheckedItemsDialogFragment e;

            {
                this.e = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                switch (i2) {
                    case 0:
                        KeyEventDispatcher.Component componentRequireActivity = this.e.requireActivity();
                        Intrinsics.f(componentRequireActivity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener");
                        ((DeleteCheckedItemsDialogListener) componentRequireActivity).h(true);
                        break;
                    default:
                        KeyEventDispatcher.Component componentRequireActivity2 = this.e.requireActivity();
                        Intrinsics.f(componentRequireActivity2, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.shoppinglist.ui.DeleteCheckedItemsDialogListener");
                        ((DeleteCheckedItemsDialogListener) componentRequireActivity2).h(false);
                        break;
                }
            }
        }).create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
