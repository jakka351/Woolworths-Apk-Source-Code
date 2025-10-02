package au.com.woolworths.android.onesite.notification;

import android.support.v4.media.session.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/notification/SwrveConfigData;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SwrveConfigData {

    /* renamed from: a, reason: collision with root package name */
    public final String f4581a;
    public final int b;

    public SwrveConfigData(String str, int i) {
        this.f4581a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwrveConfigData)) {
            return false;
        }
        SwrveConfigData swrveConfigData = (SwrveConfigData) obj;
        return this.f4581a.equals(swrveConfigData.f4581a) && this.b == swrveConfigData.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f4581a.hashCode() * 31);
    }

    public final String toString() {
        return a.p("SwrveConfigData(apiKey=", this.b, this.f4581a, ", appId=", ")");
    }
}
