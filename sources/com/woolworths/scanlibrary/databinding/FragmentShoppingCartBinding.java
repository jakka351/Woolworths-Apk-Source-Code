package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public abstract class FragmentShoppingCartBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final Button A;
    public final CoordinatorLayout B;
    public final Button C;
    public final RecyclerView D;
    public final Button y;
    public final RelativeLayout z;

    public FragmentShoppingCartBinding(DataBindingComponent dataBindingComponent, View view, Button button, RelativeLayout relativeLayout, Button button2, CoordinatorLayout coordinatorLayout, Button button3, RecyclerView recyclerView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = relativeLayout;
        this.A = button2;
        this.B = coordinatorLayout;
        this.C = button3;
        this.D = recyclerView;
    }
}
