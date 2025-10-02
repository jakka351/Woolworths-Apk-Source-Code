package au.com.woolworths.foundation.shop.marketplace.education.ui;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.foundation.shop.marketplace.education.analytics.EducationBottomSheetActions;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetViewModel;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetViewModel;", "marketplace-education_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EducationBottomSheetViewModel extends BaseBottomSheetViewModel {
    public final AnalyticsManager i;
    public Screen j;
    public InfoSection k;
    public final SharedFlowImpl l;
    public final SharedFlowImpl m;

    public EducationBottomSheetViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.i = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = sharedFlowImplB;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel, au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public final void B4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        this.l.f(EducationBottomSheetContract.Actions.ContinueAddOrUpdateCart.f8751a);
        Screen screen = this.j;
        if (screen == null) {
            Intrinsics.p("screen");
            throw null;
        }
        this.i.j(new EducationBottomSheetActions.ContinueAddItem(screen), TrackingMetadata.Companion.a(TrackableValue.o0, "Everyday Market Info Modal"));
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel, au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract.CtaClickListener
    public final void c4(ContentCta cta) {
        Intrinsics.h(cta, "cta");
        InfoSection infoSection = this.k;
        if (infoSection == null) {
            Intrinsics.p("infoSection");
            throw null;
        }
        this.l.f(new EducationBottomSheetContract.Actions.LaunchInfoSection(infoSection));
        Screen screen = this.j;
        if (screen == null) {
            Intrinsics.p("screen");
            throw null;
        }
        this.i.j(new EducationBottomSheetActions.ClickLearnMore(screen), TrackingMetadata.Companion.a(TrackableValue.o0, "Everyday Market Info Modal"));
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void q6(ContentCta contentCta) {
        Intrinsics.h(contentCta, "contentCta");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void r6(String label) {
        Intrinsics.h(label, "label");
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel
    public final void s6() {
        Screen screen = this.j;
        if (screen == null) {
            Intrinsics.p("screen");
            throw null;
        }
        this.i.j(new EducationBottomSheetActions.OnAppear(screen), TrackingMetadata.Companion.a(TrackableValue.o0, "Everyday Market Info Modal"));
    }
}
