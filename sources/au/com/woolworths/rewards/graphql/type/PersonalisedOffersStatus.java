package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PersonalisedOffersStatus;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalisedOffersStatus {
    public static final Companion e;
    public static final EnumType f;
    public static final PersonalisedOffersStatus g;
    public static final /* synthetic */ PersonalisedOffersStatus[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/PersonalisedOffersStatus$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PersonalisedOffersStatus personalisedOffersStatus = new PersonalisedOffersStatus("AVAILABLE", 0, "AVAILABLE");
        PersonalisedOffersStatus personalisedOffersStatus2 = new PersonalisedOffersStatus("BOOSTED", 1, "BOOSTED");
        PersonalisedOffersStatus personalisedOffersStatus3 = new PersonalisedOffersStatus("ENDED", 2, "ENDED");
        PersonalisedOffersStatus personalisedOffersStatus4 = new PersonalisedOffersStatus("UNKNOWN__", 3, "UNKNOWN__");
        g = personalisedOffersStatus4;
        PersonalisedOffersStatus[] personalisedOffersStatusArr = {personalisedOffersStatus, personalisedOffersStatus2, personalisedOffersStatus3, personalisedOffersStatus4};
        h = personalisedOffersStatusArr;
        i = EnumEntriesKt.a(personalisedOffersStatusArr);
        e = new Companion();
        f = new EnumType("PersonalisedOffersStatus", CollectionsKt.R("AVAILABLE", "BOOSTED", "ENDED"));
    }

    public PersonalisedOffersStatus(String str, int i2, String str2) {
        this.d = str2;
    }

    public static PersonalisedOffersStatus valueOf(String str) {
        return (PersonalisedOffersStatus) Enum.valueOf(PersonalisedOffersStatus.class, str);
    }

    public static PersonalisedOffersStatus[] values() {
        return (PersonalisedOffersStatus[]) h.clone();
    }
}
