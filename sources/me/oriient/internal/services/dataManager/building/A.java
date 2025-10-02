package me.oriient.internal.services.dataManager.building;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class A extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f25092a = new A();

    public A() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return ((BuildingClientIdResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(BuildingClientIdResponse.class))).getClientBuildingId();
    }
}
