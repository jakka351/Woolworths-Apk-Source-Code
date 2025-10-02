package com.woolworths.scanlibrary.base.dagger;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.di.session.CartSessionScopedActivity;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.login.UserManager;
import com.woolworths.scanlibrary.util.widget.LoadingViewDelegate;
import dagger.android.support.AndroidSupportInjection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseMvvmFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DaggerBaseMvvmFragment extends Fragment {
    public UserManager d;
    public final Lazy e = LazyKt.b(new au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c(this, 8));
    public LoadingViewDelegate f;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        boolean zA;
        Intrinsics.h(context, "context");
        FragmentActivity activity = getActivity();
        Object application = activity != null ? activity.getApplication() : null;
        Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        UserManager userManagerD = ((SnGAppProvider) application).d();
        Intrinsics.h(userManagerD, "<set-?>");
        this.d = userManagerD;
        FragmentActivity activity2 = getActivity();
        Object application2 = activity2 != null ? activity2.getApplication() : null;
        Intrinsics.f(application2, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
        Intrinsics.h(((SnGAppProvider) application2).b(), "<set-?>");
        FragmentActivity activity3 = getActivity();
        if (activity3 instanceof UserScopedActivity) {
            UserManager userManager = this.d;
            if (userManager == null) {
                Intrinsics.p("userManager");
                throw null;
            }
            zA = userManager.a();
        } else if (activity3 instanceof CartSessionScopedActivity) {
            UserManager userManager2 = this.d;
            if (userManager2 == null) {
                Intrinsics.p("userManager");
                throw null;
            }
            zA = userManager2.a();
        } else {
            zA = true;
        }
        if (zA) {
            AndroidSupportInjection.a(this);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f = new LoadingViewDelegate(fragmentActivityRequireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoadingViewDelegate loadingViewDelegate = this.f;
        if (loadingViewDelegate != null) {
            loadingViewDelegate.a();
        }
        super.onDestroy();
    }
}
