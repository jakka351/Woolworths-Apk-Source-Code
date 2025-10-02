package com.tealium.core.persistence;

import com.salesforce.marketingcloud.storage.db.i;
import com.tealium.core.Logger;
import com.tealium.core.messaging.NewSessionListener;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/f0;", "Lcom/tealium/core/persistence/DataLayer;", "Lcom/tealium/core/messaging/NewSessionListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f0 implements DataLayer, NewSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19169a;
    public final com.tealium.core.messaging.c b;
    public final CoroutineScope c;
    public final KeyValueDao d;
    public final long e;
    public final String f;
    public boolean g;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "k", "Lcom/tealium/core/persistence/e0;", "v", "", "a", "(Ljava/lang/String;Lcom/tealium/core/persistence/e0;)V"}, k = 3, mv = {1, 6, 0})
    final class a extends Lambda implements Function2<String, e0, Unit> {
        public final /* synthetic */ ContextScope h;
        public final /* synthetic */ com.tealium.core.messaging.c i;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.persistence.PersistentStorage$1$1", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tealium.core.persistence.f0$a$a, reason: collision with other inner class name */
        final class C0391a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ e0 p;
            public final /* synthetic */ com.tealium.core.messaging.c q;
            public final /* synthetic */ String r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0391a(e0 e0Var, com.tealium.core.messaging.c cVar, String str, Continuation continuation) {
                super(2, continuation);
                this.p = e0Var;
                this.q = cVar;
                this.r = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0391a(this.p, this.q, this.r, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C0391a c0391a = (C0391a) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c0391a.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str = this.r;
                e0 e0Var = this.p;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                try {
                    Object objB = n0.b(e0Var);
                    com.tealium.core.messaging.c cVar = this.q;
                    if (objB == null) {
                        objB = e0Var.b;
                    }
                    cVar.e(objB, str);
                } catch (Exception e) {
                    Logger.f19124a.b("Tealium-1.6.0", "Exception handling onDataUpdated(" + str + ", " + e0Var + "): " + e.getMessage());
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.tealium.core.messaging.c cVar, ContextScope contextScope) {
            super(2);
            this.h = contextScope;
            this.i = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String k = (String) obj;
            e0 v = (e0) obj2;
            Intrinsics.h(k, "k");
            Intrinsics.h(v, "v");
            BuildersKt.c(this.h, null, null, new C0391a(v, this.i, k, null), 3);
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", i.a.n, "", "a", "(Ljava/util/Set;)V"}, k = 3, mv = {1, 6, 0})
    final class b extends Lambda implements Function1<Set<? extends String>, Unit> {
        public final /* synthetic */ ContextScope h;
        public final /* synthetic */ com.tealium.core.messaging.c i;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.persistence.PersistentStorage$2$1", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ com.tealium.core.messaging.c p;
            public final /* synthetic */ Set q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.tealium.core.messaging.c cVar, Set set, Continuation continuation) {
                super(2, continuation);
                this.p = cVar;
                this.q = set;
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
                Set set = this.q;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                try {
                    this.p.q(set);
                } catch (Exception e) {
                    Logger.f19124a.b("Tealium-1.6.0", "Exception handling onDataRemoved(" + set + "): " + e.getMessage());
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.tealium.core.messaging.c cVar, ContextScope contextScope) {
            super(1);
            this.h = contextScope;
            this.i = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Set keys = (Set) obj;
            Intrinsics.h(keys, "keys");
            BuildersKt.c(this.h, null, null, new a(this.i, keys, null), 3);
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.persistence.PersistentStorage$all$2$1", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
    final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return f0.this.new c(continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            f0.this.d.i();
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.persistence.PersistentStorage$notifyRemoved$1", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Set q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set set, Continuation continuation) {
            super(2, continuation);
            this.q = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return f0.this.new d(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            dVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set set = this.q;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            try {
                f0.this.b.q(set);
            } catch (Exception e) {
                Logger.f19124a.b("Tealium-1.6.0", "Exception handling onDataRemoved(" + set + "): " + e.getMessage());
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.tealium.core.persistence.PersistentStorage$notifyUpdated$1", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String q;
        public final /* synthetic */ Object r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object obj, Continuation continuation) {
            super(2, continuation);
            this.q = str;
            this.r = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return f0.this.new e(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            e eVar = (e) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            eVar.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.r;
            String str = this.q;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            try {
                f0.this.b.e(obj2, str);
            } catch (Exception e) {
                Logger.f19124a.b("Tealium-1.6.0", "Exception handling onDataUpdated(" + str + ", " + obj2 + "): " + e.getMessage());
            }
            return Unit.f24250a;
        }
    }

    public f0(h hVar, com.tealium.core.messaging.c cVar, ContextScope contextScope, long j) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        g0 g0Var = new g0(hVar, "datalayer", false, new a(cVar, contextScope), new b(cVar, contextScope));
        g0Var.i();
        this.f19169a = concurrentHashMap;
        this.b = cVar;
        this.c = contextScope;
        this.d = g0Var;
        this.e = j;
        this.f = "DataLayer";
        this.g = true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getE() {
        return this.g;
    }

    public final void E(long j) {
        KeyValueDao keyValueDao = this.d;
        Unit unit = null;
        g0 g0Var = keyValueDao instanceof g0 ? (g0) keyValueDao : null;
        if (g0Var != null) {
            g0Var.f(j);
            unit = Unit.f24250a;
        }
        if (unit == null) {
            Map all = keyValueDao.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : all.entrySet()) {
                if (Intrinsics.c(((e0) entry.getValue()).c, Expiry.f19166a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                keyValueDao.h(((Map.Entry) it.next()).getKey());
            }
        }
    }

    public final void F(String str, Serializable serializable, Serializer serializer, Expiry expiry, Serialization serialization) {
        boolean zC = Intrinsics.c(expiry, Expiry.c);
        KeyValueDao keyValueDao = this.d;
        Map map = this.f19169a;
        if (!zC) {
            keyValueDao.c(new e0(str, serializer.serialize(serializable), expiry, null, serialization));
            map.remove(str);
        } else {
            if (serializable == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            map.put(str, serializable);
            keyValueDao.h(str);
            BuildersKt.c(this.c, null, null, new e(str, serializable, null), 3);
        }
    }

    public final String G(String key) {
        Intrinsics.h(key, "key");
        Object obj = this.f19169a.get(key);
        Object objA = null;
        if (obj != null) {
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                return str;
            }
        }
        Deserializer b2 = h0.e().getB();
        e0 e0Var = (e0) this.d.b(key);
        if (e0Var != null) {
            try {
                objA = b2.a(e0Var.b);
            } catch (Exception unused) {
                Logger.f19124a.b("Tealium-1.6.0", "Exception deserializing " + e0Var.b);
            }
        }
        return (String) objA;
    }

    public final void H(String str, boolean z, Expiry expiry) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Serde fVar = h0.f;
        if (fVar == null) {
            fVar = new f();
        }
        h0.f = fVar;
        h0.f19171a.put(Boolean.TYPE, fVar);
        F(str, boolValueOf, fVar.getF19167a(), expiry, Serialization.BOOLEAN);
    }

    public final void I(double d2, String str) {
        Double dValueOf = Double.valueOf(d2);
        Serde qVar = h0.e;
        if (qVar == null) {
            qVar = new q();
        }
        h0.e = qVar;
        h0.f19171a.put(Double.TYPE, qVar);
        F(str, dValueOf, qVar.getF19167a(), Expiry.b, Serialization.DOUBLE);
    }

    public final void J(String key, String value, Expiry expiry) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        F(key, value, h0.e().getF19167a(), expiry, Serialization.STRING);
    }

    public final void K(String key) {
        Intrinsics.h(key, "key");
        if (this.f19169a.remove(key) == null) {
            this.d.h(key);
        } else {
            BuildersKt.c(this.c, null, null, new d(SetsKt.i(key), null), 3);
        }
    }

    @Override // com.tealium.core.messaging.NewSessionListener
    public final void f(long j) {
        if (this.e == j) {
            return;
        }
        E(j);
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getD() {
        return this.f;
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        Map all = this.d.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(all.size()));
        for (Map.Entry entry : all.entrySet()) {
            Object key = entry.getKey();
            Object objB = n0.b((e0) entry.getValue());
            if (objB == null) {
                objB = ((e0) entry.getValue()).b;
            }
            linkedHashMap.put(key, objB);
        }
        LinkedHashMap linkedHashMapM = MapsKt.m(linkedHashMap, this.f19169a);
        BuildersKt.c(this.c, null, null, new c(null), 3);
        return linkedHashMapM;
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.g = z;
    }
}
