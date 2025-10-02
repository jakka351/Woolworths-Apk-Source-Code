package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "Lau/com/woolworths/shop/graphql/type/AdBannerNativeSize;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdBannerNativeSizeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdBannerNativeSize.values().length];
            try {
                AdBannerNativeSize.Companion companion = AdBannerNativeSize.e;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdBannerNativeSize.Companion companion2 = AdBannerNativeSize.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdBannerNativeSize.Companion companion3 = AdBannerNativeSize.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DefaultCardHeight toUiModel(@NotNull AdBannerNativeSize adBannerNativeSize) {
        Intrinsics.h(adBannerNativeSize, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[adBannerNativeSize.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
    }
}
