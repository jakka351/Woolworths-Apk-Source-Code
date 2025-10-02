package au.com.woolworths.shop.aem.components.model.pagecover;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/pagecover/PageCoverContentAlignment;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageCoverContentAlignment {
    public static final PageCoverContentAlignment d;
    public static final PageCoverContentAlignment e;
    public static final /* synthetic */ PageCoverContentAlignment[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PageCoverContentAlignment pageCoverContentAlignment = new PageCoverContentAlignment("LEFT", 0);
        d = pageCoverContentAlignment;
        PageCoverContentAlignment pageCoverContentAlignment2 = new PageCoverContentAlignment("CENTER", 1);
        e = pageCoverContentAlignment2;
        PageCoverContentAlignment[] pageCoverContentAlignmentArr = {pageCoverContentAlignment, pageCoverContentAlignment2};
        f = pageCoverContentAlignmentArr;
        g = EnumEntriesKt.a(pageCoverContentAlignmentArr);
    }

    public static PageCoverContentAlignment valueOf(String str) {
        return (PageCoverContentAlignment) Enum.valueOf(PageCoverContentAlignment.class, str);
    }

    public static PageCoverContentAlignment[] values() {
        return (PageCoverContentAlignment[]) f.clone();
    }
}
