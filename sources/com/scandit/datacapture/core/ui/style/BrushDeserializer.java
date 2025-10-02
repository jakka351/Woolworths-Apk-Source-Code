package com.scandit.datacapture.core.ui.style;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/BrushDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/ui/style/Brush;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BrushDeserializer {

    @NotNull
    public static final BrushDeserializer INSTANCE = new BrushDeserializer();

    private BrushDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final Brush fromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeBrush nativeBrushBrushFromJson = NativeStructDeserializer.brushFromJson(NativeJsonValue.fromString(json));
        Intrinsics.g(nativeBrushBrushFromJson, "brushFromJson(\n         …tring(json)\n            )");
        return coreNativeTypeFactory.convert(nativeBrushBrushFromJson);
    }
}
