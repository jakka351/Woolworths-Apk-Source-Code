package com.scandit.datacapture.core.data;

import com.scandit.datacapture.core.internal.sdk.common.graphic.ImageBufferSerializerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/data/FrameDataSerializer;", "", "Lcom/scandit/datacapture/core/data/FrameData;", "frameData", "", "toJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FrameDataSerializer {

    @NotNull
    public static final FrameDataSerializer INSTANCE = new FrameDataSerializer();

    private FrameDataSerializer() {
    }

    @JvmStatic
    @NotNull
    public static final String toJson(@NotNull FrameData frameData) {
        Intrinsics.h(frameData, "frameData");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(ImageBufferSerializerKt.toJsonObject(frameData.getImageBuffer()));
        String string = jSONObject.put("imageBuffers", jSONArray).put("orientation", frameData.getOrientation()).toString();
        Intrinsics.g(string, "JSONObject()\n        .pu…on())\n        .toString()");
        return string;
    }
}
