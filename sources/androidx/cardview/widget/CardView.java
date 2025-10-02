package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class CardView extends FrameLayout {
    public static final int[] i = {R.attr.colorBackground};
    public static final CardViewApi21Impl j = new CardViewApi21Impl();
    public boolean d;
    public boolean e;
    public final Rect f;
    public final Rect g;
    public final AnonymousClass1 h;

    /* renamed from: androidx.cardview.widget.CardView$1, reason: invalid class name */
    public class AnonymousClass1 implements CardViewDelegate {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f666a;

        public AnonymousClass1() {
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final boolean a() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final void b(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.g.set(i, i2, i3, i4);
            Rect rect = cardView.f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final Drawable c() {
            return this.f666a;
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        public final boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    public final void f(int i2, int i3, int i4, int i5) {
        this.f.set(i2, i3, i4, i5);
        j.b(this.h);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((RoundRectDrawable) this.h.f666a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f.top;
    }

    public float getMaxCardElevation() {
        return ((RoundRectDrawable) this.h.f666a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.e;
    }

    public float getRadius() {
        return ((RoundRectDrawable) this.h.f666a).f667a;
    }

    public boolean getUseCompatPadding() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(@ColorInt int i2) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.h.f666a;
        if (colorStateListValueOf == null) {
            roundRectDrawable.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        roundRectDrawable.h = colorStateListValueOf;
        roundRectDrawable.b.setColor(colorStateListValueOf.getColorForState(roundRectDrawable.getState(), roundRectDrawable.h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        j.a(this.h, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.e) {
            this.e = z;
            AnonymousClass1 anonymousClass1 = this.h;
            j.a(anonymousClass1, ((RoundRectDrawable) anonymousClass1.f666a).e);
        }
    }

    public void setRadius(float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.h.f666a;
        if (f == roundRectDrawable.f667a) {
            return;
        }
        roundRectDrawable.f667a = f;
        roundRectDrawable.b(null);
        roundRectDrawable.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.d != z) {
            this.d = z;
            AnonymousClass1 anonymousClass1 = this.h;
            j.a(anonymousClass1, ((RoundRectDrawable) anonymousClass1.f666a).e);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.cardViewStyle);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f = rect;
        this.g = new Rect();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.h = anonymousClass1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.f665a, i2, com.woolworths.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(i);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.woolworths.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.woolworths.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED);
        this.d = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        RoundRectDrawable roundRectDrawable = new RoundRectDrawable(colorStateListValueOf, dimension);
        anonymousClass1.f666a = roundRectDrawable;
        setBackgroundDrawable(roundRectDrawable);
        setClipToOutline(true);
        setElevation(dimension2);
        j.a(anonymousClass1, dimension3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) this.h.f666a;
        if (colorStateList == null) {
            roundRectDrawable.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        roundRectDrawable.h = colorStateList;
        roundRectDrawable.b.setColor(colorStateList.getColorForState(roundRectDrawable.getState(), roundRectDrawable.h.getDefaultColor()));
        roundRectDrawable.invalidateSelf();
    }
}
