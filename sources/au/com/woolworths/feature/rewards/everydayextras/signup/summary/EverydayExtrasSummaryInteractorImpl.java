package au.com.woolworths.feature.rewards.everydayextras.signup.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.SignUpQueryParamsManager;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscribeFeatureFlags;
import au.com.woolworths.rewards.graphql.type.EverydayExtraSubscriptionInput;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/EverydayExtrasSummaryInteractorImpl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/summary/EverydayExtrasSummaryInteractor;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSummaryInteractorImpl implements EverydayExtrasSummaryInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtrasSummaryRepository f6218a;
    public final SignUpQueryParamsManager b;

    public EverydayExtrasSummaryInteractorImpl(EverydayExtrasSummaryRepository everydayExtrasSummaryRepository, SignUpQueryParamsManager signUpQueryParamsManager) {
        Intrinsics.h(signUpQueryParamsManager, "signUpQueryParamsManager");
        this.f6218a = everydayExtrasSummaryRepository;
        this.b = signUpQueryParamsManager;
    }

    public final Object a(String str, String str2, String str3, Continuation continuation) {
        return this.f6218a.b(new EverydayExtraSubscriptionInput(str, new Optional.Present(str2), Optional.Companion.a(this.b.a()), new Optional.Present(str3)), new EverydayExtraSubscribeFeatureFlags(new Optional.Present(Boolean.TRUE)), (ContinuationImpl) continuation);
    }
}
