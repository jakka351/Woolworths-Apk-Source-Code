package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (MaterialAttributes.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, com.google.android.material.R.styleable.K);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iC = -1;
            for (int i2 = 0; i2 < 2 && iC < 0; i2++) {
                iC = MaterialResources.c(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC >= 0) {
                setLineHeight(iC);
            }
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (MaterialAttributes.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = com.google.android.material.R.styleable.L;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int[] iArr2 = {1, 2};
            int iC = -1;
            for (int i2 = 0; i2 < 2 && iC < 0; i2++) {
                iC = MaterialResources.c(context2, typedArrayObtainStyledAttributes, iArr2[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iC != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, com.google.android.material.R.styleable.K);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iC2 = -1;
                for (int i3 = 0; i3 < 2 && iC2 < 0; i3++) {
                    iC2 = MaterialResources.c(context3, typedArrayObtainStyledAttributes3, iArr3[i3], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iC2 >= 0) {
                    setLineHeight(iC2);
                }
            }
        }
    }
}
