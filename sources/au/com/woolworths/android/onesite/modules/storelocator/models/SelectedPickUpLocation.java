package au.com.woolworths.android.onesite.modules.storelocator.models;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/models/SelectedPickUpLocation;", "", "addressId", "", "displayableName", "pickUpOptionLabel", "id", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAddressId", "()Ljava/lang/String;", "getDisplayableName", "getPickUpOptionLabel", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lau/com/woolworths/android/onesite/modules/storelocator/models/SelectedPickUpLocation;", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectedPickUpLocation {

    @SerializedName(alternate = {"a"}, value = "addressId")
    @NotNull
    private final String addressId;

    @SerializedName(alternate = {"b"}, value = "displayableName")
    @NotNull
    private final String displayableName;

    @SerializedName(alternate = {"d"}, value = "id")
    @Nullable
    private final Integer id;

    @SerializedName(alternate = {"c"}, value = "pickUpOptionLabel")
    @NotNull
    private final String pickUpOptionLabel;

    public SelectedPickUpLocation(@NotNull String addressId, @NotNull String displayableName, @NotNull String pickUpOptionLabel, @Nullable Integer num) {
        Intrinsics.h(addressId, "addressId");
        Intrinsics.h(displayableName, "displayableName");
        Intrinsics.h(pickUpOptionLabel, "pickUpOptionLabel");
        this.addressId = addressId;
        this.displayableName = displayableName;
        this.pickUpOptionLabel = pickUpOptionLabel;
        this.id = num;
    }

    public static /* synthetic */ SelectedPickUpLocation copy$default(SelectedPickUpLocation selectedPickUpLocation, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectedPickUpLocation.addressId;
        }
        if ((i & 2) != 0) {
            str2 = selectedPickUpLocation.displayableName;
        }
        if ((i & 4) != 0) {
            str3 = selectedPickUpLocation.pickUpOptionLabel;
        }
        if ((i & 8) != 0) {
            num = selectedPickUpLocation.id;
        }
        return selectedPickUpLocation.copy(str, str2, str3, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayableName() {
        return this.displayableName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPickUpOptionLabel() {
        return this.pickUpOptionLabel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @NotNull
    public final SelectedPickUpLocation copy(@NotNull String addressId, @NotNull String displayableName, @NotNull String pickUpOptionLabel, @Nullable Integer id) {
        Intrinsics.h(addressId, "addressId");
        Intrinsics.h(displayableName, "displayableName");
        Intrinsics.h(pickUpOptionLabel, "pickUpOptionLabel");
        return new SelectedPickUpLocation(addressId, displayableName, pickUpOptionLabel, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedPickUpLocation)) {
            return false;
        }
        SelectedPickUpLocation selectedPickUpLocation = (SelectedPickUpLocation) other;
        return Intrinsics.c(this.addressId, selectedPickUpLocation.addressId) && Intrinsics.c(this.displayableName, selectedPickUpLocation.displayableName) && Intrinsics.c(this.pickUpOptionLabel, selectedPickUpLocation.pickUpOptionLabel) && Intrinsics.c(this.id, selectedPickUpLocation.id);
    }

    @NotNull
    public final String getAddressId() {
        return this.addressId;
    }

    @NotNull
    public final String getDisplayableName() {
        return this.displayableName;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @NotNull
    public final String getPickUpOptionLabel() {
        return this.pickUpOptionLabel;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.addressId.hashCode() * 31, 31, this.displayableName), 31, this.pickUpOptionLabel);
        Integer num = this.id;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.addressId;
        String str2 = this.displayableName;
        String str3 = this.pickUpOptionLabel;
        Integer num = this.id;
        StringBuilder sbV = a.v("SelectedPickUpLocation(addressId=", str, ", displayableName=", str2, ", pickUpOptionLabel=");
        sbV.append(str3);
        sbV.append(", id=");
        sbV.append(num);
        sbV.append(")");
        return sbV.toString();
    }
}
