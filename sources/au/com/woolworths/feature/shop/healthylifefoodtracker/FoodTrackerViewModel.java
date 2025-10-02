package au.com.woolworths.feature.shop.healthylifefoodtracker;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.healthylife.foodtracker.HealthyLifeFoodTrackerAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterActionType;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerFooterCard;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerEventListener;", "Companion", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoodTrackerViewModel extends ViewModel implements FoodTrackerEventListener {
    public final FoodTrackerInteractor e;
    public final AnalyticsManager f;
    public final BufferedChannel g;
    public final MutableLiveData h;
    public final Flow i;
    public final MutableLiveData j;
    public String k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/FoodTrackerViewModel$Companion;", "", "", "UI_DELAY_MSEC", "J", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7160a;

        static {
            int[] iArr = new int[FoodTrackerFooterActionType.values().length];
            try {
                FoodTrackerFooterActionType foodTrackerFooterActionType = FoodTrackerFooterActionType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FoodTrackerFooterActionType foodTrackerFooterActionType2 = FoodTrackerFooterActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7160a = iArr;
        }
    }

    public FoodTrackerViewModel(FoodTrackerInteractor foodTrackerInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = foodTrackerInteractor;
        this.f = analyticsManager;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.g = bufferedChannelA;
        MutableLiveData mutableLiveData = new MutableLiveData(FoodTrackerContract.ViewState.h);
        this.h = mutableLiveData;
        this.i = FlowKt.I(bufferedChannelA);
        this.j = mutableLiveData;
    }

    public static void q6(FoodTrackerViewModel foodTrackerViewModel, MutableLiveData mutableLiveData, boolean z, FoodTrackerPage foodTrackerPage, String str, StatefulButtonState statefulButtonState, FullPageMessage.Error error, Text text, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).f7157a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            foodTrackerPage = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).b;
        }
        FoodTrackerPage foodTrackerPage2 = foodTrackerPage;
        if ((i & 4) != 0) {
            str = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            statefulButtonState = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).d;
        }
        StatefulButtonState statefulButtonState2 = statefulButtonState;
        if ((i & 16) != 0) {
            error = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).e;
        }
        FullPageMessage.Error error2 = error;
        if ((i & 32) != 0) {
            text = ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).f;
        }
        Text text2 = text;
        boolean z4 = (i & 64) != 0 ? ((FoodTrackerContract.ViewState) LiveDataExtKt.a(mutableLiveData)).g : z2;
        foodTrackerViewModel.getClass();
        mutableLiveData.m(new FoodTrackerContract.ViewState(z3, foodTrackerPage2, str2, statefulButtonState2, error2, text2, z4));
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void E2() {
        p6(null);
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void I1(boolean z) {
        if (z) {
            this.f.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.d);
        }
        q6(this, this.h, false, null, null, null, null, null, z, 63);
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void R() {
        this.f.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.e);
        q6(this, this.h, false, null, null, StatefulButtonState.e, null, null, false, 119);
        BuildersKt.c(ViewModelKt.a(this), null, null, new FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void l1() {
        this.f.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.f);
        q6(this, this.h, false, null, null, null, null, null, false, 63);
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void m5() {
        q6(this, this.h, false, null, null, null, null, null, false, 95);
    }

    public final void p6(b bVar) {
        q6(this, this.h, true, null, null, null, null, null, false, 110);
        BuildersKt.c(ViewModelKt.a(this), null, null, new FoodTrackerViewModel$fetchFoodTrackerPage$1(this, bVar, null), 3);
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void s5(FoodTrackerFooterCard footerCard) {
        Intrinsics.h(footerCard, "footerCard");
        HealthyLifeFoodTrackerAnalytics.LandingPage.Action.Companion companion = HealthyLifeFoodTrackerAnalytics.LandingPage.Action.d;
        final String str = footerCard.b;
        companion.getClass();
        this.f.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.healthylife.foodtracker.HealthyLifeFoodTrackerAnalytics$LandingPage$Action$Companion$consentBannerClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(HealthyLifeFoodTrackerAnalytics.LandingPage.e);
                spreadBuilder.a(new Pair("event.Category", "banner"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", "link rewards card with food tracker", spreadBuilder, "event.Description", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "banner_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "banner_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        int i = WhenMappings.f7160a[footerCard.d.ordinal()];
        if (i == 1) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new FoodTrackerViewModel$onFooterCardClicked$1(this, null), 3);
        } else {
            if (i != 2) {
                return;
            }
            q6(this, this.h, false, null, null, null, null, null, true, 63);
        }
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerEventListener
    public final void v1(String url) {
        Intrinsics.h(url, "url");
        BuildersKt.c(ViewModelKt.a(this), null, null, new FoodTrackerViewModel$onExternalLinkClicked$1(this, url, null), 3);
    }
}
