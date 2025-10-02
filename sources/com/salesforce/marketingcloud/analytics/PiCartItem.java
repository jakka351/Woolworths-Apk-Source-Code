package com.salesforce.marketingcloud.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b(\u0010*J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010\u0004¨\u0006-"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/PiCartItem;", "Landroid/os/Parcelable;", "", "-deprecated_item", "()Ljava/lang/String;", "item", "", "-deprecated_quantity", "()I", "quantity", "", "-deprecated_price", "()D", "price", "-deprecated_uniqueId", "uniqueId", "Lorg/json/JSONObject;", "-toJson", "()Lorg/json/JSONObject;", "toJson", "component1", "component2", "component3", "component4", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "I", "D", "<init>", "(Ljava/lang/String;IDLjava/lang/String;)V", "(Ljava/lang/String;ID)V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final /* data */ class PiCartItem implements Parcelable {

    @NotNull
    private final String item;
    private final double price;
    private final int quantity;

    @Nullable
    private final String uniqueId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PiCartItem> CREATOR = new b();

    /* renamed from: com.salesforce.marketingcloud.analytics.PiCartItem$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final PiCartItem a(@NotNull String item, int i, double d) {
            Intrinsics.h(item, "item");
            return new PiCartItem(item, i, d);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmStatic
        @NotNull
        public final PiCartItem a(@NotNull String item, int i, double d, @Nullable String str) {
            Intrinsics.h(item, "item");
            return new PiCartItem(item, i, d, str);
        }
    }

    public static final class b implements Parcelable.Creator<PiCartItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCartItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PiCartItem(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PiCartItem[] newArray(int i) {
            return new PiCartItem[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PiCartItem(@NotNull String item, int i, double d) {
        this(item, i, d, null);
        Intrinsics.h(item, "item");
    }

    public static /* synthetic */ PiCartItem copy$default(PiCartItem piCartItem, String str, int i, double d, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = piCartItem.item;
        }
        if ((i2 & 2) != 0) {
            i = piCartItem.quantity;
        }
        if ((i2 & 4) != 0) {
            d = piCartItem.price;
        }
        if ((i2 & 8) != 0) {
            str2 = piCartItem.uniqueId;
        }
        String str3 = str2;
        return piCartItem.copy(str, i, d, str3);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final PiCartItem create(@NotNull String str, int i, double d) {
        return INSTANCE.a(str, i, d);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_item, reason: not valid java name and from getter */
    public final String getItem() {
        return this.item;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_price, reason: not valid java name and from getter */
    public final double getPrice() {
        return this.price;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_quantity, reason: not valid java name and from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Deprecated
    @JvmName
    @Nullable
    /* renamed from: -deprecated_uniqueId, reason: not valid java name and from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @JvmName
    @NotNull
    /* renamed from: -toJson, reason: not valid java name */
    public final JSONObject m90toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item", this.item);
        jSONObject.put("quantity", this.quantity);
        jSONObject.put("price", this.price);
        String str = this.uniqueId;
        if (str != null) {
            jSONObject.put("unique_id", str);
        }
        return jSONObject;
    }

    @NotNull
    public final String component1() {
        return this.item;
    }

    public final int component2() {
        return this.quantity;
    }

    public final double component3() {
        return this.price;
    }

    @Nullable
    public final String component4() {
        return this.uniqueId;
    }

    @NotNull
    public final PiCartItem copy(@NotNull String item, int quantity, double price, @Nullable String uniqueId) {
        Intrinsics.h(item, "item");
        return new PiCartItem(item, quantity, price, uniqueId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PiCartItem)) {
            return false;
        }
        PiCartItem piCartItem = (PiCartItem) other;
        return Intrinsics.c(this.item, piCartItem.item) && this.quantity == piCartItem.quantity && Double.compare(this.price, piCartItem.price) == 0 && Intrinsics.c(this.uniqueId, piCartItem.uniqueId);
    }

    public int hashCode() {
        int iA = android.support.v4.media.session.a.a(this.price, androidx.camera.core.impl.b.a(this.quantity, this.item.hashCode() * 31, 31), 31);
        String str = this.uniqueId;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @JvmName
    @NotNull
    public final String item() {
        return this.item;
    }

    @JvmName
    public final double price() {
        return this.price;
    }

    @JvmName
    public final int quantity() {
        return this.quantity;
    }

    @NotNull
    public String toString() {
        String str = this.item;
        int i = this.quantity;
        double d = this.price;
        String str2 = this.uniqueId;
        StringBuilder sbU = androidx.camera.core.impl.b.u("PiCartItem(item=", i, str, ", quantity=", ", price=");
        sbU.append(d);
        sbU.append(", uniqueId=");
        sbU.append(str2);
        sbU.append(")");
        return sbU.toString();
    }

    @JvmName
    @Nullable
    public final String uniqueId() {
        return this.uniqueId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        parcel.writeString(this.item);
        parcel.writeInt(this.quantity);
        parcel.writeDouble(this.price);
        parcel.writeString(this.uniqueId);
    }

    public PiCartItem(@NotNull String item, int i, double d, @Nullable String str) {
        Intrinsics.h(item, "item");
        this.item = item;
        this.quantity = i;
        this.price = d;
        this.uniqueId = str;
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final PiCartItem create(@NotNull String str, int i, double d, @Nullable String str2) {
        return INSTANCE.a(str, i, d, str2);
    }
}
