package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.woolworths.R;

/* loaded from: classes6.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {
    public static final /* synthetic */ int m = 0;
    public final Chip d;
    public final Chip e;
    public final ClockHandView f;
    public final ClockFaceView g;
    public final MaterialButtonToggleGroup h;
    public final View.OnClickListener i;
    public TimePickerClockPresenter j;
    public TimePickerClockPresenter k;
    public MaterialTimePicker l;

    public interface OnDoubleTapListener {
    }

    public interface OnPeriodChangeListener {
    }

    public interface OnSelectionChange {
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.e.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    TimePickerClockPresenter timePickerClockPresenter = TimePickerView.this.k;
                    if (timePickerClockPresenter != null) {
                        timePickerClockPresenter.d(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        };
        this.i = onClickListener;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.g = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.h = materialButtonToggleGroup;
        materialButtonToggleGroup.f.add(new c(this, 1));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.d = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.e = chip2;
        this.f = (ClockHandView) findViewById(R.id.material_clock_hand);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                MaterialTimePicker materialTimePicker = TimePickerView.this.l;
                if (materialTimePicker == null) {
                    return false;
                }
                materialTimePicker.w = 1;
                materialTimePicker.I1(materialTimePicker.u);
                materialTimePicker.k.d();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        chip.setOnTouchListener(onTouchListener);
        chip2.setOnTouchListener(onTouchListener);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
