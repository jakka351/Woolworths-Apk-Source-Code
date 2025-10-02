package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;

/* loaded from: classes6.dex */
public class TabItem extends View {
    public final CharSequence d;
    public final Drawable e;
    public final int f;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, R.styleable.e0);
        TypedArray typedArray = tintTypedArrayE.b;
        this.d = typedArray.getText(2);
        this.e = tintTypedArrayE.b(0);
        this.f = typedArray.getResourceId(1, 0);
        tintTypedArrayE.g();
    }
}
