package com.woolworths.scanlibrary.base.dagger;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.rewards.base.d;
import com.woolworths.R;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DaggerBaseMvvmActivity e;

    public /* synthetic */ c(DaggerBaseMvvmActivity daggerBaseMvvmActivity, int i) {
        this.d = i;
        this.e = daggerBaseMvvmActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        DaggerBaseMvvmActivity daggerBaseMvvmActivity = this.e;
        switch (i) {
            case 0:
                int i2 = DaggerBaseMvvmActivity.D;
                DaggerBaseMvvmActivity daggerBaseMvvmActivity2 = this.e;
                FeatureToggleManager featureToggleManager = daggerBaseMvvmActivity2.w;
                if (featureToggleManager != null) {
                    return new ErrorHandlingDelegate(daggerBaseMvvmActivity2, featureToggleManager, new c(daggerBaseMvvmActivity2, 2), new c(daggerBaseMvvmActivity2, 3), new c(daggerBaseMvvmActivity2, 4), new c(daggerBaseMvvmActivity2, 5), new c(daggerBaseMvvmActivity2, 6));
                }
                Intrinsics.p("featureToggleManager");
                throw null;
            case 1:
                int i3 = DaggerBaseMvvmActivity.D;
                daggerBaseMvvmActivity.finish();
                return unit;
            case 2:
                if (daggerBaseMvvmActivity.z == null) {
                    Intrinsics.p("sngFeatureConfig");
                    throw null;
                }
                c cVar = new c(daggerBaseMvvmActivity, 1);
                String string = daggerBaseMvvmActivity.getString(R.string.sng_error_unhandled);
                Intrinsics.g(string, "getString(...)");
                daggerBaseMvvmActivity.T4(string, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(22, cVar));
                return unit;
            case 3:
                int i4 = DaggerBaseMvvmActivity.D;
                d dVar = new d(26);
                String string2 = daggerBaseMvvmActivity.getString(R.string.sng_no_network);
                Intrinsics.g(string2, "getString(...)");
                daggerBaseMvvmActivity.T4(string2, new au.com.woolworths.shop.lists.ui.magicmatch.ui.c(23, dVar));
                return unit;
            case 4:
                int i5 = DaggerBaseMvvmActivity.D;
                daggerBaseMvvmActivity.finish();
                return unit;
            case 5:
                int i6 = DaggerBaseMvvmActivity.D;
                TapActivity.Companion.a(daggerBaseMvvmActivity, null, null, 12);
                return unit;
            default:
                int i7 = DaggerBaseMvvmActivity.D;
                Timber.f27013a.h("showTapOff() from " + daggerBaseMvvmActivity, new Object[0]);
                CheckOutActivity.Companion.a(daggerBaseMvvmActivity);
                return unit;
        }
    }
}
