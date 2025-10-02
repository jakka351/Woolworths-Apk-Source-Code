package com.google.firebase.sessions;

import android.util.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SharedSessionRepositoryImpl$appForeground$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SharedSessionRepositoryImpl q;
    public final /* synthetic */ SessionData r;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ SharedSessionRepositoryImpl q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
            super(2, continuation);
            this.q = sharedSessionRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((SessionData) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean zC;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            SessionData sessionData = (SessionData) this.p;
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.q;
            ProcessDataManager processDataManager = sharedSessionRepositoryImpl.f;
            boolean zF = sharedSessionRepositoryImpl.f(sessionData);
            Map mapE = sessionData.c;
            if (mapE != null) {
                zC = processDataManager.c(mapE);
                if (zC) {
                    Log.d("FirebaseSessions", "Cold app start detected");
                }
            } else {
                Log.d("FirebaseSessions", "No process data map");
                zC = true;
            }
            boolean zE = sharedSessionRepositoryImpl.e(sessionData);
            if (zC) {
                mapE = processDataManager.d();
            } else if (zE) {
                mapE = processDataManager.e(mapE);
            }
            SessionDetails sessionDetails = zC ? null : sessionData.f15811a;
            if (!zF && !zC) {
                return zE ? SessionData.a(sessionData, null, null, processDataManager.e(mapE), 3) : sessionData;
            }
            SessionDetails sessionDetailsA = sharedSessionRepositoryImpl.b.a(sessionDetails);
            sharedSessionRepositoryImpl.c.a(sessionDetailsA);
            processDataManager.f();
            return new SessionData(sessionDetailsA, null, mapE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$appForeground$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, SessionData sessionData, Continuation continuation) {
        super(2, continuation);
        this.q = sharedSessionRepositoryImpl;
        this.r = sessionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedSessionRepositoryImpl$appForeground$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedSessionRepositoryImpl$appForeground$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7.a(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r5, r7, r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 0
            r3 = 2
            r4 = 1
            com.google.firebase.sessions.SharedSessionRepositoryImpl r5 = r6.q
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.b(r7)
            goto L74
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L1f
            goto L74
        L1f:
            r7 = move-exception
            goto L34
        L21:
            kotlin.ResultKt.b(r7)
            androidx.datastore.core.DataStore r7 = r5.e     // Catch: java.lang.Exception -> L1f
            com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r1 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L1f
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1f
            r6.p = r4     // Catch: java.lang.Exception -> L1f
            java.lang.Object r7 = r7.a(r1, r6)     // Catch: java.lang.Exception -> L1f
            if (r7 != r0) goto L74
            goto L73
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "App foregrounded, failed to update data. Message: "
            r1.<init>(r4)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "FirebaseSessions"
            android.util.Log.d(r1, r7)
            com.google.firebase.sessions.SessionData r7 = r6.r
            boolean r1 = r5.f(r7)
            if (r1 == 0) goto L74
            com.google.firebase.sessions.SessionGenerator r1 = r5.b
            com.google.firebase.sessions.SessionDetails r4 = r7.f15811a
            com.google.firebase.sessions.SessionDetails r1 = r1.a(r4)
            r4 = 4
            com.google.firebase.sessions.SessionData r7 = com.google.firebase.sessions.SessionData.a(r7, r1, r2, r2, r4)
            r5.h = r7
            com.google.firebase.sessions.SessionFirelogPublisher r7 = r5.c
            r7.a(r1)
            java.lang.String r7 = r1.f15815a
            com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r1 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.e
            r6.p = r3
            java.lang.Object r7 = com.google.firebase.sessions.SharedSessionRepositoryImpl.d(r5, r7, r1, r6)
            if (r7 != r0) goto L74
        L73:
            return r0
        L74:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
