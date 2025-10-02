package au.com.woolworths.foundation.barcode.reader.scandit;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface;
import au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeScanningConfig;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import au.com.woolworths.foundation.barcode.reader.scandit.ScanditSymbologyMapperKt;
import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureListener;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSession;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSettings;
import com.scandit.datacapture.barcode.capture.SymbologySettings;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/scandit/ScanditBarcodeScannerView;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", "Lau/com/woolworths/foundation/barcode/reader/BarcodeScannerViewInterface;", "Companion", "barcode-reader-scandit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ScanditBarcodeScannerView extends RelativeLayout implements BarcodeCaptureListener, BarcodeScannerViewInterface {
    public final String d;
    public DataCaptureContext e;
    public Camera f;
    public DataCaptureView g;
    public BarcodeCapture h;
    public ScannerActivityOld i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/scandit/ScanditBarcodeScannerView$Companion;", "", "", "QUICK_SALE_BARCODE_LENGTH", "S", "barcode-reader-scandit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanditBarcodeScannerView(@NotNull Context context) {
        this(context, null, 14);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void a() {
        BarcodeCapture barcodeCapture = this.h;
        if (barcodeCapture != null) {
            barcodeCapture.setEnabled(false);
        }
        Camera camera = this.f;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.OFF, null);
        }
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void b(BarcodeScanningConfig barcodeScanningConfig, BarcodeScanningHandler barcodeScanningHandler) {
        Symbology symbology;
        Rect rect = barcodeScanningConfig.b;
        String str = this.d;
        if (str == null) {
            throw new IllegalStateException("BarcodeScannerView license key is not provided");
        }
        this.e = DataCaptureContext.INSTANCE.forLicenseKey(str);
        Camera defaultCamera$default = Camera.Companion.getDefaultCamera$default(Camera.INSTANCE, null, 1, null);
        this.f = defaultCamera$default;
        if (defaultCamera$default == null) {
            throw new IllegalStateException("BarcodeScannerView depends on a camera, which failed to initialize.");
        }
        Camera.applySettings$default(defaultCamera$default, BarcodeCapture.INSTANCE.createRecommendedCameraSettings(), null, 2, null);
        DataCaptureContext dataCaptureContext = this.e;
        if (dataCaptureContext != null) {
            DataCaptureContext.setFrameSource$default(dataCaptureContext, this.f, null, 2, null);
        }
        BarcodeCaptureSettings barcodeCaptureSettings = new BarcodeCaptureSettings();
        List<BarcodeSymbology> list = barcodeScanningConfig.f8477a;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (BarcodeSymbology barcodeSymbology : list) {
            Intrinsics.h(barcodeSymbology, "<this>");
            switch (barcodeSymbology.ordinal()) {
                case 0:
                    symbology = Symbology.EAN13_UPCA;
                    break;
                case 1:
                    symbology = Symbology.UPCE;
                    break;
                case 2:
                    symbology = Symbology.EAN8;
                    break;
                case 3:
                    symbology = Symbology.CODE39;
                    break;
                case 4:
                    symbology = Symbology.CODE93;
                    break;
                case 5:
                    symbology = Symbology.CODE128;
                    break;
                case 6:
                    symbology = Symbology.CODE11;
                    break;
                case 7:
                    symbology = Symbology.CODE25;
                    break;
                case 8:
                    symbology = Symbology.CODABAR;
                    break;
                case 9:
                    symbology = Symbology.INTERLEAVED_TWO_OF_FIVE;
                    break;
                case 10:
                    symbology = Symbology.MSI_PLESSEY;
                    break;
                case 11:
                    symbology = Symbology.QR;
                    break;
                case 12:
                    symbology = Symbology.DATA_MATRIX;
                    break;
                case 13:
                    symbology = Symbology.AZTEC;
                    break;
                case 14:
                    symbology = Symbology.MAXI_CODE;
                    break;
                case 15:
                    symbology = Symbology.DOT_CODE;
                    break;
                case 16:
                    symbology = Symbology.KIX;
                    break;
                case 17:
                    symbology = Symbology.RM4SCC;
                    break;
                case 18:
                    symbology = Symbology.GS1_DATABAR;
                    break;
                case 19:
                    symbology = Symbology.GS1_DATABAR_EXPANDED;
                    break;
                case 20:
                    symbology = Symbology.GS1_DATABAR_LIMITED;
                    break;
                case 21:
                    symbology = Symbology.PDF417;
                    break;
                case 22:
                    symbology = Symbology.MICRO_PDF417;
                    break;
                case 23:
                    symbology = Symbology.MICRO_QR;
                    break;
                case 24:
                    symbology = Symbology.CODE32;
                    break;
                case 25:
                    symbology = Symbology.LAPA4SC;
                    break;
                case 26:
                    symbology = Symbology.IATA_TWO_OF_FIVE;
                    break;
                case 27:
                    symbology = Symbology.MATRIX_TWO_OF_FIVE;
                    break;
                case 28:
                    symbology = Symbology.USPS_INTELLIGENT_MAIL;
                    break;
                case 29:
                    symbology = Symbology.ARUCO;
                    break;
                case 30:
                    symbology = Symbology.UPU4STATE;
                    break;
                case 31:
                    symbology = Symbology.AUSTRALIANPOST;
                    break;
                case 32:
                    symbology = Symbology.FRENCHPOST;
                    break;
                case 33:
                    symbology = Symbology.GS1_DATABAR;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(symbology);
        }
        barcodeCaptureSettings.enableSymbologies(CollectionsKt.L0(arrayList));
        SymbologySettings symbologySettings = barcodeCaptureSettings.getSymbologySettings(Symbology.CODE128);
        symbologySettings.setActiveSymbolCounts(CollectionsKt.N0(symbologySettings.getActiveSymbolCounts(), SetsKt.b(25)));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        float fWidth = (i - rect.width()) / i;
        float fHeight = ((r8 - rect.height()) / 2) / displayMetrics.heightPixels;
        BarcodeCapture barcodeCaptureForDataCaptureContext = BarcodeCapture.INSTANCE.forDataCaptureContext(this.e, barcodeCaptureSettings);
        this.h = barcodeCaptureForDataCaptureContext;
        if (barcodeCaptureForDataCaptureContext != null) {
            barcodeCaptureForDataCaptureContext.getFeedback().setSuccess(new Feedback(null, null, 3, null));
            barcodeCaptureForDataCaptureContext.addListener(this);
        }
        DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
        Context context = getContext();
        Intrinsics.g(context, "getContext(...)");
        DataCaptureView dataCaptureViewNewInstance = companion.newInstance(context, this.e);
        this.g = dataCaptureViewNewInstance;
        if (dataCaptureViewNewInstance != null) {
            MeasureUnit measureUnit = MeasureUnit.FRACTION;
            dataCaptureViewNewInstance.setScanAreaMargins(new MarginsWithUnit(new FloatWithUnit(fWidth, measureUnit), new FloatWithUnit(fHeight, measureUnit), new FloatWithUnit(fWidth, measureUnit), new FloatWithUnit(fHeight, measureUnit)));
        }
        DataCaptureView dataCaptureView = this.g;
        if (dataCaptureView != null) {
            dataCaptureView.setLogoAnchor(Anchor.BOTTOM_RIGHT);
            MeasureUnit measureUnit2 = MeasureUnit.FRACTION;
            dataCaptureView.setLogoOffset(new PointWithUnit(new FloatWithUnit(0.8f, measureUnit2), new FloatWithUnit(dataCaptureView.getBottom(), measureUnit2)));
        }
        addView(this.g);
        this.i = (ScannerActivityOld) barcodeScanningHandler;
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void c() {
        BarcodeCapture barcodeCapture = this.h;
        if (barcodeCapture != null) {
            barcodeCapture.setEnabled(true);
        }
        Camera camera = this.f;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.ON, null);
        }
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void m() {
        BarcodeCapture barcodeCapture = this.h;
        if (barcodeCapture != null) {
            barcodeCapture.removeListener(this);
        }
        DataCaptureView dataCaptureView = this.g;
        if (dataCaptureView != null) {
            dataCaptureView.removeAllViews();
        }
        this.g = null;
        DataCaptureContext dataCaptureContext = this.e;
        if (dataCaptureContext != null) {
            BarcodeCapture barcodeCapture2 = this.h;
            Intrinsics.e(barcodeCapture2);
            dataCaptureContext.removeMode(barcodeCapture2);
        }
        DataCaptureContext dataCaptureContext2 = this.e;
        if (dataCaptureContext2 != null) {
            dataCaptureContext2.release();
        }
        this.i = null;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onBarcodeScanned(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData frameData) throws IllegalStateException {
        BarcodeData barcodeData;
        BarcodeSymbology barcodeSymbology;
        Intrinsics.h(barcodeCapture, "barcodeCapture");
        Intrinsics.h(session, "session");
        Intrinsics.h(frameData, "frameData");
        if (session.getNewlyRecognizedBarcodes().isEmpty()) {
            return;
        }
        barcodeCapture.setEnabled(false);
        ScannerActivityOld scannerActivityOld = this.i;
        if (scannerActivityOld != null) {
            List<Barcode> newlyRecognizedBarcodes = session.getNewlyRecognizedBarcodes();
            ArrayList arrayList = new ArrayList();
            for (Barcode barcode : newlyRecognizedBarcodes) {
                String data = barcode.getData();
                if (data != null) {
                    Symbology symbology = barcode.getSymbology();
                    Intrinsics.h(symbology, "<this>");
                    switch (ScanditSymbologyMapperKt.WhenMappings.f8478a[symbology.ordinal()]) {
                        case 1:
                            barcodeSymbology = BarcodeSymbology.d;
                            break;
                        case 2:
                            barcodeSymbology = BarcodeSymbology.e;
                            break;
                        case 3:
                            barcodeSymbology = BarcodeSymbology.f;
                            break;
                        case 4:
                            barcodeSymbology = BarcodeSymbology.g;
                            break;
                        case 5:
                            barcodeSymbology = BarcodeSymbology.h;
                            break;
                        case 6:
                            barcodeSymbology = BarcodeSymbology.i;
                            break;
                        case 7:
                            barcodeSymbology = BarcodeSymbology.j;
                            break;
                        case 8:
                            barcodeSymbology = BarcodeSymbology.k;
                            break;
                        case 9:
                            barcodeSymbology = BarcodeSymbology.l;
                            break;
                        case 10:
                            barcodeSymbology = BarcodeSymbology.m;
                            break;
                        case 11:
                            barcodeSymbology = BarcodeSymbology.n;
                            break;
                        case 12:
                            barcodeSymbology = BarcodeSymbology.o;
                            break;
                        case 13:
                            barcodeSymbology = BarcodeSymbology.p;
                            break;
                        case 14:
                            barcodeSymbology = BarcodeSymbology.q;
                            break;
                        case 15:
                            barcodeSymbology = BarcodeSymbology.r;
                            break;
                        case 16:
                            barcodeSymbology = BarcodeSymbology.s;
                            break;
                        case 17:
                            barcodeSymbology = BarcodeSymbology.t;
                            break;
                        case 18:
                            barcodeSymbology = BarcodeSymbology.u;
                            break;
                        case 19:
                            barcodeSymbology = BarcodeSymbology.v;
                            break;
                        case 20:
                            barcodeSymbology = BarcodeSymbology.w;
                            break;
                        case 21:
                            barcodeSymbology = BarcodeSymbology.x;
                            break;
                        case 22:
                            barcodeSymbology = BarcodeSymbology.y;
                            break;
                        case 23:
                            barcodeSymbology = BarcodeSymbology.z;
                            break;
                        case 24:
                            barcodeSymbology = BarcodeSymbology.A;
                            break;
                        case 25:
                            barcodeSymbology = BarcodeSymbology.B;
                            break;
                        case 26:
                            barcodeSymbology = BarcodeSymbology.C;
                            break;
                        case 27:
                            barcodeSymbology = BarcodeSymbology.D;
                            break;
                        case 28:
                            barcodeSymbology = BarcodeSymbology.E;
                            break;
                        case 29:
                            barcodeSymbology = BarcodeSymbology.F;
                            break;
                        case 30:
                            barcodeSymbology = BarcodeSymbology.G;
                            break;
                        case 31:
                            barcodeSymbology = BarcodeSymbology.H;
                            break;
                        case 32:
                            barcodeSymbology = BarcodeSymbology.I;
                            break;
                        case 33:
                            barcodeSymbology = BarcodeSymbology.J;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    barcodeData = new BarcodeData(data, barcodeSymbology, barcode.isGs1DataCarrier());
                } else {
                    barcodeData = null;
                }
                if (barcodeData != null) {
                    arrayList.add(barcodeData);
                }
            }
            scannerActivityOld.h2(arrayList);
        }
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onObservationStarted(BarcodeCapture barcodeCapture) {
        Intrinsics.h(barcodeCapture, "barcodeCapture");
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onObservationStopped(BarcodeCapture barcodeCapture) {
        Intrinsics.h(barcodeCapture, "barcodeCapture");
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureListener
    public final void onSessionUpdated(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
        Intrinsics.h(barcodeCapture, "barcodeCapture");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanditBarcodeScannerView(Context context, String str, int i) {
        super(context, null, 0);
        str = (i & 2) != 0 ? null : str;
        this.d = str;
    }
}
