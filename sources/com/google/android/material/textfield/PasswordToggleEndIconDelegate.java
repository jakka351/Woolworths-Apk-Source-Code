package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.woolworths.R;

/* loaded from: classes6.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {
    public final int e;
    public EditText f;
    public final a g;

    public PasswordToggleEndIconDelegate(EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.e = R.drawable.design_password_eye;
        this.g = new a(this, 2);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void b() {
        p();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
