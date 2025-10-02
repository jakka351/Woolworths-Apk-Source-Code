package me.oriient.internal.services.remoteLog;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.scheduler.Scheduler;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.remoteLog.database.DatabaseService;
import me.oriient.internal.services.remoteLog.di.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements DiProvidable {

    @NotNull
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25536a;
    public final Lazy b;
    public final Lazy c;
    public final Mutex d;
    public final Mutex e;

    public e() {
        DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
        if (dependencyInjectionImpl == null) {
            Intrinsics.p("di");
            throw null;
        }
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25536a = dependencyInjectionImpl.inject(reflectionFactory.b(DatabaseService.class));
        DependencyInjectionImpl dependencyInjectionImpl2 = i.f25535a;
        if (dependencyInjectionImpl2 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.b = dependencyInjectionImpl2.inject(reflectionFactory.b(RestService.class));
        DependencyInjectionImpl dependencyInjectionImpl3 = i.f25535a;
        if (dependencyInjectionImpl3 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.c = dependencyInjectionImpl3.inject(reflectionFactory.b(Scheduler.class));
        this.d = MutexKt.a();
        this.e = MutexKt.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.remoteLog.e.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        if (r2.mo395removeBatcheK7Yl6k(r10, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        if (r2.mo395removeBatcheK7Yl6k(r10, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a2, code lost:
    
        if (r2.upsertBatch(r10, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a5, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c0, code lost:
    
        if (r11.mo395removeBatcheK7Yl6k(r10, r0) != r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.remoteLog.models.a r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.remoteLog.e.a(me.oriient.internal.services.remoteLog.models.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
