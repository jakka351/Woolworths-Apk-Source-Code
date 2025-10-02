package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.core.view.d;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes6.dex */
public interface DateSelector<S> extends Parcelable {
    static void b2(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                for (EditText editText : editTextArr) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                ViewUtils.g(view, false);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new d(3, editText2), 100L);
    }

    int C(Context context);

    String P1(Context context);

    ArrayList R1();

    Object T0();

    void V0(long j);

    boolean r0();

    View u2(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener);

    String y1(Context context);

    ArrayList z0();
}
