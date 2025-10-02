package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1321t implements InterfaceC1306d {

    @NotNull
    private static final C1307e Companion = new C1307e();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f25225a;
    public final DataManagerSqlDatabase b;
    public final FileManager c;
    public final Lazy d;
    public final Lazy e;

    public C1321t(CoroutineScope databaseCoroutineScope, DataManagerSqlDatabase dataManagerDatabase, FileManager fileManager) {
        Intrinsics.h(databaseCoroutineScope, "databaseCoroutineScope");
        Intrinsics.h(dataManagerDatabase, "dataManagerDatabase");
        Intrinsics.h(fileManager, "fileManager");
        this.f25225a = databaseCoroutineScope;
        this.b = dataManagerDatabase;
        this.c = fileManager;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.d = di.inject(reflectionFactory.b(Logger.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
    }
}
