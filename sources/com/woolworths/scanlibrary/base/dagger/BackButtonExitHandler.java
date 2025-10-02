package com.woolworths.scanlibrary.base.dagger;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import com.woolworths.R;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/BackButtonExitHandler;", "Landroidx/activity/OnBackPressedCallback;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BackButtonExitHandler extends OnBackPressedCallback {
    public final DaggerBaseActivity d;

    public BackButtonExitHandler(DaggerBaseActivity daggerBaseActivity) {
        super(true);
        this.d = daggerBaseActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void e() {
        if (!j()) {
            k();
            return;
        }
        DaggerBaseActivity daggerBaseActivity = this.d;
        String string = daggerBaseActivity.getString(R.string.sng_label_exit_sng);
        Intrinsics.g(string, "getString(...)");
        String string2 = daggerBaseActivity.getString(R.string.sng_label_exit_confirmation);
        Intrinsics.g(string2, "getString(...)");
        String string3 = daggerBaseActivity.getString(R.string.sng_label_exit_button);
        Intrinsics.g(string3, "getString(...)");
        au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c cVar = new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(this, 7);
        String string4 = daggerBaseActivity.getString(R.string.sng_label_cancel);
        Intrinsics.g(string4, "getString(...)");
        AppCompatActivityExtKt.b(daggerBaseActivity, string, string2, string3, cVar, string4, new h(20), true);
    }

    public abstract boolean j();

    public abstract void k();

    public abstract void l();
}
