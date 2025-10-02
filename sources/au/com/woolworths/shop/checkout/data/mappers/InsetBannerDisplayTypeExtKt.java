package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerTypeApiData;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetBannerDisplayTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InsetBannerDisplayType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InsetBannerDisplayType.Companion companion = InsetBannerDisplayType.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InsetBannerDisplayType.Companion companion2 = InsetBannerDisplayType.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InsetBannerDisplayType.Companion companion3 = InsetBannerDisplayType.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InsetBannerDisplayType.Companion companion4 = InsetBannerDisplayType.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final InsetBannerTypeApiData a(InsetBannerDisplayType insetBannerDisplayType) {
        Intrinsics.h(insetBannerDisplayType, "<this>");
        int iOrdinal = insetBannerDisplayType.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? InsetBannerTypeApiData.INFO : InsetBannerTypeApiData.GREEN : InsetBannerTypeApiData.REWARDS : InsetBannerTypeApiData.ERROR : InsetBannerTypeApiData.WARNING : InsetBannerTypeApiData.INFO;
    }
}
