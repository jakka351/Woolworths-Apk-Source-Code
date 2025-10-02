package au.com.woolworths.feature.rewards.offers.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/PersonalisedOffersStatus;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonalisedOffersStatus {
    public static final PersonalisedOffersStatus d;
    public static final PersonalisedOffersStatus e;
    public static final PersonalisedOffersStatus f;
    public static final /* synthetic */ PersonalisedOffersStatus[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        PersonalisedOffersStatus personalisedOffersStatus = new PersonalisedOffersStatus("Available", 0);
        d = personalisedOffersStatus;
        PersonalisedOffersStatus personalisedOffersStatus2 = new PersonalisedOffersStatus("Boosted", 1);
        e = personalisedOffersStatus2;
        PersonalisedOffersStatus personalisedOffersStatus3 = new PersonalisedOffersStatus("Ended", 2);
        f = personalisedOffersStatus3;
        PersonalisedOffersStatus[] personalisedOffersStatusArr = {personalisedOffersStatus, personalisedOffersStatus2, personalisedOffersStatus3};
        g = personalisedOffersStatusArr;
        h = EnumEntriesKt.a(personalisedOffersStatusArr);
    }

    public static PersonalisedOffersStatus valueOf(String str) {
        return (PersonalisedOffersStatus) Enum.valueOf(PersonalisedOffersStatus.class, str);
    }

    public static PersonalisedOffersStatus[] values() {
        return (PersonalisedOffersStatus[]) g.clone();
    }
}
