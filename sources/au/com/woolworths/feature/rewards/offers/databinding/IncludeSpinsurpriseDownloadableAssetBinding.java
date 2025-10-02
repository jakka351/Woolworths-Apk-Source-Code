package au.com.woolworths.feature.rewards.offers.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes3.dex */
public abstract class IncludeSpinsurpriseDownloadableAssetBinding extends ViewDataBinding {
    public DownloadableAsset A;
    public Integer B;
    public Integer C;
    public Boolean D;
    public Boolean E;
    public final ImageView y;
    public final LottieAnimationView z;

    public IncludeSpinsurpriseDownloadableAssetBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, LottieAnimationView lottieAnimationView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = lottieAnimationView;
    }

    public abstract void L(DownloadableAsset downloadableAsset);
}
