package au.com.woolworths.shop.aem.components.model.editorialbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialCarouselItem;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditorialCarouselItem {

    /* renamed from: a, reason: collision with root package name */
    public final EditorialBannerData f10158a;

    public EditorialCarouselItem(EditorialBannerData editorialBannerData) {
        this.f10158a = editorialBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditorialCarouselItem) && Intrinsics.c(this.f10158a, ((EditorialCarouselItem) obj).f10158a);
    }

    public final int hashCode() {
        EditorialBannerData editorialBannerData = this.f10158a;
        if (editorialBannerData == null) {
            return 0;
        }
        return editorialBannerData.hashCode();
    }

    public final String toString() {
        return "EditorialCarouselItem(editorialBannerData=" + this.f10158a + ")";
    }
}
