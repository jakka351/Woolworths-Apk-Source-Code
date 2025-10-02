package androidx.compose.foundation.gestures;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {469}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AnchoredDraggableNode r;
    public final /* synthetic */ Ref.FloatRef s;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, Ref.FloatRef floatRef, float f, Continuation continuation) {
        super(3, continuation);
        this.r = anchoredDraggableNode;
        this.s = floatRef;
        this.t = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ref.FloatRef floatRef = this.s;
        float f = this.t;
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.r, floatRef, f, (Continuation) obj3);
        anchoredDraggableNode$fling$2.q = (AnchoredDragScope) obj;
        return anchoredDraggableNode$fling$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.q;
            final AnchoredDraggableNode anchoredDraggableNode = this.r;
            ScrollScope scrollScope = new ScrollScope(anchoredDraggableNode, anchoredDragScope) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2$scrollScope$1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AnchoredDragScope f867a;

                {
                    this.f867a = anchoredDragScope;
                }

                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float f(float f) {
                    throw null;
                }
            };
            FlingBehavior flingBehavior = anchoredDraggableNode.B;
            if (flingBehavior == null) {
                Intrinsics.p("resolvedFlingBehavior");
                throw null;
            }
            Ref.FloatRef floatRef2 = this.s;
            this.q = floatRef2;
            this.p = 1;
            obj = flingBehavior.a(scrollScope, this.t, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            floatRef = floatRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.q;
            ResultKt.b(obj);
        }
        floatRef.d = ((Number) obj).floatValue();
        return Unit.f24250a;
    }
}
