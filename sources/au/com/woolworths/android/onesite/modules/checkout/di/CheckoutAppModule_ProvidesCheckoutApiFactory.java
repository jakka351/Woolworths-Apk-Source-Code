package au.com.woolworths.android.onesite.modules.checkout.di;

import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CheckoutAppModule_ProvidesCheckoutApiFactory implements Factory<CheckoutApiInterface> {
    public static CheckoutApiInterface a(CheckoutAppModule checkoutAppModule, AppConfig appConfig, OkHttpClient okHttpClient, Gson gson, SchedulersProvider schedulersProvider) throws NumberFormatException {
        checkoutAppModule.getClass();
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.b(appConfig.getL());
        builder.f27005a = okHttpClient;
        builder.c.add(GsonConverterFactory.c(gson));
        builder.a(RxJava2CallAdapterFactory.d(schedulersProvider.d()));
        Object objB = builder.c().b(CheckoutApiInterface.class);
        Intrinsics.g(objB, "create(...)");
        return (CheckoutApiInterface) objB;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
