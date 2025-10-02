package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@KeepForSdk
/* loaded from: classes6.dex */
public final class BaseModel {
    public static final /* synthetic */ BaseModel[] d = {new BaseModel("FACE_DETECTION", 0), new BaseModel("SMART_REPLY", 1), new BaseModel("TRANSLATE", 2), new BaseModel("ENTITY_EXTRACTION", 3), new BaseModel("TOXICITY_DETECTION", 4), new BaseModel("IMAGE_CAPTIONING", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    BaseModel EF5;

    @NonNull
    public static BaseModel[] values() {
        return (BaseModel[]) d.clone();
    }
}
