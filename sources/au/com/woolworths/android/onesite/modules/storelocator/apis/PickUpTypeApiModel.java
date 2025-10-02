package au.com.woolworths.android.onesite.modules.storelocator.apis;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpTypeApiModel;", "", "", "addressId", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpOptionApiModel;", "type", AnnotatedPrivateKey.LABEL, TextBundle.TEXT_ENTRY, "shoppingModeId", "<init>", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpOptionApiModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpOptionApiModel;", "e", "()Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpOptionApiModel;", "b", "d", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PickUpTypeApiModel {

    @SerializedName("AddressId")
    @NotNull
    private final String addressId;

    @SerializedName("Label")
    @NotNull
    private final String label;

    @SerializedName("ShoppingModeId")
    @NotNull
    private final String shoppingModeId;

    @SerializedName("Text")
    @NotNull
    private final String text;

    @SerializedName("Type")
    @NotNull
    private final PickUpOptionApiModel type;

    public PickUpTypeApiModel(@NotNull String addressId, @NotNull PickUpOptionApiModel type, @NotNull String label, @NotNull String text, @NotNull String shoppingModeId) {
        Intrinsics.h(addressId, "addressId");
        Intrinsics.h(type, "type");
        Intrinsics.h(label, "label");
        Intrinsics.h(text, "text");
        Intrinsics.h(shoppingModeId, "shoppingModeId");
        this.addressId = addressId;
        this.type = type;
        this.label = label;
        this.text = text;
        this.shoppingModeId = shoppingModeId;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: c, reason: from getter */
    public final String getShoppingModeId() {
        return this.shoppingModeId;
    }

    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: e, reason: from getter */
    public final PickUpOptionApiModel getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpTypeApiModel)) {
            return false;
        }
        PickUpTypeApiModel pickUpTypeApiModel = (PickUpTypeApiModel) obj;
        return Intrinsics.c(this.addressId, pickUpTypeApiModel.addressId) && this.type == pickUpTypeApiModel.type && Intrinsics.c(this.label, pickUpTypeApiModel.label) && Intrinsics.c(this.text, pickUpTypeApiModel.text) && Intrinsics.c(this.shoppingModeId, pickUpTypeApiModel.shoppingModeId);
    }

    public final int hashCode() {
        return this.shoppingModeId.hashCode() + b.c(b.c((this.type.hashCode() + (this.addressId.hashCode() * 31)) * 31, 31, this.label), 31, this.text);
    }

    public final String toString() {
        String str = this.addressId;
        PickUpOptionApiModel pickUpOptionApiModel = this.type;
        String str2 = this.label;
        String str3 = this.text;
        String str4 = this.shoppingModeId;
        StringBuilder sb = new StringBuilder("PickUpTypeApiModel(addressId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(pickUpOptionApiModel);
        sb.append(", label=");
        a.B(sb, str2, ", text=", str3, ", shoppingModeId=");
        return YU.a.o(sb, str4, ")");
    }
}
