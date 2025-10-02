package com.woolworths.scanlibrary.ui.dto;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/dto/BarCodeDTO;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BarCodeDTO {

    /* renamed from: a, reason: collision with root package name */
    public final String f21243a;
    public final BarcodeType b;

    public BarCodeDTO(String code, BarcodeType barcodeType) {
        Intrinsics.h(code, "code");
        this.f21243a = code;
        this.b = barcodeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarCodeDTO)) {
            return false;
        }
        BarCodeDTO barCodeDTO = (BarCodeDTO) obj;
        return Intrinsics.c(this.f21243a, barCodeDTO.f21243a) && this.b == barCodeDTO.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21243a.hashCode() * 31);
    }

    public final String toString() {
        return "BarCodeDTO(code=" + this.f21243a + ", barCodeType=" + this.b + ")";
    }
}
