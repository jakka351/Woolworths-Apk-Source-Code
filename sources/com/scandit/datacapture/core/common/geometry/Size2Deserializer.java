package com.scandit.datacapture.core.common.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Size2Deserializer;", "", "", "json", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Size2Deserializer {

    @NotNull
    public static final Size2Deserializer INSTANCE = new Size2Deserializer();

    private Size2Deserializer() {
    }

    @NotNull
    public final Size2 fromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        return new Size2((float) jSONObject.getDouble("width"), (float) jSONObject.getDouble("height"));
    }
}
