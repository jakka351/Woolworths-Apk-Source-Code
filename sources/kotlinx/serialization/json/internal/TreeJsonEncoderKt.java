package kotlinx.serialization.json.internal;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TreeJsonEncoderKt {
    public static final JsonElement a(Json json, Object obj, SerializationStrategy serializer) {
        Intrinsics.h(json, "json");
        Intrinsics.h(serializer, "serializer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new JsonTreeEncoder(json, new a(objectRef, 1)).e(serializer, obj);
        Object obj2 = objectRef.d;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        Intrinsics.p(lqlqqlq.m006Dm006Dm006Dm);
        throw null;
    }
}
