package au.com.woolworths.product.details.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.ProductDetailsClickHandler;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.ui.ProductImageLoaderListener;

/* loaded from: classes4.dex */
public abstract class EpoxyItemProductImageBinding extends ViewDataBinding {
    public ProductImage A;
    public ProductDetailsClickHandler B;
    public ProductImageLoaderListener C;
    public final ContentLoadingProgressBar y;
    public final ImageView z;

    public EpoxyItemProductImageBinding(DataBindingComponent dataBindingComponent, View view, ContentLoadingProgressBar contentLoadingProgressBar, ImageView imageView) {
        super(dataBindingComponent, view, 0);
        this.y = contentLoadingProgressBar;
        this.z = imageView;
    }
}
