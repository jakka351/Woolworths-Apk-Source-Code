package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
final class CalendarItemStyle {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f14562a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final ShapeAppearanceModel f;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        Preconditions.d(rect.left);
        Preconditions.d(rect.top);
        Preconditions.d(rect.right);
        Preconditions.d(rect.bottom);
        this.f14562a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = shapeAppearanceModel;
    }

    public static CalendarItemStyle a(int i, Context context) throws Resources.NotFoundException {
        Preconditions.a("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.D);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, shapeAppearanceModelA, rect);
    }

    public final void b(TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = this.f;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.m(this.c);
        materialShapeDrawable.t(this.e);
        materialShapeDrawable.s(this.d);
        ColorStateList colorStateList = this.b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f14562a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        textView.setBackground(insetDrawable);
    }
}
