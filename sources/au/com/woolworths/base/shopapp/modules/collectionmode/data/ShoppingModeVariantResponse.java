package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantResponse;", "", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantStateData;", "state", "<init>", "(Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantStateData;)V", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantStateData;", "getState", "()Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantStateData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeVariantResponse {

    @SerializedName("state")
    @NotNull
    private final ShoppingModeVariantStateData state;

    public ShoppingModeVariantResponse(@NotNull ShoppingModeVariantStateData state) {
        Intrinsics.h(state, "state");
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingModeVariantResponse) && this.state == ((ShoppingModeVariantResponse) obj).state;
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    public final String toString() {
        return "ShoppingModeVariantResponse(state=" + this.state + ")";
    }
}
