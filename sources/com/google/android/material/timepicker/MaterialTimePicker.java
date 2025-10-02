package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import com.woolworths.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    public TimePickerView h;
    public ViewStub i;
    public TimePickerClockPresenter j;
    public TimePickerTextInputPresenter k;
    public Object l;
    public int m;
    public int n;
    public CharSequence p;
    public CharSequence r;
    public CharSequence t;
    public MaterialButton u;
    public Button v;
    public TimeModel x;
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public int o = 0;
    public int q = 0;
    public int s = 0;
    public int w = 0;
    public int y = 0;

    public static final class Builder {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    public final void I1(MaterialButton materialButton) {
        TimePickerTextInputPresenter timePickerTextInputPresenter;
        Pair pair;
        if (materialButton == null || this.h == null || this.i == null) {
            return;
        }
        ?? r0 = this.l;
        if (r0 != 0) {
            r0.b();
        }
        int i = this.w;
        TimePickerView timePickerView = this.h;
        ViewStub viewStub = this.i;
        if (i == 0) {
            TimePickerClockPresenter timePickerClockPresenter = this.j;
            TimePickerClockPresenter timePickerClockPresenter2 = timePickerClockPresenter;
            if (timePickerClockPresenter == null) {
                timePickerClockPresenter2 = new TimePickerClockPresenter(timePickerView, this.x);
            }
            this.j = timePickerClockPresenter2;
            timePickerTextInputPresenter = timePickerClockPresenter2;
        } else {
            if (this.k == null) {
                this.k = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.x);
            }
            TimePickerTextInputPresenter timePickerTextInputPresenter2 = this.k;
            timePickerTextInputPresenter2.h.setChecked(false);
            timePickerTextInputPresenter2.i.setChecked(false);
            timePickerTextInputPresenter = this.k;
        }
        this.l = timePickerTextInputPresenter;
        timePickerTextInputPresenter.a();
        this.l.invalidate();
        int i2 = this.w;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.m), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(YU.a.d(i2, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.n), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.x = timeModel;
        if (timeModel == null) {
            this.x = new TimeModel(0, 0, 10, 0);
        }
        this.w = bundle.getInt("TIME_PICKER_INPUT_MODE", this.x.f != 1 ? 0 : 1);
        this.o = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.p = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.q = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.r = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.s = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.t = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.y = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i = this.y;
        if (i == 0) {
            TypedValue typedValueA = MaterialAttributes.a(R.attr.materialTimePickerTheme, requireContext());
            i = typedValueA == null ? 0 : typedValueA.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i);
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, 2132084172);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.M, R.attr.materialTimePickerStyle, 2132084172);
        this.n = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.m = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.k(context);
        materialShapeDrawable.m(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.l(ViewCompat.k(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.h = timePickerView;
        timePickerView.l = this;
        this.i = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.u = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.o;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.p)) {
            textView.setText(this.p);
        }
        I1(this.u);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Callback.g(view);
                try {
                    Iterator it = materialTimePicker.d.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    materialTimePicker.dismiss();
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
        int i2 = this.q;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.r)) {
            button.setText(this.r);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.v = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Callback.g(view);
                try {
                    Iterator it = materialTimePicker.e.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    materialTimePicker.dismiss();
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
        int i3 = this.s;
        if (i3 != 0) {
            this.v.setText(i3);
        } else if (!TextUtils.isEmpty(this.t)) {
            this.v.setText(this.t);
        }
        Button button3 = this.v;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.u.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                    materialTimePicker.w = materialTimePicker.w == 0 ? 1 : 0;
                    materialTimePicker.I1(materialTimePicker.u);
                } finally {
                    Callback.h();
                }
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.l = null;
        this.j = null;
        this.k = null;
        TimePickerView timePickerView = this.h;
        if (timePickerView != null) {
            timePickerView.l = null;
            this.h = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.x);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.w);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.o);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.p);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.q);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.r);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.s);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.t);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.y);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.l instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new b(this, 0), 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        Button button = this.v;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
