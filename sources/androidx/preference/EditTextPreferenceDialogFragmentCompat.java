package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText l;
    public CharSequence m;
    public final Runnable n = new Runnable() { // from class: androidx.preference.EditTextPreferenceDialogFragmentCompat.1
        @Override // java.lang.Runnable
        public final void run() {
            EditTextPreferenceDialogFragmentCompat.this.h2();
        }
    };
    public long o = -1;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void Q1(View view) {
        super.Q1(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.l = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.l.setText(this.m);
        EditText editText2 = this.l;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) I1()).getClass();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void R1(boolean z) {
        if (z) {
            String string = this.l.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) I1();
            editTextPreference.getClass();
            editTextPreference.C(string);
        }
    }

    public final void h2() {
        long j = this.o;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.l;
        if (editText == null || !editText.isFocused()) {
            this.o = -1L;
            return;
        }
        if (((InputMethodManager) this.l.getContext().getSystemService("input_method")).showSoftInput(this.l, 0)) {
            this.o = -1L;
            return;
        }
        EditText editText2 = this.l;
        Runnable runnable = this.n;
        editText2.removeCallbacks(runnable);
        this.l.postDelayed(runnable, 50L);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.m = ((EditTextPreference) I1()).V;
        } else {
            this.m = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.m);
    }
}
