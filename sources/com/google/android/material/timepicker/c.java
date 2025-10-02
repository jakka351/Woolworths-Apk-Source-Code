package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.woolworths.R;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14674a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.f14674a = i;
        this.b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void a(int i, boolean z) {
        int i2 = this.f14674a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                TimePickerTextInputPresenter timePickerTextInputPresenter = (TimePickerTextInputPresenter) obj;
                if (z) {
                    timePickerTextInputPresenter.e.d(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z) {
                    int i3 = TimePickerView.m;
                    break;
                } else {
                    TimePickerClockPresenter timePickerClockPresenter = timePickerView.j;
                    if (timePickerClockPresenter != null) {
                        timePickerClockPresenter.e.d(i == R.id.material_clock_period_pm_button ? 1 : 0);
                        break;
                    }
                }
                break;
        }
    }
}
