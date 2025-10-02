package au.com.woolworths.shop.aem.components.model.editorialbanner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerTextPosition;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditorialBannerTextPosition {
    public static final EditorialBannerTextPosition d;
    public static final EditorialBannerTextPosition e;
    public static final /* synthetic */ EditorialBannerTextPosition[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        EditorialBannerTextPosition editorialBannerTextPosition = new EditorialBannerTextPosition("LEFT", 0);
        d = editorialBannerTextPosition;
        EditorialBannerTextPosition editorialBannerTextPosition2 = new EditorialBannerTextPosition("RIGHT", 1);
        e = editorialBannerTextPosition2;
        EditorialBannerTextPosition[] editorialBannerTextPositionArr = {editorialBannerTextPosition, editorialBannerTextPosition2};
        f = editorialBannerTextPositionArr;
        g = EnumEntriesKt.a(editorialBannerTextPositionArr);
    }

    public static EditorialBannerTextPosition valueOf(String str) {
        return (EditorialBannerTextPosition) Enum.valueOf(EditorialBannerTextPosition.class, str);
    }

    public static EditorialBannerTextPosition[] values() {
        return (EditorialBannerTextPosition[]) f.clone();
    }
}
