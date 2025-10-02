package au.com.woolworths.shop.aem.components.model.editorialbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.footer.ContentFooterStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/editorialbanner/EditorialBannerFooter;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditorialBannerFooter {

    /* renamed from: a, reason: collision with root package name */
    public final ContentFooterStyle f10156a;
    public final String b;
    public final ImageWithAltText c;

    public EditorialBannerFooter(ContentFooterStyle contentFooterStyle, String str, ImageWithAltText imageWithAltText) {
        this.f10156a = contentFooterStyle;
        this.b = str;
        this.c = imageWithAltText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorialBannerFooter)) {
            return false;
        }
        EditorialBannerFooter editorialBannerFooter = (EditorialBannerFooter) obj;
        return this.f10156a == editorialBannerFooter.f10156a && Intrinsics.c(this.b, editorialBannerFooter.b) && Intrinsics.c(this.c, editorialBannerFooter.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10156a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ImageWithAltText imageWithAltText = this.c;
        return iHashCode2 + (imageWithAltText != null ? imageWithAltText.hashCode() : 0);
    }

    public final String toString() {
        return "EditorialBannerFooter(style=" + this.f10156a + ", text=" + this.b + ", logo=" + this.c + ")";
    }
}
