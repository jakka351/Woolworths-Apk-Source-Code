package au.com.woolworths.feature.shop.inbox;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.inbox.InboxAnalytics;
import au.com.woolworths.analytics.supers.notificationinbox.NotificationInboxAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.inbox.InboxUiState;
import au.com.woolworths.feature.shop.inbox.domain.LastUnreadChatbotMessageItemMapperKt;
import au.com.woolworths.feature.shop.inbox.domain.RealInboxTimeSource;
import au.com.woolworths.feature.shop.inbox.tracking.InboxAnalyticsFactoryImpl;
import au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed;
import au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage;
import au.com.woolworths.foundation.navigation.LinkNavigator;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/InboxViewModel;", "Landroidx/lifecycle/ViewModel;", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InboxViewModel extends ViewModel {
    public final AnalyticsManager e;
    public final LinkNavigator f;
    public final SwrveEventTrackerImpl g;
    public final InboxClient h;
    public final RealInboxTimeSource i;
    public final InboxAnalyticsFactoryImpl j;
    public final SharedFlowImpl k;
    public final Flow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final LinkedHashSet o;
    public final c p;

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;", "syncState", "Lau/com/woolworths/foundation/appcomms/inbox/client/InboxSyncState;", "inboxFeed", "Lau/com/woolworths/foundation/appcomms/inbox/client/model/InboxFeed;", "<destruct>", "Lau/com/woolworths/feature/shop/inbox/TransformContext;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$1", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.InboxViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function4<InboxSyncState, InboxFeed, TransformContext, Continuation<? super InboxUiState>, Object> {
        public /* synthetic */ InboxSyncState p;
        public /* synthetic */ InboxFeed q;
        public /* synthetic */ TransformContext r;

        public AnonymousClass1(Continuation continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = InboxViewModel.this.new AnonymousClass1((Continuation) obj4);
            anonymousClass1.p = (InboxSyncState) obj;
            anonymousClass1.q = (InboxFeed) obj2;
            anonymousClass1.r = (TransformContext) obj3;
            return anonymousClass1.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            InboxViewModel inboxViewModel = InboxViewModel.this;
            RealInboxTimeSource realInboxTimeSource = inboxViewModel.i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            InboxSyncState inboxSyncState = this.p;
            InboxFeed inboxFeed = this.q;
            TransformContext transformContext = this.r;
            boolean z = transformContext.f7286a;
            int i = transformContext.b;
            if (inboxFeed instanceof InboxFeed.Mixed) {
                InboxFeed.Mixed mixed = (InboxFeed.Mixed) inboxFeed;
                pair = new Pair(mixed.f8438a, mixed.b);
            } else {
                if (!(inboxFeed instanceof InboxFeed.NotificationsOnly)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(null, ((InboxFeed.NotificationsOnly) inboxFeed).f8439a);
            }
            LastChatbotMessage lastChatbotMessage = (LastChatbotMessage) pair.d;
            List list = (List) pair.e;
            boolean zIsEmpty = list.isEmpty();
            boolean z2 = true;
            if (inboxSyncState instanceof InboxSyncState.Syncing) {
                return !zIsEmpty ? new InboxUiState.Content(InboxViewModelKt.a(list, realInboxTimeSource), LastUnreadChatbotMessageItemMapperKt.a(lastChatbotMessage), true, false) : InboxUiState.Loading.f7283a;
            }
            if (inboxSyncState instanceof InboxSyncState.Idle) {
                return new InboxUiState.Content(InboxViewModelKt.a(list, realInboxTimeSource), LastUnreadChatbotMessageItemMapperKt.a(lastChatbotMessage), false, false);
            }
            if (!(inboxSyncState instanceof InboxSyncState.OutOfSync)) {
                throw new NoWhenBranchMatchedException();
            }
            if (zIsEmpty) {
                return InboxUiState.Error.f7282a;
            }
            if (!z && i != 0) {
                Object value = inboxViewModel.m.getValue();
                InboxUiState.Content content = value instanceof InboxUiState.Content ? (InboxUiState.Content) value : null;
                if (content == null || !content.d) {
                    z2 = false;
                }
            }
            return new InboxUiState.Content(InboxViewModelKt.a(list, realInboxTimeSource), LastUnreadChatbotMessageItemMapperKt.a(lastChatbotMessage), false, z2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$2", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.InboxViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<InboxUiState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = InboxViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((InboxUiState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            InboxViewModel.this.m.setValue((InboxUiState) this.p);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/inbox/InboxUiState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.inbox.InboxViewModel$3", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.inbox.InboxViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<InboxUiState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = InboxViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((InboxUiState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            InboxUiState inboxUiState = (InboxUiState) this.p;
            InboxUiState.Content content = inboxUiState instanceof InboxUiState.Content ? (InboxUiState.Content) inboxUiState : null;
            if (content != null && !content.c && !content.d && ((InboxUiState.Content) inboxUiState).f7281a.isEmpty()) {
                InboxViewModel inboxViewModel = InboxViewModel.this;
                inboxViewModel.e.g(inboxViewModel.j.f7294a ? InboxAnalytics.Inbox.Action.e : NotificationInboxAnalytics.NotificationInbox.Action.e);
                inboxViewModel.g.b(InboxSwrveEvent.g);
            }
            return Unit.f24250a;
        }
    }

    public InboxViewModel(AnalyticsManager analyticsManager, LinkNavigator linkNavigator, SwrveEventTrackerImpl swrveEventTrackerImpl, InboxClient inboxClient, RealInboxTimeSource realInboxTimeSource, InboxAnalyticsFactoryImpl inboxAnalyticsFactoryImpl) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(linkNavigator, "linkNavigator");
        Intrinsics.h(inboxClient, "inboxClient");
        this.e = analyticsManager;
        this.f = linkNavigator;
        this.g = swrveEventTrackerImpl;
        this.h = inboxClient;
        this.i = realInboxTimeSource;
        this.j = inboxAnalyticsFactoryImpl;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.k = sharedFlowImplB;
        this.l = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(InboxUiState.Loading.f7283a);
        this.m = mutableStateFlowA;
        StateFlow stateFlowB = FlowKt.b(mutableStateFlowA);
        this.n = stateFlowB;
        this.o = new LinkedHashSet();
        this.p = new c(this, 0);
        StateFlow flow1 = inboxClient.getG();
        ChannelFlowTransformLatest channelFlowTransformLatestD = inboxClient.d(true);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Intrinsics.h(flow1, "flow1");
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowKt.B(new CombineWithContextKt$combineWithContext$1(flow1, channelFlowTransformLatestD, anonymousClass1, null))), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), stateFlowB), ViewModelKt.a(this));
    }

    public final Job p6(boolean z) {
        return BuildersKt.c(ViewModelKt.a(this), null, null, new InboxViewModel$saveRecordedSeenItems$1(this, z, null), 3);
    }
}
