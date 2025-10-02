package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupUpCompleteViewModel;

/* loaded from: classes7.dex */
public abstract class ActivitySetupCompleteBinding extends ViewDataBinding {
    public final Button y;
    public SetupUpCompleteViewModel z;

    public ActivitySetupCompleteBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }

    public abstract void L(SetupUpCompleteViewModel setupUpCompleteViewModel);
}
