package au.com.woolworths.shop.aem.components.model.herobanner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/herobanner/HeroBannerTitleSize;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeroBannerTitleSize {
    public static final HeroBannerTitleSize d;
    public static final HeroBannerTitleSize e;
    public static final HeroBannerTitleSize f;
    public static final /* synthetic */ HeroBannerTitleSize[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        HeroBannerTitleSize heroBannerTitleSize = new HeroBannerTitleSize("SMALL", 0);
        d = heroBannerTitleSize;
        HeroBannerTitleSize heroBannerTitleSize2 = new HeroBannerTitleSize("LARGE", 1);
        e = heroBannerTitleSize2;
        HeroBannerTitleSize heroBannerTitleSize3 = new HeroBannerTitleSize("UNKNOWN", 2);
        f = heroBannerTitleSize3;
        HeroBannerTitleSize[] heroBannerTitleSizeArr = {heroBannerTitleSize, heroBannerTitleSize2, heroBannerTitleSize3};
        g = heroBannerTitleSizeArr;
        h = EnumEntriesKt.a(heroBannerTitleSizeArr);
    }

    public static HeroBannerTitleSize valueOf(String str) {
        return (HeroBannerTitleSize) Enum.valueOf(HeroBannerTitleSize.class, str);
    }

    public static HeroBannerTitleSize[] values() {
        return (HeroBannerTitleSize[]) g.clone();
    }
}
