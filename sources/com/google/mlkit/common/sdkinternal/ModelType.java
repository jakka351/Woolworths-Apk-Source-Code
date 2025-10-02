package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@KeepForSdk
/* loaded from: classes6.dex */
public final class ModelType {
    public static final ModelType d;
    public static final /* synthetic */ ModelType[] e;

    static {
        ModelType modelType = new ModelType("UNKNOWN", 0);
        d = modelType;
        e = new ModelType[]{modelType, new ModelType("BASE", 1), new ModelType("TRANSLATE", 2), new ModelType("ENTITY_EXTRACTION", 3), new ModelType("CUSTOM", 4), new ModelType("DIGITAL_INK", 5), new ModelType("DIGITAL_INK_SEGMENTATION", 6), new ModelType("TOXICITY_DETECTION", 7), new ModelType("IMAGE_CAPTIONING", 8)};
    }

    @NonNull
    public static ModelType[] values() {
        return (ModelType[]) e.clone();
    }
}
