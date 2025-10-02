package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerTextPosition;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerTextPosition {
    public static final Companion e;
    public static final EnumType f;
    public static final BannerTextPosition g;
    public static final /* synthetic */ BannerTextPosition[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerTextPosition$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BannerTextPosition bannerTextPosition = new BannerTextPosition("LEFT", 0, "LEFT");
        BannerTextPosition bannerTextPosition2 = new BannerTextPosition("RIGHT", 1, "RIGHT");
        BannerTextPosition bannerTextPosition3 = new BannerTextPosition("UNKNOWN__", 2, "UNKNOWN__");
        g = bannerTextPosition3;
        BannerTextPosition[] bannerTextPositionArr = {bannerTextPosition, bannerTextPosition2, bannerTextPosition3};
        h = bannerTextPositionArr;
        i = EnumEntriesKt.a(bannerTextPositionArr);
        e = new Companion();
        f = new EnumType("BannerTextPosition", CollectionsKt.R("LEFT", "RIGHT"));
    }

    public BannerTextPosition(String str, int i2, String str2) {
        this.d = str2;
    }

    public static BannerTextPosition valueOf(String str) {
        return (BannerTextPosition) Enum.valueOf(BannerTextPosition.class, str);
    }

    public static BannerTextPosition[] values() {
        return (BannerTextPosition[]) h.clone();
    }
}
