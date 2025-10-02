package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PickupOption;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PickupOption {
    public static final Companion e;
    public static final EnumType f;
    public static final PickupOption g;
    public static final /* synthetic */ PickupOption[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/PickupOption$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        PickupOption pickupOption = new PickupOption("DTB_DRIVE_THRU", 0, "DTB_DRIVE_THRU");
        PickupOption pickupOption2 = new PickupOption("DTB_DRIVE_UP", 1, "DTB_DRIVE_UP");
        PickupOption pickupOption3 = new PickupOption("IN_STORE", 2, "IN_STORE");
        PickupOption pickupOption4 = new PickupOption("E_LOCKER", 3, "E_LOCKER");
        PickupOption pickupOption5 = new PickupOption("UNKNOWN__", 4, "UNKNOWN__");
        g = pickupOption5;
        PickupOption[] pickupOptionArr = {pickupOption, pickupOption2, pickupOption3, pickupOption4, pickupOption5};
        h = pickupOptionArr;
        i = EnumEntriesKt.a(pickupOptionArr);
        e = new Companion();
        f = new EnumType("PickupOption", CollectionsKt.R("DTB_DRIVE_THRU", "DTB_DRIVE_UP", "IN_STORE", "E_LOCKER"));
    }

    public PickupOption(String str, int i2, String str2) {
        this.d = str2;
    }

    public static PickupOption valueOf(String str) {
        return (PickupOption) Enum.valueOf(PickupOption.class, str);
    }

    public static PickupOption[] values() {
        return (PickupOption[]) h.clone();
    }
}
