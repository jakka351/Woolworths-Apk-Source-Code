package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet d = new LinkedHashSet();

    public void E1(OnSelectionChangedListener onSelectionChangedListener) {
        this.d.add(onSelectionChangedListener);
    }
}
