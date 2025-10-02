package me.oriient.internal.services.dataManager.floorTransitions;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f25177a = new g();

    public g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return ((FloorTransitionsResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(FloorTransitionsResponse.class))).toFloorTransitions();
    }
}
