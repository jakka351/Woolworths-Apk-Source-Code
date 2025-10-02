package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/GiftCardDesignImageType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GiftCardDesignImageType {
    public static final Companion e;
    public static final GiftCardDesignImageType f;
    public static final /* synthetic */ GiftCardDesignImageType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/GiftCardDesignImageType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        GiftCardDesignImageType giftCardDesignImageType = new GiftCardDesignImageType("DEFAULT", 0, "DEFAULT");
        GiftCardDesignImageType giftCardDesignImageType2 = new GiftCardDesignImageType("WEB", 1, "WEB");
        GiftCardDesignImageType giftCardDesignImageType3 = new GiftCardDesignImageType("THUMBNAIL", 2, "THUMBNAIL");
        GiftCardDesignImageType giftCardDesignImageType4 = new GiftCardDesignImageType("MOBILE", 3, "MOBILE");
        GiftCardDesignImageType giftCardDesignImageType5 = new GiftCardDesignImageType("UNKNOWN__", 4, "UNKNOWN__");
        f = giftCardDesignImageType5;
        GiftCardDesignImageType[] giftCardDesignImageTypeArr = {giftCardDesignImageType, giftCardDesignImageType2, giftCardDesignImageType3, giftCardDesignImageType4, giftCardDesignImageType5};
        g = giftCardDesignImageTypeArr;
        h = EnumEntriesKt.a(giftCardDesignImageTypeArr);
        e = new Companion();
        CollectionsKt.R("DEFAULT", "WEB", "THUMBNAIL", "MOBILE");
    }

    public GiftCardDesignImageType(String str, int i, String str2) {
        this.d = str2;
    }

    public static GiftCardDesignImageType valueOf(String str) {
        return (GiftCardDesignImageType) Enum.valueOf(GiftCardDesignImageType.class, str);
    }

    public static GiftCardDesignImageType[] values() {
        return (GiftCardDesignImageType[]) g.clone();
    }
}
