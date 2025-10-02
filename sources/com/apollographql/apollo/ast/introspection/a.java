package com.apollographql.apollo.ast.introspection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder Json = (JsonBuilder) obj;
        int i = Introspection__Introspection_readerKt.f13578a;
        Intrinsics.h(Json, "$this$Json");
        Json.b = true;
        return Unit.f24250a;
    }
}
