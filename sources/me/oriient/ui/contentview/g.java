package me.oriient.ui.contentview;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import me.oriient.ipssdk.ips.IPSCore;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f26617a = new g();
    private static final WeakHashMap b = new WeakHashMap();
    private static boolean c;
    private static Job d;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f26618a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.f26618a;
            if (i == 0) {
                ResultKt.b(obj);
                g.f26617a.a();
                this.f26618a = 1;
                if (DelayKt.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            g.f26617a.b();
            return Unit.f24250a;
        }
    }

    private g() {
    }

    private final void c() {
        if (d != null) {
            return;
        }
        b();
    }

    private final void a(Job job) {
        Job job2 = d;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        d = job;
    }

    public final void b(ContentView contentView) {
        Intrinsics.h(contentView, "contentView");
        b.remove(contentView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        a(BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a), null, null, new a(null), 3));
    }

    public final void a(ContentView contentView) {
        Intrinsics.h(contentView, "contentView");
        b.put(contentView, Boolean.FALSE);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        boolean z;
        boolean z2 = c;
        Set<ContentView> setKeySet = b.keySet();
        Intrinsics.g(setKeySet, "<get-keys>(...)");
        for (ContentView contentView : setKeySet) {
            b.put(contentView, Boolean.valueOf(contentView.calcVisibility$ui_content_view_publishRelease()));
        }
        WeakHashMap weakHashMap = b;
        if (weakHashMap.isEmpty()) {
            z = false;
        } else {
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                Intrinsics.g(value, "<get-value>(...)");
                if (((Boolean) value).booleanValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z2 != z) {
            c = z;
            a(z);
        }
        if (b.isEmpty()) {
            a((Job) null);
        }
    }

    private final void a(boolean z) {
        if (z) {
            IPSCore.userDidEngageWithFeature("me.oriient.mapPresented");
            IPSCore.registerApplicationEvent(2);
        } else {
            if (z) {
                return;
            }
            IPSCore.registerApplicationEvent(3);
        }
    }
}
