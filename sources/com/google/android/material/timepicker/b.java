package com.google.android.material.timepicker;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Object obj = ((MaterialTimePicker) this.e).l;
                if (obj instanceof TimePickerTextInputPresenter) {
                    ((TimePickerTextInputPresenter) obj).d();
                    break;
                }
                break;
            default:
                ((RadialViewGroup) this.e).d();
                break;
        }
    }
}
