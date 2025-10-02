package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;

/* loaded from: classes7.dex */
public abstract class ActivityManualAddItemProcessBinding extends ViewDataBinding {
    public final Button A;
    public final Button B;
    public final ImageView C;
    public final FrameLayout D;
    public final DialogScanResultViewBinding E;
    public final View F;
    public final FrameLayout G;
    public final EditText H;
    public final ConstraintLayout I;
    public final FrameLayout J;
    public final FrameLayout K;
    public AddItemActivity L;
    public final Button y;
    public final Button z;

    public ActivityManualAddItemProcessBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, Button button3, Button button4, ImageView imageView, FrameLayout frameLayout, DialogScanResultViewBinding dialogScanResultViewBinding, View view2, FrameLayout frameLayout2, EditText editText, ConstraintLayout constraintLayout, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        super(dataBindingComponent, view, 1);
        this.y = button;
        this.z = button2;
        this.A = button3;
        this.B = button4;
        this.C = imageView;
        this.D = frameLayout;
        this.E = dialogScanResultViewBinding;
        this.F = view2;
        this.G = frameLayout2;
        this.H = editText;
        this.I = constraintLayout;
        this.J = frameLayout3;
        this.K = frameLayout4;
    }

    public abstract void L(AddItemActivity addItemActivity);
}
