package au.com.woolworths.foundation.barcode.reader.models;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/models/BarcodeData;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BarcodeData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8476a;
    public final BarcodeSymbology b;
    public final boolean c;

    public BarcodeData(String displayValue, BarcodeSymbology barcodeSymbology, boolean z) {
        Intrinsics.h(displayValue, "displayValue");
        this.f8476a = displayValue;
        this.b = barcodeSymbology;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeData)) {
            return false;
        }
        BarcodeData barcodeData = (BarcodeData) obj;
        return Intrinsics.c(this.f8476a, barcodeData.f8476a) && this.b == barcodeData.b && this.c == barcodeData.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f8476a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BarcodeData(displayValue=");
        sb.append(this.f8476a);
        sb.append(", symbology=");
        sb.append(this.b);
        sb.append(", isGs1DataCarrier=");
        return a.k(")", sb, this.c);
    }
}
