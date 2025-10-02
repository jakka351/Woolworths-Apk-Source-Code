package au.com.woolworths.foundation.barcode.reader.models;

import YU.a;
import android.graphics.Rect;
import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/models/BarcodeScanningConfig;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BarcodeScanningConfig {

    /* renamed from: a, reason: collision with root package name */
    public final List f8477a;
    public final Rect b;
    public final boolean c;

    public BarcodeScanningConfig(List list, Rect rect, boolean z) {
        this.f8477a = list;
        this.b = rect;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeScanningConfig)) {
            return false;
        }
        BarcodeScanningConfig barcodeScanningConfig = (BarcodeScanningConfig) obj;
        return this.f8477a.equals(barcodeScanningConfig.f8477a) && this.b.equals(barcodeScanningConfig.b) && this.c == barcodeScanningConfig.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b.e((this.b.hashCode() + (this.f8477a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BarcodeScanningConfig(supportedSymbologies=");
        sb.append(this.f8477a);
        sb.append(", activeScanningArea=");
        sb.append(this.b);
        sb.append(", compensateUpcA=");
        return a.k(", enableConvertRssToDataBar=true)", sb, this.c);
    }
}
