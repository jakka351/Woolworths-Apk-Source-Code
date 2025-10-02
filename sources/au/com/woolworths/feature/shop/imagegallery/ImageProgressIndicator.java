package au.com.woolworths.feature.shop.imagegallery;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.github.piasy.biv.indicator.ProgressIndicator;
import com.github.piasy.biv.view.BigImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/ImageProgressIndicator;", "Lcom/github/piasy/biv/indicator/ProgressIndicator;", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageProgressIndicator implements ProgressIndicator {
    @Override // com.github.piasy.biv.indicator.ProgressIndicator
    public final ProgressBar a(BigImageView bigImageView) {
        ProgressBar progressBar = new ProgressBar(bigImageView.getContext());
        progressBar.setIndeterminate(false);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        return progressBar;
    }
}
