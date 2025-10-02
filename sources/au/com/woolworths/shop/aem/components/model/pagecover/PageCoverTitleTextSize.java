package au.com.woolworths.shop.aem.components.model.pagecover;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/pagecover/PageCoverTitleTextSize;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageCoverTitleTextSize {
    public static final PageCoverTitleTextSize d;
    public static final PageCoverTitleTextSize e;
    public static final /* synthetic */ PageCoverTitleTextSize[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PageCoverTitleTextSize pageCoverTitleTextSize = new PageCoverTitleTextSize("LARGE", 0);
        d = pageCoverTitleTextSize;
        PageCoverTitleTextSize pageCoverTitleTextSize2 = new PageCoverTitleTextSize("SMALL", 1);
        e = pageCoverTitleTextSize2;
        PageCoverTitleTextSize[] pageCoverTitleTextSizeArr = {pageCoverTitleTextSize, pageCoverTitleTextSize2};
        f = pageCoverTitleTextSizeArr;
        g = EnumEntriesKt.a(pageCoverTitleTextSizeArr);
    }

    public static PageCoverTitleTextSize valueOf(String str) {
        return (PageCoverTitleTextSize) Enum.valueOf(PageCoverTitleTextSize.class, str);
    }

    public static PageCoverTitleTextSize[] values() {
        return (PageCoverTitleTextSize[]) f.clone();
    }
}
