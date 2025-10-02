package me.oriient.internal.services.uploadingManager;

import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;

/* renamed from: me.oriient.internal.services.uploadingManager.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC1541t {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DataUploaderItemStatus.values().length];
        try {
            iArr[DataUploaderItemStatus.COLLECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataUploaderItemStatus.ZIPPING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataUploaderItemStatus.UPLOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataUploaderItemStatus.READY_FOR_ZIPPING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DataUploaderItemStatus.READY_FOR_UPLOAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DataUploaderItemStatus.UPLOADED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
