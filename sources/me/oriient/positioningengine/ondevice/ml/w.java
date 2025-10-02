package me.oriient.positioningengine.ondevice.ml;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public final class w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f26467a;
    public final /* synthetic */ Ref.IntRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Throwable th, Ref.IntRef intRef) {
        super(1);
        this.f26467a = th;
        this.b = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map it = (Map) obj;
        Intrinsics.h(it, "it");
        it.put("reason", "exception caught");
        it.put("failureMessage", this.f26467a.getMessage());
        it.put("stageNum", Integer.valueOf(this.b.d));
        return Unit.f24250a;
    }
}
