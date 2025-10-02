package au.com.woolworths.shop.specials;

import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.shop.graphql.type.SpecialsHomeSaleFinderStore;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecialsHomeRepositoryKt {
    public static final Optional a(CatalogueStoreInfo catalogueStoreInfo) {
        return catalogueStoreInfo != null ? new Optional.Present(new SpecialsHomeSaleFinderStore(catalogueStoreInfo.getStoreId(), new Optional.Present(catalogueStoreInfo.getDisplayName()), new Optional.Present(catalogueStoreInfo.getPostCode()))) : Optional.Absent.f13523a;
    }
}
