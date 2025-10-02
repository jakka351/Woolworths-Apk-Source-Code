package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.woolworths.R;

/* loaded from: classes6.dex */
public abstract class BaseProgressIndicatorSpec {

    /* renamed from: a, reason: collision with root package name */
    public int f14618a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        ThemeEnforcement.a(context, attributeSet, i, i2);
        int[] iArr = com.google.android.material.R.styleable.d;
        ThemeEnforcement.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f14618a = MaterialResources.c(context, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        this.b = Math.min(MaterialResources.c(context, typedArrayObtainStyledAttributes, 8, 0), this.f14618a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c = new int[]{MaterialColors.c(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = MaterialColors.a(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
