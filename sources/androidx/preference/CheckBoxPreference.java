package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final Listener U;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckBoxPreference checkBoxPreference = CheckBoxPreference.this;
            checkBoxPreference.getClass();
            checkBoxPreference.C(z);
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.U = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.b, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.Q = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.P) {
            m();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.R = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.P) {
            m();
        }
        this.T = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.P);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.U);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) {
        super.q(preferenceViewHolder);
        E(preferenceViewHolder.c(android.R.id.checkbox));
        D(preferenceViewHolder.c(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(android.R.id.checkbox));
            D(view.findViewById(android.R.id.summary));
        }
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.a(context, com.woolworths.R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }
}
