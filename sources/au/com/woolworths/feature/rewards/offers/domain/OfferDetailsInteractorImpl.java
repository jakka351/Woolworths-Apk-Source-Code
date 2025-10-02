package au.com.woolworths.feature.rewards.offers.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.data.OfferDetailsRepository;
import au.com.woolworths.rewards.base.ShopAppInstallationInteractor;
import au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/OfferDetailsInteractorImpl;", "Lau/com/woolworths/feature/rewards/offers/domain/OfferDetailsInteractor;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsInteractorImpl implements OfferDetailsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final OfferDetailsRepository f6335a;
    public final ShopAppInstallationInteractor b;

    public OfferDetailsInteractorImpl(OfferDetailsRepository offerDetailsRepository, ShopAppInstallationInteractor shopAppInstallationInteractor) {
        this.f6335a = offerDetailsRepository;
        this.b = shopAppInstallationInteractor;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f6335a.a(new OfferDetailsPageInput(str, new Optional.Present(Boolean.valueOf(this.b.a())), str2 != null ? new Optional.Present(str2) : Optional.Absent.f13523a), (ContinuationImpl) continuation);
    }
}
