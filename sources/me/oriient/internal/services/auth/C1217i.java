package me.oriient.internal.services.auth;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.internal.services.auth.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1217i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1217i f25030a = new C1217i();

    public C1217i() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me.oriient.internal.services.auth.rest.l it = (me.oriient.internal.services.auth.rest.l) obj;
        Intrinsics.h(it, "it");
        return it.b;
    }
}
