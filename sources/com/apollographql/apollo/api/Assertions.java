package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.NullOrMissingField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"com/apollographql/apollo/api/Assertions__AssertionsKt", "com/apollographql/apollo/api/Assertions__Assertions_jvmKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Assertions {
    public static final void a(JsonReader jsonReader, String str) {
        Intrinsics.h(jsonReader, "jsonReader");
        StringBuilder sbU = YU.a.u("Field '", str, "' is missing or null at path ");
        sbU.append(jsonReader.getPath());
        String message = sbU.toString();
        Intrinsics.h(message, "message");
        throw new NullOrMissingField(message, null);
    }
}
