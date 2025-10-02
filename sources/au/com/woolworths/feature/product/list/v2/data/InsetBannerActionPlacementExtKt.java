package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerActionPlacementExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InsetBannerActionPlacement.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InsetBannerActionPlacement.Companion companion = InsetBannerActionPlacement.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final InsetBannerActionPlacementTypeApiData a(InsetBannerActionPlacement insetBannerActionPlacement) {
        int iOrdinal = insetBannerActionPlacement.ordinal();
        if (iOrdinal != 0 && iOrdinal == 1) {
            return InsetBannerActionPlacementTypeApiData.RIGHT;
        }
        return InsetBannerActionPlacementTypeApiData.BOTTOM;
    }
}
