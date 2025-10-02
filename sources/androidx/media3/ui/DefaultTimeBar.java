package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultTimeBar extends View implements TimeBar {
    public static final /* synthetic */ int S = 0;
    public final CopyOnWriteArraySet A;
    public final Point B;
    public final float C;
    public int D;
    public long E;
    public int F;
    public Rect G;
    public final ValueAnimator H;
    public float I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public long O;
    public int P;
    public long[] Q;
    public boolean[] R;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final Drawable n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final StringBuilder x;
    public final Formatter y;
    public final a z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static int c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.E;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.M;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.D;
    }

    private String getProgressText() {
        return Util.x(this.x, this.y, this.N);
    }

    private long getScrubberPosition() {
        if (this.e.width() <= 0 || this.M == -9223372036854775807L) {
            return 0L;
        }
        return (this.g.width() * this.M) / r0.width();
    }

    @Override // androidx.media3.ui.TimeBar
    public final void a(long[] jArr, boolean[] zArr, int i) {
        Assertions.b(i == 0 || !(jArr == null || zArr == null));
        this.P = i;
        this.Q = jArr;
        this.R = zArr;
        g();
    }

    @Override // androidx.media3.ui.TimeBar
    public final void b(TimeBar.OnScrubListener onScrubListener) {
        this.A.add(onScrubListener);
    }

    public final boolean d(long j) {
        long j2 = this.M;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.K ? this.L : this.N;
        long j4 = Util.j(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (this.K) {
            h(j4);
        } else {
            e(j4);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.L = j;
        this.K = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).C(j);
        }
    }

    public final void f(boolean z) {
        removeCallbacks(this.z);
        this.K = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).H(this.L, z);
        }
    }

    public final void g() {
        Rect rect = this.f;
        Rect rect2 = this.e;
        rect.set(rect2);
        Rect rect3 = this.g;
        rect3.set(rect2);
        long j = this.K ? this.L : this.N;
        if (this.M > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.O) / this.M)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.M)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.d);
    }

    @Override // androidx.media3.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.e.width() / this.C);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.M;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / iWidth;
    }

    public final void h(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((TimeBar.OnScrubListener) it.next()).F(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.e;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.M;
        Paint paint = this.j;
        Rect rect2 = this.g;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.f;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.i);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.h);
            }
            if (this.P != 0) {
                long[] jArr = this.Q;
                jArr.getClass();
                boolean[] zArr = this.R;
                zArr.getClass();
                int i5 = this.r;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.P) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((rect.width() * Util.j(jArr[i8], 0L, this.M)) / this.M)) - i6)) + rect.left, iCenterY, r3 + i5, i, zArr[i8] ? this.l : this.k);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.M > 0) {
            int i10 = Util.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.n;
            if (drawable == null) {
                canvas2.drawCircle(i10, iCenterY2, (int) ((((this.K || isFocused()) ? this.u : isEnabled() ? this.s : this.t) * this.I) / 2.0f), this.m);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.I)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.I)) / 2;
                drawable.setBounds(i10 - intrinsicWidth, iCenterY2 - intrinsicHeight, i10 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.K || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.M <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.d(r0)
            if (r0 == 0) goto L2e
            androidx.media3.ui.a r5 = r4.z
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.K
            if (r0 == 0) goto L2e
            r5 = 0
            r4.f(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.J ? 0 : this.v;
        int i8 = this.q;
        int i9 = this.o;
        int i10 = this.p;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.d;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.e.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Util.f2928a >= 29 && ((rect = this.G) == null || rect.width() != i5 || this.G.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.G = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.p;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.n;
        if (drawable == null || Util.f2928a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La2
            long r2 = r9.M
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La2
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.B
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.e
            android.graphics.Rect r5 = r9.g
            r6 = 1
            if (r3 == 0) goto L7e
            r7 = 3
            if (r3 == r6) goto L6f
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6f
            goto La2
        L38:
            boolean r10 = r9.K
            if (r10 == 0) goto La2
            int r10 = r9.w
            if (r2 >= r10) goto L53
            int r10 = r9.F
            int r10 = YU.a.D(r0, r10, r7, r10)
            float r10 = (float) r10
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = androidx.media3.common.util.Util.i(r10, r0, r1)
            r5.right = r10
            goto L61
        L53:
            r9.F = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = androidx.media3.common.util.Util.i(r10, r0, r1)
            r5.right = r10
        L61:
            long r0 = r9.getScrubberPosition()
            r9.h(r0)
            r9.g()
            r9.invalidate()
            return r6
        L6f:
            boolean r0 = r9.K
            if (r0 == 0) goto La2
            int r10 = r10.getAction()
            if (r10 != r7) goto L7a
            r1 = r6
        L7a:
            r9.f(r1)
            return r6
        L7e:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.d
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La2
            int r0 = r4.left
            int r1 = r4.right
            int r10 = androidx.media3.common.util.Util.i(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.e(r0)
            r9.g()
            r9.invalidate()
            return r6
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.M <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(@ColorInt int i) {
        this.k.setColor(i);
        invalidate(this.d);
    }

    public void setBufferedColor(@ColorInt int i) {
        this.i.setColor(i);
        invalidate(this.d);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setBufferedPosition(long j) {
        if (this.O == j) {
            return;
        }
        this.O = j;
        g();
    }

    @Override // androidx.media3.ui.TimeBar
    public void setDuration(long j) {
        if (this.M == j) {
            return;
        }
        this.M = j;
        if (this.K && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.K || z) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i) {
        Assertions.b(i > 0);
        this.D = i;
        this.E = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        Assertions.b(j > 0);
        this.D = -1;
        this.E = j;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i) {
        this.l.setColor(i);
        invalidate(this.d);
    }

    public void setPlayedColor(@ColorInt int i) {
        this.h.setColor(i);
        invalidate(this.d);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setPosition(long j) {
        if (this.N == j) {
            return;
        }
        this.N = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(@ColorInt int i) {
        this.m.setColor(i);
        invalidate(this.d);
    }

    public void setUnplayedColor(@ColorInt int i) {
        this.j.setColor(i);
        invalidate(this.d);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.j = paint3;
        Paint paint4 = new Paint();
        this.k = paint4;
        Paint paint5 = new Paint();
        this.l = paint5;
        Paint paint6 = new Paint();
        this.m = paint6;
        paint6.setAntiAlias(true);
        this.A = new CopyOnWriteArraySet();
        this.B = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.C = f;
        this.w = c(f, -50);
        int iC = c(f, 4);
        int iC2 = c(f, 26);
        int iC3 = c(f, 4);
        int iC4 = c(f, 12);
        int iC5 = c(f, 0);
        int iC6 = c(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.b, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.n = drawable;
                if (drawable != null) {
                    int i3 = Util.f2928a;
                    if (i3 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i3 < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iC2 = Math.max(drawable.getMinimumHeight(), iC2);
                }
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iC);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iC2);
                this.q = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iC3);
                this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iC4);
                this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iC5);
                this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iC6);
                int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i7 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i8 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i9 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i5);
                paint2.setColor(i6);
                paint3.setColor(i7);
                paint4.setColor(i8);
                paint5.setColor(i9);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.o = iC;
            this.p = iC2;
            this.q = 0;
            this.r = iC3;
            this.s = iC4;
            this.t = iC5;
            this.u = iC6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.n = null;
        }
        StringBuilder sb = new StringBuilder();
        this.x = sb;
        this.y = new Formatter(sb, Locale.getDefault());
        this.z = new a(0, this);
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            this.v = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.v = (Math.max(this.t, Math.max(this.s, this.u)) + 1) / 2;
        }
        this.I = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.H = valueAnimator;
        valueAnimator.addUpdateListener(new h(this, 4));
        this.M = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.D = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
