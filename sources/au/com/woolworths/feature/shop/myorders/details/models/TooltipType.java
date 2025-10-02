package au.com.woolworths.feature.shop.myorders.details.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/TooltipType;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TooltipType {
    public static final TooltipType d;
    public static final TooltipType e;
    public static final /* synthetic */ TooltipType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        TooltipType tooltipType = new TooltipType("INFO", 0);
        d = tooltipType;
        TooltipType tooltipType2 = new TooltipType("COMPLETED", 1);
        e = tooltipType2;
        TooltipType[] tooltipTypeArr = {tooltipType, tooltipType2};
        f = tooltipTypeArr;
        g = EnumEntriesKt.a(tooltipTypeArr);
    }

    public static TooltipType valueOf(String str) {
        return (TooltipType) Enum.valueOf(TooltipType.class, str);
    }

    public static TooltipType[] values() {
        return (TooltipType[]) f.clone();
    }
}
