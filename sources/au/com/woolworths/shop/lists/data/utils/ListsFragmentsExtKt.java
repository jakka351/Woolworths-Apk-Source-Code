package au.com.woolworths.shop.lists.data.utils;

import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment;
import au.com.woolworths.shop.lists.data.remote.fragment.TextItemFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsFragmentsExtKt {
    public static final ProductListItemEntity a(String str, ProductItemFragment productItemFragment) {
        Intrinsics.h(productItemFragment, "<this>");
        String id = productItemFragment.getId();
        ProductId productIdCreate = ProductId.INSTANCE.create(productItemFragment.getProductId());
        float quantity = (float) productItemFragment.getQuantity();
        return new ProductListItemEntity(null, str, 0L, (long) productItemFragment.getTimestamp(), id, (long) productItemFragment.getTimestamp(), false, false, productItemFragment.getChecked(), productIdCreate, quantity, false, 2245, null);
    }

    public static final TextListItemEntity b(String str, TextItemFragment textItemFragment) {
        Intrinsics.h(textItemFragment, "<this>");
        String referenceId = textItemFragment.getReferenceId();
        if (referenceId == null) {
            referenceId = "";
        }
        String id = textItemFragment.getId();
        boolean checked = textItemFragment.getChecked();
        String text = textItemFragment.getText();
        return new TextListItemEntity(referenceId, str, 0L, (long) textItemFragment.getTimestamp(), id, (long) textItemFragment.getTimestamp(), false, false, checked, text, 196, null);
    }
}
