package me.oriient.ipssdk.ips;

import android.app.AlertDialog;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class d implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f25791a;

    public d(AlertDialog alertDialog) {
        this.f25791a = alertDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (bool.booleanValue()) {
                this.f25791a.show();
            } else {
                this.f25791a.dismiss();
            }
        }
    }
}
