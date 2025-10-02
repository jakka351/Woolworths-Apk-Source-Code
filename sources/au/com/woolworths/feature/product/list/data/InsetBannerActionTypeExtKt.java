package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerActionTypeApiData;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerActionTypeApiData;", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsetBannerActionTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetBannerActionType.values().length];
            try {
                InsetBannerActionType.Companion companion = InsetBannerActionType.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InsetBannerActionType.Companion companion2 = InsetBannerActionType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InsetBannerActionTypeApiData toUiModel(@NotNull InsetBannerActionType insetBannerActionType) {
        Intrinsics.h(insetBannerActionType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[insetBannerActionType.ordinal()];
        return i != 1 ? i != 2 ? InsetBannerActionTypeApiData.UNKNOWN : InsetBannerActionTypeApiData.APPLOCAL : InsetBannerActionTypeApiData.LINK;
    }
}
