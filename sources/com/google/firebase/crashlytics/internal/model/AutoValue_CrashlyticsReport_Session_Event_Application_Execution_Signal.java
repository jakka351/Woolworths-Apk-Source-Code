package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* renamed from: a, reason: collision with root package name */
    public final String f15356a;
    public final String b;
    public final long c;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15357a;
        public String b;
        public long c;
        public byte d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal a() {
            String str;
            String str2;
            if (this.d == 1 && (str = this.f15357a) != null && (str2 = this.b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(str, str2, this.c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15357a == null) {
                sb.append(" name");
            }
            if (this.b == null) {
                sb.append(" code");
            }
            if ((1 & this.d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder b(long j) {
            this.c = j;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f15357a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j) {
        this.f15356a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final long b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String d() {
        return this.f15356a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.f15356a.equals(signal.d()) && this.b.equals(signal.c()) && this.c == signal.b();
    }

    public final int hashCode() {
        int iHashCode = (((this.f15356a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f15356a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return a.l(this.c, "}", sb);
    }
}
