package me.oriient.internal.services.dataManager;

import com.squareup.sqldelight.EnumColumnAdapter;
import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import me.oriient.internal.services.dataModel.engine.MapGridType;

/* renamed from: me.oriient.internal.services.dataManager.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1232b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1232b f25091a = new C1232b();

    public C1232b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DataManagerSqlDatabase.Companion companion = DataManagerSqlDatabase.INSTANCE;
        return companion.invoke(new AndroidSqliteDriver(companion.getSchema(), ((ContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext(), "me.oriient.internal.dataManager.database"), new DbMapGrid.Adapter(new EnumColumnAdapter(MapGridType.values())));
    }
}
