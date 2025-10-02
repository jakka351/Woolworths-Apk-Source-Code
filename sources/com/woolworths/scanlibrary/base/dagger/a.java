package com.woolworths.scanlibrary.base.dagger;

import au.com.woolworths.rewards.base.d;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DaggerBaseActivity e;

    public /* synthetic */ a(DaggerBaseActivity daggerBaseActivity, int i) {
        this.d = i;
        this.e = daggerBaseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        DaggerBaseActivity daggerBaseActivity = this.e;
        switch (i) {
            case 0:
                int i2 = DaggerBaseActivity.F;
                DaggerBaseActivity daggerBaseActivity2 = this.e;
                return new ErrorHandlingDelegate(daggerBaseActivity2, daggerBaseActivity2.Q4(), new a(daggerBaseActivity2, 2), new a(daggerBaseActivity2, 3), new a(daggerBaseActivity2, 4), new a(daggerBaseActivity2, 5), new a(daggerBaseActivity2, 6));
            case 1:
                int i3 = DaggerBaseActivity.F;
                daggerBaseActivity.finish();
                return unit;
            case 2:
                int i4 = DaggerBaseActivity.F;
                if (daggerBaseActivity.A != null) {
                    daggerBaseActivity.Z4(new a(daggerBaseActivity, 1));
                    return unit;
                }
                Intrinsics.p("sngFeatureConfig");
                throw null;
            case 3:
                int i5 = DaggerBaseActivity.F;
                daggerBaseActivity.a5(new d(24));
                return unit;
            case 4:
                int i6 = DaggerBaseActivity.F;
                daggerBaseActivity.finish();
                return unit;
            case 5:
                int i7 = DaggerBaseActivity.F;
                daggerBaseActivity.b5();
                return unit;
            default:
                int i8 = DaggerBaseActivity.F;
                Timber.f27013a.h("showTapOff() from " + daggerBaseActivity, new Object[0]);
                int i9 = CheckOutActivity.L;
                CheckOutActivity.Companion.a(daggerBaseActivity);
                return unit;
        }
    }
}
