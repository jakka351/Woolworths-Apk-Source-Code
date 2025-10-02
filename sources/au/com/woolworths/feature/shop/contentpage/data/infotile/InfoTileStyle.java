package au.com.woolworths.feature.shop.contentpage.data.infotile;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/infotile/InfoTileStyle;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoTileStyle {
    public static final InfoTileStyle d;
    public static final InfoTileStyle e;
    public static final /* synthetic */ InfoTileStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        InfoTileStyle infoTileStyle = new InfoTileStyle("UNBOXED", 0);
        d = infoTileStyle;
        InfoTileStyle infoTileStyle2 = new InfoTileStyle("BOXED", 1);
        e = infoTileStyle2;
        InfoTileStyle[] infoTileStyleArr = {infoTileStyle, infoTileStyle2};
        f = infoTileStyleArr;
        g = EnumEntriesKt.a(infoTileStyleArr);
    }

    public static InfoTileStyle valueOf(String str) {
        return (InfoTileStyle) Enum.valueOf(InfoTileStyle.class, str);
    }

    public static InfoTileStyle[] values() {
        return (InfoTileStyle[]) f.clone();
    }
}
