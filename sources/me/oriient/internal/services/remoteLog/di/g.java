package me.oriient.internal.services.remoteLog.di;

import android.content.Context;
import com.squareup.sqldelight.android.AndroidSqliteDriver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.remoteLog.database.DatabaseServiceImpl;
import me.oriient.internal.services.remoteLog.database.RemoteLogDatabase;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(0);
        this.f25533a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RemoteLogDatabase.Companion companion = RemoteLogDatabase.INSTANCE;
        RemoteLogDatabase remoteLogDatabaseInvoke = companion.invoke(new AndroidSqliteDriver(companion.getSchema(), this.f25533a, "me.oriient.internal.services.remoteLog.database"));
        DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
        if (dependencyInjectionImpl == null) {
            Intrinsics.p("di");
            throw null;
        }
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        TimeProvider timeProvider = (TimeProvider) dependencyInjectionImpl.get(reflectionFactory.b(TimeProvider.class));
        DependencyInjectionImpl dependencyInjectionImpl2 = i.f25535a;
        if (dependencyInjectionImpl2 != null) {
            return new DatabaseServiceImpl(remoteLogDatabaseInvoke, timeProvider, (CoroutineContextProvider) dependencyInjectionImpl2.get(reflectionFactory.b(CoroutineContextProvider.class)));
        }
        Intrinsics.p("di");
        throw null;
    }
}
