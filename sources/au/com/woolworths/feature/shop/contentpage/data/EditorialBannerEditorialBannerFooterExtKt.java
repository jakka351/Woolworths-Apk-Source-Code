package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerFooter;
import au.com.woolworths.shop.aem.components.model.footer.ContentFooterStyle;
import com.woolworths.feature.shop.contentpage.fragment.EditorialBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditorialBannerEditorialBannerFooterExtKt {
    public static final EditorialBannerFooter a(EditorialBanner.EditorialBannerFooter editorialBannerFooter) {
        Intrinsics.h(editorialBannerFooter, "<this>");
        int iOrdinal = editorialBannerFooter.f19759a.ordinal();
        ContentFooterStyle contentFooterStyle = iOrdinal != 0 ? iOrdinal != 1 ? ContentFooterStyle.e : ContentFooterStyle.e : ContentFooterStyle.d;
        String str = editorialBannerFooter.b;
        EditorialBanner.Logo logo = editorialBannerFooter.c;
        return new EditorialBannerFooter(contentFooterStyle, str, logo != null ? new ImageWithAltText(logo.f19761a, logo.b) : null);
    }
}
