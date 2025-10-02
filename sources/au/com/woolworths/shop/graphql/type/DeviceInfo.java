package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeviceInfo;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11344a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;

    public DeviceInfo(Optional deviceModel, Optional deviceVendor, Optional operatingSystem, Optional screenResolution, Optional screenResolutionInCm, Optional usableScreenResolution, Optional usableScreenResolutionInCm, Optional phoneNetworkRetailer, Optional mobileSignalStrength, Optional storageSpaceAvailable, Optional appVersion, Optional optional) {
        Intrinsics.h(deviceModel, "deviceModel");
        Intrinsics.h(deviceVendor, "deviceVendor");
        Intrinsics.h(operatingSystem, "operatingSystem");
        Intrinsics.h(screenResolution, "screenResolution");
        Intrinsics.h(screenResolutionInCm, "screenResolutionInCm");
        Intrinsics.h(usableScreenResolution, "usableScreenResolution");
        Intrinsics.h(usableScreenResolutionInCm, "usableScreenResolutionInCm");
        Intrinsics.h(phoneNetworkRetailer, "phoneNetworkRetailer");
        Intrinsics.h(mobileSignalStrength, "mobileSignalStrength");
        Intrinsics.h(storageSpaceAvailable, "storageSpaceAvailable");
        Intrinsics.h(appVersion, "appVersion");
        this.f11344a = deviceModel;
        this.b = deviceVendor;
        this.c = operatingSystem;
        this.d = screenResolution;
        this.e = screenResolutionInCm;
        this.f = usableScreenResolution;
        this.g = usableScreenResolutionInCm;
        this.h = phoneNetworkRetailer;
        this.i = mobileSignalStrength;
        this.j = storageSpaceAvailable;
        this.k = appVersion;
        this.l = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.c(this.f11344a, deviceInfo.f11344a) && Intrinsics.c(this.b, deviceInfo.b) && Intrinsics.c(this.c, deviceInfo.c) && Intrinsics.c(this.d, deviceInfo.d) && Intrinsics.c(this.e, deviceInfo.e) && Intrinsics.c(this.f, deviceInfo.f) && Intrinsics.c(this.g, deviceInfo.g) && Intrinsics.c(this.h, deviceInfo.h) && Intrinsics.c(this.i, deviceInfo.i) && Intrinsics.c(this.j, deviceInfo.j) && Intrinsics.c(this.k, deviceInfo.k) && Intrinsics.c(this.l, deviceInfo.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + a.c(this.k, a.c(this.j, a.c(this.i, a.c(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.f11344a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = a.p("DeviceInfo(deviceModel=", this.f11344a, ", deviceVendor=", this.b, ", operatingSystem=");
        a.x(sbP, this.c, ", screenResolution=", this.d, ", screenResolutionInCm=");
        a.x(sbP, this.e, ", usableScreenResolution=", this.f, ", usableScreenResolutionInCm=");
        a.x(sbP, this.g, ", phoneNetworkRetailer=", this.h, ", mobileSignalStrength=");
        a.x(sbP, this.i, ", storageSpaceAvailable=", this.j, ", appVersion=");
        sbP.append(this.k);
        sbP.append(", locationData=");
        sbP.append(this.l);
        sbP.append(")");
        return sbP.toString();
    }
}
