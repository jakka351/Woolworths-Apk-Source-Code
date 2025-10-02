package me.oriient.navigation.common;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class W extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26226a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(boolean z) {
        super(0);
        this.f26226a = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.i(new Pair("enabled", Boolean.valueOf(this.f26226a)));
    }
}
