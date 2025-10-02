package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.appcomms.inbox.client.InboxChatbotSessionIdSource;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor$special$$inlined$map$3;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppCommsConfigsModule_ProvideInboxChatbotSessionIdSourceFactory implements Factory<InboxChatbotSessionIdSource> {
    /* JADX WARN: Type inference failed for: r0v1, types: [au.com.woolworths.android.onesite.app.di.a] */
    public static a a(final ShopAccountInteractor accountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        return new InboxChatbotSessionIdSource() { // from class: au.com.woolworths.android.onesite.app.di.a
            @Override // au.com.woolworths.foundation.appcomms.inbox.client.InboxChatbotSessionIdSource
            public final ShopAccountInteractor$special$$inlined$map$3 a() {
                return accountInteractor.q;
            }
        };
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
