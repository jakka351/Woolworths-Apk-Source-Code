package au.com.woolworths.foundation.shop.editorder.data;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/data/EditOrderMessage;", "", "", "title", "message", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EditOrderMessage {

    @SerializedName("buttonTitle")
    @NotNull
    private final String buttonTitle;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("title")
    @NotNull
    private final String title;

    public EditOrderMessage(@NotNull String title, @NotNull String message, @NotNull String buttonTitle) {
        Intrinsics.h(title, "title");
        Intrinsics.h(message, "message");
        Intrinsics.h(buttonTitle, "buttonTitle");
        this.title = title;
        this.message = message;
        this.buttonTitle = buttonTitle;
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditOrderMessage)) {
            return false;
        }
        EditOrderMessage editOrderMessage = (EditOrderMessage) obj;
        return Intrinsics.c(this.title, editOrderMessage.title) && Intrinsics.c(this.message, editOrderMessage.message) && Intrinsics.c(this.buttonTitle, editOrderMessage.buttonTitle);
    }

    public final int hashCode() {
        return this.buttonTitle.hashCode() + b.c(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        return a.o(a.v("EditOrderMessage(title=", str, ", message=", str2, ", buttonTitle="), this.buttonTitle, ")");
    }
}
