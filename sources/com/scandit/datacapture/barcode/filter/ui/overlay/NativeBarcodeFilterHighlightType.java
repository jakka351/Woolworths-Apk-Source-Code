package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBarcodeFilterHighlightType {
    public static final NativeBarcodeFilterHighlightType BRUSH;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ NativeBarcodeFilterHighlightType[] f17652a;

    static {
        NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType = new NativeBarcodeFilterHighlightType();
        BRUSH = nativeBarcodeFilterHighlightType;
        f17652a = new NativeBarcodeFilterHighlightType[]{nativeBarcodeFilterHighlightType};
    }

    private NativeBarcodeFilterHighlightType() {
    }

    public static NativeBarcodeFilterHighlightType valueOf(String str) {
        return (NativeBarcodeFilterHighlightType) Enum.valueOf(NativeBarcodeFilterHighlightType.class, str);
    }

    public static NativeBarcodeFilterHighlightType[] values() {
        return (NativeBarcodeFilterHighlightType[]) f17652a.clone();
    }
}
