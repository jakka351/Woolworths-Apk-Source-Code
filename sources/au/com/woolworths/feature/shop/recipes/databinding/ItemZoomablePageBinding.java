package au.com.woolworths.feature.shop.recipes.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.ClickableRectGroup;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect.OnItemClickListener;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePageViewState;

/* loaded from: classes3.dex */
public abstract class ItemZoomablePageBinding extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;
    public final ImageView A;
    public ZoomablePage B;
    public ZoomablePageViewState C;
    public ImageLoaderListener D;
    public OnItemClickListener E;
    public final ClickableRectGroup y;
    public final ProgressBar z;

    public ItemZoomablePageBinding(DataBindingComponent dataBindingComponent, View view, ClickableRectGroup clickableRectGroup, ProgressBar progressBar, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = clickableRectGroup;
        this.z = progressBar;
        this.A = imageView;
    }

    public abstract void L(ImageLoaderListener imageLoaderListener);

    public abstract void M(OnItemClickListener onItemClickListener);

    public abstract void N(ZoomablePage zoomablePage);

    public abstract void O(ZoomablePageViewState zoomablePageViewState);
}
