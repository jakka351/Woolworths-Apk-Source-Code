package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.ThemeEnforcement;
import com.woolworths.R;

/* loaded from: classes6.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int h;
    public int i;
    public boolean j;
    public int k;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void a() {
        super.a();
        if (this.k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.h == 0) {
            if (this.b > 0 && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, 2132084113);
        int i2 = LinearProgressIndicator.p;
        ThemeEnforcement.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132084113);
        int[] iArr = com.google.android.material.R.styleable.x;
        ThemeEnforcement.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132084113, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132084113);
        this.h = typedArrayObtainStyledAttributes.getInt(0, 1);
        this.i = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), this.f14618a);
        typedArrayObtainStyledAttributes.recycle();
        a();
        this.j = this.i == 1;
    }
}
