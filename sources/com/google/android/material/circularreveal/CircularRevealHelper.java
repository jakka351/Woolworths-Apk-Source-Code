package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class CircularRevealHelper {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f14546a;
    public final ViewGroup b;
    public final Paint c;
    public CircularRevealWidget.RevealInfo d;
    public Drawable e;

    public interface Delegate {
        void b(Canvas canvas);

        boolean c();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.f14546a = (ViewGroup) delegate;
        View view = (View) delegate;
        this.b = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.google.android.material.circularreveal.CircularRevealHelper$Delegate] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Canvas r8) {
        /*
            r7 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r7.d
            if (r0 == 0) goto L10
            float r0 = r0.c
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            android.graphics.Paint r6 = r7.c
            android.view.ViewGroup r1 = r7.f14546a
            android.view.ViewGroup r2 = r7.b
            if (r0 != 0) goto L39
            r1.b(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L37
            int r0 = r2.getWidth()
            float r4 = (float) r0
            int r0 = r2.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L56
        L37:
            r1 = r8
            goto L56
        L39:
            r1.b(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L37
            int r0 = r2.getWidth()
            float r4 = (float) r0
            int r0 = r2.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L56:
            android.graphics.drawable.Drawable r8 = r7.e
            if (r8 == 0) goto L87
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r7.d
            if (r0 == 0) goto L87
            android.graphics.Rect r8 = r8.getBounds()
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r7.d
            float r0 = r0.f14550a
            int r2 = r8.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 - r2
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r7.d
            float r2 = r2.b
            int r8 = r8.height()
            float r8 = (float) r8
            float r8 = r8 / r3
            float r2 = r2 - r8
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r8 = r7.e
            r8.draw(r1)
            float r8 = -r0
            float r0 = -r2
            r1.translate(r8, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.CircularRevealHelper.a(android.graphics.Canvas):void");
    }

    public final CircularRevealWidget.RevealInfo b() {
        CircularRevealWidget.RevealInfo revealInfo = this.d;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.c == Float.MAX_VALUE) {
            float f = revealInfo2.f14550a;
            float f2 = revealInfo2.b;
            ViewGroup viewGroup = this.b;
            revealInfo2.c = MathUtils.b(f, f2, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return revealInfo2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.google.android.material.circularreveal.CircularRevealHelper$Delegate] */
    public final boolean c() {
        if (this.f14546a.c()) {
            CircularRevealWidget.RevealInfo revealInfo = this.d;
            if (revealInfo == null || revealInfo.c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final void d(Drawable drawable) {
        this.e = drawable;
        this.b.invalidate();
    }

    public final void e(int i) {
        this.c.setColor(i);
        this.b.invalidate();
    }

    public final void f(CircularRevealWidget.RevealInfo revealInfo) {
        ViewGroup viewGroup = this.b;
        if (revealInfo == null) {
            this.d = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.d;
            if (revealInfo2 == null) {
                this.d = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                float f = revealInfo.f14550a;
                float f2 = revealInfo.b;
                float f3 = revealInfo.c;
                revealInfo2.f14550a = f;
                revealInfo2.b = f2;
                revealInfo2.c = f3;
            }
            if (revealInfo.c + 1.0E-4f >= MathUtils.b(revealInfo.f14550a, revealInfo.b, viewGroup.getWidth(), viewGroup.getHeight())) {
                this.d.c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }
}
