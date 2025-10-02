package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002*\u000e\u0010\u0001\"\u0004\u0018\u00010\u00002\u0004\u0018\u00010\u0000¨\u0006\u0002"}, d2 = {"", "CompiledValue", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CompiledGraphQL {
    public static final CompiledListType a(CompiledType compiledType) {
        Intrinsics.h(compiledType, "<this>");
        return new CompiledListType();
    }

    public static final CompiledNotNullType b(CompiledType compiledType) {
        Intrinsics.h(compiledType, "<this>");
        return new CompiledNotNullType();
    }
}
