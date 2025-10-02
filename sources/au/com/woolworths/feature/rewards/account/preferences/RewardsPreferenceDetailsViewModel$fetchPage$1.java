package au.com.woolworths.feature.rewards.account.preferences;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.pushnotifications.PushNotificationsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel$fetchPage$1", f = "RewardsPreferenceDetailsViewModel.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsViewModel$fetchPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsPreferenceDetailsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsViewModel$fetchPage$1(RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsPreferenceDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsViewModel$fetchPage$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsViewModel$fetchPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final String str;
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel = this.q;
        AnalyticsManager analyticsManager = rewardsPreferenceDetailsViewModel.h;
        MutableStateFlow mutableStateFlow = rewardsPreferenceDetailsViewModel.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                boolean zB = rewardsPreferenceDetailsViewModel.i.b(CollectionsKt.Q("1"));
                if (rewardsPreferenceDetailsViewModel.l && !zB) {
                    mutableStateFlow.f(RewardsPreferenceDetailsContract.ViewState.Error.PushSettings.f5732a);
                    return unit;
                }
                mutableStateFlow.f(RewardsPreferenceDetailsContract.ViewState.Loading.f5734a);
                RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor = rewardsPreferenceDetailsViewModel.e;
                String strQ6 = rewardsPreferenceDetailsViewModel.q6();
                this.p = 1;
                RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository = rewardsPreferenceDetailsInteractor.f5741a;
                rewardsPreferenceDetailsRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new RewardsPreferenceDetailsRepository$getReceiptsPreferences$2(rewardsPreferenceDetailsRepository, strQ6, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            PreferenceDetailsData preferenceDetailsData = (PreferenceDetailsData) obj;
            mutableStateFlow.setValue(new RewardsPreferenceDetailsContract.ViewState.Content(preferenceDetailsData.f5747a, false, preferenceDetailsData.b));
            return unit;
        } catch (NoConnectivityException e) {
            mutableStateFlow.setValue(RewardsPreferenceDetailsContract.ViewState.Error.Network.f5731a);
            if (rewardsPreferenceDetailsViewModel.l) {
                PushNotificationsAnalytics.PushNotifications.Action.Companion companion = PushNotificationsAnalytics.PushNotifications.Action.d;
                String message = e.getMessage();
                str = message != null ? message : "";
                companion.getClass();
                analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.pushnotifications.PushNotificationsAnalytics$PushNotifications$Action$Companion$errorLoadingPageNetwork$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(PushNotificationsAnalytics.PushNotifications.e);
                        spreadBuilder.a(new Pair("event.Category", "error"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        a.z("event.Label", str, spreadBuilder, "event.Description", "Network Error");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            return unit;
        } catch (ServerErrorException e2) {
            mutableStateFlow.setValue(RewardsPreferenceDetailsContract.ViewState.Error.Server.f5733a);
            if (rewardsPreferenceDetailsViewModel.l) {
                PushNotificationsAnalytics.PushNotifications.Action.Companion companion2 = PushNotificationsAnalytics.PushNotifications.Action.d;
                String message2 = e2.getMessage();
                str = message2 != null ? message2 : "";
                companion2.getClass();
                analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.pushnotifications.PushNotificationsAnalytics$PushNotifications$Action$Companion$errorLoadingPageServer$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(PushNotificationsAnalytics.PushNotifications.e);
                        spreadBuilder.a(new Pair("event.Category", "error"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        a.z("event.Label", str, spreadBuilder, "event.Description", "Server Error");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            return unit;
        }
    }
}
