package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.Global;
import java.util.Objects;

/* loaded from: classes.dex */
public final class UserPrivacyOptions {

    /* renamed from: a, reason: collision with root package name */
    public final DataCollectionLevel f14104a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public DataCollectionLevel f14105a = DataCollectionLevel.OFF;
        public boolean b = false;
        public boolean c = false;
        public Boolean d = null;
    }

    static {
        boolean z = Global.f14077a;
    }

    public UserPrivacyOptions(Builder builder) {
        this.f14104a = builder.f14105a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UserPrivacyOptions.class == obj.getClass()) {
            UserPrivacyOptions userPrivacyOptions = (UserPrivacyOptions) obj;
            if (this.f14104a == userPrivacyOptions.f14104a && this.b == userPrivacyOptions.b && this.c == userPrivacyOptions.c && Objects.equals(this.d, userPrivacyOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f14104a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Boolean bool = this.d;
        return iHashCode + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    public final String toString() {
        return "UserPrivacyOptions{dataCollectionLevel=" + this.f14104a + ", crashReportingOptedIn=" + this.b + ", crashReplayOptedIn=" + this.c + ", screenRecordOptedIn=" + this.d + '}';
    }
}
