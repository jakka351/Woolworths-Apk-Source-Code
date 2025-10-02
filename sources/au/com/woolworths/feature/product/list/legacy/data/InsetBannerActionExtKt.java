package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionApiData;
import com.woolworths.product.list.legacy.fragment.InsetBanner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerActionExtKt {
    public static final InsetBannerActionApiData a(InsetBanner.Action action) {
        return new InsetBannerActionApiData(action.getLabel(), action.getUrl(), InsetBannerActionTypeExtKt.a(action.getType()), InsetBannerActionPlacementExtKt.a(action.getPlacement()), null);
    }
}
