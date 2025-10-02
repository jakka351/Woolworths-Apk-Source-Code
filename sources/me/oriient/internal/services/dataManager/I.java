package me.oriient.internal.services.dataManager;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.services.plai.database.DbPlaiProducts;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I f25074a = new I();

    public I() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PlaiSqlDatabase.Companion companion = PlaiSqlDatabase.INSTANCE;
        AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(companion.getSchema(), ((ContextProvider) InternalDiKt.getDi().get(Reflection.f24268a.b(ContextProvider.class))).getContext(), "me.oriient.internal.plai.database");
        me.oriient.internal.services.dataManager.utils.c.Companion.getClass();
        me.oriient.internal.services.dataManager.utils.a aVar = me.oriient.internal.services.dataManager.utils.c.f25416a;
        return companion.invoke(androidSqliteDriver, new DbPlaiProducts.Adapter(aVar, aVar));
    }
}
