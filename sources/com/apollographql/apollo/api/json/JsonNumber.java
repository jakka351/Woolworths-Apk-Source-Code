package com.apollographql.apollo.api.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonNumber;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonNumber {

    /* renamed from: a, reason: collision with root package name */
    public final String f13534a;

    public JsonNumber(String value) {
        Intrinsics.h(value, "value");
        this.f13534a = value;
    }

    /* renamed from: toString, reason: from getter */
    public final String getF13534a() {
        return this.f13534a;
    }
}
