package com.woolworths.scanlibrary.util.exceptions;

import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.presentation.deliverynowbanner.DeliveryNowBannerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ b(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Function0 function0 = this.e;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            default:
                DeliveryNowBottomBanner deliveryNowBottomBanner = DeliveryNowBannerKt.f7248a;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
        return unit;
    }
}
