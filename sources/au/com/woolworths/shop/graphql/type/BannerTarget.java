package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerTarget;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerTarget {
    public static final Companion e;
    public static final BannerTarget f;
    public static final /* synthetic */ BannerTarget[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BannerTarget$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BannerTarget bannerTarget = new BannerTarget("FRESH_MAG", 0, "FRESH_MAG");
        BannerTarget bannerTarget2 = new BannerTarget("SAVED_RECIPES", 1, "SAVED_RECIPES");
        BannerTarget bannerTarget3 = new BannerTarget("UNKNOWN__", 2, "UNKNOWN__");
        f = bannerTarget3;
        BannerTarget[] bannerTargetArr = {bannerTarget, bannerTarget2, bannerTarget3};
        g = bannerTargetArr;
        h = EnumEntriesKt.a(bannerTargetArr);
        e = new Companion();
        CollectionsKt.R("FRESH_MAG", "SAVED_RECIPES");
    }

    public BannerTarget(String str, int i, String str2) {
        this.d = str2;
    }

    public static BannerTarget valueOf(String str) {
        return (BannerTarget) Enum.valueOf(BannerTarget.class, str);
    }

    public static BannerTarget[] values() {
        return (BannerTarget[]) g.clone();
    }
}
