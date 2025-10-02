package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final Listener U;
    public final String V;
    public final String W;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreferenceCompat switchPreferenceCompat = SwitchPreferenceCompat.this;
            switchPreferenceCompat.getClass();
            switchPreferenceCompat.C(z);
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.U = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.n, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.Q = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.P) {
            m();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.R = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.P) {
            m();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.V = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        m();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.W = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        m();
        this.T = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.V);
            switchCompat.setTextOff(this.W);
            switchCompat.setOnCheckedChangeListener(this.U);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) throws Resources.NotFoundException {
        super.q(preferenceViewHolder);
        E(preferenceViewHolder.c(com.woolworths.R.id.switchWidget));
        D(preferenceViewHolder.c(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void x(View view) throws Resources.NotFoundException {
        super.x(view);
        if (((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(com.woolworths.R.id.switchWidget));
            D(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(@NonNull Context context) {
        this(context, null);
    }
}
