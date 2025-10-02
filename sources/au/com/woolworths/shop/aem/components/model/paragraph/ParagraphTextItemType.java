package au.com.woolworths.shop.aem.components.model.paragraph;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/paragraph/ParagraphTextItemType;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParagraphTextItemType {
    public static final ParagraphTextItemType d;
    public static final ParagraphTextItemType e;
    public static final ParagraphTextItemType f;
    public static final /* synthetic */ ParagraphTextItemType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ParagraphTextItemType paragraphTextItemType = new ParagraphTextItemType("BODY", 0);
        d = paragraphTextItemType;
        ParagraphTextItemType paragraphTextItemType2 = new ParagraphTextItemType("CAPTION", 1);
        e = paragraphTextItemType2;
        ParagraphTextItemType paragraphTextItemType3 = new ParagraphTextItemType("UNKNOWN", 2);
        f = paragraphTextItemType3;
        ParagraphTextItemType[] paragraphTextItemTypeArr = {paragraphTextItemType, paragraphTextItemType2, paragraphTextItemType3};
        g = paragraphTextItemTypeArr;
        h = EnumEntriesKt.a(paragraphTextItemTypeArr);
    }

    public static ParagraphTextItemType valueOf(String str) {
        return (ParagraphTextItemType) Enum.valueOf(ParagraphTextItemType.class, str);
    }

    public static ParagraphTextItemType[] values() {
        return (ParagraphTextItemType[]) g.clone();
    }
}
