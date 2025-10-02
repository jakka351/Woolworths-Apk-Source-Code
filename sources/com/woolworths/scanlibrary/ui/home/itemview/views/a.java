package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Ref.BooleanRef e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ a(Ref.BooleanRef booleanRef, Function0 function0, int i) {
        this.d = i;
        this.e = booleanRef;
        this.f = function0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.d) {
            case 0:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
            case 1:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
            case 2:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
            case 3:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
            case 4:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
            default:
                this.e.d = true;
                dialogInterface.dismiss();
                this.f.invoke();
                break;
        }
    }
}
