package au.com.woolworths.base.shopapp.ui.infosection.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.e;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.databinding.DialogInfoSectionBinding;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionEpoxyController;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/shopapp/ui/infosection/dialog/InfoSectionDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InfoSectionDialog extends DialogFragment {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/ui/infosection/dialog/InfoSectionDialog$Companion;", "", "", "TAG", "Ljava/lang/String;", "ARG_INFO_SECTION", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable("arg_info_section");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InfoSection infoSection = (InfoSection) parcelable;
        InfoSectionEpoxyController infoSectionEpoxyController = new InfoSectionEpoxyController(null, 1, null);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = DialogInfoSectionBinding.z;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        DialogInfoSectionBinding dialogInfoSectionBinding = (DialogInfoSectionBinding) ViewDataBinding.q(layoutInflater, R.layout.dialog_info_section, null, false, null);
        dialogInfoSectionBinding.y.F0(new e(this, infoSection));
        infoSectionEpoxyController.setData(infoSection);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(requireActivity()).setTitle(infoSection.getTitle()).setView(dialogInfoSectionBinding.h).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
