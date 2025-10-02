package me.oriient.positioningengine.support.device_data;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.positioningengine.support.device_data.model.network.DeviceDataResponse;

/* loaded from: classes8.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f26524a = new f();

    public f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return ((DeviceDataResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(DeviceDataResponse.class))).toDeviceData();
    }
}
