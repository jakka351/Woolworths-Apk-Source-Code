package au.com.woolworths.foundation.bark.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/bark/common/ReportOwner;", "", "Squad", "common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Squad f8485a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/bark/common/ReportOwner$Squad;", "", "common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Squad {
        public static final Squad d;
        public static final Squad e;
        public static final Squad f;
        public static final Squad g;
        public static final Squad h;
        public static final Squad i;
        public static final Squad j;
        public static final Squad k;
        public static final Squad l;
        public static final Squad m;
        public static final Squad n;
        public static final Squad o;
        public static final Squad p;
        public static final Squad q;
        public static final Squad r;
        public static final Squad s;
        public static final Squad t;
        public static final Squad u;
        public static final Squad v;
        public static final Squad w;
        public static final /* synthetic */ Squad[] x;
        public static final /* synthetic */ EnumEntries y;

        static {
            Squad squad = new Squad("Discover", 0);
            d = squad;
            Squad squad2 = new Squad("Engage", 1);
            e = squad2;
            Squad squad3 = new Squad("Onboard", 2);
            f = squad3;
            Squad squad4 = new Squad("Pay", 3);
            Squad squad5 = new Squad("ACAR", 4);
            Squad squad6 = new Squad("ACDC", 5);
            g = squad6;
            Squad squad7 = new Squad("AND", 6);
            Squad squad8 = new Squad("AOC", 7);
            Squad squad9 = new Squad("APPCO", 8);
            h = squad9;
            Squad squad10 = new Squad("ATLA", 9);
            Squad squad11 = new Squad("BROWSE", 10);
            i = squad11;
            Squad squad12 = new Squad("CC", 11);
            Squad squad13 = new Squad("COCO", 12);
            j = squad13;
            Squad squad14 = new Squad("DTAC", 13);
            k = squad14;
            Squad squad15 = new Squad("EDRSHOP", 14);
            Squad squad16 = new Squad("FRB", 15);
            Squad squad17 = new Squad("GFEEF", 16);
            l = squad17;
            Squad squad18 = new Squad("HAL", 17);
            Squad squad19 = new Squad("LION", 18);
            Squad squad20 = new Squad("MOBPLAT", 19);
            m = squad20;
            Squad squad21 = new Squad("MPWEB", 20);
            n = squad21;
            Squad squad22 = new Squad("MPPSUP", 21);
            o = squad22;
            Squad squad23 = new Squad("NEC", 22);
            Squad squad24 = new Squad("NUK", 23);
            p = squad24;
            Squad squad25 = new Squad("NUTDX", 24);
            Squad squad26 = new Squad("PDE", 25);
            q = squad26;
            Squad squad27 = new Squad("PLAT", 26);
            r = squad27;
            Squad squad28 = new Squad("RAF", 27);
            Squad squad29 = new Squad("POPX", 28);
            s = squad29;
            Squad squad30 = new Squad("SANDX", 29);
            Squad squad31 = new Squad("SNG", 30);
            Squad squad32 = new Squad("TAN", 31);
            Squad squad33 = new Squad("TEMPUS", 32);
            Squad squad34 = new Squad("THOR", 33);
            t = squad34;
            Squad squad35 = new Squad("TIDE", 34);
            u = squad35;
            Squad squad36 = new Squad("VA", 35);
            v = squad36;
            Squad squad37 = new Squad("FDC", 36);
            w = squad37;
            Squad[] squadArr = {squad, squad2, squad3, squad4, squad5, squad6, squad7, squad8, squad9, squad10, squad11, squad12, squad13, squad14, squad15, squad16, squad17, squad18, squad19, squad20, squad21, squad22, squad23, squad24, squad25, squad26, squad27, squad28, squad29, squad30, squad31, squad32, squad33, squad34, squad35, squad36, squad37, new Squad("VEGDX", 37)};
            x = squadArr;
            y = EnumEntriesKt.a(squadArr);
        }

        public static Squad valueOf(String str) {
            return (Squad) Enum.valueOf(Squad.class, str);
        }

        public static Squad[] values() {
            return (Squad[]) x.clone();
        }

        public final ReportOwner a() {
            return new ReportOwner(this);
        }
    }

    public ReportOwner(Squad squad) {
        Intrinsics.h(squad, "squad");
        this.f8485a = squad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportOwner) && this.f8485a == ((ReportOwner) obj).f8485a;
    }

    public final int hashCode() {
        return this.f8485a.hashCode();
    }

    public final String toString() {
        return "ReportOwner(squad=" + this.f8485a + ")";
    }
}
