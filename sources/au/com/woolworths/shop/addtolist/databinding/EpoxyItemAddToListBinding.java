package au.com.woolworths.shop.addtolist.databinding;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.addtolist.add.ListItemClickListener;
import au.com.woolworths.shop.lists.data.model.ShoppingList;

/* loaded from: classes4.dex */
public abstract class EpoxyItemAddToListBinding extends ViewDataBinding {
    public final TextView A;
    public int B;
    public ShoppingList C;
    public ListItemClickListener D;
    public Boolean E;
    public final ProgressBar y;
    public final TextView z;

    public EpoxyItemAddToListBinding(View view, ProgressBar progressBar, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = progressBar;
        this.z = textView;
        this.A = textView2;
    }
}
