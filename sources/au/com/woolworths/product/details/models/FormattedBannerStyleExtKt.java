package au.com.woolworths.product.details.models;

import au.com.woolworths.shop.graphql.type.FormattedBannerStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/BannerStyle;", "Lau/com/woolworths/shop/graphql/type/FormattedBannerStyle;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FormattedBannerStyleExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormattedBannerStyle.values().length];
            try {
                FormattedBannerStyle.Companion companion = FormattedBannerStyle.e;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FormattedBannerStyle.Companion companion2 = FormattedBannerStyle.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FormattedBannerStyle.Companion companion3 = FormattedBannerStyle.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BannerStyle toUiModel(@NotNull FormattedBannerStyle formattedBannerStyle) {
        Intrinsics.h(formattedBannerStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[formattedBannerStyle.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? BannerStyle.UNKNOWN : BannerStyle.ERROR : BannerStyle.WARNING : BannerStyle.INFO;
    }
}
