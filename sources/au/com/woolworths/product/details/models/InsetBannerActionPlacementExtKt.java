package au.com.woolworths.product.details.models;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionPlacementTypeApiData;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionPlacementTypeApiData;", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetBannerActionPlacementExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetBannerActionPlacement.values().length];
            try {
                InsetBannerActionPlacement.Companion companion = InsetBannerActionPlacement.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InsetBannerActionPlacement.Companion companion2 = InsetBannerActionPlacement.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InsetBannerActionPlacementTypeApiData toUiModel(@NotNull InsetBannerActionPlacement insetBannerActionPlacement) {
        Intrinsics.h(insetBannerActionPlacement, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[insetBannerActionPlacement.ordinal()];
        if (i != 1 && i == 2) {
            return InsetBannerActionPlacementTypeApiData.RIGHT;
        }
        return InsetBannerActionPlacementTypeApiData.BOTTOM;
    }
}
