package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ a(boolean z, String str) {
        this.d = z;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonWriter jsonWriter = (JsonWriter) obj;
        Intrinsics.h(jsonWriter, "<this>");
        if (this.d) {
            jsonWriter.F1("extensions");
            jsonWriter.G();
            jsonWriter.F1("persistedQuery");
            jsonWriter.G();
            jsonWriter.F1("version").e1(1);
            jsonWriter.F1("sha256Hash").v0(this.e);
            jsonWriter.K();
            jsonWriter.K();
        }
        return Unit.f24250a;
    }
}
