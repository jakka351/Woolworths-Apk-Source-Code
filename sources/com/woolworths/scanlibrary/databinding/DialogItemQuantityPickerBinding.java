package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes7.dex */
public abstract class DialogItemQuantityPickerBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public final NumberPicker A;
    public final Button y;
    public final Button z;

    public DialogItemQuantityPickerBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, NumberPicker numberPicker) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = button2;
        this.A = numberPicker;
    }
}
