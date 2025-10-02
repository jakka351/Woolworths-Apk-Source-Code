package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes6.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView d;
    public final ChipTextInputComboView e;
    public final TimeModel f;
    public boolean g = false;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.d = chipTextInputComboView;
        this.e = chipTextInputComboView2;
        this.f = timeModel;
    }

    public final void a(int i) {
        this.e.setChecked(i == 12);
        this.d.setChecked(i == 10);
        this.f.i = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.g) {
            return false;
        }
        boolean z = true;
        this.g = true;
        EditText editText = (EditText) view;
        if (this.f.i != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z = false;
            } else if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z = false;
            }
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z = false;
        }
        this.g = false;
        return z;
    }
}
