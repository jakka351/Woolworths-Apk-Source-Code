package au.com.woolworths.feature.shop.myorders.details.substitutionrating;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import au.com.woolworths.feature.shop.modeselector.ui.c;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubstitutionRatingDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f7789a = {Reflection.f24268a.h(new PropertyReference1Impl(SubstitutionRatingDataStoreKt.class, "substitutionRatingDataStore", "getSubstitutionRatingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final PreferenceDataStoreSingletonDelegate b = PreferenceDataStoreDelegateKt.a("SubstitutionRatingPrefs", new ReplaceFileCorruptionHandler(new c(14)), null, 12);
}
