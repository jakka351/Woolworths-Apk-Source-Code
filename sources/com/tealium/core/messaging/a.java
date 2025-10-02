package com.tealium.core.messaging;

import com.google.android.gms.ads.RequestConfiguration;
import com.tealium.core.Collector;
import com.tealium.core.Logger;
import com.tealium.core.Transformer;
import com.tealium.core.consent.ConsentManagementPolicy;
import com.tealium.core.consent.ConsentManager;
import com.tealium.core.consent.ConsentStatus;
import com.tealium.core.consent.UserConsentPreferences;
import com.tealium.core.network.Connectivity;
import com.tealium.core.persistence.e0;
import com.tealium.core.persistence.l;
import com.tealium.core.persistence.m;
import com.tealium.core.validation.DispatchValidator;
import com.tealium.dispatcher.Dispatch;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/messaging/a;", "Lcom/tealium/core/messaging/ValidationChangedListener;", "Lcom/tealium/core/messaging/UserConsentPreferencesUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements ValidationChangedListener, UserConsentPreferencesUpdatedListener {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f19154a;
    public final Set b;
    public final Set c;
    public final l d;
    public final com.tealium.core.settings.c e;
    public final Connectivity f;
    public final ConsentManager g;
    public final EventRouter h;
    public final ContextScope i;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter", f = "DispatchRouter.kt", l = {86}, m = "collect")
    /* renamed from: com.tealium.core.messaging.a$a, reason: collision with other inner class name */
    final class C0384a extends ContinuationImpl {
        public Map p;
        public Iterator q;
        public Collector r;
        public Map s;
        public /* synthetic */ Object t;
        public int v;

        public C0384a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter$sendDispatches$1", f = "DispatchRouter.kt", l = {160, 166, 171, 178}, m = "invokeSuspend")
    final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a p;
        public Iterator q;
        public int r;
        public final /* synthetic */ List s;
        public final /* synthetic */ a t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, a aVar, Continuation continuation) {
            super(2, continuation);
            this.s = list;
            this.t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.s, this.t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
        
            if (r1.a(r8) != r2) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                com.tealium.core.messaging.a r0 = r8.t
                com.tealium.core.settings.c r1 = r0.e
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r8.r
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L38
                if (r3 == r7) goto L33
                if (r3 == r6) goto L2b
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                kotlin.ResultKt.b(r9)
                goto Lb8
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.util.Iterator r0 = r8.q
                com.tealium.core.messaging.a r3 = r8.p
                kotlin.ResultKt.b(r9)
                goto L8f
            L2b:
                java.util.Iterator r0 = r8.q
                com.tealium.core.messaging.a r3 = r8.p
                kotlin.ResultKt.b(r9)
                goto L6e
            L33:
                kotlin.ResultKt.b(r9)
                goto Laa
            L38:
                kotlin.ResultKt.b(r9)
                java.util.List r9 = r8.s
                int r3 = r9.size()
                if (r3 != r7) goto L54
                com.tealium.core.messaging.EventRouter r0 = r0.h
                java.lang.Object r9 = kotlin.collections.CollectionsKt.D(r9)
                com.tealium.dispatcher.Dispatch r9 = (com.tealium.dispatcher.Dispatch) r9
                r8.r = r7
                java.lang.Object r9 = r0.d(r9, r8)
                if (r9 != r2) goto Laa
                goto Lb7
            L54:
                int r3 = r9.size()
                if (r3 <= r7) goto Laa
                com.tealium.core.settings.LibrarySettings r3 = r1.b()
                com.tealium.core.settings.Batching r3 = r3.c
                int r3 = r3.f19177a
                if (r3 <= r7) goto L89
                java.util.ArrayList r9 = kotlin.collections.CollectionsKt.O0(r9, r3, r3)
                java.util.Iterator r9 = r9.iterator()
                r3 = r0
                r0 = r9
            L6e:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto Laa
                java.lang.Object r9 = r0.next()
                java.util.List r9 = (java.util.List) r9
                com.tealium.core.messaging.EventRouter r5 = r3.h
                r8.p = r3
                r8.q = r0
                r8.r = r6
                java.lang.Object r9 = r5.o(r9, r8)
                if (r9 != r2) goto L6e
                goto Lb7
            L89:
                java.util.Iterator r9 = r9.iterator()
                r3 = r0
                r0 = r9
            L8f:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto Laa
                java.lang.Object r9 = r0.next()
                com.tealium.dispatcher.Dispatch r9 = (com.tealium.dispatcher.Dispatch) r9
                com.tealium.core.messaging.EventRouter r6 = r3.h
                r8.p = r3
                r8.q = r0
                r8.r = r5
                java.lang.Object r9 = r6.d(r9, r8)
                if (r9 != r2) goto L8f
                goto Lb7
            Laa:
                r9 = 0
                r8.p = r9
                r8.q = r9
                r8.r = r4
                java.lang.Object r9 = r1.a(r8)
                if (r9 != r2) goto Lb8
            Lb7:
                return r2
            Lb8:
                kotlin.Unit r9 = kotlin.Unit.f24250a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.messaging.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter$track$1", f = "DispatchRouter.kt", l = {47, 48}, m = "invokeSuspend")
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public com.tealium.dispatcher.a p;
        public int q;
        public final /* synthetic */ com.tealium.dispatcher.a r;
        public final /* synthetic */ a s;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter$track$1$1", f = "DispatchRouter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tealium.core.messaging.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        final class C0385a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ a p;
            public final /* synthetic */ com.tealium.dispatcher.a q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0385a(a aVar, com.tealium.dispatcher.a aVar2, Continuation continuation) {
                super(2, continuation);
                this.p = aVar;
                this.q = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0385a(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C0385a c0385a = (C0385a) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c0385a.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                this.p.h.k(this.q);
                return Unit.f24250a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter$track$1$2", f = "DispatchRouter.kt", l = {}, m = "invokeSuspend")
        final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ a p;
            public final /* synthetic */ com.tealium.dispatcher.a q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, com.tealium.dispatcher.a aVar2, Continuation continuation) {
                super(2, continuation);
                this.p = aVar;
                this.q = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                b bVar = (b) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                bVar.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                this.p.h.x(this.q);
                return Unit.f24250a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter$track$1$3", f = "DispatchRouter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tealium.core.messaging.a$c$c, reason: collision with other inner class name */
        final class C0386c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ a p;
            public final /* synthetic */ com.tealium.dispatcher.a q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0386c(a aVar, com.tealium.dispatcher.a aVar2, Continuation continuation) {
                super(2, continuation);
                this.p = aVar;
                this.q = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0386c(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C0386c c0386c = (C0386c) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c0386c.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                this.p.h.p(this.q);
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
        public final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.a(((Dispatch) obj).getC(), ((Dispatch) obj2).getC());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, com.tealium.dispatcher.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.r = aVar2;
            this.s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.s, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        
            if (r0.b(r6, r12) == r2) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.messaging.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.tealium.core.messaging.DispatchRouter", f = "DispatchRouter.kt", l = {100}, m = "transform")
    final class d extends ContinuationImpl {
        public Dispatch p;
        public Iterator q;
        public Transformer r;
        public /* synthetic */ Object s;
        public int u;

        public d(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.s = obj;
            this.u |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public a(ExecutorCoroutineDispatcherImpl coroutineDispatcher, LinkedHashSet linkedHashSet, Set set, Set set2, l dispatchStore, com.tealium.core.settings.c librarySettingsManager, Connectivity connectivity, ConsentManager consentManager, EventRouter eventRouter) {
        Intrinsics.h(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.h(dispatchStore, "dispatchStore");
        Intrinsics.h(librarySettingsManager, "librarySettingsManager");
        Intrinsics.h(connectivity, "connectivity");
        Intrinsics.h(consentManager, "consentManager");
        Intrinsics.h(eventRouter, "eventRouter");
        this.f19154a = linkedHashSet;
        this.b = set;
        this.c = set2;
        this.d = dispatchStore;
        this.e = librarySettingsManager;
        this.f = connectivity;
        this.g = consentManager;
        this.h = eventRouter;
        this.i = CoroutineScopeKt.a(coroutineDispatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.tealium.dispatcher.Dispatch] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007b -> B:30:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.tealium.dispatcher.a r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.tealium.core.messaging.a.d
            if (r0 == 0) goto L13
            r0 = r9
            com.tealium.core.messaging.a$d r0 = (com.tealium.core.messaging.a.d) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            com.tealium.core.messaging.a$d r0 = new com.tealium.core.messaging.a$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.tealium.core.Transformer r8 = r0.r
            java.util.Iterator r2 = r0.q
            com.tealium.dispatcher.Dispatch r4 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L80
            goto L7c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r2 = r7.b
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.tealium.core.Transformer r5 = (com.tealium.core.Transformer) r5
            boolean r5 = r5.getD()
            if (r5 == 0) goto L43
            r9.add(r4)
            goto L43
        L5a:
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L5f:
            boolean r9 = r2.hasNext()
            kotlin.Unit r4 = kotlin.Unit.f24250a
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r2.next()
            com.tealium.core.Transformer r9 = (com.tealium.core.Transformer) r9
            r0.p = r8     // Catch: java.lang.Exception -> L7e
            r0.q = r2     // Catch: java.lang.Exception -> L7e
            r0.r = r9     // Catch: java.lang.Exception -> L7e
            r0.u = r3     // Catch: java.lang.Exception -> L7e
            r9.B(r8)     // Catch: java.lang.Exception -> L7e
            if (r4 != r1) goto L7b
            return r1
        L7b:
            r4 = r8
        L7c:
            r8 = r4
            goto L5f
        L7e:
            r4 = r8
            r8 = r9
        L80:
            com.tealium.core.Logger$Companion r9 = com.tealium.core.Logger.f19124a
            java.lang.String r8 = r8.getC()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to transform data from "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            java.lang.String r5 = "Tealium-1.6.0"
            r9.b(r5, r8)
            goto L7c
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.messaging.a.b(com.tealium.dispatcher.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0091 -> B:31:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.tealium.core.messaging.a.C0384a
            if (r0 == 0) goto L13
            r0 = r9
            com.tealium.core.messaging.a$a r0 = (com.tealium.core.messaging.a.C0384a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            com.tealium.core.messaging.a$a r0 = new com.tealium.core.messaging.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.util.Map r2 = r0.s
            java.util.Map r2 = (java.util.Map) r2
            com.tealium.core.Collector r4 = r0.r
            java.util.Iterator r5 = r0.q
            java.util.Map r6 = r0.p
            java.util.Map r6 = (java.util.Map) r6
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L33
            goto L92
        L33:
            r2 = r6
            goto L99
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            kotlin.ResultKt.b(r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashSet r4 = r8.f19154a
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L67
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.tealium.core.Collector r6 = (com.tealium.core.Collector) r6
            boolean r6 = r6.getD()
            if (r6 == 0) goto L50
            r2.add(r5)
            goto L50
        L67:
            java.util.Iterator r2 = r2.iterator()
            r5 = r2
            r2 = r9
        L6d:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto Lb3
            java.lang.Object r9 = r5.next()
            r4 = r9
            com.tealium.core.Collector r4 = (com.tealium.core.Collector) r4
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L99
            r0.p = r9     // Catch: java.lang.Exception -> L99
            r0.q = r5     // Catch: java.lang.Exception -> L99
            r0.r = r4     // Catch: java.lang.Exception -> L99
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L99
            r0.s = r9     // Catch: java.lang.Exception -> L99
            r0.v = r3     // Catch: java.lang.Exception -> L99
            java.lang.Object r9 = r4.i(r0)     // Catch: java.lang.Exception -> L99
            if (r9 != r1) goto L91
            return r1
        L91:
            r6 = r2
        L92:
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L33
            r2.putAll(r9)     // Catch: java.lang.Exception -> L33
            r2 = r6
            goto L6d
        L99:
            com.tealium.core.Logger$Companion r9 = com.tealium.core.Logger.f19124a
            java.lang.String r4 = r4.getC()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to collect data from "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "Tealium-1.6.0"
            r9.b(r6, r4)
            goto L6d
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.messaging.a.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.tealium.core.messaging.ValidationChangedListener
    public final void g(Class cls) {
        Logger.f19124a.b("Tealium-1.6.0", "Revalidation requested.");
        if (h(null, cls)) {
            return;
        }
        ArrayList arrayListR = r(null);
        BuildersKt.c(this.i, Logger.c, null, new b(arrayListR, this, null), 2);
        if (arrayListR.size() > 1) {
            Iterator it = arrayListR.iterator();
            while (it.hasNext()) {
                i((Dispatch) it.next());
            }
        }
    }

    public final boolean h(com.tealium.dispatcher.a aVar, Class cls) {
        boolean zB;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.c) {
            if (((DispatchValidator) obj).getD()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                DispatchValidator dispatchValidator = (DispatchValidator) it.next();
                if (!z) {
                    if (cls == null || !cls.isInstance(dispatchValidator)) {
                        zB = dispatchValidator.b();
                        if (zB) {
                            Logger.f19124a.h("Tealium-1.6.0", "Queueing dispatch requested by: " + dispatchValidator.getC());
                            if (Intrinsics.c(dispatchValidator.getC(), "BATCHING_VALIDATOR")) {
                                i(aVar);
                            }
                        }
                    } else {
                        zB = false;
                    }
                    if (zB) {
                    }
                }
                z = true;
            }
            return z;
        }
    }

    public final void i(Dispatch dispatch) {
        if (this.e.b().c.f19177a <= 1 || dispatch == null) {
            return;
        }
        ConsentManager consentManager = this.g;
        boolean z = consentManager.d;
        EventRouter eventRouter = this.h;
        Connectivity connectivity = this.f;
        if (z) {
            if (consentManager.f.a() == ConsentStatus.CONSENTED && connectivity.isConnected()) {
                eventRouter.j(dispatch);
                return;
            }
            return;
        }
        if (z || !connectivity.isConnected()) {
            return;
        }
        eventRouter.j(dispatch);
    }

    @Override // com.tealium.core.messaging.UserConsentPreferencesUpdatedListener
    public final void n(UserConsentPreferences userConsentPreferences, ConsentManagementPolicy policy) {
        Intrinsics.h(policy, "policy");
        boolean zJ = policy.j();
        l lVar = this.d;
        if (zJ) {
            lVar.clear();
        }
        if (lVar.count() <= 0 || policy.b()) {
            return;
        }
        g(null);
    }

    public final ArrayList r(com.tealium.dispatcher.a aVar) {
        ArrayList arrayList;
        i(aVar);
        l lVar = this.d;
        m mVar = lVar.b;
        ConcurrentLinkedQueue<Dispatch> concurrentLinkedQueue = lVar.f19175a;
        if (concurrentLinkedQueue.isEmpty()) {
            ArrayList arrayListD = mVar.d(-1);
            arrayList = new ArrayList(CollectionsKt.s(arrayListD, 10));
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tealium.dispatcher.b((e0) it.next()));
            }
        } else {
            arrayList = new ArrayList();
            for (Dispatch dispatch : concurrentLinkedQueue) {
                mVar.h(dispatch.getB());
                arrayList.add(dispatch);
            }
            concurrentLinkedQueue.clear();
        }
        return aVar != null ? CollectionsKt.d0(aVar, arrayList) : arrayList;
    }

    public final void s(com.tealium.dispatcher.a aVar) {
        if (this.e.b().g) {
            return;
        }
        BuildersKt.c(this.i, Logger.c, null, new c(this, aVar, null), 2);
    }
}
