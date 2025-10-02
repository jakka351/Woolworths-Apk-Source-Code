package au.com.woolworths.feature.shop.instore.navigation.di;

import android.content.Context;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositionInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ReleaseModule_ProvidePositioningInteractorFactory implements Factory<PositioningInteractor> {
    public static PositionInteractorImpl a(ReleaseModule releaseModule, Context context, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        releaseModule.getClass();
        Intrinsics.h(context, "context");
        return new PositionInteractorImpl(context, releaseSettingsInteractorImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
