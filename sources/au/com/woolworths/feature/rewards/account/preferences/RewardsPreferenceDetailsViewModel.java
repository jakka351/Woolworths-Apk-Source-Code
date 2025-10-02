package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.pushnotifications.PushNotificationsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.android.onesite.utils.NotificationManager;
import au.com.woolworths.base.rewards.account.RewardsActivityInteractor;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContract;
import au.com.woolworths.feature.rewards.account.preferences.analytics.RewardsPreferenceDetailsActionData;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class RewardsPreferenceDetailsViewModel extends ViewModel {
    public final RewardsPreferenceDetailsInteractor e;
    public final RewardsActivityInteractor f;
    public final RewardsAccountInteractor g;
    public final AnalyticsManager h;
    public final NotificationManager i;
    public final Context j;
    public String k;
    public boolean l;
    public String m;
    public boolean n;
    public final Lazy o;
    public final MutableStateFlow p;
    public final SharedFlowImpl q;
    public final SharedFlowImpl r;
    public final StateFlow s;
    public final Flow t;
    public final Flow u;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel$1", f = "RewardsPreferenceDetailsViewModel.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsPreferenceDetailsViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel = RewardsPreferenceDetailsViewModel.this;
            RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor = rewardsPreferenceDetailsViewModel.e;
            androidx.navigation.fragment.e eVar = new androidx.navigation.fragment.e(rewardsPreferenceDetailsViewModel, 22);
            this.p = 1;
            rewardsPreferenceDetailsInteractor.a(eVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsViewModel$Companion;", "", "", "RECEIPTS_KEY", "Ljava/lang/String;", "PUSH_NOTIFS_KEY", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsPreferenceDetailsViewModel(RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor, RewardsActivityInteractor rewardsActivityInteractor, RewardsAccountInteractor rewardsAccountInteractor, AnalyticsManager analyticsManager, NotificationManager notificationManager, Context context) {
        Intrinsics.h(rewardsActivityInteractor, "rewardsActivityInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(notificationManager, "notificationManager");
        this.e = rewardsPreferenceDetailsInteractor;
        this.f = rewardsActivityInteractor;
        this.g = rewardsAccountInteractor;
        this.h = analyticsManager;
        this.i = notificationManager;
        this.j = context;
        this.o = LazyKt.b(new androidx.lifecycle.a(this, 22));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RewardsPreferenceDetailsContract.ViewState.Loading.f5734a);
        this.p = mutableStateFlowA;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.q = sharedFlowImplB;
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.r = sharedFlowImplB2;
        this.s = mutableStateFlowA;
        this.t = FlowKt.a(sharedFlowImplB);
        this.u = FlowKt.a(sharedFlowImplB2);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        if (q6().equals("receipts") && this.n) {
            this.f.notifyActivityFeedShouldBeRefreshed();
        }
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPreferenceDetailsViewModel$fetchPage$1(this, null), 3);
    }

    public final String q6() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        Intrinsics.p("preferencesKey");
        throw null;
    }

    public final void r6() {
        this.q.f(RewardsPreferenceDetailsContract.Actions.GoToPushSettings.f5726a);
        PushNotificationsAnalytics.PushNotifications.Action.Companion companion = PushNotificationsAnalytics.PushNotifications.Action.d;
        final String string = this.j.getString(RewardsAccountInteractorKt.a(this.g) == Region.i ? R.string.au_rewards_push_setting_button_text : R.string.nz_rewards_push_setting_button_text);
        Intrinsics.e(string);
        companion.getClass();
        this.h.g(new Event(string) { // from class: au.com.woolworths.analytics.rewards.pushnotifications.PushNotificationsAnalytics$PushNotifications$Action$Companion$pushNotificationClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(PushNotificationsAnalytics.PushNotifications.e);
                spreadBuilder.a(new Pair("event.Category", "push notification"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", string, spreadBuilder, "event.Description", "Don't miss out");
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "push_notification_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "push_notification_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    public final void x5(PreferenceToggleData data, boolean z) {
        Intrinsics.h(data, "data");
        RewardsPreferenceDetailsActionData rewardsPreferenceDetailsActionData = z ? RewardsPreferenceDetailsActionData.f : RewardsPreferenceDetailsActionData.g;
        Screens screens = (Screens) this.o.getD();
        rewardsPreferenceDetailsActionData.getClass();
        Intrinsics.h(screens, "<set-?>");
        rewardsPreferenceDetailsActionData.d = screens;
        String label = data.getAnalytics().getLabel();
        Intrinsics.h(label, "<set-?>");
        rewardsPreferenceDetailsActionData.e = label;
        this.h.c(rewardsPreferenceDetailsActionData);
        BuildersKt.c(ViewModelKt.a(this), null, null, new RewardsPreferenceDetailsViewModel$onToggleClick$1(this, data, z, null), 3);
    }
}
