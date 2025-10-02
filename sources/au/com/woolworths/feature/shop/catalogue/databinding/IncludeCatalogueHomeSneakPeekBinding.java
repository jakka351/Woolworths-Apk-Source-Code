package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeCatalogueHomeSneakPeekBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout y;
    public final TextView z;

    public IncludeCatalogueHomeSneakPeekBinding(DataBindingComponent dataBindingComponent, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(dataBindingComponent, view, 0);
        this.y = constraintLayout;
        this.z = textView;
        this.A = textView2;
        this.B = textView3;
    }
}
