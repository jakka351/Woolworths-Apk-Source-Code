package com.woolworths.scanlibrary.ui.onboarding;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ItemOnboardingBinding;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingContentViewHolder;", "Lcom/woolworths/scanlibrary/ui/onboarding/OnBoardingPagerAdapter$BaseViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnBoardingContentViewHolder extends OnBoardingPagerAdapter.BaseViewHolder {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ItemOnboardingBinding f21282a;

    /* JADX WARN: Illegal instructions before constructor call */
    public OnBoardingContentViewHolder(ItemOnboardingBinding itemOnboardingBinding) {
        View view = itemOnboardingBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21282a = itemOnboardingBinding;
    }
}
