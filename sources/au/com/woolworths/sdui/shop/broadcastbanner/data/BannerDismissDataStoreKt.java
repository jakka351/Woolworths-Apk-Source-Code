package au.com.woolworths.sdui.shop.broadcastbanner.data;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import au.com.woolworths.android.onesite.analytics.a11y.a;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BannerDismissDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f10028a = {Reflection.f24268a.h(new PropertyReference1Impl(BannerDismissDataStoreKt.class, "bannerDismissDataStore", "getBannerDismissDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final PreferenceDataStoreSingletonDelegate b = PreferenceDataStoreDelegateKt.a("dismissed_banners", new ReplaceFileCorruptionHandler(new a(13)), null, 12);
}
