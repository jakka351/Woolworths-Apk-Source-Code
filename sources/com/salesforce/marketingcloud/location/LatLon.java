package com.salesforce.marketingcloud.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0014J\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/salesforce/marketingcloud/location/LatLon;", "Landroid/os/Parcelable;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", h.a.b, "", h.a.c, "(DD)V", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "-deprecated_latitude", "-deprecated_longitude", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LatLon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatLon> CREATOR = new a();
    private final double latitude;
    private final double longitude;

    public static final class a implements Parcelable.Creator<LatLon> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatLon createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new LatLon(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatLon[] newArray(int i) {
            return new LatLon[i];
        }
    }

    public LatLon(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ LatLon copy$default(LatLon latLon, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = latLon.latitude;
        }
        if ((i & 2) != 0) {
            d2 = latLon.longitude;
        }
        return latLon.copy(d, d2);
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_latitude, reason: not valid java name and from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_longitude, reason: not valid java name and from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @NotNull
    public final LatLon copy(double latitude, double longitude) {
        return new LatLon(latitude, longitude);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatLon)) {
            return false;
        }
        LatLon latLon = (LatLon) other;
        return Double.compare(this.latitude, latLon.latitude) == 0 && Double.compare(this.longitude, latLon.longitude) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    @JvmName
    public final double latitude() {
        return this.latitude;
    }

    @JvmName
    public final double longitude() {
        return this.longitude;
    }

    @NotNull
    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "LatLon(latitude=", ", longitude=");
        sbN.append(d2);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.h(parcel, "out");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LatLon(@NotNull JSONObject json) throws JSONException {
        this(json.getDouble(h.a.b), json.getDouble(h.a.c));
        Intrinsics.h(json, "json");
    }
}
