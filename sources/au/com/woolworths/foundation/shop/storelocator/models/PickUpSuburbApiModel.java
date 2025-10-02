package au.com.woolworths.foundation.shop.storelocator.models;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.storage.db.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/models/PickUpSuburbApiModel;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "state", "postcode", "", h.a.b, h.a.c, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "b", "D", "getLatitude", "()D", "getLongitude", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PickUpSuburbApiModel {

    @SerializedName(h.a.b)
    private final double latitude;

    @SerializedName("longtitude")
    private final double longitude;

    @SerializedName("suburb")
    @NotNull
    private final String name;

    @SerializedName("postcode")
    @NotNull
    private final String postcode;

    @SerializedName("state")
    @NotNull
    private final String state;

    public PickUpSuburbApiModel(@NotNull String name, @NotNull String state, @NotNull String postcode, double d, double d2) {
        Intrinsics.h(name, "name");
        Intrinsics.h(state, "state");
        Intrinsics.h(postcode, "postcode");
        this.name = name;
        this.state = state;
        this.postcode = postcode;
        this.latitude = d;
        this.longitude = d2;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickUpSuburbApiModel)) {
            return false;
        }
        PickUpSuburbApiModel pickUpSuburbApiModel = (PickUpSuburbApiModel) obj;
        return Intrinsics.c(this.name, pickUpSuburbApiModel.name) && Intrinsics.c(this.state, pickUpSuburbApiModel.state) && Intrinsics.c(this.postcode, pickUpSuburbApiModel.postcode) && Double.compare(this.latitude, pickUpSuburbApiModel.latitude) == 0 && Double.compare(this.longitude, pickUpSuburbApiModel.longitude) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.longitude) + a.a(this.latitude, b.c(b.c(this.name.hashCode() * 31, 31, this.state), 31, this.postcode), 31);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.state;
        String str3 = this.postcode;
        double d = this.latitude;
        double d2 = this.longitude;
        StringBuilder sbV = YU.a.v("PickUpSuburbApiModel(name=", str, ", state=", str2, ", postcode=");
        sbV.append(str3);
        sbV.append(", latitude=");
        sbV.append(d);
        sbV.append(", longitude=");
        sbV.append(d2);
        sbV.append(")");
        return sbV.toString();
    }
}
