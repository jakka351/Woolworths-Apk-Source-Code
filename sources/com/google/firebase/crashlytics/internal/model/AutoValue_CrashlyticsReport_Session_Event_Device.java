package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* renamed from: a, reason: collision with root package name */
    public final Double f15364a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Double f15365a;
        public int b;
        public boolean c;
        public int d;
        public long e;
        public long f;
        public byte g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device a() {
            if (this.g == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f15365a, this.b, this.c, this.d, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder b(Double d) {
            this.f15365a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder c(int i) {
            this.b = i;
            this.g = (byte) (this.g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder d(long j) {
            this.f = j;
            this.g = (byte) (this.g | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder e(int i) {
            this.d = i;
            this.g = (byte) (this.g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder f(boolean z) {
            this.c = z;
            this.g = (byte) (this.g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder g(long j) {
            this.e = j;
            this.g = (byte) (this.g | 8);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f15364a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final Double b() {
        return this.f15364a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.f15364a;
        if (d == null) {
            if (device.b() != null) {
                return false;
            }
        } else if (!d.equals(device.b())) {
            return false;
        }
        return this.b == device.c() && this.c == device.g() && this.d == device.e() && this.e == device.f() && this.f == device.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final boolean g() {
        return this.c;
    }

    public final int hashCode() {
        Double d = this.f15364a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f15364a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return a.l(this.f, "}", sb);
    }
}
