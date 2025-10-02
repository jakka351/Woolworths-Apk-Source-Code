package au.com.woolworths.shop.aem.components.model.footer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/footer/ContentFooterStyle;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentFooterStyle {
    public static final ContentFooterStyle d;
    public static final ContentFooterStyle e;
    public static final /* synthetic */ ContentFooterStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ContentFooterStyle contentFooterStyle = new ContentFooterStyle("BYLINE", 0);
        d = contentFooterStyle;
        ContentFooterStyle contentFooterStyle2 = new ContentFooterStyle("TANDC", 1);
        e = contentFooterStyle2;
        ContentFooterStyle[] contentFooterStyleArr = {contentFooterStyle, contentFooterStyle2};
        f = contentFooterStyleArr;
        g = EnumEntriesKt.a(contentFooterStyleArr);
    }

    public static ContentFooterStyle valueOf(String str) {
        return (ContentFooterStyle) Enum.valueOf(ContentFooterStyle.class, str);
    }

    public static ContentFooterStyle[] values() {
        return (ContentFooterStyle[]) f.clone();
    }
}
