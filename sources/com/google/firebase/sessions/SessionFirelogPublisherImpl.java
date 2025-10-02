package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15819a;
    public final FirebaseInstallationsApi b;
    public final SessionsSettings c;
    public final EventGDTLoggerInterface d;
    public final CoroutineContext e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl$Companion;", "", "", "randomValueForSampling", "D", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, SessionsSettings sessionSettings, EventGDTLoggerInterface eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.h(firebaseApp, "firebaseApp");
        Intrinsics.h(firebaseInstallations, "firebaseInstallations");
        Intrinsics.h(sessionSettings, "sessionSettings");
        Intrinsics.h(eventGDTLogger, "eventGDTLogger");
        Intrinsics.h(backgroundDispatcher, "backgroundDispatcher");
        this.f15819a = firebaseApp;
        this.b = firebaseInstallations;
        this.c = sessionSettings;
        this.d = eventGDTLogger;
        this.e = backgroundDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r7.b(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.google.firebase.sessions.SessionFirelogPublisherImpl r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            java.lang.String r5 = "FirebaseSessions"
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L85
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r7)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f15832a
            r0.p = r6
            r0.s = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L4c
            goto L84
        L4c:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L62
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto Lc1
        L62:
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r7.next()
            com.google.firebase.sessions.api.SessionSubscriber r2 = (com.google.firebase.sessions.api.SessionSubscriber) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L66
            com.google.firebase.sessions.settings.SessionsSettings r7 = r6.c
            r0.p = r6
            r0.s = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            com.google.firebase.sessions.settings.SessionsSettings r7 = r6.c
            com.google.firebase.sessions.settings.SettingsProvider r0 = r7.f15846a
            java.lang.Boolean r0 = r0.c()
            if (r0 == 0) goto L94
            boolean r4 = r0.booleanValue()
            goto La0
        L94:
            com.google.firebase.sessions.settings.SettingsProvider r7 = r7.b
            java.lang.Boolean r7 = r7.c()
            if (r7 == 0) goto La0
            boolean r4 = r7.booleanValue()
        La0:
            if (r4 != 0) goto Laa
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Laa:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r6.c
            double r6 = r6.a()
            double r0 = com.google.firebase.sessions.SessionFirelogPublisherImpl.f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lb9
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lb9:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lc1:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.b(com.google.firebase.sessions.SessionFirelogPublisherImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public final void a(SessionDetails sessionDetails) {
        BuildersKt.c(CoroutineScopeKt.a(this.e), null, null, new SessionFirelogPublisherImpl$mayLogSession$1(this, sessionDetails, null), 3);
    }
}
