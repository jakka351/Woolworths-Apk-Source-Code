package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import androidx.datastore.core.DataStore;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.ShopInboxDataFetcher;
import java.time.Clock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/InboxSyncerImpl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/InboxSyncer;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InboxSyncerImpl implements InboxSyncer {

    /* renamed from: a, reason: collision with root package name */
    public final ShopInboxDataFetcher f8434a;
    public final InboxMessageDao b;
    public final SyncMetadataDao c;
    public final DataStore d;
    public final Clock e;
    public final MutableStateFlow f;
    public final StateFlow g;
    public final BufferedChannel h;
    public final SyncRequestEvaluator i;

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncRequest;", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl$1", f = "InboxSyncer.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends SyncRequest, ? extends String>>, SyncRequest, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ FlowCollector q;
        public /* synthetic */ SyncRequest r;
        public final /* synthetic */ StateFlow s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlow stateFlow, Continuation continuation) {
            super(3, continuation);
            this.s = stateFlow;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, (Continuation) obj3);
            anonymousClass1.q = (FlowCollector) obj;
            anonymousClass1.r = (SyncRequest) obj2;
            return anonymousClass1.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                FlowCollector flowCollector = this.q;
                SyncRequest syncRequest = this.r;
                String str = (String) this.s.getValue();
                if (str != null) {
                    Pair pair = new Pair(syncRequest, str);
                    this.q = null;
                    this.p = 1;
                    if (flowCollector.emit(pair, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/sync/SyncRequest;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl$2", f = "InboxSyncer.kt", l = {77, 84}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends SyncRequest, ? extends String>, Continuation<? super Unit>, Object> {
        public Object p;
        public InboxSyncerImpl q;
        public int r;
        public /* synthetic */ Object s;
        public final /* synthetic */ StateFlow u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StateFlow stateFlow, Continuation continuation) {
            super(2, continuation);
            this.u = stateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = InboxSyncerImpl.this.new AnonymousClass2(this.u, continuation);
            anonymousClass2.s = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            if (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl.a(r0, r6, r3, r11, r10) == r2) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl r0 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = r0.f
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r3 = r10.r
                kotlin.Unit r4 = kotlin.Unit.f24250a
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L33
                if (r3 == r6) goto L25
                if (r3 != r5) goto L1d
                java.lang.Object r0 = r10.s
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl r0 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl) r0
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1a
                goto L81
            L1a:
                r11 = move-exception
                goto L8a
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl r0 = r10.q
                java.lang.Object r3 = r10.p
                kotlinx.coroutines.flow.StateFlow r3 = (kotlinx.coroutines.flow.StateFlow) r3
                java.lang.Object r6 = r10.s
                java.lang.String r6 = (java.lang.String) r6
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1a
                goto L5e
            L33:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.s
                kotlin.Pair r11 = (kotlin.Pair) r11
                java.lang.Object r3 = r11.d
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequest r3 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequest) r3
                java.lang.Object r11 = r11.e
                java.lang.String r11 = (java.lang.String) r11
                kotlinx.coroutines.flow.StateFlow r7 = r10.u
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncRequestEvaluator r8 = r0.i     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r9 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
                boolean r9 = r9 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState.OutOfSync     // Catch: java.lang.Throwable -> L1a
                r10.s = r11     // Catch: java.lang.Throwable -> L1a
                r10.p = r7     // Catch: java.lang.Throwable -> L1a
                r10.q = r0     // Catch: java.lang.Throwable -> L1a
                r10.r = r6     // Catch: java.lang.Throwable -> L1a
                java.lang.Enum r3 = r8.a(r11, r3, r9, r10)     // Catch: java.lang.Throwable -> L1a
                if (r3 != r2) goto L5b
                goto L80
            L5b:
                r6 = r11
                r11 = r3
                r3 = r7
            L5e:
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r11 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision) r11     // Catch: java.lang.Throwable -> L1a
                au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r7 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision.g     // Catch: java.lang.Throwable -> L1a
                if (r11 == r7) goto L81
                kotlinx.coroutines.flow.MutableStateFlow r7 = r0.f     // Catch: java.lang.Throwable -> L1a
                au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState$Syncing r8 = au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState.Syncing.f8412a     // Catch: java.lang.Throwable -> L1a
                r7.setValue(r8)     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1a
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
                r10.s = r0     // Catch: java.lang.Throwable -> L1a
                r7 = 0
                r10.p = r7     // Catch: java.lang.Throwable -> L1a
                r10.q = r7     // Catch: java.lang.Throwable -> L1a
                r10.r = r5     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r11 = au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl.a(r0, r6, r3, r11, r10)     // Catch: java.lang.Throwable -> L1a
                if (r11 != r2) goto L81
            L80:
                return r2
            L81:
                kotlinx.coroutines.flow.MutableStateFlow r11 = r0.f     // Catch: java.lang.Throwable -> L1a
                au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState$Idle r0 = au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState.Idle.f8410a     // Catch: java.lang.Throwable -> L1a
                r11.setValue(r0)     // Catch: java.lang.Throwable -> L1a
                r11 = r4
                goto L8e
            L8a:
                kotlin.Result$Failure r11 = kotlin.ResultKt.a(r11)
            L8e:
                java.lang.Throwable r11 = kotlin.Result.a(r11)
                if (r11 == 0) goto La9
                boolean r0 = r11 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto La8
                timber.log.Timber$Forest r0 = timber.log.Timber.f27013a
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Failed to sync inbox messages."
                r0.n(r3, r11, r2)
                au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState$OutOfSync r11 = au.com.woolworths.foundation.appcomms.inbox.client.InboxSyncState.OutOfSync.f8411a
                r1.setValue(r11)
                goto La9
            La8:
                throw r11
            La9:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SyncDecision.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SyncDecision syncDecision = SyncDecision.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SyncDecision syncDecision2 = SyncDecision.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SyncDecision syncDecision3 = SyncDecision.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public InboxSyncerImpl(StateFlow stateFlow, StateFlow stateFlow2, ShopInboxDataFetcher shopInboxDataFetcher, InboxMessageDao inboxMessageDao, SyncMetadataDao syncMetadataDao, DataStore dataStore, boolean z, CoroutineScope syncerScope, SyncConfig syncConfig, Clock clock) {
        Intrinsics.h(inboxMessageDao, "inboxMessageDao");
        Intrinsics.h(syncMetadataDao, "syncMetadataDao");
        Intrinsics.h(syncerScope, "syncerScope");
        Intrinsics.h(clock, "clock");
        this.f8434a = shopInboxDataFetcher;
        this.b = inboxMessageDao;
        this.c = syncMetadataDao;
        this.d = dataStore;
        this.e = clock;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(InboxSyncState.Idle.f8410a);
        this.f = mutableStateFlowA;
        this.g = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.h = bufferedChannelA;
        ChannelFlowTransformLatest channelFlowTransformLatestF = FlowKt.F(new InboxSyncerImpl$autoSyncTrigger$1(2, null), FlowKt.s(stateFlow2, 1));
        this.i = new SyncRequestEvaluator(syncConfig, syncMetadataDao, z, dataStore, clock);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(stateFlow2, null), FlowKt.Q(FlowKt.G(FlowKt.I(bufferedChannelA), channelFlowTransformLatestF), new AnonymousClass1(stateFlow, null))), syncerScope);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r3 == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r3 == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r3 == r6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r2.a(r3, r5) != r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0163, code lost:
    
        if (r3 == r6) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[PHI: r3
  0x0150: PHI (r3v16 au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote) = 
  (r3v12 au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote)
  (r3v18 au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote)
 binds: [B:40:0x00ba, B:56:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl r21, java.lang.String r22, java.lang.String r23, au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl.a(au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl, java.lang.String, java.lang.String, au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.SyncDecision, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(boolean z, boolean z2, SuspendLambda suspendLambda) {
        Object objZ = this.h.z(new SyncRequest(z, z2), suspendLambda);
        return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
    }
}
