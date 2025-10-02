package com.woolworths.scanlibrary.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.woolworths.scanlibrary.data.payment.PaymentStatus;
import com.woolworths.scanlibrary.data.payment.PaymentStatusTypeAdapter;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.authentication.BannerTypeAdapter;
import com.woolworths.scanlibrary.models.cart.CouponStatus;
import com.woolworths.scanlibrary.models.cart.CouponStatusTypeAdapter;
import com.woolworths.scanlibrary.models.cart.CouponType;
import com.woolworths.scanlibrary.models.cart.CouponTypeAdapter;
import com.woolworths.scanlibrary.models.store.StoreTradingWeek;
import com.woolworths.scanlibrary.models.store.TradingHoursJSONDeserializer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideGsonFactory implements Factory<Gson> {
    public static Gson a(ScanNGoModule scanNGoModule) {
        scanNGoModule.getClass();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.g = scanNGoModule.b;
        gsonBuilder.b(new PaymentStatusTypeAdapter(), PaymentStatus.class);
        gsonBuilder.b(new CouponStatusTypeAdapter(), CouponStatus.class);
        gsonBuilder.b(new CouponTypeAdapter(), CouponType.class);
        gsonBuilder.b(new BannerTypeAdapter(), Banner.class);
        gsonBuilder.b(new TradingHoursJSONDeserializer(), StoreTradingWeek.class);
        return gsonBuilder.a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
