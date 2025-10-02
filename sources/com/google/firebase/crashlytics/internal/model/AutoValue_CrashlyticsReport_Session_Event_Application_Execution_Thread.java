package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final String f15358a;
    public final int b;
    public final List c;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15359a;
        public int b;
        public List c;
        public byte d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread a() {
            String str;
            List list;
            if (this.d == 1 && (str = this.f15359a) != null && (list = this.c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(str, this.b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15359a == null) {
                sb.append(" name");
            }
            if ((1 & this.d) == 0) {
                sb.append(" importance");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder c(int i) {
            this.b = i;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f15359a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(String str, int i, List list) {
        this.f15358a = str;
        this.b = i;
        this.c = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final List b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final String d() {
        return this.f15358a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        return this.f15358a.equals(thread.d()) && this.b == thread.c() && this.c.equals(thread.b());
    }

    public final int hashCode() {
        return ((((this.f15358a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.f15358a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return a.t(sb, this.c, "}");
    }
}
