package com.woolworths.scanlibrary.data.authentication.token;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.scanandgo.HandleOnSngRewardsTokenExpired;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.data.authentication.DefaultLocalTokenProvider;
import com.woolworths.scanlibrary.data.source.remote.TokenRefreshService;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.util.payment.DigitalPayProvider;
import io.reactivex.Single;
import io.reactivex.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/token/DefaultTokenProvider;", "Lcom/woolworths/scanlibrary/data/authentication/token/TokenProvider;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTokenProvider implements TokenProvider {

    /* renamed from: a, reason: collision with root package name */
    public final TokenRefreshService f21153a;
    public final DigitalPayProvider b;
    public final DefaultLocalTokenProvider c;
    public final HandleOnSngRewardsTokenExpired d;
    public final ScanAndGoFeatureConfig e;

    public DefaultTokenProvider(TokenRefreshService tokenRefreshService, DigitalPayProvider digitalPayProvider, DefaultLocalTokenProvider defaultLocalTokenProvider, HandleOnSngRewardsTokenExpired handleOnSngRewardsTokenExpired, ScanAndGoFeatureConfig sngFeatureConfig) {
        Intrinsics.h(digitalPayProvider, "digitalPayProvider");
        Intrinsics.h(sngFeatureConfig, "sngFeatureConfig");
        this.f21153a = tokenRefreshService;
        this.b = digitalPayProvider;
        this.c = defaultLocalTokenProvider;
        this.d = handleOnSngRewardsTokenExpired;
        this.e = sngFeatureConfig;
    }

    public final ObservableOnErrorNext a() {
        Single<Token> singleA = this.f21153a.a(this.c.b());
        au.com.woolworths.product.details.epoxy.a aVar = new au.com.woolworths.product.details.epoxy.a(new a(this, 0), 29);
        singleA.getClass();
        return new ObservableOnErrorNext(new SingleFlatMapObservable(singleA, aVar), new b(new a(this, 1), 0));
    }
}
