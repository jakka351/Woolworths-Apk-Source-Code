package au.com.woolworths.shop.aem.components.model.editorialbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialCarousel;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditorialCarousel implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10157a;

    public EditorialCarousel(ArrayList arrayList) {
        this.f10157a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditorialCarousel) && this.f10157a.equals(((EditorialCarousel) obj).f10157a);
    }

    public final int hashCode() {
        return this.f10157a.hashCode();
    }

    public final String toString() {
        return a.k("EditorialCarousel(editorialCarouselItems=", ")", this.f10157a);
    }
}
