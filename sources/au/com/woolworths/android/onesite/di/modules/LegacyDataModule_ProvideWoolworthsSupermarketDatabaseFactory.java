package au.com.woolworths.android.onesite.di.modules;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import au.com.woolworths.android.onesite.database.WoolworthsSupermarketDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class LegacyDataModule_ProvideWoolworthsSupermarketDatabaseFactory implements Factory<WoolworthsSupermarketDatabase> {
    public static WoolworthsSupermarketDatabase a(LegacyDataModule legacyDataModule, Application application) {
        legacyDataModule.getClass();
        Context applicationContext = application.getApplicationContext();
        Intrinsics.g(applicationContext, "getApplicationContext(...)");
        return (WoolworthsSupermarketDatabase) Room.a(applicationContext, WoolworthsSupermarketDatabase.class, "woolworths_supermarkets.db").b();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
