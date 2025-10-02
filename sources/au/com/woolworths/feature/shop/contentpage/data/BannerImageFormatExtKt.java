package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerImageFormat;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerImageFormatExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BannerImageFormat.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BannerImageFormat.Companion companion = BannerImageFormat.e;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BannerImageFormat.Companion companion2 = BannerImageFormat.e;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BannerImageFormat.Companion companion3 = BannerImageFormat.e;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final EditorialBannerImageFormat a(BannerImageFormat bannerImageFormat) {
        int iOrdinal = bannerImageFormat.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? EditorialBannerImageFormat.d : EditorialBannerImageFormat.g : EditorialBannerImageFormat.f : EditorialBannerImageFormat.d : EditorialBannerImageFormat.e;
    }
}
