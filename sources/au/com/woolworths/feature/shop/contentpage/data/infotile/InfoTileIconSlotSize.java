package au.com.woolworths.feature.shop.contentpage.data.infotile;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileIconSlotSize;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoTileIconSlotSize {
    public static final InfoTileIconSlotSize d;
    public static final InfoTileIconSlotSize e;
    public static final /* synthetic */ InfoTileIconSlotSize[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        InfoTileIconSlotSize infoTileIconSlotSize = new InfoTileIconSlotSize("SMALL", 0);
        d = infoTileIconSlotSize;
        InfoTileIconSlotSize infoTileIconSlotSize2 = new InfoTileIconSlotSize("LARGE", 1);
        e = infoTileIconSlotSize2;
        InfoTileIconSlotSize[] infoTileIconSlotSizeArr = {infoTileIconSlotSize, infoTileIconSlotSize2};
        f = infoTileIconSlotSizeArr;
        g = EnumEntriesKt.a(infoTileIconSlotSizeArr);
    }

    public static InfoTileIconSlotSize valueOf(String str) {
        return (InfoTileIconSlotSize) Enum.valueOf(InfoTileIconSlotSize.class, str);
    }

    public static InfoTileIconSlotSize[] values() {
        return (InfoTileIconSlotSize[]) f.clone();
    }
}
