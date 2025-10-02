package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/MandyMessageId;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MandyMessageId {
    public static final Companion e;
    public static final MandyMessageId f;
    public static final /* synthetic */ MandyMessageId[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/MandyMessageId$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        MandyMessageId mandyMessageId = new MandyMessageId("Orders", 0, "Orders");
        MandyMessageId mandyMessageId2 = new MandyMessageId("Shop", 1, "Shop");
        MandyMessageId mandyMessageId3 = new MandyMessageId("UNKNOWN__", 2, "UNKNOWN__");
        f = mandyMessageId3;
        MandyMessageId[] mandyMessageIdArr = {mandyMessageId, mandyMessageId2, mandyMessageId3};
        g = mandyMessageIdArr;
        h = EnumEntriesKt.a(mandyMessageIdArr);
        e = new Companion();
        CollectionsKt.R("Orders", "Shop");
    }

    public MandyMessageId(String str, int i, String str2) {
        this.d = str2;
    }

    public static MandyMessageId valueOf(String str) {
        return (MandyMessageId) Enum.valueOf(MandyMessageId.class, str);
    }

    public static MandyMessageId[] values() {
        return (MandyMessageId[]) g.clone();
    }
}
