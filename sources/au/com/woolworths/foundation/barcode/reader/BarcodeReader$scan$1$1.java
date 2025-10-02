package au.com.woolworths.foundation.barcode.reader;

import android.os.Bundle;
import android.os.ResultReceiver;
import au.com.woolworths.foundation.barcode.reader.BarcodeReader;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/foundation/barcode/reader/BarcodeReader$scan$1$1", "Landroid/os/ResultReceiver;", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeReader$scan$1$1 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        Object obj;
        Object obj2;
        if (i == -1) {
            Serializable serializable = bundle != null ? bundle.getSerializable("extra_result_uri") : null;
            if ((serializable instanceof BarcodeReader.BarcodeScanResult ? (BarcodeReader.BarcodeScanResult) serializable : null) != null) {
                throw null;
            }
        } else {
            if (i != 0) {
                return;
            }
            if (bundle != null && (obj2 = bundle.get("extra_error_reason")) != null) {
                throw null;
            }
            if (bundle == null || (obj = bundle.get("extra_user_cancelled_triggering_resource")) == null) {
                return;
            }
            throw null;
        }
    }
}
