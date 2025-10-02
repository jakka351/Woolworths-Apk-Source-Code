package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.woolworths.R;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    public static final String[] i = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] j = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    public static final String[] k = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView d;
    public final TimeModel e;
    public float f;
    public float g;
    public boolean h = false;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.d = timePickerView;
        this.e = timeModel;
        if (timeModel.f == 0) {
            timePickerView.h.setVisibility(0);
        }
        timePickerView.f.m.add(this);
        timePickerView.k = this;
        timePickerView.j = this;
        timePickerView.f.u = this;
        for (int i2 = 0; i2 < 12; i2++) {
            Resources resources = this.d.getResources();
            String[] strArr = i;
            strArr[i2] = TimeModel.a(resources, strArr[i2], "%d");
        }
        for (int i3 = 0; i3 < 12; i3++) {
            Resources resources2 = this.d.getResources();
            String[] strArr2 = k;
            strArr2[i3] = TimeModel.a(resources2, strArr2[i3], "%02d");
        }
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        this.d.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void b() {
        this.d.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void c(float f, boolean z) {
        if (this.h) {
            return;
        }
        TimeModel timeModel = this.e;
        int i2 = timeModel.g;
        int i3 = timeModel.h;
        int iRound = Math.round(f);
        int i4 = timeModel.i;
        TimePickerView timePickerView = this.d;
        if (i4 == 12) {
            timeModel.h = ((iRound + 3) / 6) % 60;
            this.f = (float) Math.floor(r8 * 6);
        } else {
            int i5 = (iRound + 15) / 30;
            if (timeModel.f == 1) {
                i5 %= 12;
                if (timePickerView.g.g.x == 2) {
                    i5 += 12;
                }
            }
            timeModel.c(i5);
            this.g = (timeModel.b() * 30) % 360;
        }
        if (z) {
            return;
        }
        e();
        if (timeModel.h == i3 && timeModel.g == i2) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    public final void d(int i2, boolean z) {
        boolean z2 = i2 == 12;
        TimePickerView timePickerView = this.d;
        ClockHandView clockHandView = timePickerView.f;
        Chip chip = timePickerView.e;
        Chip chip2 = timePickerView.d;
        ClockFaceView clockFaceView = timePickerView.g;
        clockHandView.g = z2;
        TimeModel timeModel = this.e;
        timeModel.i = i2;
        int i3 = timeModel.f;
        clockFaceView.f(z2 ? R.string.material_minute_suffix : i3 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, z2 ? k : i3 == 1 ? j : i);
        int i4 = (timeModel.i == 10 && i3 == 1 && timeModel.g >= 12) ? 2 : 1;
        ClockHandView clockHandView2 = clockFaceView.g;
        clockHandView2.x = i4;
        clockHandView2.invalidate();
        timePickerView.f.c(z2 ? this.f : this.g, z);
        boolean z3 = i2 == 12;
        chip2.setChecked(z3);
        int i5 = z3 ? 2 : 0;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        chip2.setAccessibilityLiveRegion(i5);
        boolean z4 = i2 == 10;
        chip.setChecked(z4);
        chip.setAccessibilityLiveRegion(z4 ? 2 : 0);
        ViewCompat.A(chip, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                Resources resources = view.getResources();
                TimeModel timeModel2 = TimePickerClockPresenter.this.e;
                accessibilityNodeInfoCompat.p(resources.getString(timeModel2.f == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
            }
        });
        ViewCompat.A(chip2, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.p(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.e.h)));
            }
        });
    }

    public final void e() {
        TimeModel timeModel = this.e;
        int i2 = timeModel.j;
        int iB = timeModel.b();
        int i3 = timeModel.h;
        TimePickerView timePickerView = this.d;
        Chip chip = timePickerView.e;
        Chip chip2 = timePickerView.d;
        timePickerView.h.b(i2 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i3));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iB));
        if (!TextUtils.equals(chip2.getText(), str)) {
            chip2.setText(str);
        }
        if (TextUtils.equals(chip.getText(), str2)) {
            return;
        }
        chip.setText(str2);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        TimeModel timeModel = this.e;
        this.g = (timeModel.b() * 30) % 360;
        this.f = timeModel.h * 6;
        d(timeModel.i, false);
        e();
    }
}
