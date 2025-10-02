package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.logging.dynatrace.DynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.TimberDynatraceLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideDyntraceLoggerFactory implements Factory<DynatraceLogger> {

    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
    }

    public static TimberDynatraceLogger a() {
        return new TimberDynatraceLogger();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TimberDynatraceLogger();
    }
}
