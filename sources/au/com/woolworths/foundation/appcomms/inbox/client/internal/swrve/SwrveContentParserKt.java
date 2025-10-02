package au.com.woolworths.foundation.appcomms.inbox.client.internal.swrve;

import au.com.woolworths.feature.shop.recipes.recipes.list.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox-client_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SwrveContentParserKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Json f8432a = JsonKt.a(new b(22));

    public static final SwrveContentDto a(String data, Json json) {
        Intrinsics.h(json, "<this>");
        Intrinsics.h(data, "data");
        Object obj = JsonElementKt.j(Json.d.d(data)).get("data");
        Intrinsics.e(obj);
        JsonElement jsonElement = (JsonElement) obj;
        Object obj2 = JsonElementKt.j(jsonElement).get("contentVersion");
        Intrinsics.e(obj2);
        String f = JsonElementKt.k((JsonElement) obj2).getF();
        if (!Intrinsics.c(f, "1")) {
            throw new IllegalStateException(("Unknown content version: " + f).toString());
        }
        Object obj3 = JsonElementKt.j(jsonElement).get("content");
        Intrinsics.e(obj3);
        return (SwrveContentDto) json.a(SwrveContentDto.INSTANCE.serializer(), (JsonElement) obj3);
    }
}
