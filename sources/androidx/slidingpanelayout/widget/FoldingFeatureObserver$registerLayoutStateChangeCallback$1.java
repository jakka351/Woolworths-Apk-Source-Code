package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.view.animation.PathInterpolator;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FoldingFeatureObserver q;
    public final /* synthetic */ Activity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(FoldingFeatureObserver foldingFeatureObserver, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.q = foldingFeatureObserver;
        this.r = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final FoldingFeatureObserver foldingFeatureObserver = this.q;
            final Flow flowB = foldingFeatureObserver.f3761a.b(this.r);
            Flow flowR = FlowKt.r(new Flow<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public final class AnonymousClass2 implements FlowCollector<WindowLayoutInfo> {
                    public final /* synthetic */ FlowCollector d;
                    public final /* synthetic */ FoldingFeatureObserver e;

                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", l = {138}, m = "emit")
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, FoldingFeatureObserver foldingFeatureObserver) {
                        this.d = flowCollector;
                        this.e = foldingFeatureObserver;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    /* JADX WARN: Type inference failed for: r7v4 */
                    /* JADX WARN: Type inference failed for: r7v5 */
                    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L18
                        L13:
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.p
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.q
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r7)
                            goto L6a
                        L27:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L2f:
                            kotlin.ResultKt.b(r7)
                            androidx.window.layout.WindowLayoutInfo r6 = (androidx.window.layout.WindowLayoutInfo) r6
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver r7 = r5.e
                            r7.getClass()
                            java.lang.Object r6 = r6.f3889a
                            java.lang.Iterable r6 = (java.lang.Iterable) r6
                            java.util.Iterator r6 = r6.iterator()
                        L41:
                            boolean r7 = r6.hasNext()
                            r2 = 0
                            if (r7 == 0) goto L54
                            java.lang.Object r7 = r6.next()
                            r4 = r7
                            androidx.window.layout.DisplayFeature r4 = (androidx.window.layout.DisplayFeature) r4
                            boolean r4 = r4 instanceof androidx.window.layout.FoldingFeature
                            if (r4 == 0) goto L41
                            goto L55
                        L54:
                            r7 = r2
                        L55:
                            boolean r6 = r7 instanceof androidx.window.layout.FoldingFeature
                            if (r6 == 0) goto L5c
                            r2 = r7
                            androidx.window.layout.FoldingFeature r2 = (androidx.window.layout.FoldingFeature) r2
                        L5c:
                            if (r2 != 0) goto L5f
                            goto L6a
                        L5f:
                            r0.q = r3
                            kotlinx.coroutines.flow.FlowCollector r6 = r5.d
                            java.lang.Object r6 = r6.emit(r2, r0)
                            if (r6 != r1) goto L6a
                            return r1
                        L6a:
                            kotlin.Unit r6 = kotlin.Unit.f24250a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowB.collect(new AnonymousClass2(flowCollector, foldingFeatureObserver), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            });
            FlowCollector<FoldingFeature> flowCollector = new FlowCollector<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Unit unit;
                    FoldingFeature foldingFeature = (FoldingFeature) obj2;
                    FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = foldingFeatureObserver.d;
                    Unit unit2 = Unit.f24250a;
                    if (onFoldingFeatureChangeListener == null) {
                        unit = null;
                    } else {
                        SlidingPaneLayout slidingPaneLayout = ((SlidingPaneLayout.AnonymousClass1) onFoldingFeatureChangeListener).f3762a;
                        slidingPaneLayout.y = foldingFeature;
                        ChangeBounds changeBounds = new ChangeBounds();
                        changeBounds.f = 300L;
                        changeBounds.g = new PathInterpolator(0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                        TransitionManager.a(slidingPaneLayout, changeBounds);
                        slidingPaneLayout.requestLayout();
                        unit = unit2;
                    }
                    return unit == CoroutineSingletons.d ? unit : unit2;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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
