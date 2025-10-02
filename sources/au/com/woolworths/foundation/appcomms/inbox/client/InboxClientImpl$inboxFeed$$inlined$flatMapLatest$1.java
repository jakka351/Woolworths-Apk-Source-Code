package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve.SwrveDataSourceImpl$special$$inlined$map$1;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1", f = "InboxClient.kt", l = {189}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super InboxFeed>, String, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ InboxClientImpl s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1(InboxClientImpl inboxClientImpl, Continuation continuation, boolean z) {
        super(3, continuation);
        this.s = inboxClientImpl;
        this.t = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1 inboxClientImpl$inboxFeed$$inlined$flatMapLatest$1 = new InboxClientImpl$inboxFeed$$inlined$flatMapLatest$1(this.s, (Continuation) obj3, this.t);
        inboxClientImpl$inboxFeed$$inlined$flatMapLatest$1.q = (FlowCollector) obj;
        inboxClientImpl$inboxFeed$$inlined$flatMapLatest$1.r = obj2;
        return inboxClientImpl$inboxFeed$$inlined$flatMapLatest$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowL;
        InboxClientImpl inboxClientImpl = this.s;
        BffDataSource bffDataSource = inboxClientImpl.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            String str = (String) this.r;
            final FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new InboxClientImpl$inboxFeed$1$bffData$1(inboxClientImpl, null, this.t), bffDataSource.b.f(str));
            Flow<List<? extends InboxMessage>> flow = new Flow<List<? extends InboxMessage>>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2", f = "InboxClient.kt", l = {50}, m = "emit")
                    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object p;
                        public int q;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.p = obj;
                            this.q |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.d = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
                        /*
                            r20 = this;
                            r0 = r20
                            r1 = r22
                            boolean r2 = r1 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r2 == 0) goto L17
                            r2 = r1
                            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2$1 r2 = (au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                            int r3 = r2.q
                            r4 = -2147483648(0xffffffff80000000, float:-0.0)
                            r5 = r3 & r4
                            if (r5 == 0) goto L17
                            int r3 = r3 - r4
                            r2.q = r3
                            goto L1c
                        L17:
                            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2$1 r2 = new au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1$2$1
                            r2.<init>(r1)
                        L1c:
                            java.lang.Object r1 = r2.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r4 = r2.q
                            r5 = 1
                            if (r4 == 0) goto L34
                            if (r4 != r5) goto L2c
                            kotlin.ResultKt.b(r1)
                            goto La8
                        L2c:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r1
                        L34:
                            kotlin.ResultKt.b(r1)
                            r1 = r21
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r6 = 10
                            int r6 = kotlin.collections.CollectionsKt.s(r1, r6)
                            r4.<init>(r6)
                            java.util.Iterator r1 = r1.iterator()
                        L4c:
                            boolean r6 = r1.hasNext()
                            if (r6 == 0) goto L9d
                            java.lang.Object r6 = r1.next()
                            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageEntity r6 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageEntity) r6
                            java.lang.String r7 = "<this>"
                            kotlin.jvm.internal.Intrinsics.h(r6, r7)
                            java.lang.String r9 = r6.f8416a
                            java.lang.String r10 = r6.c
                            java.lang.String r11 = r6.d
                            java.lang.String r12 = r6.e
                            java.lang.String r13 = r6.f
                            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.CtaEntity r7 = r6.g
                            if (r7 == 0) goto L76
                            au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage$Cta r8 = new au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage$Cta
                            java.lang.String r14 = r7.f8413a
                            java.lang.String r7 = r7.b
                            r8.<init>(r14, r7)
                        L74:
                            r14 = r8
                            goto L78
                        L76:
                            r8 = 0
                            goto L74
                        L78:
                            java.lang.String r7 = r6.h
                            java.time.format.DateTimeFormatter r8 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME
                            java.time.OffsetDateTime r7 = java.time.OffsetDateTime.parse(r7, r8)
                            java.time.Instant r7 = r7.toInstant()
                            java.lang.String r8 = "toInstant(...)"
                            kotlin.jvm.internal.Intrinsics.g(r7, r8)
                            boolean r6 = r6.j
                            au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage r8 = new au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage
                            r15 = 0
                            r16 = 0
                            r19 = 0
                            r18 = r6
                            r17 = r7
                            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                            r4.add(r8)
                            goto L4c
                        L9d:
                            r2.q = r5
                            kotlinx.coroutines.flow.FlowCollector r1 = r0.d
                            java.lang.Object r1 = r1.emit(r4, r2)
                            if (r1 != r3) goto La8
                            return r3
                        La8:
                            kotlin.Unit r1 = kotlin.Unit.f24250a
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            };
            SwrveDataSourceImpl$special$$inlined$map$1 messages = inboxClientImpl.c.getMessages();
            SyncMetadataDao syncMetadataDao = bffDataSource.c;
            SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
            final Flow flowB = syncMetadataDao.b(str);
            final InboxClientImpl$inboxFeed$lambda$7$$inlined$map$3 inboxClientImpl$inboxFeed$lambda$7$$inlined$map$3 = new InboxClientImpl$inboxFeed$lambda$7$$inlined$map$3(FlowKt.m(flow, messages, FlowKt.r(new Flow<Boolean>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2", f = "InboxClient.kt", l = {50}, m = "emit")
                    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object p;
                        public int q;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.p = obj;
                            this.q |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.d = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L48
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity r5 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity) r5
                            if (r5 == 0) goto L38
                            r5 = r3
                            goto L39
                        L38:
                            r5 = 0
                        L39:
                            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L48
                            return r1
                        L48:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object objCollect = flowB.collect(new AnonymousClass2(flowCollector2), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            }), new InboxClientImpl$inboxFeed$1$inboxMessagesFlow$1(inboxClientImpl, null)));
            if (inboxClientImpl.e) {
                final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(inboxClientImpl.d.getD());
                flowL = FlowKt.l(inboxClientImpl$inboxFeed$lambda$7$$inlined$map$3, new Flow<LastChatbotMessage>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2", f = "InboxClient.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.d = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r8
                                au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4$2$1
                                r0.<init>(r8)
                            L18:
                                java.lang.Object r8 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r8)
                                goto L51
                            L27:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r8)
                                throw r7
                            L2f:
                                kotlin.ResultKt.b(r8)
                                au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore.LastChatbotMessageEntity r7 = (au.com.woolworths.foundation.appcomms.inbox.client.internal.datastore.LastChatbotMessageEntity) r7
                                java.lang.String r8 = "<this>"
                                kotlin.jvm.internal.Intrinsics.h(r7, r8)
                                au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage r8 = new au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage
                                java.lang.String r2 = r7.f8421a
                                java.lang.String r4 = r7.b
                                java.lang.String r5 = r7.c
                                int r7 = r7.d
                                r8.<init>(r7, r2, r4, r5)
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r7 = r6.d
                                java.lang.Object r7 = r7.emit(r8, r0)
                                if (r7 != r1) goto L51
                                return r1
                            L51:
                                kotlin.Unit r7 = kotlin.Unit.f24250a
                                return r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                }, new InboxClientImpl$inboxFeed$1$1(3, null));
            } else {
                flowL = new Flow<InboxFeed.NotificationsOnly>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2", f = "InboxClient.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.d = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2$1 r0 = (au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2$1 r0 = new au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L44
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                java.util.List r5 = (java.util.List) r5
                                au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed$NotificationsOnly r6 = new au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed$NotificationsOnly
                                r6.<init>(r5)
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                                java.lang.Object r5 = r5.emit(r6, r0)
                                if (r5 != r1) goto L44
                                return r1
                            L44:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl$inboxFeed$lambda$7$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = inboxClientImpl$inboxFeed$lambda$7$$inlined$map$3.collect(new AnonymousClass2(flowCollector2), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                };
            }
            this.p = 1;
            if (FlowKt.u(flowCollector, flowL, this) == coroutineSingletons) {
                return coroutineSingletons;
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
