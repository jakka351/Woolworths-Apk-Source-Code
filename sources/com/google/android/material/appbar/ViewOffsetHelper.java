package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class ViewOffsetHelper {

    /* renamed from: a, reason: collision with root package name */
    public final View f14516a;
    public int b;
    public int c;
    public int d;

    public ViewOffsetHelper(View view) {
        this.f14516a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.f14516a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
