package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SpecialsFeaturedPartnerId;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecialsFeaturedPartnerId {
    public static final Companion e;
    public static final SpecialsFeaturedPartnerId f;
    public static final /* synthetic */ SpecialsFeaturedPartnerId[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SpecialsFeaturedPartnerId$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        SpecialsFeaturedPartnerId specialsFeaturedPartnerId = new SpecialsFeaturedPartnerId("Woolworths", 0, "Woolworths");
        SpecialsFeaturedPartnerId specialsFeaturedPartnerId2 = new SpecialsFeaturedPartnerId("BigW", 1, "BigW");
        SpecialsFeaturedPartnerId specialsFeaturedPartnerId3 = new SpecialsFeaturedPartnerId("BWS", 2, "BWS");
        SpecialsFeaturedPartnerId specialsFeaturedPartnerId4 = new SpecialsFeaturedPartnerId("Marketplace", 3, "Marketplace");
        SpecialsFeaturedPartnerId specialsFeaturedPartnerId5 = new SpecialsFeaturedPartnerId("UNKNOWN__", 4, "UNKNOWN__");
        f = specialsFeaturedPartnerId5;
        SpecialsFeaturedPartnerId[] specialsFeaturedPartnerIdArr = {specialsFeaturedPartnerId, specialsFeaturedPartnerId2, specialsFeaturedPartnerId3, specialsFeaturedPartnerId4, specialsFeaturedPartnerId5};
        g = specialsFeaturedPartnerIdArr;
        h = EnumEntriesKt.a(specialsFeaturedPartnerIdArr);
        e = new Companion();
        CollectionsKt.R("Woolworths", "BigW", "BWS", "Marketplace");
    }

    public SpecialsFeaturedPartnerId(String str, int i, String str2) {
        this.d = str2;
    }

    public static SpecialsFeaturedPartnerId valueOf(String str) {
        return (SpecialsFeaturedPartnerId) Enum.valueOf(SpecialsFeaturedPartnerId.class, str);
    }

    public static SpecialsFeaturedPartnerId[] values() {
        return (SpecialsFeaturedPartnerId[]) g.clone();
    }
}
