package com.google.firebase.sessions.api;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "Dependency", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FirebaseSessionsDependencies {

    /* renamed from: a, reason: collision with root package name */
    public static final FirebaseSessionsDependencies f15832a = new FirebaseSessionsDependencies();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dependency {

        /* renamed from: a, reason: collision with root package name */
        public final MutexImpl f15833a;
        public CrashlyticsAppQualitySessionsSubscriber b = null;

        public Dependency(MutexImpl mutexImpl) {
            this.f15833a = mutexImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return this.f15833a.equals(dependency.f15833a) && Intrinsics.c(this.b, dependency.b);
        }

        public final int hashCode() {
            int iHashCode = this.f15833a.hashCode() * 31;
            CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = this.b;
            return iHashCode + (crashlyticsAppQualitySessionsSubscriber == null ? 0 : crashlyticsAppQualitySessionsSubscriber.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.f15833a + ", subscriber=" + this.b + ')';
        }
    }

    public static final void a() {
        SessionSubscriber.Name name = SessionSubscriber.Name.d;
        Map map = b;
        if (map.containsKey(name)) {
            Log.d("FirebaseSessions", "Dependency " + name + " already added.");
            return;
        }
        map.put(name, new Dependency(new MutexImpl(true)));
        Log.d("FirebaseSessions", "Dependency to " + name + " added.");
    }

    public static Dependency b(SessionSubscriber.Name name) {
        Map dependencies = b;
        Intrinsics.g(dependencies, "dependencies");
        Object obj = dependencies.get(name);
        if (obj != null) {
            return (Dependency) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    public static final void d(CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        SessionSubscriber.Name name = SessionSubscriber.Name.d;
        Dependency dependencyB = b(name);
        if (dependencyB.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + name + " already registered.");
            return;
        }
        dependencyB.b = crashlyticsAppQualitySessionsSubscriber;
        Log.d("FirebaseSessions", "Subscriber " + name + " registered.");
        dependencyB.f15833a.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x009b, B:25:0x00b0, B:26:0x00c8), top: B:31:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.u
            java.util.Map r4 = r0.t
            java.util.Map r4 = (java.util.Map) r4
            kotlinx.coroutines.sync.MutexImpl r5 = r0.s
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = r0.r
            java.util.Iterator r7 = r0.q
            java.util.Map r8 = r0.p
            java.util.Map r8 = (java.util.Map) r8
            kotlin.ResultKt.b(r11)
            goto L9a
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            kotlin.ResultKt.b(r11)
            java.lang.String r11 = "dependencies"
            java.util.Map r2 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.b
            kotlin.jvm.internal.Intrinsics.g(r2, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r4 = r2.size()
            int r4 = kotlin.collections.MapsKt.h(r4)
            r11.<init>(r4)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r4 = r11
            r7 = r2
        L62:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lce
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            com.google.firebase.sessions.api.SessionSubscriber$Name r6 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r6
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.MutexImpl r5 = r11.f15833a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.p = r11
            r0.q = r7
            r0.r = r6
            r0.s = r5
            r0.t = r11
            r0.u = r2
            r0.x = r3
            java.lang.Object r11 = r5.a(r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            r8 = r4
        L9a:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.h(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r9 = b(r6)     // Catch: java.lang.Throwable -> Lc9
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r9 = r9.b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            r5.c(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L62
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            r5.c(r11)
            throw r0
        Lce:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
