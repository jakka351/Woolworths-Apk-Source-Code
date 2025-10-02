package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.DaggerFirebaseSessionsComponent;
import com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory;
import com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory;
import com.google.firebase.sessions.dagger.internal.DoubleCheck;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.LocalOverrideSettings_Factory;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory;
import com.google.firebase.sessions.settings.RemoteSettings_Factory;
import com.google.firebase.sessions.settings.SessionsSettings_Factory;
import com.google.firebase.sessions.settings.SettingsCacheImpl_Factory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0014\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Companion Companion = new Companion();

    @NotNull
    private static final Qualified<Context> appContext = Qualified.a(Context.class);

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.a(FirebaseApp.class);

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.a(FirebaseInstallationsApi.class);

    @NotNull
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher = new Qualified<>(Background.class, CoroutineDispatcher.class);

    @NotNull
    private static final Qualified<CoroutineDispatcher> blockingDispatcher = new Qualified<>(Blocking.class, CoroutineDispatcher.class);

    @NotNull
    private static final Qualified<TransportFactory> transportFactory = Qualified.a(TransportFactory.class);

    @NotNull
    private static final Qualified<FirebaseSessionsComponent> firebaseSessionsComponent = Qualified.a(FirebaseSessionsComponent.class);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        return ((FirebaseSessionsComponent) componentContainer.h(firebaseSessionsComponent)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessionsComponent getComponents$lambda$1(ComponentContainer componentContainer) {
        DaggerFirebaseSessionsComponent.Builder builder = new DaggerFirebaseSessionsComponent.Builder();
        Object objH = componentContainer.h(appContext);
        Intrinsics.g(objH, "get(...)");
        builder.f15793a = (Context) objH;
        Object objH2 = componentContainer.h(backgroundDispatcher);
        Intrinsics.g(objH2, "get(...)");
        builder.b = (CoroutineContext) objH2;
        Object objH3 = componentContainer.h(blockingDispatcher);
        Intrinsics.g(objH3, "get(...)");
        builder.c = (CoroutineContext) objH3;
        Object objH4 = componentContainer.h(firebaseApp);
        Intrinsics.g(objH4, "get(...)");
        builder.d = (FirebaseApp) objH4;
        Object objH5 = componentContainer.h(firebaseInstallationsApi);
        Intrinsics.g(objH5, "get(...)");
        builder.e = (FirebaseInstallationsApi) objH5;
        Provider providerE = componentContainer.e(transportFactory);
        Intrinsics.g(providerE, "getProvider(...)");
        builder.f = providerE;
        Preconditions.a(Context.class, builder.f15793a);
        Preconditions.a(CoroutineContext.class, builder.b);
        Preconditions.a(CoroutineContext.class, builder.c);
        Preconditions.a(FirebaseApp.class, builder.d);
        Preconditions.a(FirebaseInstallationsApi.class, builder.e);
        Preconditions.a(Provider.class, builder.f);
        Context context = builder.f15793a;
        CoroutineContext coroutineContext = builder.b;
        CoroutineContext coroutineContext2 = builder.c;
        FirebaseApp firebaseApp2 = builder.d;
        FirebaseInstallationsApi firebaseInstallationsApi2 = builder.e;
        Provider provider = builder.f;
        DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl firebaseSessionsComponentImpl = new DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl();
        firebaseSessionsComponentImpl.f15794a = InstanceFactory.a(firebaseApp2);
        InstanceFactory instanceFactoryA = InstanceFactory.a(context);
        firebaseSessionsComponentImpl.b = instanceFactoryA;
        firebaseSessionsComponentImpl.c = DoubleCheck.a(new LocalOverrideSettings_Factory(instanceFactoryA));
        firebaseSessionsComponentImpl.d = DoubleCheck.a(FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.InstanceHolder.f15802a);
        firebaseSessionsComponentImpl.e = InstanceFactory.a(firebaseInstallationsApi2);
        firebaseSessionsComponentImpl.f = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(firebaseSessionsComponentImpl.f15794a));
        InstanceFactory instanceFactoryA2 = InstanceFactory.a(coroutineContext2);
        firebaseSessionsComponentImpl.g = instanceFactoryA2;
        firebaseSessionsComponentImpl.h = DoubleCheck.a(new RemoteSettingsFetcher_Factory(instanceFactoryA2, firebaseSessionsComponentImpl.f));
        firebaseSessionsComponentImpl.i = InstanceFactory.a(coroutineContext);
        com.google.firebase.sessions.dagger.internal.Provider providerA = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(firebaseSessionsComponentImpl.b, firebaseSessionsComponentImpl.g));
        firebaseSessionsComponentImpl.j = providerA;
        com.google.firebase.sessions.dagger.internal.Provider providerA2 = DoubleCheck.a(new SettingsCacheImpl_Factory(firebaseSessionsComponentImpl.i, firebaseSessionsComponentImpl.d, providerA));
        firebaseSessionsComponentImpl.k = providerA2;
        com.google.firebase.sessions.dagger.internal.Provider providerA3 = DoubleCheck.a(new RemoteSettings_Factory(firebaseSessionsComponentImpl.d, firebaseSessionsComponentImpl.e, firebaseSessionsComponentImpl.f, firebaseSessionsComponentImpl.h, providerA2));
        firebaseSessionsComponentImpl.l = providerA3;
        firebaseSessionsComponentImpl.m = DoubleCheck.a(new SessionsSettings_Factory(firebaseSessionsComponentImpl.c, providerA3));
        com.google.firebase.sessions.dagger.internal.Provider providerA4 = DoubleCheck.a(FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.InstanceHolder.f15803a);
        firebaseSessionsComponentImpl.n = providerA4;
        firebaseSessionsComponentImpl.o = DoubleCheck.a(new SessionGenerator_Factory(firebaseSessionsComponentImpl.d, providerA4));
        com.google.firebase.sessions.dagger.internal.Provider providerA5 = DoubleCheck.a(new EventGDTLogger_Factory(InstanceFactory.a(provider)));
        firebaseSessionsComponentImpl.p = providerA5;
        firebaseSessionsComponentImpl.q = DoubleCheck.a(new SessionFirelogPublisherImpl_Factory(firebaseSessionsComponentImpl.f15794a, firebaseSessionsComponentImpl.e, firebaseSessionsComponentImpl.m, providerA5, firebaseSessionsComponentImpl.i));
        com.google.firebase.sessions.dagger.internal.Provider providerA6 = DoubleCheck.a(new SessionDataSerializer_Factory(firebaseSessionsComponentImpl.o));
        firebaseSessionsComponentImpl.r = providerA6;
        firebaseSessionsComponentImpl.s = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(firebaseSessionsComponentImpl.b, firebaseSessionsComponentImpl.g, providerA6));
        com.google.firebase.sessions.dagger.internal.Provider providerA7 = DoubleCheck.a(new ProcessDataManagerImpl_Factory(firebaseSessionsComponentImpl.b, firebaseSessionsComponentImpl.n));
        firebaseSessionsComponentImpl.t = providerA7;
        com.google.firebase.sessions.dagger.internal.Provider providerA8 = DoubleCheck.a(new SharedSessionRepositoryImpl_Factory(firebaseSessionsComponentImpl.m, firebaseSessionsComponentImpl.o, firebaseSessionsComponentImpl.q, firebaseSessionsComponentImpl.d, firebaseSessionsComponentImpl.s, providerA7, firebaseSessionsComponentImpl.i));
        firebaseSessionsComponentImpl.u = providerA8;
        com.google.firebase.sessions.dagger.internal.Provider providerA9 = DoubleCheck.a(new SessionsActivityLifecycleCallbacks_Factory(providerA8));
        firebaseSessionsComponentImpl.v = providerA9;
        firebaseSessionsComponentImpl.w = DoubleCheck.a(new FirebaseSessions_Factory(firebaseSessionsComponentImpl.f15794a, firebaseSessionsComponentImpl.m, firebaseSessionsComponentImpl.i, providerA9));
        return firebaseSessionsComponentImpl;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseSessions.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.b(firebaseSessionsComponent));
        builderB.f = new com.google.firebase.remoteconfig.a(3);
        builderB.c(2);
        Component componentB = builderB.b();
        Component.Builder builderB2 = Component.b(FirebaseSessionsComponent.class);
        builderB2.f15223a = "fire-sessions-component";
        builderB2.a(Dependency.b(appContext));
        builderB2.a(Dependency.b(backgroundDispatcher));
        builderB2.a(Dependency.b(blockingDispatcher));
        builderB2.a(Dependency.b(firebaseApp));
        builderB2.a(Dependency.b(firebaseInstallationsApi));
        builderB2.a(new Dependency(transportFactory, 1, 1));
        builderB2.f = new com.google.firebase.remoteconfig.a(4);
        return CollectionsKt.R(componentB, builderB2.b(), LibraryVersionComponent.a(LIBRARY_NAME, "3.0.1"));
    }
}
