package com.google.android.material.textfield;

import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ EndIconDelegate e;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.d = i;
        this.e = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.d) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.e;
                clearTextEndIconDelegate.s(clearTextEndIconDelegate.t());
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.e;
                dropdownMenuEndIconDelegate.l = z;
                dropdownMenuEndIconDelegate.p();
                if (!z) {
                    dropdownMenuEndIconDelegate.s(false);
                    dropdownMenuEndIconDelegate.m = false;
                    break;
                }
                break;
        }
    }
}
