package au.com.woolworths.feature.shop.onboarding;

import android.view.View;
import au.com.woolworths.feature.shop.onboarding.OnboardingAdapter;
import au.com.woolworths.feature.shop.onboarding.databinding.ItemOnboardingContentBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/OnboardingContentViewHolder;", "Lau/com/woolworths/feature/shop/onboarding/OnboardingAdapter$BaseViewHolder;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingContentViewHolder extends OnboardingAdapter.BaseViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ItemOnboardingContentBinding f7952a;

    /* JADX WARN: Illegal instructions before constructor call */
    public OnboardingContentViewHolder(ItemOnboardingContentBinding itemOnboardingContentBinding) {
        View view = itemOnboardingContentBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f7952a = itemOnboardingContentBinding;
    }
}
