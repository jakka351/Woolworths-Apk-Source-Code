package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerImageFormat;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerImageFormat {
    public static final Companion e;
    public static final EnumType f;
    public static final BannerImageFormat g;
    public static final /* synthetic */ BannerImageFormat[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerImageFormat$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BannerImageFormat bannerImageFormat = new BannerImageFormat("HALF_WIDTH", 0, "HALF_WIDTH");
        BannerImageFormat bannerImageFormat2 = new BannerImageFormat("FULL_WIDTH", 1, "FULL_WIDTH");
        BannerImageFormat bannerImageFormat3 = new BannerImageFormat("PORTRAIT", 2, "PORTRAIT");
        BannerImageFormat bannerImageFormat4 = new BannerImageFormat("NARROW", 3, "NARROW");
        BannerImageFormat bannerImageFormat5 = new BannerImageFormat("UNKNOWN__", 4, "UNKNOWN__");
        g = bannerImageFormat5;
        BannerImageFormat[] bannerImageFormatArr = {bannerImageFormat, bannerImageFormat2, bannerImageFormat3, bannerImageFormat4, bannerImageFormat5};
        h = bannerImageFormatArr;
        i = EnumEntriesKt.a(bannerImageFormatArr);
        e = new Companion();
        f = new EnumType("BannerImageFormat", CollectionsKt.R("HALF_WIDTH", "FULL_WIDTH", "PORTRAIT", "NARROW"));
    }

    public BannerImageFormat(String str, int i2, String str2) {
        this.d = str2;
    }

    public static BannerImageFormat valueOf(String str) {
        return (BannerImageFormat) Enum.valueOf(BannerImageFormat.class, str);
    }

    public static BannerImageFormat[] values() {
        return (BannerImageFormat[]) h.clone();
    }
}
