package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* loaded from: classes7.dex */
public final class E extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final E f25235a = new E();

    public E() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.h(it, "it");
        return Double.valueOf(JsonElementKt.f(JsonElementKt.k(it)));
    }
}
