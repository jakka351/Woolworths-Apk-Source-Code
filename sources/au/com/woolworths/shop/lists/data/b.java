package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListItemEntity e;

    public /* synthetic */ b(ProductListItemEntity productListItemEntity, int i) {
        this.d = i;
        this.e = productListItemEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return this.e;
            default:
                ProductListItemEntity productListItemEntity = (ProductListItemEntity) obj;
                ProductListItemEntity productListItemEntity2 = this.e;
                return productListItemEntity == null ? productListItemEntity2.copy((3968 & 1) != 0 ? productListItemEntity2.id : null, (3968 & 2) != 0 ? productListItemEntity2.listId : null, (3968 & 4) != 0 ? productListItemEntity2.localCreatedAt : ListsDataUtilsKt.b(), (3968 & 8) != 0 ? productListItemEntity2.localUpdatedAt : 0L, (3968 & 16) != 0 ? productListItemEntity2.remoteId : null, (3968 & 32) != 0 ? productListItemEntity2.remoteTimestamp : 0L, (3968 & 64) != 0 ? productListItemEntity2.isLocalEdited : false, (3968 & 128) != 0 ? productListItemEntity2.isLocalDeleted : false, (3968 & 256) != 0 ? productListItemEntity2.isChecked : false, (3968 & 512) != 0 ? productListItemEntity2.productId : null, (3968 & 1024) != 0 ? productListItemEntity2.quantity : BitmapDescriptorFactory.HUE_RED, (3968 & 2048) != 0 ? productListItemEntity2.productFoundInResponse : false) : productListItemEntity2.copy((3968 & 1) != 0 ? productListItemEntity2.id : productListItemEntity.getId(), (3968 & 2) != 0 ? productListItemEntity2.listId : null, (3968 & 4) != 0 ? productListItemEntity2.localCreatedAt : productListItemEntity.getLocalCreatedAt(), (3968 & 8) != 0 ? productListItemEntity2.localUpdatedAt : 0L, (3968 & 16) != 0 ? productListItemEntity2.remoteId : null, (3968 & 32) != 0 ? productListItemEntity2.remoteTimestamp : 0L, (3968 & 64) != 0 ? productListItemEntity2.isLocalEdited : false, (3968 & 128) != 0 ? productListItemEntity2.isLocalDeleted : false, (3968 & 256) != 0 ? productListItemEntity2.isChecked : false, (3968 & 512) != 0 ? productListItemEntity2.productId : null, (3968 & 1024) != 0 ? productListItemEntity2.quantity : BitmapDescriptorFactory.HUE_RED, (3968 & 2048) != 0 ? productListItemEntity2.productFoundInResponse : false);
        }
    }
}
