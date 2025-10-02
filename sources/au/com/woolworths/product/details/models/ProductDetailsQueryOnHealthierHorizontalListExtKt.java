package au.com.woolworths.product.details.models;

import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/HealthierHorizontalListData;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnHealthierHorizontalListExtKt {
    @NotNull
    public static final HealthierHorizontalListData toUiModel(@NotNull ProductDetailsQuery.OnHealthierHorizontalList onHealthierHorizontalList) {
        Intrinsics.h(onHealthierHorizontalList, "<this>");
        List<ProductDetailsQuery.HealthierOption> healthierOptions = onHealthierHorizontalList.getHealthierOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(healthierOptions, 10));
        Iterator<T> it = healthierOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductDetailsQueryHealthierOptionExtKt.toUiModel((ProductDetailsQuery.HealthierOption) it.next()));
        }
        String title = onHealthierHorizontalList.getTitle();
        String subtitle = onHealthierHorizontalList.getSubtitle();
        ProductDetailsQuery.LinkedInfo linkedInfo = onHealthierHorizontalList.getLinkedInfo();
        return new HealthierHorizontalListData(arrayList, title, subtitle, linkedInfo != null ? ProductDetailsQueryLinkedInfoExtKt.toUiModel(linkedInfo) : null);
    }
}
