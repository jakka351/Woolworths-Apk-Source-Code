package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.d;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int h = 0;
    public final Chip d;
    public final TextInputLayout e;
    public final EditText f;
    public final TextWatcher g;

    public class TextFormatter extends TextWatcherAdapter {
        public TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            Chip chip = chipTextInputComboView.d;
            if (TextUtils.isEmpty(editable)) {
                chip.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            int i = ChipTextInputComboView.h;
            String strA = TimeModel.a(chipTextInputComboView.getResources(), editable, "%02d");
            if (TextUtils.isEmpty(strA)) {
                strA = TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d");
            }
            chip.setText(strA);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.d;
        chip.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.f;
        editText.setVisibility(i);
        chip.setVisibility(z ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new d(4, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.d.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.d.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.d = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.e = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.g = textFormatter;
        editText.addTextChangedListener(textFormatter);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
