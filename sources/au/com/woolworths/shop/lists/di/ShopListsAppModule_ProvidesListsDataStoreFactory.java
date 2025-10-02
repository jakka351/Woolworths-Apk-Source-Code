package au.com.woolworths.shop.lists.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import au.com.woolworths.base.shopapp.modules.lists.ListsDataStore;
import au.com.woolworths.shop.lists.data.ListsDataStoreImpl;
import au.com.woolworths.shop.lists.data.ListsDataStoreImplKt;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopListsAppModule_ProvidesListsDataStoreFactory implements Factory<ListsDataStore> {
    public static ListsDataStoreImpl a(ShopListsAppModule shopListsAppModule, Context context) {
        shopListsAppModule.getClass();
        Intrinsics.h(context, "context");
        KProperty[] kPropertyArr = ListsDataStoreImplKt.f12254a;
        return new ListsDataStoreImpl((DataStore) ListsDataStoreImplKt.b.getValue(context, ListsDataStoreImplKt.f12254a[0]));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
