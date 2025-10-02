package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;

    public /* synthetic */ hf(View view, boolean z, boolean z2, Function0 function0, int i) {
        this.d = i;
        this.e = view;
        this.f = z;
        this.g = z2;
        this.h = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Ld.c(this.e, this.f, this.g, this.h);
                break;
            default:
                Ld.b(this.e, this.f, this.g, this.h);
                break;
        }
    }
}
