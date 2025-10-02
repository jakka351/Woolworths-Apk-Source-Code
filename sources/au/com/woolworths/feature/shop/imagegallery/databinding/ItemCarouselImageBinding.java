package au.com.woolworths.feature.shop.imagegallery.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.github.piasy.biv.view.BigImageView;

/* loaded from: classes3.dex */
public abstract class ItemCarouselImageBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final BigImageView y;
    public String z;

    public ItemCarouselImageBinding(DataBindingComponent dataBindingComponent, View view, BigImageView bigImageView) {
        super(dataBindingComponent, view, 0);
        this.y = bigImageView;
    }

    public abstract void L(String str);
}
