package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdBannerNativeSizeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AdBannerNativeSize.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdBannerNativeSize.Companion companion = AdBannerNativeSize.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdBannerNativeSize.Companion companion2 = AdBannerNativeSize.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final DefaultCardHeight a(AdBannerNativeSize adBannerNativeSize) {
        Intrinsics.h(adBannerNativeSize, "<this>");
        int iOrdinal = adBannerNativeSize.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL;
    }
}
