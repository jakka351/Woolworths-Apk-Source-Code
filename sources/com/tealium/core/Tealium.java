package com.tealium.core;

import android.app.Application;
import android.content.SharedPreferences;
import com.tealium.core.Logger;
import com.tealium.core.Session;
import com.tealium.core.collection.ModuleCollector;
import com.tealium.core.collection.TealiumCollector;
import com.tealium.core.consent.ConsentManager;
import com.tealium.core.events.TimedEvents;
import com.tealium.core.messaging.Listener;
import com.tealium.core.messaging.MessengerService;
import com.tealium.core.network.Connectivity;
import com.tealium.core.network.ConnectivityRetriever;
import com.tealium.core.network.HttpClient;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.Serialization;
import com.tealium.core.persistence.f0;
import com.tealium.core.persistence.h0;
import com.tealium.core.persistence.k;
import com.tealium.core.persistence.l;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.core.validation.DispatchValidator;
import com.tealium.dispatcher.Dispatch;
import com.tealium.test.OpenForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/Tealium;", "Lcom/tealium/core/events/TimedEvents;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
@OpenForTesting
/* loaded from: classes.dex */
public final class Tealium implements TimedEvents {
    public static final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final TealiumConfig f19127a;
    public final Function1 b;
    public final ExecutorCoroutineDispatcherImpl c;
    public final ContextScope d;
    public final AtomicBoolean e;
    public LinkedHashSet f;
    public LinkedHashSet g;
    public Set h;
    public l i;
    public Connectivity j;
    public com.tealium.core.messaging.a k;
    public com.tealium.core.messaging.b l;
    public final Lazy m;
    public final Lazy n;
    public final com.tealium.core.persistence.h o;
    public final com.tealium.core.messaging.c p;
    public final com.tealium.core.d q;
    public final com.tealium.core.events.b r;
    public final com.tealium.core.settings.c s;
    public final Logger.Companion t;
    public final com.tealium.core.c u;
    public final MessengerService v;
    public final f0 w;
    public final com.tealium.core.f x;
    public final TealiumContext y;
    public final ConsentManager z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tealium/core/Tealium$Companion;", "", "", "", "Lcom/tealium/core/Tealium;", "instances", "Ljava/util/Map;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.Tealium$2", f = "Tealium.kt", l = {}, m = "invokeSuspend")
    final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Tealium.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            aVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            Tealium tealium = Tealium.this;
            Lazy lazy = tealium.n;
            com.tealium.core.c cVar = tealium.u;
            TealiumConfig tealiumConfig = tealium.f19127a;
            tealium.j = ConnectivityRetriever.b.a(tealiumConfig.f19129a);
            tealium.i = new l(tealium.o);
            com.tealium.core.messaging.c cVar2 = tealium.p;
            tealium.l = new com.tealium.core.messaging.b(cVar2);
            TealiumContext tealiumContext = tealium.y;
            TealiumCollector tealiumCollector = new TealiumCollector(tealiumContext);
            long j = tealium.q.b.f19126a;
            com.tealium.core.collection.a aVar = new com.tealium.core.collection.a();
            aVar.f19139a = j;
            aVar.b = true;
            LinkedHashSet linkedHashSetF = SetsKt.f(tealiumCollector, aVar, tealium.w);
            Set set = tealiumConfig.f;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((CollectorFactory) it.next()).a(tealiumContext));
            }
            tealium.f = CollectionsKt.N0(linkedHashSetF, CollectionsKt.L0(arrayList));
            LinkedHashSet linkedHashSet = tealiumConfig.i;
            com.tealium.core.settings.c cVar3 = tealium.s;
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                ((DispatchValidator) it2.next()).setEnabled(true);
            }
            com.tealium.core.validation.b bVar = new com.tealium.core.validation.b(tealiumConfig, cVar3.b(), tealium.v);
            Connectivity connectivity = tealium.j;
            if (connectivity == null) {
                Intrinsics.p("connectivity");
                throw null;
            }
            com.tealium.core.validation.d dVar = new com.tealium.core.validation.d(connectivity, cVar3.b());
            l lVar = tealium.i;
            if (lVar == null) {
                Intrinsics.p("dispatchStore");
                throw null;
            }
            tealium.g = CollectionsKt.N0(ArraysKt.r0(new DispatchValidator[]{bVar, dVar, new com.tealium.core.validation.a(lVar, cVar3.b(), cVar2)}), linkedHashSet);
            Set<DispatcherFactory> set2 = tealiumConfig.g;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(set2, 10));
            for (DispatcherFactory dispatcherFactory : set2) {
                com.tealium.core.messaging.b bVar2 = tealium.l;
                if (bVar2 == null) {
                    Intrinsics.p("dispatchSendCallbacks");
                    throw null;
                }
                arrayList2.add(dispatcherFactory.a(tealiumContext, bVar2));
            }
            tealium.h = CollectionsKt.L0(arrayList2);
            Set setR0 = ArraysKt.r0(new Module[]{tealium.z, tealium.r});
            Set set3 = tealiumConfig.h;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(set3, 10));
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ModuleFactory) it3.next()).a(tealiumContext));
            }
            LinkedHashSet linkedHashSetN0 = CollectionsKt.N0(setR0, CollectionsKt.L0(arrayList3));
            LinkedHashSet linkedHashSet2 = tealium.f;
            if (linkedHashSet2 == null) {
                Intrinsics.p("collectors");
                throw null;
            }
            LinkedHashSet linkedHashSet3 = tealium.g;
            if (linkedHashSet3 == null) {
                Intrinsics.p("validators");
                throw null;
            }
            LinkedHashSet linkedHashSetN02 = CollectionsKt.N0(linkedHashSet2, linkedHashSet3);
            Set set4 = tealium.h;
            if (set4 == null) {
                Intrinsics.p("dispatchers");
                throw null;
            }
            List<Module> listG0 = CollectionsKt.G0(CollectionsKt.N0(CollectionsKt.N0(linkedHashSetN02, set4), linkedHashSetN0));
            ModuleCollector moduleCollector = new ModuleCollector(listG0);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listG0) {
                if (obj2 instanceof Listener) {
                    arrayList4.add(obj2);
                }
            }
            cVar2.c(arrayList4);
            for (Module module : listG0) {
                cVar.getClass();
                Intrinsics.h(module, "module");
                cVar.f19125a.put(module.getC(), module);
            }
            ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = tealium.c;
            LinkedHashSet linkedHashSetN03 = CollectionsKt.N0(cVar.c(Collector.class), SetsKt.i(moduleCollector));
            Set setC = cVar.c(Transformer.class);
            Set setC2 = cVar.c(DispatchValidator.class);
            l lVar2 = tealium.i;
            if (lVar2 == null) {
                Intrinsics.p("dispatchStore");
                throw null;
            }
            com.tealium.core.settings.c cVar4 = tealium.s;
            Connectivity connectivity2 = tealium.j;
            if (connectivity2 == null) {
                Intrinsics.p("connectivity");
                throw null;
            }
            com.tealium.core.messaging.a aVar2 = new com.tealium.core.messaging.a(executorCoroutineDispatcherImpl, linkedHashSetN03, setC, setC2, lVar2, cVar4, connectivity2, tealium.z, tealium.p);
            tealium.k = aVar2;
            l lVar3 = tealium.i;
            if (lVar3 == null) {
                Intrinsics.p("dispatchStore");
                throw null;
            }
            cVar2.c(CollectionsKt.R(aVar2, lVar3));
            Logger.Companion companion = tealium.t;
            cVar2.h();
            cVar2.c.set(true);
            tealium.e.set(true);
            tealium.b.invoke(tealium);
            companion.h("Tealium-1.6.0", "Tealium instance initialized with the following modules: " + cVar);
            if (tealium.m.isInitialized() && ((Queue) lazy.getD()).size() > 0) {
                companion.b("Tealium-1.6.0", "Dispatching buffered events.");
                while (!((Queue) lazy.getD()).isEmpty()) {
                    Dispatch dispatch = (Dispatch) ((Queue) lazy.getD()).poll();
                    if (dispatch != null) {
                        tealium.b(dispatch);
                    }
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19128a;

        static {
            int[] iArr = new int[Environment.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f19128a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.Tealium$clearStoredVisitorIds$1", f = "Tealium.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Tealium.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            c cVar = (c) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            cVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strG;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            com.tealium.core.f fVar = Tealium.this.x;
            fVar.getClass();
            Logger.f19124a.b("Tealium-1.6.0", "Clearing stored visitor ids");
            fVar.b.f19174a.clear();
            fVar.c();
            String str = fVar.f19151a;
            if (str != null && (strG = fVar.c.G(str)) != null) {
                fVar.e(strG, str);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/LinkedList;", "Lcom/tealium/dispatcher/Dispatch;", "a", "()Ljava/util/LinkedList;"}, k = 3, mv = {1, 6, 0})
    final class d extends Lambda implements Function0<LinkedList<Dispatch>> {
        public static final d h = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new LinkedList();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.Tealium$gatherTrackData$1", f = "Tealium.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Object>>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.Tealium$resetVisitorId$1", f = "Tealium.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.Tealium$sendQueuedDispatches$1", f = "Tealium.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            g gVar = (g) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            gVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
    final class h extends Lambda implements Function1<String, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.Tealium$visitorIdProvider$1$1", f = "Tealium.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Tealium p;
            public final /* synthetic */ String q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Tealium tealium, String str, Continuation continuation) {
                super(2, continuation);
                this.p = tealium;
                this.q = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.p, this.q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                aVar.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                this.p.p.v(this.q);
                return Unit.f24250a;
            }
        }

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String it = (String) obj;
            Intrinsics.h(it, "it");
            Tealium tealium = Tealium.this;
            BuildersKt.c(tealium.d, null, null, new a(tealium, it, null), 3);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.io.Serializable, java.lang.String[]] */
    public Tealium(TealiumConfig tealiumConfig, Function1 function1) {
        Environment environment;
        Environment environment2;
        this.f19127a = tealiumConfig;
        this.b = function1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = new ExecutorCoroutineDispatcherImpl(executorServiceNewSingleThreadExecutor);
        this.c = executorCoroutineDispatcherImpl;
        ContextScope contextScopeA = CoroutineScopeKt.a(executorCoroutineDispatcherImpl);
        this.d = contextScopeA;
        this.e = new AtomicBoolean(false);
        HttpClient httpClient = new HttpClient(tealiumConfig);
        Lazy lazyB = LazyKt.b(d.h);
        this.m = lazyB;
        this.n = lazyB;
        com.tealium.core.persistence.h hVar = new com.tealium.core.persistence.h(tealiumConfig);
        this.o = hVar;
        com.tealium.core.messaging.c cVar = new com.tealium.core.messaging.c();
        this.p = cVar;
        new com.tealium.core.a(tealiumConfig, cVar, contextScopeA);
        com.tealium.core.d dVar = new com.tealium.core.d(tealiumConfig, cVar);
        this.q = dVar;
        com.tealium.core.settings.c cVar2 = new com.tealium.core.settings.c(tealiumConfig, httpClient, cVar, contextScopeA);
        this.s = cVar2;
        Logger.Companion companion = Logger.f19124a;
        this.t = companion;
        this.u = new com.tealium.core.c();
        MessengerService messengerService = new MessengerService(cVar, contextScopeA);
        this.v = messengerService;
        f0 f0Var = new f0(hVar, cVar, contextScopeA, dVar.b.f19126a);
        this.w = f0Var;
        com.tealium.core.f fVar = new com.tealium.core.f(tealiumConfig, new k(hVar), f0Var, new h());
        this.x = fVar;
        TealiumContext tealiumContext = new TealiumContext(tealiumConfig, fVar.e, f0Var, httpClient, messengerService, this);
        this.y = tealiumContext;
        this.z = new ConsentManager(tealiumContext, cVar, cVar2.b());
        String str = tealiumConfig.b;
        String str2 = tealiumConfig.c;
        Environment environment3 = tealiumConfig.d;
        int iHashCode = (str + "." + str2 + "." + environment3.d).hashCode();
        Application application = tealiumConfig.f19129a;
        String hexString = Integer.toHexString(iHashCode);
        StringBuilder sb = new StringBuilder("tealium.datasources.");
        sb.append(hexString);
        SharedPreferences sharedPreferences = application.getSharedPreferences(sb.toString(), 0);
        if (sharedPreferences.getAll().isEmpty()) {
            environment = environment3;
        } else {
            Map<String, ?> all = sharedPreferences.getAll();
            Intrinsics.g(all, "legacySharedPreferences.all");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, ?> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                boolean z = value instanceof String;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                Expiry expiry = Expiry.b;
                Iterator<Map.Entry<String, ?>> it2 = it;
                if (z) {
                    Intrinsics.g(key, "key");
                    f0Var.J(key, (String) value, expiry);
                } else if (value instanceof Boolean) {
                    Intrinsics.g(key, "key");
                    f0Var.H(key, ((Boolean) value).booleanValue(), expiry);
                } else {
                    if (value instanceof Float) {
                        Intrinsics.g(key, "key");
                        environment2 = environment3;
                        f0Var.I(((Number) value).floatValue(), key);
                    } else {
                        environment2 = environment3;
                        if (value instanceof Double) {
                            Intrinsics.g(key, "key");
                            f0Var.I(((Number) value).doubleValue(), key);
                        } else if (value instanceof Integer) {
                            Intrinsics.g(key, "key");
                            f0Var.F(key, Integer.valueOf(((Number) value).intValue()), h0.a().getF19167a(), expiry, Serialization.INT);
                        } else {
                            f0 f0Var2 = f0Var;
                            if (value instanceof Long) {
                                Intrinsics.g(key, "key");
                                f0Var2.F(key, Long.valueOf(((Number) value).longValue()), h0.c().getF19167a(), expiry, Serialization.LONG);
                            } else if (value instanceof Set) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : (Iterable) value) {
                                    if (obj instanceof String) {
                                        arrayList.add(obj);
                                    }
                                }
                                Intrinsics.g(key, "key");
                                Object[] array = arrayList.toArray(new String[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                f0Var2.F(key, (String[]) array, h0.d().getF19167a(), expiry, Serialization.STRING_ARRAY);
                            }
                            environment3 = environment2;
                            f0Var = f0Var2;
                        }
                    }
                    environment3 = environment2;
                }
                sharedPreferences = sharedPreferences2;
                it = it2;
            }
            environment = environment3;
            sharedPreferences.edit().clear().apply();
        }
        if (dVar.c) {
            f0Var.E(this.q.b.f19126a);
        }
        LogLevel logLevel = tealiumConfig.p;
        if (logLevel == null) {
            LibrarySettings librarySettings = cVar2.g;
            logLevel = librarySettings != null ? librarySettings.h : null;
            if (logLevel == null) {
                int i = b.f19128a[environment.ordinal()];
                if (i == 1) {
                    logLevel = LogLevel.DEV;
                } else if (i == 2) {
                    logLevel = LogLevel.QA;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    logLevel = LogLevel.PROD;
                }
            }
        }
        Logger.b = logLevel;
        cVar.c(CollectionsKt.G0(tealiumConfig.q));
        cVar.c(CollectionsKt.R(companion, dVar, new com.tealium.core.b(tealiumContext, contextScopeA), new com.tealium.core.settings.d(tealiumConfig.p)));
        this.r = new com.tealium.core.events.b(tealiumContext);
        if (tealiumConfig.o != null) {
            f0 f0Var3 = this.w;
            f0Var3.getClass();
            f0Var3.b.i(fVar);
        }
        BuildersKt.c(contextScopeA, null, null, new a(null), 3);
    }

    public final void a() {
        BuildersKt.c(this.d, null, null, new c(null), 3);
    }

    public final void b(Dispatch dispatch) {
        if (this.s.b().g) {
            Logger.f19124a.h("Tealium-1.6.0", "Library is disabled. Cannot track new events.");
            return;
        }
        com.tealium.dispatcher.a aVar = new com.tealium.dispatcher.a(dispatch);
        boolean z = this.e.get();
        if (!z) {
            if (z) {
                return;
            }
            this.t.b("Tealium-1.6.0", "Instance not yet initialized; buffering.");
            ((Queue) this.n.getD()).add(aVar);
            return;
        }
        com.tealium.core.d dVar = this.q;
        dVar.getClass();
        Session session = dVar.b;
        Intrinsics.h(session, "session");
        if (Math.max(session.f19126a, session.b) + 1800000 < System.currentTimeMillis()) {
            dVar.b();
        }
        Session session2 = dVar.b;
        session2.c++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!session2.d && session2.c > 1 && jCurrentTimeMillis <= session2.b + 30000) {
            Logger.f19124a.h("Tealium-1.6.0", "Starting session " + dVar.b.f19126a);
            dVar.b.d = true;
            SharedPreferences sessionPreferences = dVar.d;
            Intrinsics.g(sessionPreferences, "sessionPreferences");
            Session.a.a(sessionPreferences, dVar.b);
            dVar.f19148a.z(dVar.b.f19126a);
        }
        dVar.b.b = System.currentTimeMillis();
        com.tealium.core.messaging.a aVar2 = this.k;
        if (aVar2 != null) {
            aVar2.s(aVar);
        } else {
            Intrinsics.p("dispatchRouter");
            throw null;
        }
    }
}
