package au.com.woolworths.base.shopapp.models;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/base/shopapp/models/ShoppingCartItem;", "", "articleId", "", "quantity", "", "<init>", "(Ljava/lang/String;F)V", "getArticleId", "()Ljava/lang/String;", "getQuantity", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingCartItem {

    @NotNull
    private final String articleId;
    private final float quantity;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShoppingCartItem(@NotNull String articleId) {
        this(articleId, BitmapDescriptorFactory.HUE_RED, 2, null);
        Intrinsics.h(articleId, "articleId");
    }

    public static /* synthetic */ ShoppingCartItem copy$default(ShoppingCartItem shoppingCartItem, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartItem.articleId;
        }
        if ((i & 2) != 0) {
            f = shoppingCartItem.quantity;
        }
        return shoppingCartItem.copy(str, f);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final ShoppingCartItem copy(@NotNull String articleId, float quantity) {
        Intrinsics.h(articleId, "articleId");
        return new ShoppingCartItem(articleId, quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingCartItem)) {
            return false;
        }
        ShoppingCartItem shoppingCartItem = (ShoppingCartItem) other;
        return Intrinsics.c(this.articleId, shoppingCartItem.articleId) && Float.compare(this.quantity, shoppingCartItem.quantity) == 0;
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    public final float getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return Float.hashCode(this.quantity) + (this.articleId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ShoppingCartItem(articleId=" + this.articleId + ", quantity=" + this.quantity + ")";
    }

    @JvmOverloads
    public ShoppingCartItem(@NotNull String articleId, float f) {
        Intrinsics.h(articleId, "articleId");
        this.articleId = articleId;
        this.quantity = f;
    }

    public /* synthetic */ ShoppingCartItem(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
    }
}
