package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence P;
    public final String Q;
    public final Drawable R;
    public final String S;
    public final String T;
    public final int U;

    public interface TargetFragment {
        Preference C(String str);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.P = string;
        if (string == null) {
            this.P = this.j;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.Q = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.R = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.S = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.T = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.U = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.preference.PreferenceManager$OnDisplayPreferenceDialogListener, java.lang.Object] */
    @Override // androidx.preference.Preference
    public void r() {
        ?? r0 = this.e.i;
        if (r0 != 0) {
            r0.O0(this);
        }
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
