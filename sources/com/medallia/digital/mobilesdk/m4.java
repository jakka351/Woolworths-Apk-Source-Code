package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
abstract class m4 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final l4 f16593a;
    View b;
    RelativeLayout c;
    RelativeLayout d;
    public boolean e;
    String f;

    public m4(l4 l4Var, Context context, String str) {
        super(context);
        this.f16593a = l4Var;
        this.f = str;
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.medallia_view_base_banner, this);
        this.b = viewInflate;
        this.d = (RelativeLayout) viewInflate.findViewById(R.id.medallia_banner_base_view);
        RelativeLayout relativeLayout = (RelativeLayout) this.b.findViewById(R.id.medallia_shadow_view);
        this.c = relativeLayout;
        relativeLayout.addView(b(context));
    }

    public abstract void a();

    public abstract RelativeLayout b(Context context);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract View e();

    public abstract View f();

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return super.onApplyWindowInsets(windowInsets);
    }
}
