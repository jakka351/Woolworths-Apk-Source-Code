package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f15362a;
    public final int b;
    public final int c;
    public final boolean d;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15363a;
        public int b;
        public int c;
        public boolean d;
        public byte e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails a() {
            String str;
            if (this.e == 7 && (str = this.f15363a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(str, this.b, this.c, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15363a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder b(boolean z) {
            this.d = z;
            this.e = (byte) (this.e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder c(int i) {
            this.c = i;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder d(int i) {
            this.b = i;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f15363a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i, int i2, boolean z) {
        this.f15362a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final String d() {
        return this.f15362a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        return this.f15362a.equals(processDetails.d()) && this.b == processDetails.c() && this.c == processDetails.b() && this.d == processDetails.e();
    }

    public final int hashCode() {
        return ((((((this.f15362a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f15362a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return a.k("}", sb, this.d);
    }
}
