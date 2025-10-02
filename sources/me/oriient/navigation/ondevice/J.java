package me.oriient.navigation.ondevice;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.InterfaceC1783y;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class J implements InterfaceC1783y {

    @NotNull
    private static final v Companion = new v();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26280a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public String e;
    public final Lazy f;

    public J() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26280a = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.a().inject(reflectionFactory.b(ELog.class));
        this.c = DiKt.a().inject(reflectionFactory.b(p.class));
        this.d = DiKt.a().inject(reflectionFactory.b(InterfaceC1785a.class));
        this.f = LazyKt.b(G.f26277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.navigation.ondevice.J r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.J.a(me.oriient.navigation.ondevice.J, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
