package au.com.woolworths.feature.shop.catalogue.browse.contents.model;

import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import com.woolworths.shop.catalogue.CatalogueLandingQuery;
import com.woolworths.shop.catalogue.fragment.CatalogueActionableCard;
import com.woolworths.shop.catalogue.fragment.CatalogueLandingCard;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueLandingQueryCatalogueLandingExtKt {
    public static final CatalogueContents a(CatalogueLandingQuery.CatalogueLanding catalogueLanding) {
        Object actionableCard;
        Intrinsics.h(catalogueLanding, "<this>");
        ArrayList<CatalogueLandingQuery.Item> arrayList = catalogueLanding.f21665a;
        ArrayList arrayList2 = new ArrayList();
        for (CatalogueLandingQuery.Item item : arrayList) {
            CatalogueLandingQuery.OnCatalogueLandingHeader onCatalogueLandingHeader = item.b;
            if (onCatalogueLandingHeader != null) {
                actionableCard = new Header(onCatalogueLandingHeader.f21670a);
            } else {
                CatalogueLandingQuery.OnCatalogueLandingCategoryCard onCatalogueLandingCategoryCard = item.c;
                if (onCatalogueLandingCategoryCard != null) {
                    String str = onCatalogueLandingCategoryCard.b;
                    CatalogueLandingCard catalogueLandingCard = onCatalogueLandingCategoryCard.c;
                    actionableCard = new CategoryCard(str, catalogueLandingCard.f21781a, catalogueLandingCard.b);
                } else {
                    CatalogueLandingQuery.OnActionableCard onActionableCard = item.d;
                    if (onActionableCard != null) {
                        CatalogueActionableCard catalogueActionableCard = onActionableCard.b;
                        String str2 = catalogueActionableCard.f21747a;
                        String str3 = catalogueActionableCard.b;
                        int iOrdinal = catalogueActionableCard.c.ordinal();
                        actionableCard = new ActionableCard(str2, str3, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? DefaultCardHeight.SMALL : DefaultCardHeight.LARGE : DefaultCardHeight.MEDIUM : DefaultCardHeight.SMALL, catalogueActionableCard.d, null, null, null);
                    } else {
                        actionableCard = null;
                    }
                }
            }
            if (actionableCard != null) {
                arrayList2.add(actionableCard);
            }
        }
        return new CatalogueContents(arrayList2);
    }
}
