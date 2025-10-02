package au.com.woolworths.android.onesite.devicefingerprint;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/devicefingerprint/DeviceFingerprintConfigData;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeviceFingerprintConfigData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4246a;
    public final String b;

    public DeviceFingerprintConfigData(String str, String str2) {
        this.f4246a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFingerprintConfigData)) {
            return false;
        }
        DeviceFingerprintConfigData deviceFingerprintConfigData = (DeviceFingerprintConfigData) obj;
        return Intrinsics.c(this.f4246a, deviceFingerprintConfigData.f4246a) && Intrinsics.c(this.b, deviceFingerprintConfigData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4246a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("DeviceFingerprintConfigData(orgId=", this.f4246a, ", fpServerUrl=", this.b, ")");
    }
}
