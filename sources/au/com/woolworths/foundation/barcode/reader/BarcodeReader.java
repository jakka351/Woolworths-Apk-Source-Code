package au.com.woolworths.foundation.barcode.reader;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader;", "", "ScanOptions", "ScanType", "BarcodeValidator", "BarcodeScanResult", "BarcodeScanListener", "ScanErrorReason", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeReader {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$BarcodeScanListener;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BarcodeScanListener {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$BarcodeScanResult;", "Ljava/io/Serializable;", "Companion", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BarcodeScanResult implements Serializable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$BarcodeScanResult$Companion;", "", "", "serialVersionUID", "J", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$BarcodeValidator;", "Ljava/io/Serializable;", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BarcodeValidator extends Serializable {
        BarcodeScanResult validate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$ScanErrorReason;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanErrorReason {
        public static final ScanErrorReason d;
        public static final ScanErrorReason e;
        public static final ScanErrorReason f;
        public static final /* synthetic */ ScanErrorReason[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            ScanErrorReason scanErrorReason = new ScanErrorReason("PERMISSION_MISSING", 0);
            d = scanErrorReason;
            ScanErrorReason scanErrorReason2 = new ScanErrorReason("CAMERA_NOT_FOUND", 1);
            e = scanErrorReason2;
            ScanErrorReason scanErrorReason3 = new ScanErrorReason("UNKNOWN", 2);
            f = scanErrorReason3;
            ScanErrorReason[] scanErrorReasonArr = {scanErrorReason, scanErrorReason2, scanErrorReason3};
            g = scanErrorReasonArr;
            h = EnumEntriesKt.a(scanErrorReasonArr);
        }

        public static ScanErrorReason valueOf(String str) {
            return (ScanErrorReason) Enum.valueOf(ScanErrorReason.class, str);
        }

        public static ScanErrorReason[] values() {
            return (ScanErrorReason[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$ScanOptions;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanOptions {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/BarcodeReader$ScanType;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanType {
        public static final /* synthetic */ ScanType[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            ScanType[] scanTypeArr = {new ScanType("QR", 0), new ScanType("BARCODE", 1), new ScanType("ALL", 2)};
            d = scanTypeArr;
            e = EnumEntriesKt.a(scanTypeArr);
        }

        public static ScanType valueOf(String str) {
            return (ScanType) Enum.valueOf(ScanType.class, str);
        }

        public static ScanType[] values() {
            return (ScanType[]) d.clone();
        }
    }
}
