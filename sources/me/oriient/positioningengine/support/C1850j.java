package me.oriient.positioningengine.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSessionResponse;

/* renamed from: me.oriient.positioningengine.support.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1850j extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1850j f26557a = new C1850j();

    public C1850j() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        OnDeviceEngineSessionResponse onDeviceEngineSessionResponse = (OnDeviceEngineSessionResponse) JsonSerializationKt.parseAsJson(it, Reflection.b(OnDeviceEngineSessionResponse.class));
        List<Integer> id = onDeviceEngineSessionResponse.getId();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(id, 10));
        Iterator<T> it2 = id.iterator();
        while (it2.hasNext()) {
            arrayList.add(Character.valueOf((char) ((Number) it2.next()).intValue()));
        }
        return new OnDeviceEngineSession(CollectionsKt.M(arrayList, "", null, null, null, 62), onDeviceEngineSessionResponse.getExpirationTimeStamp());
    }
}
