package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001eJ\u0015\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR*\u00101\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010A\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R.\u0010M\u001a\u0004\u0018\u00010F2\b\u0010\u0019\u001a\u0004\u0018\u00010F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR.\u0010U\u001a\u0004\u0018\u00010N2\b\u0010\u0019\u001a\u0004\u0018\u00010N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u00106\"\u0004\bY\u00108R\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "", "getNestedScrollAxes", "()I", "e", "Landroid/view/View;", "getView", "view", "Lkotlin/Function0;", "", "value", "g", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "<set-?>", "i", "getReset", "setReset", "reset", "j", "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", "k", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "l", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", "m", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "n", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "o", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "p", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "", "v", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "B", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    public static final Function1 C = null;
    public boolean A;

    /* renamed from: B, reason: from kotlin metadata */
    public final LayoutNode layoutNode;
    public final NestedScrollDispatcher d;

    /* renamed from: e, reason: from kotlin metadata */
    public final View view;
    public final Owner f;

    /* renamed from: g, reason: from kotlin metadata */
    public Function0 update;
    public boolean h;

    /* renamed from: i, reason: from kotlin metadata */
    public Function0 reset;

    /* renamed from: j, reason: from kotlin metadata */
    public Function0 release;

    /* renamed from: k, reason: from kotlin metadata */
    public Modifier modifier;

    /* renamed from: l, reason: from kotlin metadata */
    public Function1 onModifierChanged;

    /* renamed from: m, reason: from kotlin metadata */
    public Density density;

    /* renamed from: n, reason: from kotlin metadata */
    public Function1 onDensityChanged;

    /* renamed from: o, reason: from kotlin metadata */
    public LifecycleOwner lifecycleOwner;

    /* renamed from: p, reason: from kotlin metadata */
    public SavedStateRegistryOwner savedStateRegistryOwner;
    public final int[] q;
    public long r;
    public WindowInsetsCompat s;
    public final Function0 t;
    public final Function0 u;

    /* renamed from: v, reason: from kotlin metadata */
    public Function1 onRequestDisallowInterceptTouchEvent;
    public final int[] w;
    public int x;
    public int y;
    public final NestedScrollingParentHelper z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "OnCommitAffectingUpdate", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {639, 641}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ boolean q;
        public final /* synthetic */ AndroidViewHolder r;
        public final /* synthetic */ long s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, Continuation continuation) {
            super(2, continuation);
            this.q = z;
            this.r = androidViewHolder;
            this.s = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r4.a(0, r10.s, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r1.a(r10.s, 0, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r10.p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r11)
                goto L47
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                kotlin.ResultKt.b(r11)
                r6 = r10
                goto L47
            L1d:
                kotlin.ResultKt.b(r11)
                boolean r11 = r10.q
                androidx.compose.ui.viewinterop.AndroidViewHolder r1 = r10.r
                if (r11 != 0) goto L37
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = r1.d
                r10.p = r3
                r5 = 0
                long r7 = r10.s
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L47
                goto L46
            L37:
                r6 = r10
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r1.d
                r6.p = r2
                long r2 = r6.s
                r4 = 0
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L47
            L46:
                return r0
            L47:
                kotlin.Unit r11 = kotlin.Unit.f24250a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {650}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    final class C04401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ long r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04401(long j, Continuation continuation) {
            super(2, continuation);
            this.r = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AndroidViewHolder.this.new C04401(this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C04401) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.d;
                this.p = 1;
                if (nestedScrollDispatcher.b(this.r, this) == coroutineSingletons) {
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

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.d = nestedScrollDispatcher;
        this.view = view;
        this.f = owner;
        if (compositionContext != null) {
            LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.f1991a;
            setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.P(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsCompat c(WindowInsetsCompat windowInsetsCompat, List list) {
                Function1 function1 = AndroidViewHolder.C;
                return AndroidViewHolder.this.f(windowInsetsCompat);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsAnimationCompat.BoundsCompat d(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
                InnerNodeCoordinator innerNodeCoordinator = AndroidViewHolder.this.layoutNode.K.b;
                if (innerNodeCoordinator.U.q) {
                    long jC = IntOffsetKt.c(innerNodeCoordinator.G(0L));
                    int i2 = (int) (jC >> 32);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int i3 = (int) (jC & 4294967295L);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    long jA = LayoutCoordinatesKt.c(innerNodeCoordinator).a();
                    int i4 = (int) (jA >> 32);
                    int i5 = (int) (jA & 4294967295L);
                    long j = innerNodeCoordinator.f;
                    long jC2 = IntOffsetKt.c(innerNodeCoordinator.G((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                    int i6 = i4 - ((int) (jC2 >> 32));
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    int i7 = i5 - ((int) (4294967295L & jC2));
                    int i8 = i7 >= 0 ? i7 : 0;
                    if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                        return new WindowInsetsAnimationCompat.BoundsCompat(AndroidViewHolder.e(boundsCompat.f2496a, i2, i3, i6, i8), AndroidViewHolder.e(boundsCompat.b, i2, i3, i6, i8));
                    }
                }
                return boundsCompat;
            }
        });
        ViewCompat.I(this, this);
        this.update = AndroidViewHolder$update$1.h;
        this.reset = AndroidViewHolder$reset$1.h;
        this.release = AndroidViewHolder$release$1.h;
        Modifier.Companion companion = Modifier.Companion.d;
        this.modifier = companion;
        this.density = DensityKt.b();
        this.q = new int[2];
        this.r = 0L;
        this.t = new AndroidViewHolder$runUpdate$1(this);
        this.u = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.getLayoutNode().Q();
                return Unit.f24250a;
            }
        };
        this.w = new int[2];
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = new NestedScrollingParentHelper();
        final LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.j = true;
        layoutNode.t = this;
        final Modifier modifierA = OnGloballyPositionedModifierKt.a(DrawModifierKt.b(GraphicsLayerModifierKt.b(PointerInteropFilter_androidKt.a(SemanticsModifierKt.b(NestedScrollModifierKt.a(companion, AndroidViewHolder_androidKt.f2210a, nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.h), this), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131071), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Canvas canvasA = ((DrawScope) obj).getE().a();
                AndroidViewHolder androidViewHolder = this.h;
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.A = true;
                    Owner owner2 = layoutNode.s;
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        android.graphics.Canvas canvasA2 = AndroidCanvas_androidKt.a(canvasA);
                        androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                        this.draw(canvasA2);
                    }
                    androidViewHolder.A = false;
                }
                return Unit.f24250a;
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WindowInsets windowInsetsR;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder = this.h;
                AndroidViewHolder_androidKt.a(androidViewHolder, layoutNode2);
                androidViewHolder.f.m();
                int[] iArr = androidViewHolder.q;
                int i2 = iArr[0];
                int i3 = iArr[1];
                androidViewHolder.getView().getLocationOnScreen(iArr);
                long j = androidViewHolder.r;
                long jA = ((LayoutCoordinates) obj).a();
                androidViewHolder.r = jA;
                WindowInsetsCompat windowInsetsCompat = androidViewHolder.s;
                if (windowInsetsCompat != null && ((i2 != iArr[0] || i3 != iArr[1] || !IntSize.b(j, jA)) && (windowInsetsR = androidViewHolder.f(windowInsetsCompat).r()) != null)) {
                    androidViewHolder.getView().dispatchApplyWindowInsets(windowInsetsR);
                }
                return Unit.f24250a;
            }
        });
        layoutNode.k = i;
        layoutNode.g(this.modifier.x0(modifierA));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                layoutNode.g(((Modifier) obj).x0(modifierA));
                return Unit.f24250a;
            }
        };
        layoutNode.h(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                layoutNode.h((Density) obj);
                return Unit.f24250a;
            }
        };
        layoutNode.R = new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                final AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                AndroidViewHolder androidViewHolder = this.h;
                if (androidComposeView != null) {
                    HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    final LayoutNode layoutNode2 = layoutNode;
                    holderToLayoutNode.put(androidViewHolder, layoutNode2);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(androidViewHolder);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode2, androidViewHolder);
                    androidViewHolder.setImportantForAccessibility(1);
                    ViewCompat.A(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
                        /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
                        @Override // androidx.core.view.AccessibilityDelegateCompat
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void d(android.view.View r8, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9) {
                            /*
                                r7 = this;
                                android.view.accessibility.AccessibilityNodeInfo r0 = r9.f2508a
                                android.view.View$AccessibilityDelegate r1 = r7.f2466a
                                r1.onInitializeAccessibilityNodeInfo(r8, r0)
                                androidx.compose.ui.platform.AndroidComposeView r8 = r1
                                androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = r8.u
                                boolean r2 = r1.u()
                                if (r2 == 0) goto L15
                                r2 = 0
                                r0.setVisibleToUser(r2)
                            L15:
                                androidx.compose.ui.node.LayoutNode r2 = r2
                                androidx.compose.ui.node.LayoutNode r3 = r2.K()
                            L1b:
                                r4 = 0
                                if (r3 == 0) goto L2e
                                androidx.compose.ui.node.NodeChain r5 = r3.K
                                r6 = 8
                                boolean r5 = r5.d(r6)
                                if (r5 == 0) goto L29
                                goto L2f
                            L29:
                                androidx.compose.ui.node.LayoutNode r3 = r3.K()
                                goto L1b
                            L2e:
                                r3 = r4
                            L2f:
                                if (r3 == 0) goto L37
                                int r3 = r3.e
                                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                            L37:
                                r3 = -1
                                if (r4 == 0) goto L4a
                                androidx.compose.ui.semantics.SemanticsOwner r5 = r8.getSemanticsOwner()
                                androidx.compose.ui.semantics.SemanticsNode r5 = r5.a()
                                int r5 = r5.g
                                int r6 = r4.intValue()
                                if (r6 != r5) goto L4e
                            L4a:
                                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                            L4e:
                                int r4 = r4.intValue()
                                r9.b = r4
                                androidx.compose.ui.platform.AndroidComposeView r9 = r3
                                r0.setParent(r9, r4)
                                int r2 = r2.e
                                androidx.collection.MutableIntIntMap r4 = r1.E
                                int r4 = r4.b(r2)
                                if (r4 == r3) goto L79
                                androidx.compose.ui.platform.AndroidViewsHandler r5 = r8.getAndroidViewsHandler$ui_release()
                                androidx.compose.ui.viewinterop.AndroidViewHolder r5 = androidx.compose.ui.platform.SemanticsUtils_androidKt.g(r5, r4)
                                if (r5 == 0) goto L71
                                r0.setTraversalBefore(r5)
                                goto L74
                            L71:
                                r0.setTraversalBefore(r9, r4)
                            L74:
                                java.lang.String r4 = r1.G
                                androidx.compose.ui.platform.AndroidComposeView.E(r8, r2, r0, r4)
                            L79:
                                androidx.collection.MutableIntIntMap r4 = r1.F
                                int r4 = r4.b(r2)
                                if (r4 == r3) goto L97
                                androidx.compose.ui.platform.AndroidViewsHandler r3 = r8.getAndroidViewsHandler$ui_release()
                                androidx.compose.ui.viewinterop.AndroidViewHolder r3 = androidx.compose.ui.platform.SemanticsUtils_androidKt.g(r3, r4)
                                if (r3 == 0) goto L8f
                                r0.setTraversalAfter(r3)
                                goto L92
                            L8f:
                                r0.setTraversalAfter(r9, r4)
                            L92:
                                java.lang.String r9 = r1.H
                                androidx.compose.ui.platform.AndroidComposeView.E(r8, r2, r0, r9)
                            L97:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.d(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
                        }
                    });
                }
                if (androidViewHolder.getView().getParent() != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
                return Unit.f24250a;
            }
        };
        layoutNode.S = new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Owner owner2 = (Owner) obj;
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                AndroidViewHolder androidViewHolder = this.h;
                if (androidComposeView != null) {
                    androidComposeView.Y(androidViewHolder);
                }
                androidViewHolder.removeAllViewsInLayout();
                return Unit.f24250a;
            }
        };
        layoutNode.f(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult c(MeasureScope measureScope, List list, long j) {
                final AndroidViewHolder androidViewHolder = this.f2209a;
                if (androidViewHolder.getChildCount() == 0) {
                    return measureScope.L0(Constraints.j(j), Constraints.i(j), EmptyMap.d, AndroidViewHolder$layoutNode$1$5$measure$1.h);
                }
                if (Constraints.j(j) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumWidth(Constraints.j(j));
                }
                if (Constraints.i(j) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumHeight(Constraints.i(j));
                }
                int iJ = Constraints.j(j);
                int iH = Constraints.h(j);
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams);
                int iD = AndroidViewHolder.d(androidViewHolder, iJ, iH, layoutParams.width);
                int i2 = Constraints.i(j);
                int iG = Constraints.g(j);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams2);
                androidViewHolder.measure(iD, AndroidViewHolder.d(androidViewHolder, i2, iG, layoutParams2.height));
                int measuredWidth = androidViewHolder.getMeasuredWidth();
                int measuredHeight = androidViewHolder.getMeasuredHeight();
                final LayoutNode layoutNode2 = layoutNode;
                return measureScope.L0(measuredWidth, measuredHeight, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        AndroidViewHolder_androidKt.a(androidViewHolder, layoutNode2);
                        return Unit.f24250a;
                    }
                });
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                AndroidViewHolder androidViewHolder = this.f2209a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.d(androidViewHolder, 0, i2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f2209a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.d(androidViewHolder, 0, i2, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                AndroidViewHolder androidViewHolder = this.f2209a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams);
                androidViewHolder.measure(AndroidViewHolder.d(androidViewHolder, 0, i2, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this.f2209a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.e(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.d(androidViewHolder, 0, i2, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }
        });
        this.layoutNode = layoutNode;
    }

    public static final int d(AndroidViewHolder androidViewHolder, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(RangesKt.c(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static Insets e(Insets insets, int i, int i2, int i3, int i4) {
        int i5 = insets.f2430a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = insets.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = insets.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = insets.d - i4;
        return Insets.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f.getSnapshotObserver();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void a() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void c() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    public final WindowInsetsCompat f(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.l()) {
            InnerNodeCoordinator innerNodeCoordinator = this.layoutNode.K.b;
            if (innerNodeCoordinator.U.q) {
                long jC = IntOffsetKt.c(innerNodeCoordinator.G(0L));
                int i = (int) (jC >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jC & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jA = LayoutCoordinatesKt.c(innerNodeCoordinator).a();
                int i3 = (int) (jA >> 32);
                int i4 = (int) (jA & 4294967295L);
                long j = innerNodeCoordinator.f;
                long jC2 = IntOffsetKt.c(innerNodeCoordinator.G((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (jC2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jC2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return windowInsetsCompat.n(i, i2, i5, i7);
                }
            }
        }
        return windowInsetsCompat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.w;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.z.a();
    }

    @Nullable
    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Nullable
    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.release;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.reset;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        this.z.c(i);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        this.z.b(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.A) {
            this.layoutNode.Q();
            return null;
        }
        this.view.postOnAnimation(new a(0, this.u));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.view.isNestedScrollingEnabled()) {
            float fB = AndroidViewHolder_androidKt.b(i);
            float fB2 = AndroidViewHolder_androidKt.b(i2);
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fB2) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            float fB3 = AndroidViewHolder_androidKt.b(i3);
            float fB4 = AndroidViewHolder_androidKt.b(i4);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fB4) & 4294967295L) | (Float.floatToRawIntBits(fB3) << 32);
            int iD = AndroidViewHolder_androidKt.d(i5);
            NestedScrollNode nestedScrollNode = this.d.f1845a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.q) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.a(nestedScrollNode);
            }
            if (nestedScrollNode2 != null) {
                nestedScrollNode2.n0(iD, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void k() {
        View view = this.view;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
        if (this.view.isNestedScrollingEnabled()) {
            float fB = AndroidViewHolder_androidKt.b(i);
            long jFloatToRawIntBits = (Float.floatToRawIntBits(AndroidViewHolder_androidKt.b(i2)) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            int iD = AndroidViewHolder_androidKt.d(i3);
            NestedScrollNode nestedScrollNode = this.d.f1845a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.q) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.a(nestedScrollNode);
            }
            long jB0 = nestedScrollNode2 != null ? nestedScrollNode2.b0(iD, jFloatToRawIntBits) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.b(Float.intBitsToFloat((int) (jB0 >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.b(Float.intBitsToFloat((int) (jB0 & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.view.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (Float.floatToRawIntBits(AndroidViewHolder_androidKt.b(i)) << 32) | (Float.floatToRawIntBits(AndroidViewHolder_androidKt.b(i2)) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(AndroidViewHolder_androidKt.b(i3)) << 32) | (Float.floatToRawIntBits(AndroidViewHolder_androidKt.b(i4)) & 4294967295L);
            int iD = AndroidViewHolder_androidKt.d(i5);
            NestedScrollNode nestedScrollNode = this.d.f1845a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.q) {
                nestedScrollNode2 = (NestedScrollNode) TraversableNodeKt.a(nestedScrollNode);
            }
            NestedScrollNode nestedScrollNode3 = nestedScrollNode2;
            long jN0 = nestedScrollNode3 != null ? nestedScrollNode3.n0(iD, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = NestedScrollInteropConnectionKt.b(Float.intBitsToFloat((int) (jN0 >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.b(Float.intBitsToFloat((int) (jN0 & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.s = new WindowInsetsCompat(windowInsetsCompat);
        return f(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((AndroidViewHolder$runUpdate$1) this.t).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.A) {
            this.layoutNode.Q();
        } else {
            this.view.postOnAnimation(new a(0, this.u));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f1931a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.view.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.view;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.x = i;
        this.y = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.c(this.d.c(), null, null, new AnonymousClass1(z, this, VelocityKt.a(AndroidViewHolder_androidKt.c(f), AndroidViewHolder_androidKt.c(f2)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt.c(this.d.c(), null, null, new C04401(VelocityKt.a(AndroidViewHolder_androidKt.c(f), AndroidViewHolder_androidKt.c(f2)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull Density density) {
        if (density != this.density) {
            this.density = density;
            Function1 function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.b(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1 function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.b(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.update = function0;
        this.h = true;
        ((AndroidViewHolder$runUpdate$1) this.t).invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean y0() {
        return isAttachedToWindow();
    }
}
