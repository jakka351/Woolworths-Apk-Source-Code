package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.datastore.DataStoreDelegateKt;
import androidx.datastore.DataStoreSingletonDelegate;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import au.com.woolworths.foundation.shop.nhp.ui.edr.c;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"nhp-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCarouselSessionDataStoreKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8791a = {Reflection.f24268a.h(new PropertyReference1Impl(ProductCarouselSessionDataStoreKt.class, "productCarouselSessionDataStore", "getProductCarouselSessionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final DataStoreSingletonDelegate b = DataStoreDelegateKt.a("personalised_products_banner_product_carousel_session.json", ProductCarouselSessionSerializer.f8792a, new ReplaceFileCorruptionHandler(new c(4)));
}
