package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.appcomms.inbox.client.InboxUserIdSource;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppCommsConfigsModule_ProvideInboxUserIdSourceFactory implements Factory<InboxUserIdSource> {
    /* JADX WARN: Type inference failed for: r0v1, types: [au.com.woolworths.android.onesite.app.di.b] */
    public static b a(final ShopAccountInteractor accountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        return new InboxUserIdSource() { // from class: au.com.woolworths.android.onesite.app.di.b
            @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxUserIdSource
            public final Flow a() {
                return accountInteractor.p;
            }
        };
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
