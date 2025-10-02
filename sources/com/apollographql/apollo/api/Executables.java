package com.apollographql.apollo.api;

import com.apollographql.apollo.api.Executable;
import com.apollographql.apollo.api.json.MapJsonWriter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Executables {
    public static final Executable.Variables a(Operation operation, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        MapJsonWriter mapJsonWriter = new MapJsonWriter();
        mapJsonWriter.G();
        operation.serializeVariables(mapJsonWriter, customScalarAdapters, z);
        mapJsonWriter.K();
        if (!mapJsonWriter.e) {
            throw new IllegalStateException("Check failed.");
        }
        Object obj = mapJsonWriter.d;
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new Executable.Variables((Map) obj);
    }
}
