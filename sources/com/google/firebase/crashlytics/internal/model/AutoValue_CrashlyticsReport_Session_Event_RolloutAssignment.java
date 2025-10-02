package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f15368a;
    public final String b;
    public final String c;
    public final long d;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f15369a;
        public String b;
        public String c;
        public long d;
        public byte e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment a() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.e == 1 && (rolloutVariant = this.f15369a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(rolloutVariant, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15369a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(c.o(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f15369a = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder e(long j) {
            this.d = j;
            this.e = (byte) (this.e | 1);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.f15368a = rolloutVariant;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant d() {
        return this.f15368a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.f15368a.equals(rolloutAssignment.d()) && this.b.equals(rolloutAssignment.b()) && this.c.equals(rolloutAssignment.c()) && this.d == rolloutAssignment.e();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15368a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f15368a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return a.l(this.d, "}", sb);
    }
}
