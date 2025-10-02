package au.com.woolworths.shop.aem.components.model.morecard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/morecard/MoreCardStyle;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoreCardStyle {
    public static final MoreCardStyle d;
    public static final MoreCardStyle e;
    public static final /* synthetic */ MoreCardStyle[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        MoreCardStyle moreCardStyle = new MoreCardStyle("ROUNDED_CIRCLE", 0);
        d = moreCardStyle;
        MoreCardStyle moreCardStyle2 = new MoreCardStyle("ROUNDED_CORNER", 1);
        e = moreCardStyle2;
        MoreCardStyle[] moreCardStyleArr = {moreCardStyle, moreCardStyle2};
        f = moreCardStyleArr;
        g = EnumEntriesKt.a(moreCardStyleArr);
    }

    public static MoreCardStyle valueOf(String str) {
        return (MoreCardStyle) Enum.valueOf(MoreCardStyle.class, str);
    }

    public static MoreCardStyle[] values() {
        return (MoreCardStyle[]) f.clone();
    }
}
