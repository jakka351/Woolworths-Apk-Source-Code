package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DrawablePainter extends Painter implements RememberObserver {
    public final Drawable i;
    public final MutableState j;
    public final MutableState k;
    public final Lazy l;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DrawablePainter(Drawable drawable) {
        Intrinsics.h(drawable, "drawable");
        this.i = drawable;
        this.j = SnapshotStateKt.f(0);
        Object obj = DrawablePainterKt.f14360a;
        this.k = SnapshotStateKt.f(new Size((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : SizeKt.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.l = LazyKt.b(new Function0<DrawablePainter$callback$2.AnonymousClass1>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final DrawablePainter drawablePainter = this.h;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void invalidateDrawable(Drawable d) {
                        Intrinsics.h(d, "d");
                        DrawablePainter drawablePainter2 = drawablePainter;
                        MutableState mutableState = drawablePainter2.j;
                        ((SnapshotMutableStateImpl) mutableState).setValue(Integer.valueOf(((Number) ((SnapshotMutableStateImpl) mutableState).getD()).intValue() + 1));
                        Drawable drawable2 = drawablePainter2.i;
                        Object obj2 = DrawablePainterKt.f14360a;
                        ((SnapshotMutableStateImpl) drawablePainter2.k).setValue(new Size((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : SizeKt.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void scheduleDrawable(Drawable d, Runnable what, long j) {
                        Intrinsics.h(d, "d");
                        Intrinsics.h(what, "what");
                        ((Handler) DrawablePainterKt.f14360a.getD()).postAtTime(what, j);
                    }

                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void unscheduleDrawable(Drawable d, Runnable what) {
                        Intrinsics.h(d, "d");
                        Intrinsics.h(what, "what");
                        ((Handler) DrawablePainterKt.f14360a.getD()).removeCallbacks(what);
                    }
                };
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f) {
        this.i.setAlpha(RangesKt.c(MathKt.b(f * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter != null ? colorFilter.f1767a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.l.getD();
        Drawable drawable = this.i;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void d(LayoutDirection layoutDirection) {
        int i;
        Intrinsics.h(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        this.i.setLayoutDirection(i);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getL() {
        return ((Size) ((SnapshotMutableStateImpl) this.k).getD()).f1754a;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        i();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        Intrinsics.h(drawScope, "<this>");
        Canvas canvasA = drawScope.getE().a();
        ((Number) ((SnapshotMutableStateImpl) this.j).getD()).intValue();
        int iB = MathKt.b(Size.d(drawScope.h()));
        int iB2 = MathKt.b(Size.b(drawScope.h()));
        Drawable drawable = this.i;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            canvasA.save();
            drawable.draw(AndroidCanvas_androidKt.a(canvasA));
        } finally {
            canvasA.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        Drawable drawable = this.i;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }
}
