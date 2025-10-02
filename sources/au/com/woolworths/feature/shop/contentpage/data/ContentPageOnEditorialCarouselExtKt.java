package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerFooter;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerImageFormat;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerTextPosition;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialCarousel;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialCarouselItem;
import au.com.woolworths.shop.graphql.type.BannerTextPosition;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import com.woolworths.feature.shop.contentpage.fragment.EditorialBanner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageOnEditorialCarouselExtKt {
    public static final EditorialCarousel a(ContentPage.OnEditorialCarousel onEditorialCarousel) {
        EditorialBannerTextPosition editorialBannerTextPosition;
        Intrinsics.h(onEditorialCarousel, "<this>");
        ArrayList<ContentPage.EditorialCarouselItem> arrayList = onEditorialCarousel.f19594a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (ContentPage.EditorialCarouselItem editorialCarouselItem : arrayList) {
            Intrinsics.h(editorialCarouselItem, "<this>");
            ContentPage.OnEditorialBanner onEditorialBanner = editorialCarouselItem.b;
            EditorialBannerData editorialBannerData = null;
            if (onEditorialBanner != null) {
                EditorialBanner editorialBanner = onEditorialBanner.b;
                String str = editorialBanner.f19756a;
                String str2 = editorialBanner.b;
                EditorialBanner.EditorialBannerImage editorialBannerImage = editorialBanner.c;
                ImageWithAltText imageWithAltText = editorialBannerImage != null ? new ImageWithAltText(editorialBannerImage.f19760a, editorialBannerImage.b) : null;
                EditorialBannerImageFormat editorialBannerImageFormatA = BannerImageFormatExtKt.a(editorialBanner.h);
                BannerTextPosition bannerTextPosition = editorialBanner.i;
                if (bannerTextPosition != null) {
                    int iOrdinal = bannerTextPosition.ordinal();
                    editorialBannerTextPosition = (iOrdinal == 0 || iOrdinal != 1) ? EditorialBannerTextPosition.d : EditorialBannerTextPosition.e;
                } else {
                    editorialBannerTextPosition = null;
                }
                String str3 = editorialBanner.d;
                String str4 = editorialBanner.e;
                EditorialBanner.EditorialBannerFooter editorialBannerFooter = editorialBanner.g;
                EditorialBannerFooter editorialBannerFooterA = editorialBannerFooter != null ? EditorialBannerEditorialBannerFooterExtKt.a(editorialBannerFooter) : null;
                EditorialBanner.EditorialBannerAction editorialBannerAction = editorialBanner.f;
                ActionData actionDataA = editorialBannerAction != null ? ContentPageMapperUtilKt.a(editorialBannerAction.b) : null;
                EditorialBanner.EditorialBannerAnalytics editorialBannerAnalytics = editorialBanner.j;
                editorialBannerData = new EditorialBannerData(str, str2, imageWithAltText, editorialBannerImageFormatA, editorialBannerTextPosition, str3, str4, editorialBannerFooterA, actionDataA, editorialBannerAnalytics != null ? ContentPageMapperUtilKt.b(editorialBannerAnalytics.b) : null);
            }
            arrayList2.add(new EditorialCarouselItem(editorialBannerData));
        }
        return new EditorialCarousel(arrayList2);
    }
}
