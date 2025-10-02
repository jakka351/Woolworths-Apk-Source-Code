package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int e;
    public DateSelector f;
    public CalendarConstraints g;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("THEME_RES_ID_KEY");
        this.f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f.u2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.e)), viewGroup, this.g, new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                Iterator it = MaterialTextInputPicker.this.d.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).a();
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                Iterator it = MaterialTextInputPicker.this.d.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).b(obj);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g);
    }
}
