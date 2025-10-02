package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckInType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckInType {
    public static final Companion e;
    public static final CheckInType f;
    public static final CheckInType g;
    public static final CheckInType h;
    public static final /* synthetic */ CheckInType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CheckInType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CheckInType checkInType = new CheckInType("checkIn15mins", 0, "checkIn15mins");
        f = checkInType;
        CheckInType checkInType2 = new CheckInType("checkInNow", 1, "checkInNow");
        g = checkInType2;
        CheckInType checkInType3 = new CheckInType("UNKNOWN__", 2, "UNKNOWN__");
        h = checkInType3;
        CheckInType[] checkInTypeArr = {checkInType, checkInType2, checkInType3};
        i = checkInTypeArr;
        j = EnumEntriesKt.a(checkInTypeArr);
        e = new Companion();
        CollectionsKt.R("checkIn15mins", "checkInNow");
    }

    public CheckInType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static CheckInType valueOf(String str) {
        return (CheckInType) Enum.valueOf(CheckInType.class, str);
    }

    public static CheckInType[] values() {
        return (CheckInType[]) i.clone();
    }
}
