package dagger.android;

import com.google.common.collect.ImmutableMap;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class DispatchingAndroidInjector_Factory<T> implements Factory<DispatchingAndroidInjector<T>> {
    public static DispatchingAndroidInjector a(ImmutableMap immutableMap, Map map) {
        return new DispatchingAndroidInjector(immutableMap, map);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
