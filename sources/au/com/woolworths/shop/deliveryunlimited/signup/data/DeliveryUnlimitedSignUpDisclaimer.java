package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpDisclaimer;", "", "", "title", "content", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "links", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getContent", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpDisclaimer {

    @SerializedName("content")
    @NotNull
    private final String content;

    @SerializedName("links")
    @NotNull
    private final List<DeliveryUnlimitedSubscribeLink> links;

    @SerializedName("title")
    @NotNull
    private final String title;

    public DeliveryUnlimitedSignUpDisclaimer(@NotNull String title, @NotNull String content, @NotNull List<DeliveryUnlimitedSubscribeLink> links) {
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        Intrinsics.h(links, "links");
        this.title = title;
        this.content = content;
        this.links = links;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpDisclaimer)) {
            return false;
        }
        DeliveryUnlimitedSignUpDisclaimer deliveryUnlimitedSignUpDisclaimer = (DeliveryUnlimitedSignUpDisclaimer) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSignUpDisclaimer.title) && Intrinsics.c(this.content, deliveryUnlimitedSignUpDisclaimer.content) && Intrinsics.c(this.links, deliveryUnlimitedSignUpDisclaimer.links);
    }

    public final int hashCode() {
        return this.links.hashCode() + b.c(this.title.hashCode() * 31, 31, this.content);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.content;
        return a.t(YU.a.v("DeliveryUnlimitedSignUpDisclaimer(title=", str, ", content=", str2, ", links="), this.links, ")");
    }
}
