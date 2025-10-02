package com.woolworths.scanlibrary.ui.splash;

import com.woolworths.scanlibrary.ui.splash.SplashPresenter;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements BiFunction, Consumer {
    public final /* synthetic */ Function d;

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((d) this.d).invoke(obj);
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object p0, Object p1) {
        au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b bVar = (au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b) this.d;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        return (SplashPresenter.PostInitResult) bVar.invoke(p0, p1);
    }
}
