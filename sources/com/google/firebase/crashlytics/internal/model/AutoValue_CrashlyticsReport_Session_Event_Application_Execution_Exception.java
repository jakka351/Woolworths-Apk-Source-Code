package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f15354a;
    public final String b;
    public final List c;
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception d;
    public final int e;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15355a;
        public String b;
        public List c;
        public CrashlyticsReport.Session.Event.Application.Execution.Exception d;
        public int e;
        public byte f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception a() {
            String str;
            List list;
            if (this.f == 1 && (str = this.f15355a) != null && (list = this.c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(str, this.b, list, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15355a == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d(int i) {
            this.e = i;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f15355a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.f15354a = str;
        this.b = str2;
        this.c = list;
        this.d = exception;
        this.e = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final List c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final int d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.f15354a.equals(exception.f())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (exception.e() != null) {
                return false;
            }
        } else if (!str.equals(exception.e())) {
            return false;
        }
        if (!this.c.equals(exception.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = this.d;
        if (exception2 == null) {
            if (exception.b() != null) {
                return false;
            }
        } else if (!exception2.equals(exception.b())) {
            return false;
        }
        return this.e == exception.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String f() {
        return this.f15354a;
    }

    public final int hashCode() {
        int iHashCode = (this.f15354a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.d;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f15354a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return a.m(sb, this.e, "}");
    }
}
