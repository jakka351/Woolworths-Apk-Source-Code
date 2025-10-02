package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.product.models.ProductCard;
import java.util.LinkedHashSet;
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
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1", f = "InstoreMapViewModel.kt", l = {1194}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InstoreMapViewModel$enableInitialProductProximity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapViewModel q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "locked", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$2", f = "InstoreMapViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public /* synthetic */ boolean p;
        public final /* synthetic */ InstoreMapViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = instoreMapViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
            anonymousClass2.p = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            boolean z = this.p;
            InstoreMapViewModel instoreMapViewModel = this.q;
            LinkedHashSet linkedHashSet = instoreMapViewModel.y;
            ProductCard productCard = instoreMapViewModel.u;
            if (productCard != null && z && !linkedHashSet.contains(productCard.getProductId())) {
                InstoreMapViewModel.t6(instoreMapViewModel, productCard);
                linkedHashSet.add(productCard.getProductId());
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$enableInitialProductProximity$1(InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$enableInitialProductProximity$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapViewModel$enableInitialProductProximity$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            InstoreMapViewModel instoreMapViewModel = this.q;
            final StateFlow currentPosition = instoreMapViewModel.j.getCurrentPosition();
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(instoreMapViewModel, null), new Flow<Boolean>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2", f = "InstoreMapViewModel.kt", l = {50}, m = "emit")
                    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r6)
                            goto L4b
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            kotlin.ResultKt.b(r6)
                            au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition r5 = (au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition) r5
                            r6 = 0
                            if (r5 == 0) goto L3c
                            boolean r5 = r5.e
                            if (r5 != r3) goto L3c
                            r6 = r3
                        L3c:
                            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4b
                            return r1
                        L4b:
                            kotlin.Unit r5 = kotlin.Unit.f24250a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$enableInitialProductProximity$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = currentPosition.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            });
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
