package me.oriient.internal.services.dataManager.plaiCategories;

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

/* loaded from: classes7.dex */
public final class S implements E {

    @NotNull
    private static final F Companion = new F();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f25334a;
    public final PlaiSqlDatabase b;
    public final Lazy c;
    public final Lazy d;

    public S(CoroutineScope databaseCoroutineScope, PlaiSqlDatabase db) {
        Intrinsics.h(databaseCoroutineScope, "databaseCoroutineScope");
        Intrinsics.h(db, "db");
        this.f25334a = databaseCoroutineScope;
        this.b = db;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }

    public final Object a(Function1 function1, Continuation continuation) {
        return BuildersKt.f(this.f25334a.getE(), new L(function1, this, null), continuation);
    }
}
