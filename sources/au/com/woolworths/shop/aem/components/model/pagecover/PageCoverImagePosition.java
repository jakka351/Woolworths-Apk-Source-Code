package au.com.woolworths.shop.aem.components.model.pagecover;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/pagecover/PageCoverImagePosition;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageCoverImagePosition {
    public static final PageCoverImagePosition d;
    public static final PageCoverImagePosition e;
    public static final /* synthetic */ PageCoverImagePosition[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PageCoverImagePosition pageCoverImagePosition = new PageCoverImagePosition("TOP", 0);
        d = pageCoverImagePosition;
        PageCoverImagePosition pageCoverImagePosition2 = new PageCoverImagePosition("BOTTOM", 1);
        e = pageCoverImagePosition2;
        PageCoverImagePosition[] pageCoverImagePositionArr = {pageCoverImagePosition, pageCoverImagePosition2};
        f = pageCoverImagePositionArr;
        g = EnumEntriesKt.a(pageCoverImagePositionArr);
    }

    public static PageCoverImagePosition valueOf(String str) {
        return (PageCoverImagePosition) Enum.valueOf(PageCoverImagePosition.class, str);
    }

    public static PageCoverImagePosition[] values() {
        return (PageCoverImagePosition[]) f.clone();
    }
}
