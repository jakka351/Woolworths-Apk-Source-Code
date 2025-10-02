package com.skydoves.balloon.compose;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.navigation.ui.a;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.p;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$setOnBalloonOutsideTouchListener$1;
import com.skydoves.balloon.OnBalloonClickListener;
import com.skydoves.balloon.OnBalloonDismissListener;
import com.skydoves.balloon.OnBalloonInitializedListener;
import com.skydoves.balloon.OnBalloonOutsideTouchListener;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import com.skydoves.balloon.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0018\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J)\u0010!\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\"0\u001aH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010%\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R*\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010>\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010ARM\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\bB2\u0017\u0010=\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\bB8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/skydoves/balloon/compose/BalloonComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lcom/skydoves/balloon/compose/BalloonWindow;", "Lcom/skydoves/balloon/OnBalloonClickListener;", "onBalloonClickListener", "", "setOnBalloonClickListener", "(Lcom/skydoves/balloon/OnBalloonClickListener;)V", "Lkotlin/Function1;", "Landroid/view/View;", "block", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/skydoves/balloon/OnBalloonInitializedListener;", "onBalloonInitializedListener", "setOnBalloonInitializedListener", "(Lcom/skydoves/balloon/OnBalloonInitializedListener;)V", "Lcom/skydoves/balloon/OnBalloonDismissListener;", "onBalloonDismissListener", "setOnBalloonDismissListener", "(Lcom/skydoves/balloon/OnBalloonDismissListener;)V", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/skydoves/balloon/OnBalloonOutsideTouchListener;", "onBalloonOutsideTouchListener", "setOnBalloonOutsideTouchListener", "(Lcom/skydoves/balloon/OnBalloonOutsideTouchListener;)V", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View$OnTouchListener;", "onTouchListener", "setOnBalloonTouchListener", "(Landroid/view/View$OnTouchListener;)V", "setOnBalloonOverlayTouchListener", "", "Lcom/skydoves/balloon/OnBalloonOverlayClickListener;", "onBalloonOverlayClickListener", "setOnBalloonOverlayClickListener", "(Lcom/skydoves/balloon/OnBalloonOverlayClickListener;)V", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "getBalloonArrowView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Landroidx/compose/runtime/MutableState;", "Lcom/skydoves/balloon/compose/BalloonLayoutInfo;", "l", "Landroidx/compose/runtime/MutableState;", "getBalloonLayoutInfo$balloon_compose_release", "()Landroidx/compose/runtime/MutableState;", "setBalloonLayoutInfo$balloon_compose_release", "(Landroidx/compose/runtime/MutableState;)V", "balloonLayoutInfo", "Lcom/skydoves/balloon/Balloon;", "balloon", "Lcom/skydoves/balloon/Balloon;", "getBalloon", "()Lcom/skydoves/balloon/Balloon;", "<set-?>", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "Landroidx/compose/runtime/Composable;", "content$delegate", "getContent", "()Lkotlin/jvm/functions/Function3;", "setContent", "(Lkotlin/jvm/functions/Function3;)V", "content", "balloon-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BalloonComposeView extends AbstractComposeView implements BalloonWindow {

    /* renamed from: l, reason: from kotlin metadata */
    public MutableState balloonLayoutInfo;

    private final Function3<BalloonComposeView, Composer, Integer, Unit> getContent() {
        throw null;
    }

    private final void setContent(Function3<? super BalloonComposeView, ? super Composer, ? super Integer, Unit> function3) {
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-441221009);
        getContent().invoke(this, composerImplV, 8);
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX == null) {
            return;
        }
        recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: com.skydoves.balloon.compose.BalloonComposeView$Content$4
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

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "com.skydoves.balloon.compose.BalloonComposeView";
    }

    @NotNull
    public Balloon getBalloon() {
        return null;
    }

    @NotNull
    public View getBalloonArrowView() {
        ImageView imageView = getBalloon().f.f;
        Intrinsics.g(imageView, "binding.balloonArrow");
        return imageView;
    }

    @NotNull
    public final MutableState<BalloonLayoutInfo> getBalloonLayoutInfo$balloon_compose_release() {
        return this.balloonLayoutInfo;
    }

    @NotNull
    public ViewGroup getContentView() {
        return getBalloon().f.g;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return false;
    }

    public final void setBalloonLayoutInfo$balloon_compose_release(@NotNull MutableState<BalloonLayoutInfo> mutableState) {
        Intrinsics.h(mutableState, "<set-?>");
        this.balloonLayoutInfo = mutableState;
    }

    public void setOnBalloonClickListener(@Nullable OnBalloonClickListener onBalloonClickListener) {
        getBalloon().k(onBalloonClickListener);
    }

    public void setOnBalloonDismissListener(@Nullable OnBalloonDismissListener onBalloonDismissListener) {
        Balloon balloon = getBalloon();
        balloon.h.setOnDismissListener(new b(balloon, onBalloonDismissListener));
    }

    public void setOnBalloonInitializedListener(@Nullable OnBalloonInitializedListener onBalloonInitializedListener) {
        getBalloon().l = onBalloonInitializedListener;
    }

    public void setOnBalloonOutsideTouchListener(@Nullable OnBalloonOutsideTouchListener onBalloonOutsideTouchListener) {
        Balloon balloon = getBalloon();
        balloon.h.setTouchInterceptor(new Balloon$setOnBalloonOutsideTouchListener$1(balloon, onBalloonOutsideTouchListener));
    }

    public void setOnBalloonOverlayClickListener(@Nullable OnBalloonOverlayClickListener onBalloonOverlayClickListener) {
        Balloon balloon = getBalloon();
        balloon.g.d.setOnClickListener(new a(21, onBalloonOverlayClickListener, balloon));
    }

    public void setOnBalloonOverlayTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        Balloon balloon = getBalloon();
        if (onTouchListener != null) {
            balloon.i.setTouchInterceptor(onTouchListener);
        } else {
            balloon.getClass();
        }
    }

    public void setOnBalloonTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        Balloon balloon = getBalloon();
        if (onTouchListener != null) {
            balloon.h.setTouchInterceptor(onTouchListener);
        } else {
            balloon.getClass();
        }
    }

    public void setOnBalloonClickListener(@NotNull Function1<? super View, Unit> block) {
        Intrinsics.h(block, "block");
        getBalloon().l(block);
    }

    public void setOnBalloonInitializedListener(@NotNull Function1<? super View, Unit> block) {
        Intrinsics.h(block, "block");
        getBalloon().n(block);
    }

    public void setOnBalloonDismissListener(@NotNull Function0<Unit> block) {
        Intrinsics.h(block, "block");
        getBalloon().m(block);
    }

    public void setOnBalloonOutsideTouchListener(@NotNull Function2<? super View, ? super MotionEvent, Unit> block) {
        Intrinsics.h(block, "block");
        getBalloon().o(block);
    }

    public void setOnBalloonOverlayClickListener(@NotNull Function0<Unit> block) {
        Intrinsics.h(block, "block");
        getBalloon().p(block);
    }

    public void setOnBalloonOverlayTouchListener(@NotNull Function2<? super View, ? super MotionEvent, Boolean> block) {
        Intrinsics.h(block, "block");
        Balloon balloon = getBalloon();
        balloon.getClass();
        balloon.i.setTouchInterceptor(new p(block, 1));
    }
}
