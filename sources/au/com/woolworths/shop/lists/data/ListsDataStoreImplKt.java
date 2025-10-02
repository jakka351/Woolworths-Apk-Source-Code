package au.com.woolworths.shop.lists.data;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsDataStoreImplKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f12254a = {Reflection.f24268a.h(new PropertyReference1Impl(ListsDataStoreImplKt.class, "magicMatchDataStore", "getMagicMatchDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final PreferenceDataStoreSingletonDelegate b = PreferenceDataStoreDelegateKt.a("lists_datastore", new ReplaceFileCorruptionHandler(new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(15)), null, 12);
}
