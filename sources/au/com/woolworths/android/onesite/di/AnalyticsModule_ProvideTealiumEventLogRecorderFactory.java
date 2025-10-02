package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.analytics.tealium.NoOpTealiumEventLogRecorder;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumEventLogRecorder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AnalyticsModule_ProvideTealiumEventLogRecorderFactory implements Factory<TealiumEventLogRecorder> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        return NoOpTealiumEventLogRecorder.f4072a;
    }
}
