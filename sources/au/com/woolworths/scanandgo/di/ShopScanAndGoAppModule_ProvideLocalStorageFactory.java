package au.com.woolworths.scanandgo.di;

import android.content.SharedPreferences;
import au.com.woolworths.scanandgo.storage.ScanAndGoLocalStorage;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopScanAndGoAppModule_ProvideLocalStorageFactory implements Factory<ScanAndGoLocalStorage> {
    public static ScanAndGoLocalStorage a(ShopScanAndGoAppModule shopScanAndGoAppModule, Gson gson, SharedPreferences sharedPreferences) {
        shopScanAndGoAppModule.getClass();
        return new ScanAndGoLocalStorage(sharedPreferences, gson);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
