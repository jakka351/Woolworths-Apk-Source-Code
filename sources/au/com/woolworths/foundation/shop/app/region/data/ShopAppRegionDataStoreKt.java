package au.com.woolworths.foundation.shop.app.region.data;

import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app-region_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppRegionDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8659a = {Reflection.f24268a.h(new PropertyReference1Impl(ShopAppRegionDataStoreKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final PreferenceDataStoreSingletonDelegate b = PreferenceDataStoreDelegateKt.a("shop-app-region-prefs", null, null, 14);
}
