package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Objects;

/* loaded from: classes.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* renamed from: a, reason: collision with root package name */
    public final DataCollectionArbiter f15269a;
    public final CrashlyticsAppQualitySessionsStore b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f15269a = dataCollectionArbiter;
        this.b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final boolean a() {
        return this.f15269a.a();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void b() {
        SessionSubscriber.Name name = SessionSubscriber.Name.d;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void c(SessionSubscriber.SessionDetails sessionDetails) {
        Logger.f15258a.b("App Quality Sessions session changed: " + sessionDetails, null);
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.b;
        String str = sessionDetails.f15834a;
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.c, str)) {
                CrashlyticsAppQualitySessionsStore.a(crashlyticsAppQualitySessionsStore.f15268a, crashlyticsAppQualitySessionsStore.b, str);
                crashlyticsAppQualitySessionsStore.c = str;
            }
        }
    }

    public final void d(String str) {
        CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = this.b;
        synchronized (crashlyticsAppQualitySessionsStore) {
            if (!Objects.equals(crashlyticsAppQualitySessionsStore.b, str)) {
                CrashlyticsAppQualitySessionsStore.a(crashlyticsAppQualitySessionsStore.f15268a, str, crashlyticsAppQualitySessionsStore.c);
                crashlyticsAppQualitySessionsStore.b = str;
            }
        }
    }
}
