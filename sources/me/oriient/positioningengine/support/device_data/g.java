package me.oriient.positioningengine.support.device_data;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.OriientError;

/* loaded from: classes8.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f26525a = new g();

    public g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OriientError it = (OriientError) obj;
        Intrinsics.h(it, "it");
        return me.oriient.positioningengine.common.util.b.a(it);
    }
}
