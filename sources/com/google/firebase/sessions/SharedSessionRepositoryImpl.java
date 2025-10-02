package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "NotificationType", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SessionsSettings f15825a;
    public final SessionGenerator b;
    public final SessionFirelogPublisher c;
    public final TimeProvider d;
    public final DataStore e;
    public final ProcessDataManager f;
    public final CoroutineContext g;
    public SessionData h;
    public boolean i;
    public String j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/firebase/sessions/SessionData;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        final class C03231 extends SuspendLambda implements Function3<FlowCollector<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {
            public int p;
            public /* synthetic */ FlowCollector q;
            public /* synthetic */ Throwable r;
            public final /* synthetic */ SharedSessionRepositoryImpl s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03231(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
                super(3, continuation);
                this.s = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C03231 c03231 = new C03231(this.s, (Continuation) obj3);
                c03231.q = (FlowCollector) obj;
                c03231.r = (Throwable) obj2;
                return c03231.invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.p;
                if (i == 0) {
                    ResultKt.b(obj);
                    FlowCollector flowCollector = this.q;
                    Throwable th = this.r;
                    SessionDetails sessionDetailsA = this.s.b.a(null);
                    SessionData sessionData = new SessionData(sessionDetailsA, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + sessionDetailsA.f15815a);
                    this.q = null;
                    this.p = 1;
                    if (flowCollector.emit(sessionData, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(sharedSessionRepositoryImpl.e.getD(), new C03231(sharedSessionRepositoryImpl, null));
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        SessionData sessionData = (SessionData) obj2;
                        Intrinsics.h(sessionData, "<set-?>");
                        SharedSessionRepositoryImpl sharedSessionRepositoryImpl2 = sharedSessionRepositoryImpl;
                        sharedSessionRepositoryImpl2.h = sessionData;
                        Object objD = SharedSessionRepositoryImpl.d(sharedSessionRepositoryImpl2, sessionData.f15811a.f15815a, NotificationType.d, continuation);
                        return objD == CoroutineSingletons.d ? objD : Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationType {
        public static final NotificationType d;
        public static final NotificationType e;
        public static final /* synthetic */ NotificationType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            NotificationType notificationType = new NotificationType("GENERAL", 0);
            d = notificationType;
            NotificationType notificationType2 = new NotificationType("FALLBACK", 1);
            e = notificationType2;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2};
            f = notificationTypeArr;
            g = EnumEntriesKt.a(notificationTypeArr);
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NotificationType notificationType = NotificationType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore sessionDataStore, ProcessDataManager processDataManager, CoroutineContext backgroundDispatcher) {
        Intrinsics.h(sessionsSettings, "sessionsSettings");
        Intrinsics.h(sessionGenerator, "sessionGenerator");
        Intrinsics.h(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(sessionDataStore, "sessionDataStore");
        Intrinsics.h(processDataManager, "processDataManager");
        Intrinsics.h(backgroundDispatcher, "backgroundDispatcher");
        this.f15825a = sessionsSettings;
        this.b = sessionGenerator;
        this.c = sessionFirelogPublisher;
        this.d = timeProvider;
        this.e = sessionDataStore;
        this.f = processDataManager;
        this.g = backgroundDispatcher;
        NotificationType notificationType = NotificationType.d;
        this.j = "";
        BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.google.firebase.sessions.SharedSessionRepositoryImpl r4, java.lang.String r5, com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1 r0 = (com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1 r0 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r6 = r0.q
            java.lang.String r5 = r0.p
            kotlin.ResultKt.b(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r7)
            java.lang.String r7 = r4.j
            boolean r7 = kotlin.jvm.internal.Intrinsics.c(r7, r5)
            if (r7 == 0) goto L40
            goto Lba
        L40:
            r4.j = r5
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r4 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f15832a
            r0.p = r5
            r0.q = r6
            r0.t = r3
            java.lang.Object r7 = r4.c(r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r4 = r7.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lba
            java.lang.Object r7 = r4.next()
            com.google.firebase.sessions.api.SessionSubscriber r7 = (com.google.firebase.sessions.api.SessionSubscriber) r7
            com.google.firebase.sessions.api.SessionSubscriber$SessionDetails r0 = new com.google.firebase.sessions.api.SessionSubscriber$SessionDetails
            r0.<init>(r5)
            r7.c(r0)
            int r0 = r6.ordinal()
            java.lang.String r1 = "Notified "
            if (r0 == 0) goto L9b
            if (r0 != r3) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r7.b()
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = com.google.firebase.sessions.api.SessionSubscriber.Name.d
            r0.append(r7)
            java.lang.String r7 = " of new fallback session "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
            goto Lb4
        L95:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L9b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r7.b()
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = com.google.firebase.sessions.api.SessionSubscriber.Name.d
            r0.append(r7)
            java.lang.String r7 = " of new session "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
        Lb4:
            java.lang.String r0 = "FirebaseSessions"
            android.util.Log.d(r0, r7)
            goto L5d
        Lba:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.d(com.google.firebase.sessions.SharedSessionRepositoryImpl, java.lang.String, com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void a() {
        this.i = true;
        SessionData sessionData = this.h;
        if (sessionData == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        if (sessionData == null) {
            Intrinsics.p("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
        if (f(sessionData) || e(sessionData)) {
            BuildersKt.c(CoroutineScopeKt.a(this.g), null, null, new SharedSessionRepositoryImpl$appForeground$1(this, sessionData, null), 3);
        }
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* renamed from: b, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public final void c() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        BuildersKt.c(CoroutineScopeKt.a(this.g), null, null, new SharedSessionRepositoryImpl$appBackground$1(this, null), 3);
    }

    public final boolean e(SessionData sessionData) {
        Map map = sessionData.c;
        ProcessDataManager processDataManager = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + processDataManager.a());
            return true;
        }
        boolean zB = processDataManager.b(map);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + processDataManager.a() + " is stale");
        }
        return zB;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.firebase.sessions.SessionData r12) {
        /*
            r11 = this;
            com.google.firebase.sessions.Time r0 = r12.b
            com.google.firebase.sessions.SessionDetails r12 = r12.f15811a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L74
            com.google.firebase.sessions.TimeProvider r4 = r11.d
            com.google.firebase.sessions.Time r4 = r4.a()
            int r5 = kotlin.time.Duration.g
            long r4 = r4.f15827a
            long r6 = r0.f15827a
            long r4 = r4 - r6
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.g
            long r4 = kotlin.time.DurationKt.h(r4, r0)
            com.google.firebase.sessions.settings.SessionsSettings r0 = r11.f15825a
            com.google.firebase.sessions.settings.SettingsProvider r6 = r0.f15846a
            kotlin.time.Duration r6 = r6.d()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.d
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = kotlin.time.Duration.f(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            com.google.firebase.sessions.settings.SettingsProvider r0 = r0.b
            kotlin.time.Duration r0 = r0.d()
            if (r0 == 0) goto L4c
            long r9 = r0.d
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = kotlin.time.Duration.f(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.i
            long r9 = kotlin.time.DurationKt.g(r0, r6)
        L54:
            int r0 = kotlin.time.Duration.c(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f15815a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f15815a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.f(com.google.firebase.sessions.SessionData):boolean");
    }
}
