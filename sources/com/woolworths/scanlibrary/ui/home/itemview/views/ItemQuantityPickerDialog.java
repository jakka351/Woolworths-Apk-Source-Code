package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseFragment;
import com.woolworths.scanlibrary.databinding.DialogItemQuantityPickerBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemQuantityPickerDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "OnFragmentInteractionListener", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemQuantityPickerDialog extends DialogFragment {
    public int d = 99;
    public int e = 1;
    public DaggerBaseFragment f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemQuantityPickerDialog$Companion;", "", "", "ARG_MAX_ITEM_QTY", "Ljava/lang/String;", "ARG_ITEM_CURRENT_QTY", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemQuantityPickerDialog$OnFragmentInteractionListener;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFragmentInteractionListener {
        void M(int i);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getInt("maxItemQty");
            this.e = arguments.getInt("currentQty");
        }
        setStyle(1, R.style.DefaultAlertDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = DialogItemQuantityPickerBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        DialogItemQuantityPickerBinding dialogItemQuantityPickerBinding = (DialogItemQuantityPickerBinding) ViewDataBinding.q(inflater, R.layout.dialog_item_quantity_picker, viewGroup, false, null);
        Intrinsics.g(dialogItemQuantityPickerBinding, "inflate(...)");
        NumberPicker numberPicker = dialogItemQuantityPickerBinding.A;
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMaxValue(this.d);
        numberPicker.setMinValue(1);
        numberPicker.setValue(this.e);
        dialogItemQuantityPickerBinding.y.setOnClickListener(new androidx.navigation.ui.a(22, dialogItemQuantityPickerBinding, this));
        dialogItemQuantityPickerBinding.z.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 23));
        return dialogItemQuantityPickerBinding.h;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f = null;
    }
}
