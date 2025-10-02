package au.com.woolworths.feature.shop.contentpage.data;

import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import com.woolworths.feature.shop.contentpage.fragment.ContentPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPageOnSearchNavCardExtKt {
    public static final SearchNavCardData a(ContentPage.OnSearchNavCard onSearchNavCard) {
        Intrinsics.h(onSearchNavCard, "<this>");
        String str = onSearchNavCard.f19619a;
        ContentPage.SearchNavCardAction searchNavCardAction = onSearchNavCard.b;
        Intrinsics.h(searchNavCardAction, "<this>");
        return new SearchNavCardData(str, ContentPageMapperUtilKt.a(searchNavCardAction.b));
    }
}
