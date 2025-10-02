package au.com.woolworths.feature.shop.more.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.more.MoreViewModel;
import au.com.woolworths.feature.shop.more.data.MoreRewardsCard;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemMoreRewardsCardBinding extends ViewDataBinding {
    public final TextView A;
    public final Button B;
    public MoreViewModel C;
    public MoreRewardsCard D;
    public final ImageButton y;
    public final MaterialCardView z;

    public EpoxyItemMoreRewardsCardBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, MaterialCardView materialCardView, TextView textView, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = materialCardView;
        this.A = textView;
        this.B = button;
    }
}
