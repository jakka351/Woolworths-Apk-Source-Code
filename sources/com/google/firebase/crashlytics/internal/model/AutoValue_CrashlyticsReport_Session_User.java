package com.google.firebase.crashlytics.internal.model;

import YU.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* renamed from: a, reason: collision with root package name */
    public final String f15376a;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f15377a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User a() {
            String str = this.f15377a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f15377a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f15376a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public final String b() {
        return this.f15376a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f15376a.equals(((CrashlyticsReport.Session.User) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15376a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.o(new StringBuilder("User{identifier="), this.f15376a, "}");
    }
}
