package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class K extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final K f25198a = new K();

    public K() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return (MapGridUrl) JsonSerializationKt.parseAsJson(it, Reflection.b(MapGridUrl.class));
    }
}
