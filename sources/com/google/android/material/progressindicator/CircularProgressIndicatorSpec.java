package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.woolworths.R;

/* loaded from: classes6.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int h;
    public int i;
    public int j;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) throws Resources.NotFoundException {
        super(context, attributeSet, i, 2132084101);
        int i2 = CircularProgressIndicator.p;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        ThemeEnforcement.a(context, attributeSet, i, 2132084101);
        int[] iArr = com.google.android.material.R.styleable.l;
        ThemeEnforcement.b(context, attributeSet, iArr, i, 2132084101, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 2132084101);
        this.h = Math.max(MaterialResources.c(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), this.f14618a * 2);
        this.i = MaterialResources.c(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        this.j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
