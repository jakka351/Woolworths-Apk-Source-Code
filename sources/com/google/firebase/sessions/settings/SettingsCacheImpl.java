package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Singleton;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsCacheImpl implements SettingsCache {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f15848a;
    public final TimeProvider b;
    public final DataStore c;
    public final AtomicReference d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C03241 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ AtomicReference d;

            public C03241(AtomicReference atomicReference) {
                this.d = atomicReference;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.d.set((SessionConfigs) obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SettingsCacheImpl.this.new AnonymousClass1(continuation);
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
                SettingsCacheImpl settingsCacheImpl = SettingsCacheImpl.this;
                Flow d = settingsCacheImpl.c.getD();
                C03241 c03241 = new C03241(settingsCacheImpl.d);
                this.p = 1;
                if (d.collect(c03241, this) == coroutineSingletons) {
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

    public SettingsCacheImpl(CoroutineContext backgroundDispatcher, TimeProvider timeProvider, DataStore sessionConfigsDataStore) {
        Intrinsics.h(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f15848a = backgroundDispatcher;
        this.b = timeProvider;
        this.c = sessionConfigsDataStore;
        this.d = new AtomicReference();
        BuildersKt.c(CoroutineScopeKt.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Integer a() {
        return f().c;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Double b() {
        return f().b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.google.firebase.sessions.settings.SessionConfigs r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r7)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            androidx.datastore.core.DataStore r7 = r5.c     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L27
            r0.r = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L58:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCacheImpl.c(com.google.firebase.sessions.settings.SessionConfigs, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final boolean d() {
        Long l = f().e;
        Integer num = f().d;
        return l == null || num == null || this.b.a().c - l.longValue() >= ((long) num.intValue());
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public final Boolean e() {
        return f().f15843a;
    }

    public final SessionConfigs f() throws Throwable {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objD = BuildersKt.d(EmptyCoroutineContext.d, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, objD) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        Intrinsics.g(obj, "get(...)");
        return (SessionConfigs) obj;
    }
}
