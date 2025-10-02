package au.com.woolworths.shop.auth.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsRepository;
import au.com.woolworths.android.onesite.logging.dynatrace.TimberDynatraceLogger;
import au.com.woolworths.foundation.shop.chatbot.session.ChatbotSessionDataStoreKt;
import au.com.woolworths.shop.auth.AccountRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.google.gson.Gson;
import com.tealium.core.Tealium;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAuthAppModule_ProvideShopAccountInteractorFactory implements Factory<ShopAccountInteractor> {
    public static ShopAccountInteractor a(ShopAuthAppModule shopAuthAppModule, AdobeAnalyticsRepository adobeAnalyticsRepository, AccountRepository accountRepository, FirebaseAnalyticsLogger firebaseAnalyticsLogger, TimberDynatraceLogger timberDynatraceLogger, Gson gson, Tealium tealium, Context context) {
        shopAuthAppModule.getClass();
        Intrinsics.h(adobeAnalyticsRepository, "adobeAnalyticsRepository");
        Intrinsics.h(accountRepository, "accountRepository");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(tealium, "tealium");
        KProperty[] kPropertyArr = ChatbotSessionDataStoreKt.f8702a;
        return new ShopAccountInteractor(adobeAnalyticsRepository, accountRepository, firebaseAnalyticsLogger, timberDynatraceLogger, gson, tealium, (DataStore) ChatbotSessionDataStoreKt.b.getValue(context, ChatbotSessionDataStoreKt.f8702a[0]));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
