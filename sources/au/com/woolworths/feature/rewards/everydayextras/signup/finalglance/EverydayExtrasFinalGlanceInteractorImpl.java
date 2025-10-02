package au.com.woolworths.feature.rewards.everydayextras.signup.finalglance;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryRepository;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionNoPaymentInput;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/finalglance/EverydayExtrasFinalGlanceInteractorImpl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/finalglance/EverydayExtrasFinalGlanceInteractor;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasFinalGlanceInteractorImpl implements EverydayExtrasFinalGlanceInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtrasFinalGlanceRepository f6174a;
    public final EverydayExtrasSummaryRepository b;

    public EverydayExtrasFinalGlanceInteractorImpl(EverydayExtrasFinalGlanceRepository everydayExtrasFinalGlanceRepository, EverydayExtrasSummaryRepository everydayExtrasSummaryRepository) {
        this.f6174a = everydayExtrasFinalGlanceRepository;
        this.b = everydayExtrasSummaryRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.b.c(new EverydayExtraSubscriptionNoPaymentInput(Optional.Companion.a(str)), new EverydayExtraSubscribeFeatureFlags(new Optional.Present(Boolean.TRUE)), (ContinuationImpl) continuation);
    }
}
