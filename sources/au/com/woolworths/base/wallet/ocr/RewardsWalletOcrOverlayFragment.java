package au.com.woolworths.base.wallet.ocr;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.d;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.wallet.databinding.FragmentRewardsWalletOcrOverlayBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrOverlayFragment;", "Landroid/app/Fragment;", "Lau/com/woolworths/base/wallet/ocr/OverlayClickHandler;", "<init>", "()V", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsWalletOcrOverlayFragment extends Fragment implements OverlayClickHandler {
    public static final /* synthetic */ int e = 0;
    public final Lazy d = LazyKt.b(new androidx.lifecycle.a(this, 11));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/RewardsWalletOcrOverlayFragment$Companion;", "", "", "OVERLAY_VISIBLE_DELAY_MS", "J", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4697a;

        static {
            int[] iArr = new int[Activities.RewardsWalletOcr.Origin.values().length];
            try {
                Activities.RewardsWalletOcr.Origin origin = Activities.RewardsWalletOcr.Origin.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.RewardsWalletOcr.Origin origin2 = Activities.RewardsWalletOcr.Origin.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.RewardsWalletOcr.Origin origin3 = Activities.RewardsWalletOcr.Origin.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4697a = iArr;
        }
    }

    public static final void b(RewardsWalletOcrOverlayFragment rewardsWalletOcrOverlayFragment) {
        rewardsWalletOcrOverlayFragment.getActivity().finish();
        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) rewardsWalletOcrOverlayFragment.d.getD();
        int i = origin == null ? -1 : WhenMappings.f4697a[origin.ordinal()];
        if (i != -1) {
            if (i == 1) {
                RewardsWalletOcrOverlayFragmentKt.a(rewardsWalletOcrOverlayFragment).c().c(RewardsWalletOcrActionData.f);
            } else if (i == 2) {
                RewardsWalletOcrOverlayFragmentKt.a(rewardsWalletOcrOverlayFragment).c().c(RewardsGiftingOcrActionData.f);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // au.com.woolworths.base.wallet.ocr.OverlayClickHandler
    public final void a() {
        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) this.d.getD();
        int i = origin == null ? -1 : WhenMappings.f4697a[origin.ordinal()];
        if (i != -1) {
            if (i == 1) {
                RewardsWalletOcrOverlayFragmentKt.a(this).c().c(RewardsWalletOcrActionData.e);
            } else if (i == 2) {
                RewardsWalletOcrOverlayFragmentKt.a(this).c().c(RewardsGiftingOcrActionData.e);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                RewardsWalletOcrOverlayFragmentKt.a(this).c().g(EdxSummaryAnalytics.Summary.Action.n);
            }
        }
        getActivity().finish();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRewardsWalletOcrOverlayBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRewardsWalletOcrOverlayBinding fragmentRewardsWalletOcrOverlayBinding = (FragmentRewardsWalletOcrOverlayBinding) ViewDataBinding.q(inflater, R.layout.fragment_rewards_wallet_ocr_overlay, viewGroup, false, null);
        fragmentRewardsWalletOcrOverlayBinding.L(this);
        MaterialToolbar materialToolbar = fragmentRewardsWalletOcrOverlayBinding.B;
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(-1);
        }
        materialToolbar.setNavigationOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 1));
        View view = fragmentRewardsWalletOcrOverlayBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Activities.RewardsWalletOcr.Origin origin = (Activities.RewardsWalletOcr.Origin) this.d.getD();
        int i = origin == null ? -1 : WhenMappings.f4697a[origin.ordinal()];
        if (i != -1) {
            if (i == 1) {
                RewardsWalletOcrOverlayFragmentKt.a(this).c().a(RewardsWalletOcrScreens.d);
            } else if (i == 2) {
                RewardsWalletOcrOverlayFragmentKt.a(this).c().a(RewardsGiftingOcrScreens.d);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            view.postDelayed(new d(1, view), 500L);
        }
    }
}
