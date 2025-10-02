package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

@Deprecated
/* loaded from: classes2.dex */
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    public final HashSet l = new HashSet();
    public boolean m;
    public CharSequence[] n;
    public CharSequence[] o;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (z && this.m) {
            multiSelectListPreference.getClass();
            multiSelectListPreference.C(this.l);
        }
        this.m = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void d(AlertDialog.Builder builder) {
        int length = this.o.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.l.contains(this.o[i].toString());
        }
        builder.setMultiChoiceItems(this.n, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                HashSet hashSet = multiSelectListPreferenceDialogFragment.l;
                if (z) {
                    multiSelectListPreferenceDialogFragment.m = hashSet.add(multiSelectListPreferenceDialogFragment.o[i2].toString()) | multiSelectListPreferenceDialogFragment.m;
                } else {
                    multiSelectListPreferenceDialogFragment.m = hashSet.remove(multiSelectListPreferenceDialogFragment.o[i2].toString()) | multiSelectListPreferenceDialogFragment.m;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.l;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.m = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.n = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.o = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
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

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.l));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.m);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.n);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.o);
    }
}
