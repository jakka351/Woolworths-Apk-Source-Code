package au.com.woolworths.shop.lists.network;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/network/ImageToTextRequest;", "", "", "imageBase64", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getImageBase64", "()Ljava/lang/String;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageToTextRequest {

    @SerializedName("imageBase64")
    @NotNull
    private final String imageBase64;

    public ImageToTextRequest(@NotNull String imageBase64) {
        Intrinsics.h(imageBase64, "imageBase64");
        this.imageBase64 = imageBase64;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageToTextRequest) && Intrinsics.c(this.imageBase64, ((ImageToTextRequest) obj).imageBase64);
    }

    public final int hashCode() {
        return this.imageBase64.hashCode();
    }

    public final String toString() {
        return a.h("ImageToTextRequest(imageBase64=", this.imageBase64, ")");
    }
}
