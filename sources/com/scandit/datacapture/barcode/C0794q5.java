package com.scandit.datacapture.barcode;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0794q5 implements Nd, Md {
    static final /* synthetic */ KProperty[] c = {Reflection.f24268a.e(new MutablePropertyReference1Impl(C0794q5.class, "value", "getValue()Ljava/lang/Object;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final C0776p5 f17979a;
    private ArrayList b = new ArrayList();

    public C0794q5(Object obj) {
        this.f17979a = new C0776p5(obj, this);
    }

    @Override // com.scandit.datacapture.barcode.Nd
    public final void a(Object obj) {
        b(obj);
    }

    public final void b(Object obj) {
        this.f17979a.setValue(this, c[0], obj);
    }

    public final C0825s6 a(Nd listener) {
        Intrinsics.h(listener, "listener");
        if (this.b.contains(listener)) {
            return null;
        }
        this.b.add(listener);
        listener.a(this.f17979a.getValue(this, c[0]));
        return new C0825s6(new C0810r6(this, listener));
    }

    public final void b(Nd nd) {
        if (CollectionsKt.t(this.b, nd)) {
            TypeIntrinsics.a(this.b).remove(nd);
        }
    }

    public static final void a(C0794q5 c0794q5) {
        Iterator it = c0794q5.b.iterator();
        while (it.hasNext()) {
            ((Nd) it.next()).a(c0794q5.f17979a.getValue(c0794q5, c[0]));
        }
    }
}
