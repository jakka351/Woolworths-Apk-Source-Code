package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreChatToUs;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreChatToUsBinding extends ViewDataBinding {
    public MoreChatToUs A;
    public MoreViewModel B;
    public Boolean C;
    public final TextView y;
    public final ImageView z;

    public EpoxyItemMoreChatToUsBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
    }
}
