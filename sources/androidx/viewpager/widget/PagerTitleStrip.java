package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class PagerTitleStrip extends ViewGroup {
    public static final int[] r = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] s = {R.attr.textAllCaps};
    public ViewPager d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public int h;
    public float i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public final PageListener n;
    public WeakReference o;
    public int p;
    public int q;

    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public int f3818a;

        public PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void a(int i) {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            Callback.r();
            try {
                if (this.f3818a == 0) {
                    pagerTitleStrip.b(pagerTitleStrip.d.getCurrentItem(), pagerTitleStrip.d.getAdapter());
                    float f = pagerTitleStrip.i;
                    if (f < BitmapDescriptorFactory.HUE_RED) {
                        f = 0.0f;
                    }
                    pagerTitleStrip.c(true, f, pagerTitleStrip.d.getCurrentItem());
                }
                Callback.s();
            } catch (Throwable th) {
                Callback.s();
                throw th;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void b(int i) {
            this.f3818a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void c(float f, int i, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.c(false, f, i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void d(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.a(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.d.getCurrentItem(), pagerTitleStrip.d.getAdapter());
            float f = pagerTitleStrip.i;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            pagerTitleStrip.c(true, f, pagerTitleStrip.d.getCurrentItem());
        }
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        public Locale d;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.d);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        SingleLineAllCapsTransform singleLineAllCapsTransform = new SingleLineAllCapsTransform();
        singleLineAllCapsTransform.d = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(singleLineAllCapsTransform);
    }

    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        PageListener pageListener = this.n;
        if (pagerAdapter != null) {
            pagerAdapter.d.unregisterObserver(pageListener);
            this.o = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.d.registerObserver(pageListener);
            this.o = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            this.h = -1;
            this.i = -1.0f;
            b(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public final void b(int i, PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter.g();
        }
        this.l = true;
        TextView textView = this.e;
        textView.setText((CharSequence) null);
        TextView textView2 = this.f;
        textView2.setText((CharSequence) null);
        int i2 = i + 1;
        TextView textView3 = this.g;
        textView3.setText((CharSequence) null);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.h = i;
        if (!this.m) {
            c(false, this.i, i);
        }
        this.l = false;
    }

    public void c(boolean z, float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.h) {
            b(i, this.d.getAdapter());
        } else if (!z && f == this.i) {
            return;
        }
        this.m = true;
        TextView textView = this.e;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.g;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.k & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                i5 = paddingTop + i13;
                textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
                int iMin = Math.min(paddingLeft, (i9 - this.j) - measuredWidth);
                textView.layout(iMin, i3, iMin + measuredWidth, textView.getMeasuredHeight() + i3);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.j);
                textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.i = f;
                this.m = false;
            }
            i2 = (height - paddingBottom) - iMax2;
        }
        i3 = i11 + i2;
        i4 = i2 + i12;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.j) - measuredWidth);
        textView.layout(iMin2, i3, iMin2 + measuredWidth, textView.getMeasuredHeight() + i3);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.j);
        textView3.layout(iMax32, i5, iMax32 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.i = f;
        this.m = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        PageListener pageListener = this.n;
        viewPager.W = pageListener;
        if (viewPager.a0 == null) {
            viewPager.a0 = new ArrayList();
        }
        viewPager.a0.add(pageListener);
        this.d = viewPager;
        WeakReference weakReference = this.o;
        a(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.d;
            ViewPager.OnPageChangeListener onPageChangeListener = viewPager2.W;
            viewPager2.W = null;
            ArrayList arrayList = viewPager2.a0;
            if (arrayList != null) {
                arrayList.remove(this.n);
            }
            this.d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d != null) {
            float f = this.i;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            c(true, f, this.h);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.e.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.g.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.k = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.p = i;
        int i2 = (i << 24) | (this.q & 16777215);
        this.e.setTextColor(i2);
        this.g.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.q = i;
        this.f.setTextColor(i);
        int i2 = (this.p << 24) | (this.q & 16777215);
        this.e.setTextColor(i2);
        this.g.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.j = i;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.h = -1;
        this.i = -1.0f;
        this.n = new PageListener();
        TextView textView = new TextView(context);
        this.e = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.g = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            textView.setTextSize(0, f);
            textView2.setTextSize(0, f);
            textView3.setTextSize(0, f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.k = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.q = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, s);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.j = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
