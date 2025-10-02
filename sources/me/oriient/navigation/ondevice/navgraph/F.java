package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* loaded from: classes8.dex */
public final class F extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final F f26297a = new F();

    public F() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OriientError it = (OriientError) obj;
        Intrinsics.h(it, "it");
        return me.oriient.navigation.common.util.a.a(it);
    }
}
