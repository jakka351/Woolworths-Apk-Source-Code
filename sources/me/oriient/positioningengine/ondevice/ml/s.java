package me.oriient.positioningengine.ondevice.ml;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s f26463a = new s();

    public s() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] it = (byte[]) obj;
        Intrinsics.h(it, "it");
        return it;
    }
}
