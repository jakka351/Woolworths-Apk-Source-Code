package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;

/* loaded from: classes8.dex */
public final class E extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final E f26296a = new E();

    public E() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String body = (String) obj;
        Intrinsics.h(body, "body");
        return ((NavGraphResponse) JsonSerializationKt.parseAsJson(body, Reflection.b(NavGraphResponse.class))).toNavGraph();
    }
}
