package au.com.woolworths.android.onesite.di;

import android.app.Application;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEnvironment;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import com.tealium.adidentifier.AdIdentifier;
import com.tealium.core.Environment;
import com.tealium.core.LogLevel;
import com.tealium.core.Tealium;
import com.tealium.core.TealiumConfig;
import com.tealium.lifecycle.Lifecycle;
import com.tealium.remotecommanddispatcher.RemoteCommandDispatcher;
import com.tealium.tagmanagementdispatcher.TagManagementDispatcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvidesTealiumFactory implements Factory<Tealium> {
    public static Tealium a(Application application, AppConfig appConfig, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        TealiumEnvironment[] tealiumEnvironmentArr = TealiumEnvironment.d;
        TealiumConfigData tealiumConfigDataC = appConfig.c();
        String str = tealiumConfigDataC.b;
        String str2 = tealiumConfigDataC.c;
        boolean zC = featureToggleManager.c(BaseFeature.h);
        AdIdentifier.Companion companion = AdIdentifier.e;
        TealiumConfig tealiumConfig = new TealiumConfig(application, str, str2, Environment.PROD, SetsKt.f(TagManagementDispatcher.i, RemoteCommandDispatcher.f), zC ? SetsKt.f(companion) : SetsKt.f(companion, Lifecycle.k), 48);
        tealiumConfig.p = LogLevel.PROD;
        tealiumConfig.e = tealiumConfigDataC.d;
        tealiumConfig.l = false;
        tealiumConfig.o = tealiumConfigDataC.e;
        LinkedHashMap linkedHashMap = Tealium.A;
        String name = tealiumConfigDataC.f4074a;
        a aVar = new a(featureToggleManager, application, releaseSettingsInteractorImpl, tealiumConfigDataC);
        Intrinsics.h(name, "name");
        Tealium tealium = new Tealium(tealiumConfig, aVar);
        Tealium.A.put(name, tealium);
        return tealium;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
