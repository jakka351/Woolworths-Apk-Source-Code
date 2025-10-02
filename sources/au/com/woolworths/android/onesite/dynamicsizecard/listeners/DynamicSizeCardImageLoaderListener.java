package au.com.woolworths.android.onesite.dynamicsizecard.listeners;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.ItemDynamicSizeCardBinding;
import au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardImageLoaderListener;", "Lau/com/woolworths/android/onesite/common/imageloading/ImageLoaderListener;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicSizeCardImageLoaderListener implements ImageLoaderListener {
    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean a(ViewDataBinding viewDataBinding) {
        ItemDynamicSizeCardBinding itemDynamicSizeCardBinding = viewDataBinding instanceof ItemDynamicSizeCardBinding ? (ItemDynamicSizeCardBinding) viewDataBinding : null;
        if (itemDynamicSizeCardBinding == null) {
            return false;
        }
        itemDynamicSizeCardBinding.z.setVisibility(4);
        itemDynamicSizeCardBinding.y.setVisibility(0);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.common.imageloading.ImageLoaderListener
    public final boolean b(ViewDataBinding viewDataBinding, Drawable drawable) {
        ItemDynamicSizeCardBinding itemDynamicSizeCardBinding = viewDataBinding instanceof ItemDynamicSizeCardBinding ? (ItemDynamicSizeCardBinding) viewDataBinding : null;
        if (itemDynamicSizeCardBinding != null) {
            itemDynamicSizeCardBinding.z.setVisibility(0);
            itemDynamicSizeCardBinding.y.setVisibility(8);
        }
        return false;
    }
}
