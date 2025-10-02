package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.i;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Api33Impl", "Api34Impl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    public final Window l;
    public final boolean m;
    public final Function0 n;
    public final Animatable o;
    public final CoroutineScope p;
    public final MutableState q;
    public Object r;
    public boolean s;

    @RequiresApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "a", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "b", "(Landroid/view/View;Ljava/lang/Object;)V", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        @JvmStatic
        @DoNotInline
        @NotNull
        public static final OnBackInvokedCallback a(@NotNull final Function0<Unit> onDismissRequest) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.b
                public final void onBackInvoked() {
                    onDismissRequest.invoke();
                }
            };
        }

        @JvmStatic
        @DoNotInline
        public static final void b(@NotNull View view, @Nullable Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) backCallback);
        }

        @JvmStatic
        @DoNotInline
        public static final void c(@NotNull View view, @Nullable Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J9\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api34Impl;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroid/window/OnBackAnimationCallback;", "a", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;)Landroid/window/OnBackAnimationCallback;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        @JvmStatic
        @DoNotInline
        @NotNull
        public static final OnBackAnimationCallback a(@NotNull final Function0<Unit> onDismissRequest, @NotNull final Animatable<Float, AnimationVector1D> predictiveBackProgress, @NotNull final CoroutineScope scope) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public final void onBackCancelled() {
                    BuildersKt.c(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(predictiveBackProgress, null), 3);
                }

                public final void onBackInvoked() {
                    onDismissRequest.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    BuildersKt.c(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(predictiveBackProgress, backEvent, null), 3);
                }

                public final void onBackStarted(BackEvent backEvent) {
                    BuildersKt.c(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(predictiveBackProgress, backEvent, null), 3);
                }
            };
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z, Function0 function0, Animatable animatable, CoroutineScope coroutineScope) {
        super(context, null, 6, 0);
        this.l = window;
        this.m = z;
        this.n = function0;
        this.o = animatable;
        this.p = coroutineScope;
        this.q = SnapshotStateKt.f(ComposableSingletons$ModalBottomSheet_androidKt.f1420a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(576708319);
        if ((((composerImplV.I(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ((Function2) ((SnapshotMutableStateImpl) this.q).getD()).invoke(composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Content$4
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    this.h.a((Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getS() {
        return this.s;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    /* renamed from: getWindow, reason: from getter */
    public final Window getL() {
        return this.l;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.m || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.r == null) {
            Function0 function0 = this.n;
            this.r = i >= 34 ? i.j(Api34Impl.a(function0, this.o, this.p)) : Api33Impl.a(function0);
        }
        Api33Impl.b(this, this.r);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.c(this, this.r);
        }
        this.r = null;
    }
}
