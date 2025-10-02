package com.google.android.material.textfield;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((ClearTextEndIconDelegate) this.e).s(true);
                break;
            case 1:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.e;
                boolean zIsPopupShowing = dropdownMenuEndIconDelegate.h.isPopupShowing();
                dropdownMenuEndIconDelegate.s(zIsPopupShowing);
                dropdownMenuEndIconDelegate.m = zIsPopupShowing;
                break;
            default:
                ((TextInputLayout) this.e).g.requestLayout();
                break;
        }
    }
}
