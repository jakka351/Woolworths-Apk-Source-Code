package au.com.woolworths.foundation.shop.onboarding.data;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/onboarding/data/OnboardingRepository;", "", "Companion", "onboarding-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OnboardingRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8865a;
    public final FeatureToggleManager b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shop/onboarding/data/OnboardingRepository$Companion;", "", "", "ONBOARDING_ALREADY_SHOWN_KEY", "Ljava/lang/String;", "SHOPPING_MODE_COACH_MARK_KEY", "COLLECTION_MODE_HEADER_COACH_MARK_KEY", "MESSAGE_US_COACH_MARK_KEY", "onboarding-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OnboardingRepository(SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8865a = sharedPreferences;
        this.b = featureToggleManager;
    }
}
