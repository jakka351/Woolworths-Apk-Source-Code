package au.com.woolworths.feature.shop.catalogue.productlist.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueProductDetailsListExtKt {
    public static final List a(CatalogueProductDetailsList catalogueProductDetailsList) {
        List<CatalogueProductDetailsAdditionalItems> additionalItems = catalogueProductDetailsList.getAdditionalItems();
        if (additionalItems == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : additionalItems) {
            if (!StringsKt.D(((CatalogueProductDetailsAdditionalItems) obj).getSkuCode())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
