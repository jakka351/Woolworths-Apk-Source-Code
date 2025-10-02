package au.com.woolworths.shop.aem.components.model.contentcard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/ContentCardTextHeightType;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardTextHeightType {
    public static final ContentCardTextHeightType d;
    public static final ContentCardTextHeightType e;
    public static final /* synthetic */ ContentCardTextHeightType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ContentCardTextHeightType contentCardTextHeightType = new ContentCardTextHeightType("DYNAMIC", 0);
        d = contentCardTextHeightType;
        ContentCardTextHeightType contentCardTextHeightType2 = new ContentCardTextHeightType("FIXED", 1);
        e = contentCardTextHeightType2;
        ContentCardTextHeightType[] contentCardTextHeightTypeArr = {contentCardTextHeightType, contentCardTextHeightType2};
        f = contentCardTextHeightTypeArr;
        g = EnumEntriesKt.a(contentCardTextHeightTypeArr);
    }

    public static ContentCardTextHeightType valueOf(String str) {
        return (ContentCardTextHeightType) Enum.valueOf(ContentCardTextHeightType.class, str);
    }

    public static ContentCardTextHeightType[] values() {
        return (ContentCardTextHeightType[]) f.clone();
    }
}
