package me.oriient.navigation.ondevice.navgraph;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.navigation.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class v implements InterfaceC1798d {

    @NotNull
    private static final C1799e Companion = new C1799e();

    /* renamed from: a, reason: collision with root package name */
    public final me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.u f26326a;
    public final FileManager b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public v(me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.u database, FileManager fileManager) {
        Intrinsics.h(database, "database");
        Intrinsics.h(fileManager, "fileManager");
        this.f26326a = database;
        this.b = fileManager;
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.d = DiKt.a().inject(reflectionFactory.b(TimeProvider.class));
        this.e = LazyKt.b(C1800f.f26310a);
    }

    public final void a(Function1 function1) {
        BuildersKt.c((CoroutineScope) this.e.getD(), null, null, new C1809o(function1, this, null), 3);
    }
}
