package au.com.woolworths.feature.shop.inbox.di;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import kotlin.collections.SetsKt;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class InboxAppModule_ProvideInboxFeaturesFactory implements Factory<Set<Feature>> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return SetsKt.i(InboxFeature.d);
    }
}
