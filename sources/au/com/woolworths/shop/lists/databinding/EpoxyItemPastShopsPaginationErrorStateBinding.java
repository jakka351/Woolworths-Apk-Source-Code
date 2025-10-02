package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsClickListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemPastShopsPaginationErrorStateBinding extends ViewDataBinding {
    public Text A;
    public PastShopsClickListener B;
    public final TextView y;
    public final Button z;

    public EpoxyItemPastShopsPaginationErrorStateBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = button;
    }
}
