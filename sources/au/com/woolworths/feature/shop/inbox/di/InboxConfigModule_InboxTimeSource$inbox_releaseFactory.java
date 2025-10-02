package au.com.woolworths.feature.shop.inbox.di;

import au.com.woolworths.feature.shop.inbox.domain.InboxTimeSource;
import au.com.woolworths.feature.shop.inbox.domain.RealInboxTimeSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InboxConfigModule_InboxTimeSource$inbox_releaseFactory implements Factory<InboxTimeSource> {

    public static final class InstanceHolder {
    }

    public static RealInboxTimeSource a() {
        return new RealInboxTimeSource();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RealInboxTimeSource();
    }
}
