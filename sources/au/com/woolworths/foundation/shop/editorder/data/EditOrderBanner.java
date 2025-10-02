package au.com.woolworths.foundation.shop.editorder.data;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderBanner;", "", "", "title", "message", "buttonTitle", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;", "confirmation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "a", "Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;", "b", "()Lau/com/woolworths/foundation/shop/editorder/data/EditOrderConfirmation;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditOrderBanner {

    @SerializedName("buttonTitle")
    @NotNull
    private final String buttonTitle;

    @SerializedName("confirmation")
    @NotNull
    private final EditOrderConfirmation confirmation;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("title")
    @NotNull
    private final String title;

    public EditOrderBanner(@NotNull String title, @NotNull String message, @NotNull String buttonTitle, @NotNull EditOrderConfirmation confirmation) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(buttonTitle, "buttonTitle");
        Intrinsics.h(confirmation, "confirmation");
        this.title = title;
        this.message = message;
        this.buttonTitle = buttonTitle;
        this.confirmation = confirmation;
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: b, reason: from getter */
    public final EditOrderConfirmation getConfirmation() {
        return this.confirmation;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderBanner)) {
            return false;
        }
        EditOrderBanner editOrderBanner = (EditOrderBanner) obj;
        return Intrinsics.c(this.title, editOrderBanner.title) && Intrinsics.c(this.message, editOrderBanner.message) && Intrinsics.c(this.buttonTitle, editOrderBanner.buttonTitle) && Intrinsics.c(this.confirmation, editOrderBanner.confirmation);
    }

    public final int hashCode() {
        return this.confirmation.hashCode() + b.c(b.c(this.title.hashCode() * 31, 31, this.message), 31, this.buttonTitle);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        String str3 = this.buttonTitle;
        EditOrderConfirmation editOrderConfirmation = this.confirmation;
        StringBuilder sbV = a.v("EditOrderBanner(title=", str, ", message=", str2, ", buttonTitle=");
        sbV.append(str3);
        sbV.append(", confirmation=");
        sbV.append(editOrderConfirmation);
        sbV.append(")");
        return sbV.toString();
    }
}
