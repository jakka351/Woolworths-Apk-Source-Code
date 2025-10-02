package me.oriient.ipssdk.ips;

import android.app.AlertDialog;
import android.widget.Button;
import androidx.lifecycle.Observer;

/* loaded from: classes4.dex */
public final class e implements Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25792a;
    public final /* synthetic */ AlertDialog b;
    public final /* synthetic */ boolean c;

    public e(boolean z, AlertDialog alertDialog, boolean z2) {
        this.f25792a = z;
        this.b = alertDialog;
        this.c = z2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Button button;
        Button button2;
        Button button3;
        Button button4;
        Double d = (Double) obj;
        if (d == null || d.doubleValue() < 100.0d) {
            if (this.f25792a && (button2 = this.b.getButton(-1)) != null) {
                button2.setVisibility(0);
            }
            if (!this.c || (button = this.b.getButton(-2)) == null) {
                return;
            }
            button.setVisibility(0);
            return;
        }
        if (this.f25792a && (button4 = this.b.getButton(-1)) != null) {
            button4.setVisibility(8);
        }
        if (!this.c || (button3 = this.b.getButton(-2)) == null) {
            return;
        }
        button3.setVisibility(8);
    }
}
