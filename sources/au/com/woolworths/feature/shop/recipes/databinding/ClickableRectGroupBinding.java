package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;

/* loaded from: classes3.dex */
public abstract class ClickableRectGroupBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public ImageLoaderListener A;
    public final ImageView y;
    public String z;

    public ClickableRectGroupBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
    }

    public abstract void L(ImageLoaderListener imageLoaderListener);

    public abstract void M(String str);
}
