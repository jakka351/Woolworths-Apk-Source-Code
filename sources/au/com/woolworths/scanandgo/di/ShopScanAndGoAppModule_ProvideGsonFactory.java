package au.com.woolworths.scanandgo.di;

import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.network.ComponentTypeAdapter;
import au.com.woolworths.scanandgo.data.ScanAndGoUserData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Reflection;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvideGsonFactory implements Factory<Gson> {
    public static Gson a(ShopScanAndGoAppModule shopScanAndGoAppModule) {
        shopScanAndGoAppModule.getClass();
        Map mapI = MapsKt.i(new Pair("ScanGoUser", Reflection.f24268a.b(ScanAndGoUserData.class)));
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(new ComponentTypeAdapter(mapI), Component.class);
        return gsonBuilder.a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
