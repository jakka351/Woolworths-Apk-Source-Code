package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1291v extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1291v f25170a = new C1291v();

    public C1291v() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return (FloorMetadataResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(FloorMetadataResponse.class));
    }
}
