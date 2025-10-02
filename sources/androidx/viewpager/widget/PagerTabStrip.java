package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public final Rect A;
    public int B;
    public boolean C;
    public boolean D;
    public final int E;
    public boolean F;
    public float G;
    public float H;
    public final int I;
    public int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final Paint z;

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(boolean z, float f, int i) {
        int height = getHeight();
        TextView textView = this.f;
        int left = textView.getLeft();
        int i2 = this.y;
        int right = textView.getRight() + i2;
        int i3 = height - this.u;
        Rect rect = this.A;
        rect.set(left - i2, i3, right, height);
        super.c(z, f, i);
        this.B = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i2, i3, textView.getRight() + i2, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.C;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.x);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f;
        int left = textView.getLeft();
        int i = this.y;
        int i2 = left - i;
        int right = textView.getRight() + i;
        int i3 = height - this.u;
        int i4 = (this.B << 24) | (this.t & 16777215);
        Paint paint = this.z;
        paint.setColor(i4);
        float f = height;
        canvas.drawRect(i2, i3, right, f, paint);
        if (this.C) {
            paint.setColor((this.t & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.E, getWidth() - getPaddingRight(), f, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction();
        if (action != 0 && this.F) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.G = x;
            this.H = y;
            this.F = false;
            return true;
        }
        if (action == 1) {
            int left = this.f.getLeft();
            int i = this.y;
            if (x < left - i) {
                ViewPager viewPager = this.d;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x > r5.getRight() + i) {
                ViewPager viewPager2 = this.d;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x - this.G);
            float f = this.I;
            if (fAbs > f || Math.abs(y - this.H) > f) {
                this.F = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (this.D) {
            return;
        }
        this.C = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.D) {
            return;
        }
        this.C = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.D) {
            return;
        }
        this.C = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.C = z;
        this.D = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.v;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@ColorInt int i) {
        this.t = i;
        this.z.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i) {
        setTabIndicatorColor(getContext().getColor(i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.w;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.z = paint;
        this.A = new Rect();
        this.B = 255;
        this.C = false;
        this.D = false;
        int i = this.q;
        this.t = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.u = (int) ((3.0f * f) + 0.5f);
        this.v = (int) ((6.0f * f) + 0.5f);
        this.w = (int) (64.0f * f);
        this.y = (int) ((16.0f * f) + 0.5f);
        this.E = (int) ((1.0f * f) + 0.5f);
        this.x = (int) ((f * 32.0f) + 0.5f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.e.setFocusable(true);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    PagerTabStrip.this.d.setCurrentItem(r2.getCurrentItem() - 1);
                } finally {
                    Callback.h();
                }
            }
        });
        this.g.setFocusable(true);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    ViewPager viewPager = PagerTabStrip.this.d;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                } finally {
                    Callback.h();
                }
            }
        });
        if (getBackground() == null) {
            this.C = true;
        }
    }
}
