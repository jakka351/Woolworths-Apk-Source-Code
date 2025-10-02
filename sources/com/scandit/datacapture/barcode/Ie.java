package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ie {

    /* renamed from: a, reason: collision with root package name */
    private final Ge f17199a;
    private final Function1 b;
    public View c;
    private ViewGroup d;

    public Ie(C0514a2 positioner, Function1 factory) {
        Intrinsics.h(positioner, "positioner");
        Intrinsics.h(factory, "factory");
        this.f17199a = positioner;
        this.b = factory;
    }

    public final View a() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        Intrinsics.p("view");
        throw null;
    }

    public final void b() {
        Ge ge = this.f17199a;
        View viewA = a();
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            ge.a(viewA, viewGroup);
        } else {
            Intrinsics.p("parent");
            throw null;
        }
    }

    public final void a(ViewGroup parent) {
        Intrinsics.h(parent, "parent");
        Function1 function1 = this.b;
        Context context = parent.getContext();
        Intrinsics.g(context, "parent.context");
        View view = (View) function1.invoke(context);
        Intrinsics.h(view, "<set-?>");
        this.c = view;
        parent.addView(a());
        this.d = parent;
        b();
    }
}
