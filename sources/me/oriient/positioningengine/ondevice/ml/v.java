package me.oriient.positioningengine.ondevice.ml;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.positioningengine.common.util.PositioningEngineError;

/* loaded from: classes8.dex */
public final class v extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Outcome f26466a;
    public final /* synthetic */ Ref.IntRef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Outcome outcome, Ref.IntRef intRef) {
        super(1);
        this.f26466a = outcome;
        this.b = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map it = (Map) obj;
        Intrinsics.h(it, "it");
        it.put("reason", "decoder failed");
        it.put("failureMessage", ((PositioningEngineError) ((Outcome.Failure) this.f26466a).getValue()).getMessage());
        it.put("stageNum", Integer.valueOf(this.b.d));
        return Unit.f24250a;
    }
}
