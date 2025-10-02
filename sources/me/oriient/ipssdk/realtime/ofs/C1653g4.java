package me.oriient.ipssdk.realtime.ofs;

import com.squareup.sqldelight.android.AndroidSqliteDriver;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.database.TaggingSqlDatabase;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabaseImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.g4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1653g4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1653g4 f26079a = new C1653g4();

    public C1653g4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TaggingSqlDatabase.Companion companion = TaggingSqlDatabase.INSTANCE;
        SqlDriver.Schema schema = companion.getSchema();
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new EventTaggingDatabaseImpl(companion.invoke(new AndroidSqliteDriver(schema, ((ContextProvider) di.get(reflectionFactory.b(ContextProvider.class))).getContext(), "me.oriient.ipssdk.realtime.database.tagging")), (Logger) DependencyInjectionKt.getDi().get(reflectionFactory.b(Logger.class)), (CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class)));
    }
}
