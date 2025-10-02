package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final HashSet l = new HashSet();
    public boolean m;
    public CharSequence[] n;
    public CharSequence[] o;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void R1(boolean z) {
        if (z && this.m) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) I1();
            multiSelectListPreference.getClass();
            multiSelectListPreference.C(this.l);
        }
        this.m = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void b2(AlertDialog.Builder builder) {
        int length = this.o.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.l.contains(this.o[i].toString());
        }
        builder.setMultiChoiceItems(this.n, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                HashSet hashSet = multiSelectListPreferenceDialogFragmentCompat.l;
                if (z) {
                    multiSelectListPreferenceDialogFragmentCompat.m = hashSet.add(multiSelectListPreferenceDialogFragmentCompat.o[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.m;
                } else {
                    multiSelectListPreferenceDialogFragmentCompat.m = hashSet.remove(multiSelectListPreferenceDialogFragmentCompat.o[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.m;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.l;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.m = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.n = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.o = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) I1();
        CharSequence[] charSequenceArr = multiSelectListPreference.V;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.W;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.X);
        this.m = false;
        this.n = multiSelectListPreference.V;
        this.o = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.l));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.n);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.o);
    }
}
