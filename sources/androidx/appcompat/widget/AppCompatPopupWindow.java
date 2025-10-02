package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;

/* loaded from: classes2.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, R.styleable.u, i, i2);
        TypedArray typedArray = tintTypedArrayF.b;
        if (typedArray.hasValue(2)) {
            setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(tintTypedArrayF.b(0));
        tintTypedArrayF.g();
    }
}
