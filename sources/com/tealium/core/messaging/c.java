package com.tealium.core.messaging;

import android.app.Activity;
import com.google.android.gms.ads.RequestConfiguration;
import com.tealium.core.Module;
import com.tealium.core.consent.ConsentManagementPolicy;
import com.tealium.core.consent.UserConsentPreferences;
import com.tealium.core.persistence.DataLayer;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.dispatcher.Dispatch;
import com.tealium.remotecommands.RemoteCommandRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/messaging/c;", "Lcom/tealium/core/messaging/EventRouter;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c implements EventRouter {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f19156a = new ConcurrentLinkedQueue();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Activity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.i = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof ActivityObserverListener) {
                    ((ActivityObserverListener) listener).onActivityPaused(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Activity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(0);
            this.i = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof ActivityObserverListener) {
                    ((ActivityObserverListener) listener).onActivityResumed(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.tealium.core.messaging.c$c, reason: collision with other inner class name */
    final class C0387c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Activity i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0387c(Activity activity, boolean z) {
            super(0);
            this.i = activity;
            this.j = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof ActivityObserverListener) {
                    ((ActivityObserverListener) listener).m(this.i, this.j);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List i;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.messaging.EventDispatcher$onBatchDispatchSend$2$1", f = "EventRouter.kt", l = {166}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public List p;
            public Iterator q;
            public int r;
            public final /* synthetic */ c s;
            public final /* synthetic */ List t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, List list, Continuation continuation) {
                super(2, continuation);
                this.s = cVar;
                this.t = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.s, this.t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                List list;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.r;
                if (i == 0) {
                    ResultKt.b(obj);
                    it = this.s.b.iterator();
                    list = this.t;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.q;
                    list = this.p;
                    ResultKt.b(obj);
                }
                while (it.hasNext()) {
                    Listener listener = (Listener) it.next();
                    if ((listener instanceof BatchDispatchSendListener) && (!(listener instanceof Module) || ((Module) listener).getF19138a())) {
                        this.p = list;
                        this.q = it;
                        this.r = 1;
                        if (((BatchDispatchSendListener) listener).o(list, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(0);
            this.i = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            BuildersKt.d(EmptyCoroutineContext.d, new a(c.this, this.i, null));
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Set i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Set set) {
            super(0);
            this.i = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof DataLayer.DataLayerUpdatedListener) {
                    ((DataLayer.DataLayerUpdatedListener) listener).q(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String i;
        public final /* synthetic */ Object j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object obj) {
            super(0);
            this.i = str;
            this.j = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof DataLayer.DataLayerUpdatedListener) {
                    ((DataLayer.DataLayerUpdatedListener) listener).e(this.j, this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ com.tealium.dispatcher.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.tealium.dispatcher.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof DispatchDroppedListener) {
                    ((DispatchDroppedListener) listener).k(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ com.tealium.dispatcher.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.tealium.dispatcher.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof DispatchQueuedListener) {
                    ((DispatchQueuedListener) listener).p(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ com.tealium.dispatcher.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.tealium.dispatcher.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof DispatchReadyListener) {
                    ((DispatchReadyListener) listener).x(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Dispatch i;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.tealium.core.messaging.EventDispatcher$onDispatchSend$2$1", f = "EventRouter.kt", l = {146}, m = "invokeSuspend")
        final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Dispatch p;
            public Iterator q;
            public int r;
            public final /* synthetic */ c s;
            public final /* synthetic */ Dispatch t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, Dispatch dispatch, Continuation continuation) {
                super(2, continuation);
                this.s = cVar;
                this.t = dispatch;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.s, this.t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Dispatch dispatch;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                int i = this.r;
                if (i == 0) {
                    ResultKt.b(obj);
                    it = this.s.b.iterator();
                    dispatch = this.t;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.q;
                    dispatch = this.p;
                    ResultKt.b(obj);
                }
                while (it.hasNext()) {
                    Listener listener = (Listener) it.next();
                    if ((listener instanceof DispatchSendListener) && (!(listener instanceof Module) || ((Module) listener).getF19138a())) {
                        this.p = dispatch;
                        this.q = it;
                        this.r = 1;
                        if (((DispatchSendListener) listener).d(dispatch, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Dispatch dispatch) {
            super(0);
            this.i = dispatch;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            BuildersKt.d(EmptyCoroutineContext.d, new a(c.this, this.i, null));
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class k extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.i = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof EvaluateJavascriptListener) {
                    ((EvaluateJavascriptListener) listener).a(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class l extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class m extends Lambda implements Function0<Unit> {
        public final /* synthetic */ LibrarySettings i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(LibrarySettings librarySettings) {
            super(0);
            this.i = librarySettings;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof LibrarySettingsUpdatedListener) {
                    ((LibrarySettingsUpdatedListener) listener).C(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class n extends Lambda implements Function0<Unit> {
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j) {
            super(0);
            this.i = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof NewSessionListener) {
                    ((NewSessionListener) listener).f(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class o extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Dispatch i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Dispatch dispatch) {
            super(0);
            this.i = dispatch;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof RemoteCommandListener) {
                    ((RemoteCommandListener) listener).j(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class p extends Lambda implements Function0<Unit> {
        public final /* synthetic */ RemoteCommandRequest i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(RemoteCommandRequest remoteCommandRequest) {
            super(0);
            this.i = remoteCommandRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof RemoteCommandListener) {
                    ((RemoteCommandListener) listener).w(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class q extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Class i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Class cls) {
            super(0);
            this.i = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof ValidationChangedListener) {
                    ((ValidationChangedListener) listener).g(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class r extends Lambda implements Function0<Unit> {
        public final /* synthetic */ long i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j) {
            super(0);
            this.i = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof SessionStartedListener) {
                    ((SessionStartedListener) listener).z(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class s extends Lambda implements Function0<Unit> {
        public final /* synthetic */ UserConsentPreferences i;
        public final /* synthetic */ ConsentManagementPolicy j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(UserConsentPreferences userConsentPreferences, ConsentManagementPolicy consentManagementPolicy) {
            super(0);
            this.i = userConsentPreferences;
            this.j = consentManagementPolicy;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof UserConsentPreferencesUpdatedListener) {
                    ((UserConsentPreferencesUpdatedListener) listener).n(this.i, this.j);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    final class t extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(0);
            this.i = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Iterator it = c.this.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                if (listener instanceof VisitorIdUpdatedListener) {
                    ((VisitorIdUpdatedListener) listener).v(this.i);
                }
            }
            return Unit.f24250a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tealium/core/messaging/Listener;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "a", "()V"}, k = 3, mv = {1, 6, 0})
    final class u extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Messenger i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Messenger messenger) {
            super(0);
            this.i = messenger;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CopyOnWriteArraySet copyOnWriteArraySet = c.this.b;
            Messenger messenger = this.i;
            Iterator it = CollectionsKt.A(copyOnWriteArraySet, JvmClassMappingKt.b(messenger.f19152a)).iterator();
            while (it.hasNext()) {
                messenger.a((Listener) it.next());
            }
            return Unit.f24250a;
        }
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        b(new m(settings));
    }

    @Override // com.tealium.core.messaging.EvaluateJavascriptListener
    public final void a(String str) {
        b(new k(str));
    }

    public final void b(Function0 function0) {
        if (!this.c.get()) {
            this.f19156a.add(function0);
        } else {
            h();
            function0.invoke();
        }
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.c((Listener) obj, this)) {
                arrayList.add(obj);
            }
        }
        this.b.addAll(arrayList);
    }

    @Override // com.tealium.core.messaging.DispatchSendListener
    public final Object d(Dispatch dispatch, Continuation continuation) {
        b(new j(dispatch));
        return Unit.f24250a;
    }

    @Override // com.tealium.core.persistence.DataLayer.DataLayerUpdatedListener
    public final void e(Object value, String key) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        b(new f(key, value));
    }

    @Override // com.tealium.core.messaging.NewSessionListener
    public final void f(long j2) {
        b(new n(j2));
    }

    @Override // com.tealium.core.messaging.ValidationChangedListener
    public final void g(Class cls) {
        b(new q(cls));
    }

    public final void h() {
        Queue queue = this.f19156a;
        if (queue.isEmpty()) {
            return;
        }
        for (Function0 function0 = (Function0) queue.poll(); function0 != null; function0 = (Function0) queue.poll()) {
            function0.invoke();
        }
    }

    public final void i(Listener listener) {
        if (listener.equals(this)) {
            return;
        }
        this.b.add(listener);
    }

    @Override // com.tealium.core.messaging.RemoteCommandListener
    public final void j(Dispatch dispatch) {
        Intrinsics.h(dispatch, "dispatch");
        b(new o(dispatch));
    }

    @Override // com.tealium.core.messaging.DispatchDroppedListener
    public final void k(com.tealium.dispatcher.a aVar) {
        b(new g(aVar));
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void m(Activity activity, boolean z) {
        b(new C0387c(activity, z));
    }

    @Override // com.tealium.core.messaging.UserConsentPreferencesUpdatedListener
    public final void n(UserConsentPreferences userConsentPreferences, ConsentManagementPolicy policy) {
        Intrinsics.h(policy, "policy");
        b(new s(userConsentPreferences, policy));
    }

    @Override // com.tealium.core.messaging.BatchDispatchSendListener
    public final Object o(List list, Continuation continuation) {
        b(new d(list));
        return Unit.f24250a;
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityPaused(Activity activity) {
        b(new a(activity));
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityResumed(Activity activity) {
        b(new b(activity));
    }

    @Override // com.tealium.core.messaging.DispatchQueuedListener
    public final void p(com.tealium.dispatcher.a aVar) {
        b(new h(aVar));
    }

    @Override // com.tealium.core.persistence.DataLayer.DataLayerUpdatedListener
    public final void q(Set keys) {
        Intrinsics.h(keys, "keys");
        b(new e(keys));
    }

    @Override // com.tealium.core.messaging.VisitorIdUpdatedListener
    public final void v(String visitorId) {
        Intrinsics.h(visitorId, "visitorId");
        b(new t(visitorId));
    }

    @Override // com.tealium.core.messaging.RemoteCommandListener
    public final void w(RemoteCommandRequest remoteCommandRequest) {
        b(new p(remoteCommandRequest));
    }

    @Override // com.tealium.core.messaging.DispatchReadyListener
    public final void x(com.tealium.dispatcher.a aVar) {
        b(new i(aVar));
    }

    @Override // com.tealium.core.messaging.SessionStartedListener
    public final void z(long j2) {
        b(new r(j2));
    }
}
