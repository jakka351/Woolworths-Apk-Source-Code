package au.com.woolworths.base.wallet.ocr;

import android.content.Context;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-wallet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsWalletOcrOverlayFragmentKt {
    public static final DependencyAccessor a(RewardsWalletOcrOverlayFragment rewardsWalletOcrOverlayFragment) {
        Context context = rewardsWalletOcrOverlayFragment.getContext();
        Intrinsics.g(context, "getContext(...)");
        return (DependencyAccessor) EntryPointAccessors.a(context, DependencyAccessor.class);
    }
}
