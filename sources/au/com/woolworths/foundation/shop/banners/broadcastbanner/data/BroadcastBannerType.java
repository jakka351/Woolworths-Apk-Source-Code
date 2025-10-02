package au.com.woolworths.foundation.shop.banners.broadcastbanner.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerType;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "PRIMARY", "REWARDS", "banners-data"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BroadcastBannerType {

    @DefaultValue
    @SerializedName("NEUTRAL")
    public static final BroadcastBannerType NEUTRAL;

    @SerializedName("PRIMARY")
    public static final BroadcastBannerType PRIMARY;

    @SerializedName("REWARDS")
    public static final BroadcastBannerType REWARDS;
    public static final /* synthetic */ BroadcastBannerType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        BroadcastBannerType broadcastBannerType = new BroadcastBannerType("NEUTRAL", 0);
        NEUTRAL = broadcastBannerType;
        BroadcastBannerType broadcastBannerType2 = new BroadcastBannerType("PRIMARY", 1);
        PRIMARY = broadcastBannerType2;
        BroadcastBannerType broadcastBannerType3 = new BroadcastBannerType("REWARDS", 2);
        REWARDS = broadcastBannerType3;
        BroadcastBannerType[] broadcastBannerTypeArr = {broadcastBannerType, broadcastBannerType2, broadcastBannerType3};
        d = broadcastBannerTypeArr;
        e = EnumEntriesKt.a(broadcastBannerTypeArr);
    }

    private BroadcastBannerType(String str, int i) {
    }

    public static BroadcastBannerType valueOf(String str) {
        return (BroadcastBannerType) Enum.valueOf(BroadcastBannerType.class, str);
    }

    public static BroadcastBannerType[] values() {
        return (BroadcastBannerType[]) d.clone();
    }
}
