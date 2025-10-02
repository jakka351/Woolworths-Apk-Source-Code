package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import me.oriient.internal.services.dataManager.obstacles.Obstacles;
import me.oriient.internal.services.dataManager.utils.MatlabTwoLevelArray;

/* loaded from: classes7.dex */
public final /* synthetic */ class F extends FunctionReferenceImpl implements Function1 {
    public F(H h) {
        super(1, h, H.class, "decodePolygon", "decodePolygon(Lkotlinx/serialization/json/JsonElement;)Lme/oriient/internal/services/dataManager/obstacles/Obstacles$Polygon;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement p0 = (JsonElement) obj;
        Intrinsics.h(p0, "p0");
        ((H) this.receiver).getClass();
        JsonObject jsonObjectJ = JsonElementKt.j(p0);
        MatlabTwoLevelArray.Companion companion = MatlabTwoLevelArray.INSTANCE;
        JsonElement jsonElement = (JsonElement) jsonObjectJ.get("x");
        A a2 = A.f25231a;
        companion.getClass();
        return new Obstacles.Polygon(MatlabTwoLevelArray.Companion.a(jsonElement, a2), MatlabTwoLevelArray.Companion.a((JsonElement) jsonObjectJ.get("y"), B.f25232a), MatlabTwoLevelArray.Companion.a((JsonElement) jsonObjectJ.get("sidesLengths"), C.f25233a));
    }
}
