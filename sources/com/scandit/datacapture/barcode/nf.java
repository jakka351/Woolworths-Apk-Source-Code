package com.scandit.datacapture.barcode;

import android.view.View;

/* loaded from: classes6.dex */
public final /* synthetic */ class nf implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Z9 e;

    public /* synthetic */ nf(Z9 z9, int i) {
        this.d = i;
        this.e = z9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Z9.m294xe252bbe4(this.e, view);
                break;
            default:
                Z9.m293x949343e3(this.e, view);
                break;
        }
    }
}
