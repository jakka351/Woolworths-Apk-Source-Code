package com.woolworths.scanlibrary.ui.tap;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.domain.device.DeviceRegistrationUC;
import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import com.woolworths.scanlibrary.models.profile.Survey;
import com.woolworths.scanlibrary.models.user.User;
import com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData;
import com.woolworths.scanlibrary.ui.tap.TapContract;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/scanlibrary/ui/tap/TapPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/tap/TapContract$View;", "Lcom/woolworths/scanlibrary/ui/tap/TapContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapPresenter extends BasePresenter<TapContract.View> implements TapContract.Presenter {
    public final AnalyticsManager c;
    public final MedalliaInteractor d;
    public final SurveyManager e;
    public final DeviceInfoProvider f;
    public final DeviceRegistrationUC g;
    public final ContextScope h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapPresenter(TapContract.View view, User authUser, AnalyticsManager analyticsManager, MedalliaInteractor medalliaInteractor, SurveyManager surveyManager, DeviceInfoProvider deviceInfoProvider, DeviceRegistrationUC deviceRegistrationUC, FirebaseApp firebaseApp) {
        super(view);
        Intrinsics.h(authUser, "authUser");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(medalliaInteractor, "medalliaInteractor");
        Intrinsics.h(surveyManager, "surveyManager");
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.h(firebaseApp, "firebaseApp");
        this.c = analyticsManager;
        this.d = medalliaInteractor;
        this.e = surveyManager;
        this.f = deviceInfoProvider;
        this.g = deviceRegistrationUC;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.h = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a.T()));
        view.k1(this);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) firebaseApp.b(FirebaseMessaging.class);
        if (firebaseMessaging != null) {
            firebaseMessaging.d().addOnCompleteListener(new a(this, 0));
        }
    }

    @Override // com.woolworths.scanlibrary.base.BasePresenter, com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void X0() {
        CoroutineScopeKt.b(this.h, null);
        super.X0();
    }

    @Override // com.woolworths.scanlibrary.ui.tap.TapContract.Presenter
    public final void b() {
        Survey survey;
        String menuFormId;
        this.c.j(MenuActionData.f, TrackingMetadata.Companion.a(TrackableValue.o0, "Send Feedback"));
        if (!this.d.b() || (survey = this.e.f21206a) == null || (menuFormId = survey.getMenuFormId()) == null) {
            return;
        }
        BuildersKt.c(this.h, null, null, new TapPresenter$submitUserFeedback$1$1(this, menuFormId, null), 3);
    }
}
