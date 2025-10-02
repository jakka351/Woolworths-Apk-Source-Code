package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ EndIconDelegate e;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i) {
        this.d = i;
        this.e = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.e;
                Callback.g(view);
                try {
                    EditText editText = clearTextEndIconDelegate.i;
                    if (editText != null) {
                        Editable text = editText.getText();
                        if (text != null) {
                            text.clear();
                        }
                        clearTextEndIconDelegate.p();
                    }
                    return;
                } finally {
                }
            case 1:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.e;
                Callback.g(view);
                try {
                    dropdownMenuEndIconDelegate.t();
                    return;
                } finally {
                }
            default:
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = (PasswordToggleEndIconDelegate) this.e;
                Callback.g(view);
                try {
                    EditText editText2 = passwordToggleEndIconDelegate.f;
                    if (editText2 != null) {
                        int selectionEnd = editText2.getSelectionEnd();
                        EditText editText3 = passwordToggleEndIconDelegate.f;
                        if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                            passwordToggleEndIconDelegate.f.setTransformationMethod(null);
                        } else {
                            passwordToggleEndIconDelegate.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        }
                        if (selectionEnd >= 0) {
                            passwordToggleEndIconDelegate.f.setSelection(selectionEnd);
                        }
                        passwordToggleEndIconDelegate.p();
                    }
                    return;
                } finally {
                }
        }
    }
}
