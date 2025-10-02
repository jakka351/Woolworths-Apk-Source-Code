package au.com.woolworths.feature.shop.homepage.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.homepage.data.CatalogueCard;
import au.com.woolworths.feature.shop.homepage.presentation.CatalogueClickListener;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public abstract class EpoxyItemCatalogueTileBinding extends ViewDataBinding {
    public final ImageView A;
    public CatalogueCard B;
    public CatalogueClickListener C;
    public final ImageView y;
    public final MaterialCardView z;

    public EpoxyItemCatalogueTileBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, MaterialCardView materialCardView, ImageView imageView2) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = materialCardView;
        this.A = imageView2;
    }
}
