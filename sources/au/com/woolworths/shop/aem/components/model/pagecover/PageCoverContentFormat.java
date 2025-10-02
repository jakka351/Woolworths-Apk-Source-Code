package au.com.woolworths.shop.aem.components.model.pagecover;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/pagecover/PageCoverContentFormat;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageCoverContentFormat {
    public static final PageCoverContentFormat d;
    public static final PageCoverContentFormat e;
    public static final PageCoverContentFormat f;
    public static final PageCoverContentFormat g;
    public static final /* synthetic */ PageCoverContentFormat[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        PageCoverContentFormat pageCoverContentFormat = new PageCoverContentFormat("CONTENT_BLOCK_AND_IMAGE", 0);
        d = pageCoverContentFormat;
        PageCoverContentFormat pageCoverContentFormat2 = new PageCoverContentFormat("LOCKUP_AND_IMAGE", 1);
        e = pageCoverContentFormat2;
        PageCoverContentFormat pageCoverContentFormat3 = new PageCoverContentFormat("CONTENT_BLOCK_ONLY", 2);
        f = pageCoverContentFormat3;
        PageCoverContentFormat pageCoverContentFormat4 = new PageCoverContentFormat("LOCKUP_ONLY", 3);
        g = pageCoverContentFormat4;
        PageCoverContentFormat[] pageCoverContentFormatArr = {pageCoverContentFormat, pageCoverContentFormat2, pageCoverContentFormat3, pageCoverContentFormat4};
        h = pageCoverContentFormatArr;
        i = EnumEntriesKt.a(pageCoverContentFormatArr);
    }

    public static PageCoverContentFormat valueOf(String str) {
        return (PageCoverContentFormat) Enum.valueOf(PageCoverContentFormat.class, str);
    }

    public static PageCoverContentFormat[] values() {
        return (PageCoverContentFormat[]) h.clone();
    }
}
