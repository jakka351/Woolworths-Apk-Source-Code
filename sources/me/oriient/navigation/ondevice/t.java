package me.oriient.navigation.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t f26357a = new t();

    public t() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.i(new Pair("hasEngine", Boolean.valueOf(NdkBridgeImpl.f)));
    }
}
