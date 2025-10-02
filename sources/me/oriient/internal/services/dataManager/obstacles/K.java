package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray;

/* loaded from: classes7.dex */
public final class K extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25237a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i) {
        super(1);
        this.f25237a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String body = (String) obj;
        Intrinsics.h(body, "body");
        JsonObject jsonObjectJ = JsonElementKt.j(JsonSerializationKt.getJson().d(body));
        H h = new H(jsonObjectJ);
        int i = this.f25237a;
        MatlabTwoLevelArray.Companion companion = MatlabTwoLevelArray.INSTANCE;
        JsonElement jsonElement = (JsonElement) jsonObjectJ.get("pR");
        D d = D.f25234a;
        companion.getClass();
        return new Obstacles(i, MatlabTwoLevelArray.Companion.a(jsonElement, d), MatlabTwoLevelArray.Companion.a((JsonElement) jsonObjectJ.get("pCenter"), E.f25235a), MatlabTwoLevelArray.Companion.a((JsonElement) jsonObjectJ.get("poly"), new F(h)), MatlabTwoLevelArray.Companion.a((JsonElement) jsonObjectJ.get("box"), G.f25236a));
    }
}
