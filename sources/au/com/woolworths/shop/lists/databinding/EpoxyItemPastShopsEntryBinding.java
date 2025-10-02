package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemPastShopsEntryBinding extends ViewDataBinding {
    public PastShopsClickListener A;
    public final TextView y;
    public PurchaseHistoryEvent z;

    public EpoxyItemPastShopsEntryBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }
}
