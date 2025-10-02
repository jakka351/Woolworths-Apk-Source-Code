package au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingFooterFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSubscribeFooterKt {
    public static final EverydayExtrasSubscribeFooterItem.SubscribeContentCta a(SubscribeOnboardingFooterFragment.OnContentCta onContentCta) {
        Intrinsics.h(onContentCta, "<this>");
        return new EverydayExtrasSubscribeFooterItem.SubscribeContentCta(new ContentCta(onContentCta.b, onContentCta.c, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null));
    }
}
