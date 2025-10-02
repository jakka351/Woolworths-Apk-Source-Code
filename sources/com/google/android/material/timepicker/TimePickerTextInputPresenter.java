package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.TimePickerView;
import com.woolworths.R;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    public final LinearLayout d;
    public final TimeModel e;
    public final TextWatcher f;
    public final TextWatcher g;
    public final ChipTextInputComboView h;
    public final ChipTextInputComboView i;
    public final EditText j;
    public final EditText k;
    public final MaterialButtonToggleGroup l;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        TextWatcherAdapter textWatcherAdapter = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TimeModel timeModel2 = TimePickerTextInputPresenter.this.e;
                try {
                    if (TextUtils.isEmpty(editable)) {
                        timeModel2.h = 0;
                    } else {
                        timeModel2.h = Integer.parseInt(editable.toString()) % 60;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.f = textWatcherAdapter;
        TextWatcherAdapter textWatcherAdapter2 = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws NumberFormatException {
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    if (zIsEmpty) {
                        timePickerTextInputPresenter.e.c(0);
                    } else {
                        timePickerTextInputPresenter.e.c(Integer.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.g = textWatcherAdapter2;
        this.d = linearLayout;
        this.e = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.h = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.i = chipTextInputComboView2;
        View viewFindViewById = chipTextInputComboView.findViewById(R.id.material_label);
        TextInputLayout textInputLayout = chipTextInputComboView.e;
        View viewFindViewById2 = chipTextInputComboView2.findViewById(R.id.material_label);
        TextInputLayout textInputLayout2 = chipTextInputComboView2.e;
        ((TextView) viewFindViewById).setText(resources.getString(R.string.material_timepicker_minute));
        ((TextView) viewFindViewById2).setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.f == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.l = materialButtonToggleGroup;
            materialButtonToggleGroup.f.add(new c(this, 0));
            this.l.setVisibility(0);
            f();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    TimePickerTextInputPresenter.this.c(((Integer) view.getTag(R.id.selection_type)).intValue());
                } finally {
                    Callback.h();
                }
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        MaxInputValidator maxInputValidator = timeModel.e;
        EditText editText = chipTextInputComboView2.f;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = maxInputValidator;
        editText.setFilters(inputFilterArr);
        MaxInputValidator maxInputValidator2 = timeModel.d;
        EditText editText2 = chipTextInputComboView.f;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = maxInputValidator2;
        editText2.setFilters(inputFilterArr2);
        EditText editText3 = textInputLayout2.getEditText();
        this.j = editText3;
        EditText editText4 = textInputLayout.getEditText();
        this.k = editText4;
        TimePickerTextInputKeyController timePickerTextInputKeyController = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        ViewCompat.A(chipTextInputComboView2.d, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                Resources resources2 = view.getResources();
                TimeModel timeModel2 = timeModel;
                accessibilityNodeInfoCompat.p(resources2.getString(timeModel2.f == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
            }
        });
        ViewCompat.A(chipTextInputComboView.d, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.p(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(timeModel.h)));
            }
        });
        editText3.addTextChangedListener(textWatcherAdapter2);
        editText4.addTextChangedListener(textWatcherAdapter);
        e(timeModel);
        EditText editText5 = textInputLayout2.getEditText();
        EditText editText6 = textInputLayout.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(timePickerTextInputKeyController);
        editText5.setOnKeyListener(timePickerTextInputKeyController);
        editText6.setOnKeyListener(timePickerTextInputKeyController);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        this.d.setVisibility(0);
        c(this.e.i);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void b() {
        LinearLayout linearLayout = this.d;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.g(focusedChild, false);
        }
        linearLayout.setVisibility(8);
    }

    public final void c(int i) {
        this.e.i = i;
        this.h.setChecked(i == 12);
        this.i.setChecked(i == 10);
        f();
    }

    public final void d() {
        TimeModel timeModel = this.e;
        this.h.setChecked(timeModel.i == 12);
        this.i.setChecked(timeModel.i == 10);
    }

    public final void e(TimeModel timeModel) {
        EditText editText = this.j;
        TextWatcher textWatcher = this.g;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.k;
        TextWatcher textWatcher2 = this.f;
        editText2.removeTextChangedListener(textWatcher2);
        Locale locale = this.d.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.h));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        ChipTextInputComboView chipTextInputComboView = this.h;
        TextWatcher textWatcher3 = chipTextInputComboView.g;
        EditText editText3 = chipTextInputComboView.f;
        String strA = TimeModel.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.d.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            editText3.removeTextChangedListener(textWatcher3);
            editText3.setText(strA);
            editText3.addTextChangedListener(textWatcher3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.i;
        TextWatcher textWatcher4 = chipTextInputComboView2.g;
        EditText editText4 = chipTextInputComboView2.f;
        String strA2 = TimeModel.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.d.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            editText4.removeTextChangedListener(textWatcher4);
            editText4.setText(strA2);
            editText4.addTextChangedListener(textWatcher4);
        }
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher2);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.l;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.e.j == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        e(this.e);
    }
}
