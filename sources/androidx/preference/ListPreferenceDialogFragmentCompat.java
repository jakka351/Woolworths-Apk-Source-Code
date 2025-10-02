package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

/* loaded from: classes2.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int l;
    public CharSequence[] m;
    public CharSequence[] n;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void R1(boolean z) {
        int i;
        if (!z || (i = this.l) < 0) {
            return;
        }
        String string = this.n[i].toString();
        ListPreference listPreference = (ListPreference) I1();
        listPreference.getClass();
        listPreference.D(string);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void b2(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.m, this.l, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.l = i;
                listPreferenceDialogFragmentCompat.k = -1;
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.l = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.m = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.n = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) I1();
        CharSequence[] charSequenceArr = listPreference.V;
        CharSequence[] charSequenceArr2 = listPreference.W;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.l = listPreference.C(listPreference.X);
        this.m = listPreference.V;
        this.n = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.l);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.m);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.n);
    }
}
