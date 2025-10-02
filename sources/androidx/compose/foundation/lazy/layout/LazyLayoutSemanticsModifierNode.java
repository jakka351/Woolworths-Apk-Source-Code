package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public Function0 r;
    public LazyLayoutSemanticState s;
    public Orientation t;
    public boolean u;
    public boolean v;
    public ScrollAxisRange w;
    public final Function1 x = new Function1<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$indexForKeyMapping$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.h.r.invoke();
            int iA = lazyLayoutItemProvider.a();
            int i = 0;
            while (true) {
                if (i >= iA) {
                    i = -1;
                    break;
                }
                if (lazyLayoutItemProvider.f(i).equals(obj)) {
                    break;
                }
                i++;
            }
            return Integer.valueOf(i);
        }
    };
    public Function1 y;

    public LazyLayoutSemanticsModifierNode(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        this.r = function0;
        this.s = lazyLayoutSemanticState;
        this.t = orientation;
        this.u = z;
        this.v = z2;
        s2();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.u(semanticsPropertyReceiver);
        semanticsPropertyReceiver.b(SemanticsProperties.K, this.x);
        if (this.t == Orientation.d) {
            ScrollAxisRange scrollAxisRange = this.w;
            if (scrollAxisRange == null) {
                Intrinsics.p("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.w(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.w;
            if (scrollAxisRange2 == null) {
                Intrinsics.p("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.m(semanticsPropertyReceiver, scrollAxisRange2);
        }
        Function1 function1 = this.y;
        if (function1 != null) {
            semanticsPropertyReceiver.b(SemanticsActions.f, new AccessibilityAction(null, function1));
        }
        SemanticsPropertiesKt.e(semanticsPropertyReceiver, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$applySemantics$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.h;
                return Float.valueOf(lazyLayoutSemanticsModifierNode.s.f() - lazyLayoutSemanticsModifierNode.s.a());
            }
        });
        CollectionInfo collectionInfoE = this.s.e();
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f;
        KProperty kProperty = SemanticsPropertiesKt.f2022a[21];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, collectionInfoE);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    public final void s2() {
        this.w = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(this.h.s.c());
            }
        }, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(this.h.s.d());
            }
        }, this.v);
        this.y = this.u ? new Function1<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public final /* synthetic */ LazyLayoutSemanticsModifierNode q;
                public final /* synthetic */ int r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i, Continuation continuation) {
                    super(2, continuation);
                    this.q = lazyLayoutSemanticsModifierNode;
                    this.r = i;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.q, this.r, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        LazyLayoutSemanticState lazyLayoutSemanticState = this.q.s;
                        this.p = 1;
                        if (lazyLayoutSemanticState.b(this.r, this) == coroutineSingletons) {
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

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.h;
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) lazyLayoutSemanticsModifierNode.r.invoke();
                if (iIntValue < 0 || iIntValue >= lazyLayoutItemProvider.a()) {
                    StringBuilder sbR = YU.a.r(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbR.append(lazyLayoutItemProvider.a());
                    sbR.append(')');
                    InlineClassHelperKt.a(sbR.toString());
                }
                BuildersKt.c(lazyLayoutSemanticsModifierNode.g2(), null, null, new AnonymousClass2(lazyLayoutSemanticsModifierNode, iIntValue, null), 3);
                return Boolean.TRUE;
            }
        } : null;
    }
}
