package com.woolworths.scanlibrary.ui.tap.tapon;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.woolworths.scanlibrary.databinding.FragmentTapOnBinding;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ TapOnFragment e;

    public /* synthetic */ c(TapOnFragment tapOnFragment, int i) {
        this.d = i;
        this.e = tapOnFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                TapOnFragment tapOnFragment = this.e;
                Callback.g(view);
                try {
                    tapOnFragment.h2();
                    return;
                } finally {
                    Callback.h();
                }
            default:
                TapOnFragment tapOnFragment2 = this.e;
                Callback.g(view);
                try {
                    FragmentTapOnBinding fragmentTapOnBinding = tapOnFragment2.o;
                    if (fragmentTapOnBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    fragmentTapOnBinding.A.setVisibility(8);
                    TapOnFragment.TapOnFragmentInteraction tapOnFragmentInteraction = tapOnFragment2.u;
                    if (tapOnFragmentInteraction != null) {
                        tapOnFragmentInteraction.k4();
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
