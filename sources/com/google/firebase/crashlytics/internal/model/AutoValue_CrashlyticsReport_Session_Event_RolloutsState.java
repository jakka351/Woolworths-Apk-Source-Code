package com.google.firebase.crashlytics.internal.model;

import android.support.v4.media.session.a;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {

    /* renamed from: a, reason: collision with root package name */
    public final List f15372a;

    /* loaded from: classes6.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* renamed from: a, reason: collision with root package name */
        public List f15373a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState a() {
            List list = this.f15373a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f15373a = list;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list) {
        this.f15372a = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    public final List b() {
        return this.f15372a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f15372a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15372a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.t(new StringBuilder("RolloutsState{rolloutAssignments="), this.f15372a, "}");
    }
}
