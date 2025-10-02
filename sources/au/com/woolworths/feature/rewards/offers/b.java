package au.com.woolworths.feature.rewards.offers;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements OnModelBoundListener, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, List list, RewardsOffersEpoxyController rewardsOffersEpoxyController) {
        this.d = i;
        this.e = list;
        this.f = rewardsOffersEpoxyController;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.e;
        uploader.d.b((TransportContext) this.f, this.d + 1);
        return null;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        RewardsOffersEpoxyController.buildProductOfferCarousel$lambda$27(this.d, (List) this.e, (RewardsOffersEpoxyController) this.f, (ProductOffersCarouselModel_) epoxyModel, (ProductOffersCarousel) obj, i);
    }

    public /* synthetic */ b(Uploader uploader, TransportContext transportContext, int i) {
        this.e = uploader;
        this.f = transportContext;
        this.d = i;
    }
}
