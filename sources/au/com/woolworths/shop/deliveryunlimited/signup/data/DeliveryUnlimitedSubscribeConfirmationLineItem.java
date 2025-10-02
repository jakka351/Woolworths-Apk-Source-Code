package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeConfirmationLineItem;", "", "", "title", AnnotatedPrivateKey.LABEL, "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeConfirmationLineItem {

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("title")
    @Nullable
    private final String title;

    public DeliveryUnlimitedSubscribeConfirmationLineItem(@Nullable String str, @NotNull String label, @Nullable String str2) {
        Intrinsics.h(label, "label");
        this.title = str;
        this.label = label;
        this.iconUrl = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeConfirmationLineItem)) {
            return false;
        }
        DeliveryUnlimitedSubscribeConfirmationLineItem deliveryUnlimitedSubscribeConfirmationLineItem = (DeliveryUnlimitedSubscribeConfirmationLineItem) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSubscribeConfirmationLineItem.title) && Intrinsics.c(this.label, deliveryUnlimitedSubscribeConfirmationLineItem.label) && Intrinsics.c(this.iconUrl, deliveryUnlimitedSubscribeConfirmationLineItem.iconUrl);
    }

    public final int hashCode() {
        String str = this.title;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.label);
        String str2 = this.iconUrl;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.label;
        return a.o(a.v("DeliveryUnlimitedSubscribeConfirmationLineItem(title=", str, ", label=", str2, ", iconUrl="), this.iconUrl, ")");
    }
}
