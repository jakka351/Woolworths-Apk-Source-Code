package au.com.woolworths.sdui.shop.dynamicsizecard;

import android.widget.ImageView;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DynamicSizeCardData {
    /* renamed from: a */
    String getE();

    default ImageView.ScaleType b() {
        return ImageView.ScaleType.CENTER_CROP;
    }

    default int c() {
        return R.dimen.dynamic_height_card_default_width;
    }

    DynamicSizeCardHeight getHeight();

    /* renamed from: getImageUrl */
    String getD();

    int hashCode();
}
