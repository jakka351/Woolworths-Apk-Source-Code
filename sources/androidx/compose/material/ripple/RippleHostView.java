package androidx.compose.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "Companion", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleHostView extends View {
    public static final int[] i = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] j = new int[0];
    public UnprojectedRipple d;
    public Boolean e;
    public Long f;
    public a g;
    public Function0 h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public RippleHostView(@NotNull Context context) {
        super(context);
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? i : j;
            UnprojectedRipple unprojectedRipple = this.d;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            a aVar = new a(this, 0);
            this.g = aVar;
            postDelayed(aVar, 50L);
        }
        this.f = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.d;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(j);
        }
        rippleHostView.g = null;
    }

    public final void b(PressInteraction.Press press, boolean z, long j2, int i2, long j3, float f, Function0 function0) {
        if (this.d == null || !Boolean.valueOf(z).equals(this.e)) {
            UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
            setBackground(unprojectedRipple);
            this.d = unprojectedRipple;
            this.e = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple2 = this.d;
        Intrinsics.e(unprojectedRipple2);
        this.h = function0;
        e(f, i2, j2, j3);
        if (z) {
            unprojectedRipple2.setHotspot(Offset.e(press.f925a), Offset.f(press.f925a));
        } else {
            unprojectedRipple2.setHotspot(unprojectedRipple2.getBounds().centerX(), unprojectedRipple2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.h = null;
        a aVar = this.g;
        if (aVar != null) {
            removeCallbacks(aVar);
            a aVar2 = this.g;
            Intrinsics.e(aVar2);
            aVar2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.d;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(j);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.d;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(float f, int i2, long j2, long j3) {
        UnprojectedRipple unprojectedRipple = this.d;
        if (unprojectedRipple == null) {
            return;
        }
        Integer num = unprojectedRipple.f;
        if (num == null || num.intValue() != i2) {
            unprojectedRipple.f = Integer.valueOf(i2);
            unprojectedRipple.setRadius(i2);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = Color.b(j3, f);
        Color color = unprojectedRipple.e;
        if (!(color == null ? false : Color.c(color.f1766a, jB))) {
            unprojectedRipple.e = new Color(jB);
            unprojectedRipple.setColor(ColorStateList.valueOf(ColorKt.j(jB)));
        }
        Rect rect = new Rect(0, 0, MathKt.b(Size.d(j2)), MathKt.b(Size.b(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.h;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
