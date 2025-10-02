package au.com.woolworths.android.onesite.di;

import au.com.woolworths.android.onesite.network.NetworkExceptions;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BaseModule_ProvideNetworkExceptions$base_impl_releaseFactory implements Factory<NetworkExceptions> {
    public static NetworkExceptions a(Gson gson) {
        Intrinsics.h(gson, "gson");
        return new NetworkExceptions(gson);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
