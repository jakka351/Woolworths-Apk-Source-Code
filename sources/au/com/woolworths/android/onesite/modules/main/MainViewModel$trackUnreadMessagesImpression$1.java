package au.com.woolworths.android.onesite.modules.main;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent;
import java.util.ArrayList;
import java.util.Map;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$trackUnreadMessagesImpression$1", f = "MainViewModel.kt", l = {1135}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$trackUnreadMessagesImpression$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MainViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$trackUnreadMessagesImpression$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$trackUnreadMessagesImpression$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$trackUnreadMessagesImpression$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MainViewModel mainViewModel = this.q;
        StateFlow stateFlow = mainViewModel.G;
        AnalyticsManager analyticsManager = mainViewModel.o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (DelayKt.b(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (mainViewModel.e.c(InboxFeature.d)) {
            HomepageAnalytics.HomeScreen.Action.Companion companion = HomepageAnalytics.HomeScreen.Action.d;
            final String str = Intrinsics.c(stateFlow.getValue(), UnreadMessagesInfo.Both.f4368a) ? "Unread notification and chatbot messages" : Intrinsics.c(stateFlow.getValue(), UnreadMessagesInfo.NotificationsOnly.f4371a) ? "Unread notification messages" : "Unread chatbot messages";
            companion.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$unreadInboxMessagesImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "message centre"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    a.y("event.Label", str, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "message_centre_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "message_centre_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            analyticsManager.g(HomepageAnalytics.HomeScreen.Action.i);
        }
        mainViewModel.n.b(InboxSwrveEvent.e);
        return Unit.f24250a;
    }
}
