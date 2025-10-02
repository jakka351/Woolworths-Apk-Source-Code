package au.com.woolworths.shop.lists.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/lists/network/ImageToTextResponse;", "", "Lau/com/woolworths/shop/lists/network/ErrorResponse;", "error", "", "", "productList", "<init>", "(Lau/com/woolworths/shop/lists/network/ErrorResponse;Ljava/util/List;)V", "Lau/com/woolworths/shop/lists/network/ErrorResponse;", "getError", "()Lau/com/woolworths/shop/lists/network/ErrorResponse;", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageToTextResponse {

    @SerializedName("error")
    @Nullable
    private final ErrorResponse error;

    @SerializedName("productList")
    @Nullable
    private final List<String> productList;

    public ImageToTextResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageToTextResponse)) {
            return false;
        }
        ImageToTextResponse imageToTextResponse = (ImageToTextResponse) obj;
        return Intrinsics.c(this.error, imageToTextResponse.error) && Intrinsics.c(this.productList, imageToTextResponse.productList);
    }

    public final int hashCode() {
        ErrorResponse errorResponse = this.error;
        int iHashCode = (errorResponse == null ? 0 : errorResponse.hashCode()) * 31;
        List<String> list = this.productList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ImageToTextResponse(error=" + this.error + ", productList=" + this.productList + ")";
    }

    public ImageToTextResponse(@Nullable ErrorResponse errorResponse, @Nullable List<String> list) {
        this.error = errorResponse;
        this.productList = list;
    }

    public /* synthetic */ ImageToTextResponse(ErrorResponse errorResponse, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : errorResponse, (i & 2) != 0 ? EmptyList.d : list);
    }
}
