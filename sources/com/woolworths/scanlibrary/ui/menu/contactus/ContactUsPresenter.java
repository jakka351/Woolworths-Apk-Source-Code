package com.woolworths.scanlibrary.ui.menu.contactus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ContactUsScreenTracking;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsContract$View;", "Lcom/woolworths/scanlibrary/ui/menu/contactus/ContactUsContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContactUsPresenter extends BasePresenter<ContactUsContract.View> implements ContactUsContract.Presenter {
    public final AnalyticsProvider c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUsPresenter(ContactUsContract.View view, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = analyticsAggregator;
        analyticsAggregator.a(new ContactUsScreenTracking("Contact Us Screen"));
    }
}
