package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerTypeApiData;", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerDisplayTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetBannerDisplayType.values().length];
            try {
                InsetBannerDisplayType.Companion companion = InsetBannerDisplayType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InsetBannerDisplayType.Companion companion2 = InsetBannerDisplayType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InsetBannerDisplayType.Companion companion3 = InsetBannerDisplayType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InsetBannerDisplayType.Companion companion4 = InsetBannerDisplayType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InsetBannerDisplayType.Companion companion5 = InsetBannerDisplayType.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InsetBannerTypeApiData toUiModel(@NotNull InsetBannerDisplayType insetBannerDisplayType) {
        Intrinsics.h(insetBannerDisplayType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[insetBannerDisplayType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? InsetBannerTypeApiData.INFO : InsetBannerTypeApiData.GREEN : InsetBannerTypeApiData.REWARDS : InsetBannerTypeApiData.ERROR : InsetBannerTypeApiData.WARNING : InsetBannerTypeApiData.INFO;
    }
}
