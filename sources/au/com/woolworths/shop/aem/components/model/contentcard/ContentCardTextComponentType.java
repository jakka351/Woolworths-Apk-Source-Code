package au.com.woolworths.shop.aem.components.model.contentcard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/ContentCardTextComponentType;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardTextComponentType {
    public static final ContentCardTextComponentType e;
    public static final ContentCardTextComponentType f;
    public static final ContentCardTextComponentType g;
    public static final ContentCardTextComponentType h;
    public static final /* synthetic */ ContentCardTextComponentType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final int d;

    static {
        ContentCardTextComponentType contentCardTextComponentType = new ContentCardTextComponentType("TITLE_ONLY", 0, 44);
        e = contentCardTextComponentType;
        ContentCardTextComponentType contentCardTextComponentType2 = new ContentCardTextComponentType("TITLE_DESCRIPTION", 1, 96);
        f = contentCardTextComponentType2;
        ContentCardTextComponentType contentCardTextComponentType3 = new ContentCardTextComponentType("TITLE_FOOTER", 2, 80);
        g = contentCardTextComponentType3;
        ContentCardTextComponentType contentCardTextComponentType4 = new ContentCardTextComponentType("TITLE_DESCRIPTION_FOOTER", 3, 132);
        h = contentCardTextComponentType4;
        ContentCardTextComponentType[] contentCardTextComponentTypeArr = {contentCardTextComponentType, contentCardTextComponentType2, contentCardTextComponentType3, contentCardTextComponentType4};
        i = contentCardTextComponentTypeArr;
        j = EnumEntriesKt.a(contentCardTextComponentTypeArr);
    }

    public ContentCardTextComponentType(String str, int i2, int i3) {
        this.d = i3;
    }

    public static ContentCardTextComponentType valueOf(String str) {
        return (ContentCardTextComponentType) Enum.valueOf(ContentCardTextComponentType.class, str);
    }

    public static ContentCardTextComponentType[] values() {
        return (ContentCardTextComponentType[]) i.clone();
    }
}
