package au.com.woolworths.shop.lists.data.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ShoppingListItemEntity;", "Lau/com/woolworths/shop/lists/data/entity/SyncableEntity;", "listId", "", "getListId", "()Ljava/lang/String;", "localCreatedAt", "", "getLocalCreatedAt", "()J", "localUpdatedAt", "getLocalUpdatedAt", "isChecked", "", "()Z", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShoppingListItemEntity extends SyncableEntity {
    @NotNull
    String getListId();

    long getLocalCreatedAt();

    long getLocalUpdatedAt();

    boolean isChecked();
}
