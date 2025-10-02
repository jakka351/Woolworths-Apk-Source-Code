package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* renamed from: me.oriient.navigation.ondevice.navgraph.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1805k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1805k f26315a = new C1805k();

    public C1805k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String fileName = (String) obj;
        Intrinsics.h(fileName, "fileName");
        return Boolean.valueOf(StringsKt.o(fileName, "nav_graph", false));
    }
}
