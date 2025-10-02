package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.content.DialogInterface;
import com.woolworths.scanlibrary.util.widget.MoreDetailAlertDialogHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ b(Object obj, Function0 function0, int i) {
        this.d = i;
        this.e = obj;
        this.f = function0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.d) {
            case 0:
                if (!((Ref.BooleanRef) this.e).d) {
                    this.f.invoke();
                    break;
                }
                break;
            case 1:
                if (!((Ref.BooleanRef) this.e).d) {
                    this.f.invoke();
                    break;
                }
                break;
            default:
                if (!((MoreDetailAlertDialogHelper) this.e).k) {
                    this.f.invoke();
                    break;
                }
                break;
        }
    }
}
