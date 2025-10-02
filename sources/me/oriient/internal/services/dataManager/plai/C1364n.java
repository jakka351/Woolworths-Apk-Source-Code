package me.oriient.internal.services.dataManager.plai;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.plai.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1364n implements InterfaceC1351a {

    @NotNull
    private static final C1352b Companion = new C1352b();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f25306a;
    public final PlaiSqlDatabase b;
    public final Lazy c;
    public final Lazy d;

    public C1364n(CoroutineScope databaseCoroutineScope, PlaiSqlDatabase db) {
        Intrinsics.h(databaseCoroutineScope, "databaseCoroutineScope");
        Intrinsics.h(db, "db");
        this.f25306a = databaseCoroutineScope;
        this.b = db;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    public final Object a(Function1 function1, Continuation continuation) {
        return BuildersKt.f(this.f25306a.getE(), new C1358h(function1, this, null), continuation);
    }
}
