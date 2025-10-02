package au.com.woolworths.shop.aem.components.model.contentcard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/contentcard/ContentCardSize;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardSize {
    public static final ContentCardSize d;
    public static final ContentCardSize e;
    public static final /* synthetic */ ContentCardSize[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ContentCardSize contentCardSize = new ContentCardSize("SMALL", 0);
        d = contentCardSize;
        ContentCardSize contentCardSize2 = new ContentCardSize("LARGE", 1);
        e = contentCardSize2;
        ContentCardSize[] contentCardSizeArr = {contentCardSize, contentCardSize2};
        f = contentCardSizeArr;
        g = EnumEntriesKt.a(contentCardSizeArr);
    }

    public static ContentCardSize valueOf(String str) {
        return (ContentCardSize) Enum.valueOf(ContentCardSize.class, str);
    }

    public static ContentCardSize[] values() {
        return (ContentCardSize[]) f.clone();
    }
}
