package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.settings.SessionsSettings;
import io.jsonwebtoken.JwtParser;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseSessions {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15798a;
    public final SessionsSettings b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ SessionsActivityLifecycleCallbacks r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, Continuation continuation) {
            super(2, continuation);
            this.r = sessionsActivityLifecycleCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FirebaseSessions.this.new AnonymousClass1(this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r1.b(r7) == r2) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                com.google.firebase.sessions.FirebaseSessions r0 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r1 = r0.b
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r7.p
                java.lang.String r4 = "FirebaseSessions"
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L22
                if (r3 == r6) goto L1e
                if (r3 != r5) goto L16
                kotlin.ResultKt.b(r8)
                goto L65
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.ResultKt.b(r8)
                goto L30
            L22:
                kotlin.ResultKt.b(r8)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r8 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f15832a
                r7.p = r6
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r2) goto L30
                goto L64
            L30:
                java.util.Map r8 = (java.util.Map) r8
                java.util.Collection r8 = r8.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                boolean r3 = r8 instanceof java.util.Collection
                if (r3 == 0) goto L46
                r3 = r8
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L46
                goto L9b
            L46:
                java.util.Iterator r8 = r8.iterator()
            L4a:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L9b
                java.lang.Object r3 = r8.next()
                com.google.firebase.sessions.api.SessionSubscriber r3 = (com.google.firebase.sessions.api.SessionSubscriber) r3
                boolean r3 = r3.a()
                if (r3 == 0) goto L4a
                r7.p = r5
                java.lang.Object r8 = r1.b(r7)
                if (r8 != r2) goto L65
            L64:
                return r2
            L65:
                com.google.firebase.sessions.settings.SettingsProvider r8 = r1.f15846a
                java.lang.Boolean r8 = r8.c()
                if (r8 == 0) goto L72
            L6d:
                boolean r6 = r8.booleanValue()
                goto L7b
            L72:
                com.google.firebase.sessions.settings.SettingsProvider r8 = r1.b
                java.lang.Boolean r8 = r8.c()
                if (r8 == 0) goto L7b
                goto L6d
            L7b:
                if (r6 != 0) goto L87
                java.lang.String r8 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r8 = android.util.Log.d(r4, r8)
                kotlin.coroutines.jvm.internal.Boxing.a(r8)
                goto La4
            L87:
                com.google.firebase.FirebaseApp r8 = r0.f15798a
                com.google.firebase.remoteconfig.a r0 = new com.google.firebase.remoteconfig.a
                r1 = 2
                r0.<init>(r1)
                r8.a()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.util.concurrent.CopyOnWriteArrayList r8 = r8.j
                r8.add(r0)
                goto La4
            L9b:
                java.lang.String r8 = "No Sessions subscribers. Not listening to lifecycle events."
                int r8 = android.util.Log.d(r4, r8)
                kotlin.coroutines.jvm.internal.Boxing.a(r8)
            La4:
                kotlin.Unit r8 = kotlin.Unit.f24250a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings settings, CoroutineContext backgroundDispatcher, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        Intrinsics.h(firebaseApp, "firebaseApp");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.h(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f15798a = firebaseApp;
        this.b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.1.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f15169a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + JwtParser.SEPARATOR_CHAR);
        }
    }
}
