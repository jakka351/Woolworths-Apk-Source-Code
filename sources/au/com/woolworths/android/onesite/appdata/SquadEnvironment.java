package au.com.woolworths.android.onesite.appdata;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/appdata/SquadEnvironment;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SquadEnvironment {
    public static final SquadEnvironment d;
    public static final /* synthetic */ SquadEnvironment[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        App[] appArr = App.d;
        SquadEnvironment squadEnvironment = new SquadEnvironment("AC", 0);
        SquadEnvironment squadEnvironment2 = new SquadEnvironment("AOC", 1);
        SquadEnvironment squadEnvironment3 = new SquadEnvironment("BCS", 2);
        SquadEnvironment squadEnvironment4 = new SquadEnvironment("BROWSE", 3);
        SquadEnvironment squadEnvironment5 = new SquadEnvironment("CDE", 4);
        SquadEnvironment squadEnvironment6 = new SquadEnvironment("COCO", 5);
        SquadEnvironment squadEnvironment7 = new SquadEnvironment("DTAC", 6);
        SquadEnvironment squadEnvironment8 = new SquadEnvironment("EM", 7);
        SquadEnvironment squadEnvironment9 = new SquadEnvironment("FDC", 8);
        SquadEnvironment squadEnvironment10 = new SquadEnvironment("MAF", 9);
        SquadEnvironment squadEnvironment11 = new SquadEnvironment("PDE", 10);
        SquadEnvironment squadEnvironment12 = new SquadEnvironment("POPX", 11);
        SquadEnvironment squadEnvironment13 = new SquadEnvironment("RAF", 12);
        SquadEnvironment squadEnvironment14 = new SquadEnvironment("SUPERNOVA", 13);
        SquadEnvironment squadEnvironment15 = new SquadEnvironment("TIDE", 14);
        SquadEnvironment squadEnvironment16 = new SquadEnvironment("TORCH", 15);
        SquadEnvironment squadEnvironment17 = new SquadEnvironment("VA", 16);
        SquadEnvironment squadEnvironment18 = new SquadEnvironment("DISCOVER", 17);
        SquadEnvironment squadEnvironment19 = new SquadEnvironment("ENGAGE", 18);
        SquadEnvironment squadEnvironment20 = new SquadEnvironment("ONBOARD", 19);
        SquadEnvironment squadEnvironment21 = new SquadEnvironment("PAY", 20);
        SquadEnvironment squadEnvironment22 = new SquadEnvironment("SHOP", 21);
        SquadEnvironment squadEnvironment23 = new SquadEnvironment("NONE", 22);
        d = squadEnvironment23;
        SquadEnvironment[] squadEnvironmentArr = {squadEnvironment, squadEnvironment2, squadEnvironment3, squadEnvironment4, squadEnvironment5, squadEnvironment6, squadEnvironment7, squadEnvironment8, squadEnvironment9, squadEnvironment10, squadEnvironment11, squadEnvironment12, squadEnvironment13, squadEnvironment14, squadEnvironment15, squadEnvironment16, squadEnvironment17, squadEnvironment18, squadEnvironment19, squadEnvironment20, squadEnvironment21, squadEnvironment22, squadEnvironment23};
        e = squadEnvironmentArr;
        f = EnumEntriesKt.a(squadEnvironmentArr);
    }

    public static SquadEnvironment valueOf(String str) {
        return (SquadEnvironment) Enum.valueOf(SquadEnvironment.class, str);
    }

    public static SquadEnvironment[] values() {
        return (SquadEnvironment[]) e.clone();
    }
}
