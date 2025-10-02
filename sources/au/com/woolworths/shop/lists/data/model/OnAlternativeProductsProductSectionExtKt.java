package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.product.models.ProductCardExtKt;
import au.com.woolworths.shop.lists.data.remote.AlternativeProductsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductSection;", "Lau/com/woolworths/shop/lists/data/remote/AlternativeProductsQuery$OnAlternativeProductsProductSection;", "shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OnAlternativeProductsProductSectionExtKt {
    @NotNull
    public static final AlternativeProductsProductSection toUiModel(@NotNull AlternativeProductsQuery.OnAlternativeProductsProductSection onAlternativeProductsProductSection) {
        Intrinsics.h(onAlternativeProductsProductSection, "<this>");
        List<AlternativeProductsQuery.Product> products = onAlternativeProductsProductSection.getProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(new AlternativeProductCard(ProductCardExtKt.toUiModel(((AlternativeProductsQuery.Product) it.next()).getProductCard()), onAlternativeProductsProductSection.getSubstitutionSource()));
        }
        AlternativeProductsQuery.SectionHeader sectionHeader = onAlternativeProductsProductSection.getSectionHeader();
        return new AlternativeProductsProductSection(arrayList, sectionHeader != null ? AlternativeProductsQuerySectionHeaderExtKt.toUiModel(sectionHeader) : null);
    }
}
