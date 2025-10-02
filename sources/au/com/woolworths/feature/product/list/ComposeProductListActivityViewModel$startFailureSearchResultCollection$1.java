package au.com.woolworths.feature.product.list;

import au.com.woolworths.feature.product.list.ComposeProductListActivityContract;
import au.com.woolworths.foundation.shop.olive.voice.SearchResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1", f = "ComposeProductListActivityViewModel.kt", l = {177}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ComposeProductListActivityViewModel$startFailureSearchResultCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Flow q;
    public final /* synthetic */ Flow r;
    public final /* synthetic */ ComposeProductListActivityViewModel s;
    public final /* synthetic */ c t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeProductListActivityViewModel$startFailureSearchResultCollection$1(Flow flow, Flow flow2, ComposeProductListActivityViewModel composeProductListActivityViewModel, c cVar, Continuation continuation) {
        super(2, continuation);
        this.q = flow;
        this.r = flow2;
        this.s = composeProductListActivityViewModel;
        this.t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeProductListActivityViewModel$startFailureSearchResultCollection$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeProductListActivityViewModel$startFailureSearchResultCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flow = this.q;
            final ComposeProductListActivityViewModel composeProductListActivityViewModel = this.s;
            Flow<SearchResult> flow2 = new Flow<SearchResult>() { // from class: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ComposeProductListActivityViewModel.kt", l = {52}, m = "emit")
                    /* renamed from: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, ComposeProductListActivityViewModel composeProductListActivityViewModel) {
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
                            boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L68
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            au.com.woolworths.feature.product.list.ProductListContract$ViewState r5 = (au.com.woolworths.feature.product.list.ProductListContract.ViewState) r5
                            au.com.woolworths.feature.product.list.errorstates.ProductListErrorState r5 = r5.c
                            if (r5 == 0) goto L5a
                            boolean r6 = r5 instanceof au.com.woolworths.feature.product.list.errorstates.ProductListErrorState.ProductListConnectionError
                            if (r6 == 0) goto L3f
                            au.com.woolworths.foundation.shop.olive.voice.SearchResult$ProductListConnectionError r5 = au.com.woolworths.foundation.shop.olive.voice.SearchResult.ProductListConnectionError.f8810a
                            goto L5b
                        L3f:
                            boolean r6 = r5 instanceof au.com.woolworths.feature.product.list.errorstates.ProductListErrorState.ProductListEmptyState
                            if (r6 == 0) goto L46
                            au.com.woolworths.foundation.shop.olive.voice.SearchResult$ProductListEmptyState r5 = au.com.woolworths.foundation.shop.olive.voice.SearchResult.ProductListEmptyState.f8811a
                            goto L5b
                        L46:
                            boolean r6 = r5 instanceof au.com.woolworths.feature.product.list.errorstates.ProductListErrorState.ProductListNoResultsState
                            if (r6 == 0) goto L4d
                            au.com.woolworths.foundation.shop.olive.voice.SearchResult$ProductListNoResultsState r5 = au.com.woolworths.foundation.shop.olive.voice.SearchResult.ProductListNoResultsState.f8812a
                            goto L5b
                        L4d:
                            boolean r5 = r5 instanceof au.com.woolworths.feature.product.list.errorstates.ProductListErrorState.ProductListServerError
                            if (r5 == 0) goto L54
                            au.com.woolworths.foundation.shop.olive.voice.SearchResult$ProductListServerError r5 = au.com.woolworths.foundation.shop.olive.voice.SearchResult.ProductListServerError.f8813a
                            goto L5b
                        L54:
                            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                            r5.<init>()
                            throw r5
                        L5a:
                            r5 = 0
                        L5b:
                            if (r5 == 0) goto L68
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L68
                            return r1
                        L68:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, composeProductListActivityViewModel), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            };
            final Flow flow3 = this.r;
            ChannelLimitedFlowMerge channelLimitedFlowMergeG = FlowKt.G(flow2, new Flow<SearchResult.ProductListNoResultsState>() { // from class: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2", f = "ComposeProductListActivityViewModel.kt", l = {58}, m = "emit")
                    /* renamed from: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2$1 r0 = (au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2$1 r0 = new au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L4d
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            au.com.woolworths.feature.product.list.ProductListContract$Actions r5 = (au.com.woolworths.feature.product.list.ProductListContract.Actions) r5
                            au.com.woolworths.feature.product.list.ProductListContract$Actions$ShowNoResultsMessage r6 = au.com.woolworths.feature.product.list.ProductListContract.Actions.ShowNoResultsMessage.f5239a
                            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r6)
                            if (r5 == 0) goto L3f
                            au.com.woolworths.foundation.shop.olive.voice.SearchResult$ProductListNoResultsState r5 = au.com.woolworths.foundation.shop.olive.voice.SearchResult.ProductListNoResultsState.f8812a
                            goto L40
                        L3f:
                            r5 = 0
                        L40:
                            if (r5 == 0) goto L4d
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4d
                            return r1
                        L4d:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1$invokeSuspend$$inlined$mapNotNull$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow3.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            });
            final c cVar = this.t;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.ComposeProductListActivityViewModel$startFailureSearchResultCollection$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SearchResult searchResult = (SearchResult) obj2;
                    if (((ComposeProductListActivityContract.ViewState) composeProductListActivityViewModel.j.getValue()).f) {
                        Timber.f27013a.b("SearchResultsCollection FAILED searchResult: " + searchResult, new Object[0]);
                        cVar.invoke(searchResult);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (channelLimitedFlowMergeG.collect(flowCollector, this) == coroutineSingletons) {
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
