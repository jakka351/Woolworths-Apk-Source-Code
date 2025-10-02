package me.oriient.positioningengine.ondevice.ml;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f26468a;
    public final /* synthetic */ Ref.IntRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable th, Ref.IntRef intRef) {
        super(0);
        this.f26468a = th;
        this.b = intRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f26468a.getMessage()), new Pair("stageNum", Integer.valueOf(this.b.d)));
    }
}
