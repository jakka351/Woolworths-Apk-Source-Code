package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes2.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter a0;
    public Spinner b0;
    public final AdapterView.OnItemSelectedListener c0;

    public DropDownPreference(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        ArrayAdapter arrayAdapter = this.a0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void q(PreferenceViewHolder preferenceViewHolder) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(com.woolworths.R.id.spinner);
        this.b0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.a0);
        this.b0.setOnItemSelectedListener(this.c0);
        Spinner spinner2 = this.b0;
        String str = this.X;
        if (str == null || (charSequenceArr = this.W) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.q(preferenceViewHolder);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void r() {
        this.b0.performClick();
    }

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.dropdownPreferenceStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.c0 = new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                Callback.l(view);
                if (i2 >= 0) {
                    try {
                        String string = dropDownPreference.W[i2].toString();
                        if (!string.equals(dropDownPreference.X)) {
                            dropDownPreference.D(string);
                        }
                    } catch (Throwable th) {
                        Callback.m();
                        throw th;
                    }
                }
                Callback.m();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView adapterView) {
            }
        };
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.a0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.V;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
