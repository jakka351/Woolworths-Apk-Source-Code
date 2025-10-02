package com.woolworths.scanlibrary.base.dagger;

import androidx.fragment.app.FragmentActivity;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.rewards.base.d;
import com.woolworths.R;
import com.woolworths.scanlibrary.di.user.UserComponent;
import com.woolworths.scanlibrary.domain.cart.CartSessionManager;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.util.exceptions.ErrorHandlingDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DaggerBaseFragment e;

    public /* synthetic */ b(DaggerBaseFragment daggerBaseFragment, int i) {
        this.d = i;
        this.e = daggerBaseFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CartSessionManager cartSessionManagerE;
        int i = this.d;
        int i2 = 20;
        Unit unit = Unit.f24250a;
        DaggerBaseFragment daggerBaseFragment = this.e;
        switch (i) {
            case 0:
                FragmentActivity activity = daggerBaseFragment.getActivity();
                FeatureToggleManager featureToggleManager = daggerBaseFragment.f;
                if (featureToggleManager != null) {
                    return new ErrorHandlingDelegate(activity, featureToggleManager, new b(daggerBaseFragment, 1), new b(daggerBaseFragment, 2), new h(i2), new b(daggerBaseFragment, 3), new b(daggerBaseFragment, 4));
                }
                Intrinsics.p("featureToggleManager");
                throw null;
            case 1:
                if (daggerBaseFragment.i == null) {
                    Intrinsics.p("sngFeatureConfig");
                    throw null;
                }
                h hVar = new h(i2);
                if (daggerBaseFragment.getActivity() != null) {
                    String string = daggerBaseFragment.getString(R.string.sng_error_unhandled);
                    Intrinsics.g(string, "getString(...)");
                    daggerBaseFragment.R1(string, new d(hVar, 25));
                }
                return unit;
            case 2:
                daggerBaseFragment.b2(new h(i2));
                return unit;
            case 3:
                UserManager userManager = daggerBaseFragment.e;
                if (userManager == null) {
                    Intrinsics.p("userManager");
                    throw null;
                }
                UserComponent userComponent = userManager.k;
                if (userComponent != null && (cartSessionManagerE = userComponent.e()) != null) {
                    cartSessionManagerE.b();
                }
                FragmentActivity activity2 = daggerBaseFragment.getActivity();
                if (activity2 != null) {
                    int i3 = TapActivity.W;
                    TapActivity.Companion.a(activity2, null, null, 12);
                }
                return unit;
            default:
                FragmentActivity activity3 = daggerBaseFragment.getActivity();
                if (activity3 != null) {
                    Timber.f27013a.h("showTapOff() from " + activity3, new Object[0]);
                    int i4 = CheckOutActivity.L;
                    CheckOutActivity.Companion.a(activity3);
                }
                return unit;
        }
    }
}
