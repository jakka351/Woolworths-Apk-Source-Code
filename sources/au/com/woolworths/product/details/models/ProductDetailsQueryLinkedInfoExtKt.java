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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/HealthierLinkedInfo;", "Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryLinkedInfoExtKt {
    @NotNull
    public static final HealthierLinkedInfo toUiModel(@NotNull ProductDetailsQuery.LinkedInfo linkedInfo) {
        Intrinsics.h(linkedInfo, "<this>");
        String buttonLabel = linkedInfo.getButtonLabel();
        String title = linkedInfo.getTitle();
        String content = linkedInfo.getContent();
        List<ProductDetailsQuery.Link> links = linkedInfo.getLinks();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(links, 10));
        Iterator<T> it = links.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductDetailsQueryLinkExtKt.toUiModel((ProductDetailsQuery.Link) it.next()));
        }
        return new HealthierLinkedInfo(buttonLabel, title, content, arrayList, linkedInfo.getMarkdownContent());
    }
}
