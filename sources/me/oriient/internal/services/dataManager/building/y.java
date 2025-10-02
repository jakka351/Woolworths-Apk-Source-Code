package me.oriient.internal.services.dataManager.building;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes7.dex */
public final class y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str) {
        super(1);
        this.f25119a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return ((BuildingResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(BuildingResponse.class))).toBuilding(this.f25119a);
    }
}
