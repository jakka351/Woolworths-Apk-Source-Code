package au.com.woolworths.shop.aem.components.model.editorialbanner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerImageFormat;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditorialBannerImageFormat {
    public static final EditorialBannerImageFormat d;
    public static final EditorialBannerImageFormat e;
    public static final EditorialBannerImageFormat f;
    public static final EditorialBannerImageFormat g;
    public static final /* synthetic */ EditorialBannerImageFormat[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        EditorialBannerImageFormat editorialBannerImageFormat = new EditorialBannerImageFormat("FULL_WIDTH", 0);
        d = editorialBannerImageFormat;
        EditorialBannerImageFormat editorialBannerImageFormat2 = new EditorialBannerImageFormat("HALF_WIDTH", 1);
        e = editorialBannerImageFormat2;
        EditorialBannerImageFormat editorialBannerImageFormat3 = new EditorialBannerImageFormat("PORTRAIT", 2);
        f = editorialBannerImageFormat3;
        EditorialBannerImageFormat editorialBannerImageFormat4 = new EditorialBannerImageFormat("NARROW", 3);
        g = editorialBannerImageFormat4;
        EditorialBannerImageFormat[] editorialBannerImageFormatArr = {editorialBannerImageFormat, editorialBannerImageFormat2, editorialBannerImageFormat3, editorialBannerImageFormat4};
        h = editorialBannerImageFormatArr;
        i = EnumEntriesKt.a(editorialBannerImageFormatArr);
    }

    public static EditorialBannerImageFormat valueOf(String str) {
        return (EditorialBannerImageFormat) Enum.valueOf(EditorialBannerImageFormat.class, str);
    }

    public static EditorialBannerImageFormat[] values() {
        return (EditorialBannerImageFormat[]) h.clone();
    }
}
