package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.systemStateManager.SystemStateManagerImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes8.dex */
public final class G4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G4 f25946a = new G4();

    public G4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SystemStateManagerImpl((AppStateProvider) di.get(reflectionFactory.b(AppStateProvider.class)), (ELog) DependencyInjectionKt.getDi().get(reflectionFactory.b(ELog.class)), (CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class)));
    }
}
