package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.models.CountryOfOriginAndHealthInfo;
import au.com.woolworths.product.details.ui.CountryOfOriginImageLoaderListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemCountryOfOriginAndHealthInfoBinding extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public CountryOfOriginAndHealthInfo C;
    public CountryOfOriginImageLoaderListener D;
    public final FrameLayout y;
    public final ImageView z;

    public EpoxyItemCountryOfOriginAndHealthInfoBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, ImageView imageView, TextView textView, ImageView imageView2) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
        this.z = imageView;
        this.A = textView;
        this.B = imageView2;
    }
}
