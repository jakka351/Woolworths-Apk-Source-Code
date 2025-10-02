package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* renamed from: a, reason: collision with root package name */
    public final long f15360a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* renamed from: a, reason: collision with root package name */
        public long f15361a;
        public String b;
        public String c;
        public long d;
        public int e;
        public byte f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f15361a, str, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder c(int i) {
            this.e = i;
            this.f = (byte) (this.f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder d(long j) {
            this.d = j;
            this.f = (byte) (this.f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder e(long j) {
            this.f15361a = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j, String str, String str2, long j2, int i) {
        this.f15360a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final int c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long e() {
        return this.f15360a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f15360a != frame.e() || !this.b.equals(frame.f())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (frame.b() != null) {
                return false;
            }
        } else if (!str.equals(frame.b())) {
            return false;
        }
        return this.d == frame.d() && this.e == frame.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.f15360a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f15360a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return a.m(sb, this.e, "}");
    }
}
