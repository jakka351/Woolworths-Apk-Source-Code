package com.scandit.datacapture.barcode;

import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class lf implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ X6 e;

    public /* synthetic */ lf(X6 x6, int i) {
        this.d = i;
        this.e = x6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                W6.m290x8a0d6ca1(this.e, view);
                break;
            default:
                X6.m291x4de12e11(this.e, view);
                break;
        }
    }
}
