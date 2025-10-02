package au.com.woolworths.shop.lists.data.model;

import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/ShoppingListItem;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "listId", "getListId", "isChecked", "", "()Z", "createdAt", "", "getCreatedAt", "()J", "updatedAt", "getUpdatedAt", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShoppingListItem extends Parcelable {
    long getCreatedAt();

    @NotNull
    String getId();

    @NotNull
    String getListId();

    long getUpdatedAt();

    boolean isChecked();
}
