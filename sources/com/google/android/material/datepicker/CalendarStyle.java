package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.woolworths.R;

/* loaded from: classes6.dex */
final class CalendarStyle {

    /* renamed from: a, reason: collision with root package name */
    public final CalendarItemStyle f14563a;
    public final CalendarItemStyle b;
    public final CalendarItemStyle c;
    public final CalendarItemStyle d;
    public final CalendarItemStyle e;
    public final CalendarItemStyle f;
    public final CalendarItemStyle g;
    public final Paint h;

    public CalendarStyle(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, com.google.android.material.R.styleable.C);
        this.f14563a = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(4, 0), context);
        this.g = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
        this.b = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
        this.c = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        this.d = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(9, 0), context);
        this.e = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(8, 0), context);
        this.f = CalendarItemStyle.a(typedArrayObtainStyledAttributes.getResourceId(10, 0), context);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
