package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingMethods;

@BindingMethods
@InverseBindingMethods
@RestrictTo
/* loaded from: classes2.dex */
public class CompoundButtonBindingAdapter {

    /* renamed from: androidx.databinding.adapters.CompoundButtonBindingAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements CompoundButton.OnCheckedChangeListener {
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Object obj = null;
            obj.getClass();
            throw null;
        }
    }

    public static void a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }
}
