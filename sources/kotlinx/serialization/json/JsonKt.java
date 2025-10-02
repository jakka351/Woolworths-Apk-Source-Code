package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.PolymorphismValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JsonKt {
    public static Json a(Function1 builderAction) {
        Json.Default from = Json.d;
        Intrinsics.h(from, "from");
        Intrinsics.h(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder();
        JsonConfiguration jsonConfiguration = from.f24836a;
        jsonBuilder.f24839a = jsonConfiguration.c;
        jsonBuilder.b = jsonConfiguration.f24840a;
        jsonBuilder.c = jsonConfiguration.b;
        String str = jsonConfiguration.d;
        jsonBuilder.d = jsonConfiguration.e;
        jsonBuilder.e = jsonConfiguration.f;
        ClassDiscriminatorMode classDiscriminatorMode = jsonConfiguration.i;
        boolean z = jsonConfiguration.h;
        jsonBuilder.f = jsonConfiguration.g;
        jsonBuilder.g = from.b;
        builderAction.invoke(jsonBuilder);
        if (!Intrinsics.c(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z2 = jsonBuilder.b;
        boolean z3 = jsonBuilder.c;
        boolean z4 = jsonBuilder.f24839a;
        boolean z5 = jsonBuilder.d;
        String str2 = jsonBuilder.e;
        JsonConfiguration jsonConfiguration2 = new JsonConfiguration(z2, z3, z4, str, z5, str2, jsonBuilder.f, z, classDiscriminatorMode);
        SerializersModule module = jsonBuilder.g;
        Intrinsics.h(module, "module");
        JsonImpl jsonImpl = new JsonImpl(jsonConfiguration2, module);
        if (module.equals(SerializersModuleKt.f24879a)) {
            return jsonImpl;
        }
        module.a(new PolymorphismValidator(str2));
        return jsonImpl;
    }
}
