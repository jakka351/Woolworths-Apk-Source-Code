package me.oriient.ipssdk.base.remoteconfig;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.ipssdk.base.remoteconfig.responses.RemoteConfigResponse;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f25709a = new g();

    public g() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return new Pair(it, JsonSerializationKt.parseAsJson(it, Reflection.b(RemoteConfigResponse.class)));
    }
}
