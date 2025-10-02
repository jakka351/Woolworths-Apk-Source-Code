package com.google.firebase.crashlytics.internal.model;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution f15348a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails e;
    public final List f;
    public final int g;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution f15349a;
        public List b;
        public List c;
        public Boolean d;
        public CrashlyticsReport.Session.Event.Application.ProcessDetails e;
        public List f;
        public int g;
        public byte h;

        public Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application a() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.h == 1 && (execution = this.f15349a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(execution, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15349a == null) {
                sb.append(" execution");
            }
            if ((1 & this.h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder b(List list) {
            this.f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder c(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder d(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder e(List list) {
            this.b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder f(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.f15349a = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder g(List list) {
            this.c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder h(int i) {
            this.g = i;
            this.h = (byte) (this.h | 1);
            return this;
        }

        public Builder(CrashlyticsReport.Session.Event.Application application) {
            this.f15349a = application.f();
            this.b = application.e();
            this.c = application.g();
            this.d = application.c();
            this.e = application.d();
            this.f = application.b();
            this.g = application.h();
            this.h = (byte) 1;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i) {
        this.f15348a = execution;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = processDetails;
        this.f = list3;
        this.g = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final Boolean c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.f15348a.equals(application.f())) {
            return false;
        }
        List list = this.b;
        if (list == null) {
            if (application.e() != null) {
                return false;
            }
        } else if (!list.equals(application.e())) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null) {
            if (application.g() != null) {
                return false;
            }
        } else if (!list2.equals(application.g())) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (application.c() != null) {
                return false;
            }
        } else if (!bool.equals(application.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.e;
        if (processDetails == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!processDetails.equals(application.d())) {
            return false;
        }
        List list3 = this.f;
        if (list3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!list3.equals(application.b())) {
            return false;
        }
        return this.g == application.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Execution f() {
        return this.f15348a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List g() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f15348a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.e;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Builder i() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f15348a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return a.m(sb, this.g, "}");
    }
}
