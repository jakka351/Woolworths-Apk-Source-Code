package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DeliveryMode;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryMode {
    public static final Companion e;
    public static final DeliveryMode f;
    public static final /* synthetic */ DeliveryMode[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/DeliveryMode$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        DeliveryMode deliveryMode = new DeliveryMode("SMS", 0, "SMS");
        DeliveryMode deliveryMode2 = new DeliveryMode("EMAIL", 1, "EMAIL");
        DeliveryMode deliveryMode3 = new DeliveryMode("POST", 2, "POST");
        DeliveryMode deliveryMode4 = new DeliveryMode("COURIER", 3, "COURIER");
        DeliveryMode deliveryMode5 = new DeliveryMode("UNKNOWN__", 4, "UNKNOWN__");
        f = deliveryMode5;
        DeliveryMode[] deliveryModeArr = {deliveryMode, deliveryMode2, deliveryMode3, deliveryMode4, deliveryMode5};
        g = deliveryModeArr;
        h = EnumEntriesKt.a(deliveryModeArr);
        e = new Companion();
        CollectionsKt.R("SMS", "EMAIL", "POST", "COURIER");
    }

    public DeliveryMode(String str, int i, String str2) {
        this.d = str2;
    }

    public static DeliveryMode valueOf(String str) {
        return (DeliveryMode) Enum.valueOf(DeliveryMode.class, str);
    }

    public static DeliveryMode[] values() {
        return (DeliveryMode[]) g.clone();
    }
}
