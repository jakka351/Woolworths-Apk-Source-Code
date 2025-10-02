package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import au.com.woolworths.android.onesite.webview.SquadHeaderInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ReleaseModule_ProvidesSquadWebViewInteractorFactory implements Factory<SquadHeaderInteractor> {
    public static ReleaseSquadHeaderInteractor a(ReleaseModule releaseModule) {
        releaseModule.getClass();
        return new ReleaseSquadHeaderInteractor();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
