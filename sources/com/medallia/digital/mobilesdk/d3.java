package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.e3;

/* loaded from: classes6.dex */
final class d3 implements LifeCycle.f {
    private static d3 k;

    /* renamed from: a, reason: collision with root package name */
    private final f3 f16416a;
    private InviteData b;
    private AlertDialog c;
    private DialogInterface.OnClickListener d;
    private InviteData e;
    private j4 f;
    private h g;
    private MDAppearanceMode h = MDAppearanceMode.light;
    private boolean i;
    private v5 j;

    public class a extends v4 {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d3.this.g();
        }
    }

    public class b extends v4 {
        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d3.this.f();
        }
    }

    public class c extends x {
        public c() {
        }

        @Override // com.medallia.digital.mobilesdk.x
        public void a() {
            d3.this.a(Boolean.TRUE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        public void b(e3 e3Var) {
            d3.this.f16416a.a((e3.b) null);
            d3.this.f = null;
            d3.this.a(Boolean.FALSE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        public void c(e3 e3Var) {
            if (d3.this.d != null) {
                d3.this.d.onClick(null, 0);
            }
            d3.this.f16416a.a((e3.b) null);
            d3.this.f = null;
        }

        @Override // com.medallia.digital.mobilesdk.x
        public void a(e3 e3Var) {
            d3.this.f16416a.a((e3.b) null);
            d3.this.f = null;
            d3.this.a(Boolean.FALSE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        public void a(j4 j4Var) {
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (d3.this.d != null) {
                d3.this.d.onClick(dialogInterface, i);
            }
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.c = null;
            }
            d3.this.f16416a.a((e3.b) null);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.c = null;
            }
            d3.this.f16416a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.c = null;
            }
            d3.this.f16416a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    public class g implements DialogInterface.OnCancelListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.c = null;
            }
            d3.this.f16416a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    public interface h {
        void a(boolean z);
    }

    private d3() {
        f3 f3Var = new f3();
        this.f16416a = f3Var;
        f3Var.b(true);
        LifeCycle.b().a(this);
    }

    public static d3 d() {
        if (k == null) {
            k = new d3();
        }
        return k;
    }

    private boolean e() {
        return (LifeCycle.b().f() || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f16416a.a(false);
        InviteData inviteData = this.e;
        if (inviteData != null) {
            this.f = this.f16416a.a(inviteData.getBannerData(), this.j, new c());
        }
        j4 j4Var = this.f;
        if (j4Var != null) {
            j4Var.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f16416a.a(false);
        AlertDialog alertDialogA = this.f16416a.a(this.b, this.h, this.i, new d(), new e(), new f(), new g());
        this.c = alertDialogA;
        if (alertDialogA != null) {
            a(Boolean.TRUE);
            this.c.show();
        }
    }

    private void h() {
        if (e() && this.f16416a.l()) {
            AlertDialog alertDialog = this.c;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.c = null;
                try {
                    ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new a());
                } catch (Exception e2) {
                    a4.c(e2.getMessage());
                }
            }
            j4 j4Var = this.f;
            if (j4Var != null) {
                j4Var.b();
                this.f = null;
                try {
                    ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b());
                } catch (Exception e3) {
                    a4.c(e3.getMessage());
                }
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        h();
    }

    public void i() {
        this.g = null;
    }

    public void c() {
        if (this.f != null) {
            this.f16416a.a((e3.b) null);
            this.f.b();
            this.f = null;
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
        if (this.f16416a.l()) {
            this.f16416a.c();
        }
    }

    public void a(InviteData inviteData, DialogInterface.OnClickListener onClickListener, MDAppearanceMode mDAppearanceMode, boolean z) {
        this.b = inviteData;
        this.d = onClickListener;
        this.h = mDAppearanceMode;
        this.i = z;
        g();
    }

    public void a(h hVar) {
        this.g = hVar;
    }

    public void a(j2 j2Var, DialogInterface.OnClickListener onClickListener, v5 v5Var) {
        if (j2Var != null) {
            this.j = v5Var;
            this.e = j2Var.getInviteData();
            this.d = onClickListener;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Boolean bool) {
        h hVar = this.g;
        if (hVar != null) {
            hVar.a(bool.booleanValue());
        }
    }
}
