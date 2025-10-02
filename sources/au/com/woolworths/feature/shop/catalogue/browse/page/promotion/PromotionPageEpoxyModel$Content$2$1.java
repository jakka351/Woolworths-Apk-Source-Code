package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import androidx.compose.ui.focus.FocusRequester;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1", f = "PromotionPageEpoxyModel.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PromotionPageEpoxyModel$Content$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ PromotionPageEpoxyModel q;
    public final /* synthetic */ FocusRequester r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$2", f = "PromotionPageEpoxyModel.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ FocusRequester q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FocusRequester focusRequester, Continuation continuation) {
            super(2, continuation);
            this.q = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i == 0) {
                ResultKt.b(obj);
                Duration durationOfMillis = Duration.ofMillis(500L);
                Intrinsics.g(durationOfMillis, "ofMillis(...)");
                this.p = 1;
                Object objB = DelayKt.b(durationOfMillis.compareTo(Duration.ZERO) <= 0 ? 0L : durationOfMillis.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (durationOfMillis.getSeconds() < 9223372036854775L || (durationOfMillis.getSeconds() == 9223372036854775L && durationOfMillis.getNano() < 807000000)) ? durationOfMillis.toMillis() : Long.MAX_VALUE, this);
                if (objB != coroutineSingletons) {
                    objB = unit;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            FocusRequester.d(this.q);
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionPageEpoxyModel$Content$2$1(PromotionPageEpoxyModel promotionPageEpoxyModel, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.q = promotionPageEpoxyModel;
        this.r = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromotionPageEpoxyModel$Content$2$1 promotionPageEpoxyModel$Content$2$1 = new PromotionPageEpoxyModel$Content$2$1(this.q, this.r, continuation);
        promotionPageEpoxyModel$Content$2$1.p = obj;
        return promotionPageEpoxyModel$Content$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PromotionPageEpoxyModel$Content$2$1 promotionPageEpoxyModel$Content$2$1 = (PromotionPageEpoxyModel$Content$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        promotionPageEpoxyModel$Content$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        final PromotionPageEpoxyModel promotionPageEpoxyModel = this.q;
        final StateFlow<Integer> pagingFlow = promotionPageEpoxyModel.getPagingFlow();
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(this.r, null), new Flow<Integer>() { // from class: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ PromotionPageEpoxyModel e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2", f = "PromotionPageEpoxyModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, PromotionPageEpoxyModel promotionPageEpoxyModel) {
                    this.d = flowCollector;
                    this.e = promotionPageEpoxyModel;
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L4e
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        java.lang.Number r6 = (java.lang.Number) r6
                        int r6 = r6.intValue()
                        au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel r2 = r4.e
                        au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage$Promotion r2 = r2.getPage()
                        int r2 = r2.b
                        if (r6 != r2) goto L4e
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.PromotionPageEpoxyModel$Content$2$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = pagingFlow.collect(new AnonymousClass2(flowCollector, promotionPageEpoxyModel), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), coroutineScope);
        return Unit.f24250a;
    }
}
