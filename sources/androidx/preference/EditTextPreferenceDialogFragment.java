package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

@Deprecated
/* loaded from: classes2.dex */
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {
    public EditText l;
    public CharSequence m;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void b(View view) {
        super.b(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.l = editText;
        editText.requestFocus();
        EditText editText2 = this.l;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.m);
        EditText editText3 = this.l;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z) {
        if (z) {
            String string = this.l.getText().toString();
            ((EditTextPreference) a()).getClass();
            ((EditTextPreference) a()).C(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.m = ((EditTextPreference) a()).V;
        } else {
            this.m = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.m);
    }
}
