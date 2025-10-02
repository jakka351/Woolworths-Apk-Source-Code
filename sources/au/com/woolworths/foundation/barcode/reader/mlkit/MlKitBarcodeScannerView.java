package au.com.woolworths.foundation.barcode.reader.mlkit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.e;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.delivery.address.a;
import au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface;
import au.com.woolworths.foundation.barcode.reader.BarcodeScanningHandler;
import au.com.woolworths.foundation.barcode.reader.databinding.MlkitPreviewBinding;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeScanningConfig;
import com.google.common.util.concurrent.ListenableFuture;
import com.woolworths.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tR\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/mlkit/MlKitBarcodeScannerView;", "Landroid/widget/RelativeLayout;", "Lau/com/woolworths/foundation/barcode/reader/BarcodeScannerViewInterface;", "Landroidx/camera/core/ImageAnalysis;", "l", "Lkotlin/Lazy;", "getBarcodeImageAnalysisUseCase", "()Landroidx/camera/core/ImageAnalysis;", "barcodeImageAnalysisUseCase", "Companion", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MlKitBarcodeScannerView extends RelativeLayout implements BarcodeScannerViewInterface {
    public static final /* synthetic */ int m = 0;
    public final LifecycleOwner d;
    public ProcessCameraProvider e;
    public Preview f;
    public final MlkitPreviewBinding g;
    public final ExecutorService h;
    public boolean i;
    public AppCompatActivity j;
    public MlKitBarcodeImageAnalyzer k;

    /* renamed from: l, reason: from kotlin metadata */
    public final Lazy barcodeImageAnalysisUseCase;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/mlkit/MlKitBarcodeScannerView$Companion;", "", "", "FNC", "C", "", "CAMERA_ZOOM_RATIO", "F", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MlKitBarcodeScannerView(@NotNull Context context) {
        this(context, null, 14);
        Intrinsics.h(context, "context");
    }

    private final ImageAnalysis getBarcodeImageAnalysisUseCase() {
        return (ImageAnalysis) this.barcodeImageAnalysisUseCase.getD();
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void a() {
        MlKitBarcodeImageAnalyzer mlKitBarcodeImageAnalyzer = this.k;
        if (mlKitBarcodeImageAnalyzer == null) {
            Intrinsics.p("barcodeImageAnalyzer");
            throw null;
        }
        mlKitBarcodeImageAnalyzer.g.set(false);
        ProcessCameraProvider processCameraProvider = this.e;
        if (processCameraProvider != null) {
            processCameraProvider.f(this.f);
        }
        this.i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void b(BarcodeScanningConfig barcodeScanningConfig, BarcodeScanningHandler barcodeScanningHandler) {
        this.j = (AppCompatActivity) barcodeScanningHandler;
        this.k = new MlKitBarcodeImageAnalyzer(new a(this, 21), barcodeScanningConfig.f8477a, barcodeScanningConfig.c);
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
        Object obj = this.d;
        Intrinsics.f(obj, "null cannot be cast to non-null type android.content.Context");
        Context context = (Context) obj;
        ListenableFuture listenableFutureA = ProcessCameraProvider.Companion.a(context);
        ((FutureChain) listenableFutureA).addListener(new e(24, this, listenableFutureA), ContextCompat.d(context));
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void c() {
        MlKitBarcodeImageAnalyzer mlKitBarcodeImageAnalyzer = this.k;
        if (mlKitBarcodeImageAnalyzer == null) {
            Intrinsics.p("barcodeImageAnalyzer");
            throw null;
        }
        mlKitBarcodeImageAnalyzer.g.set(true);
        d();
    }

    public final void d() {
        ProcessCameraProvider processCameraProvider;
        RestrictedCameraControl restrictedCameraControl;
        if (this.i || (processCameraProvider = this.e) == null) {
            return;
        }
        processCameraProvider.g();
        Preview previewF = new Preview.Builder().f();
        previewF.F(this.g.e.getSurfaceProvider());
        this.f = previewF;
        CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.c;
        Intrinsics.g(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        LifecycleOwner lifecycleOwner = this.d;
        if (lifecycleOwner != null) {
            ProcessCameraProvider processCameraProvider2 = this.e;
            LifecycleCamera lifecycleCameraB = processCameraProvider2 != null ? processCameraProvider2.b(lifecycleOwner, DEFAULT_BACK_CAMERA, this.f, getBarcodeImageAnalysisUseCase()) : null;
            if (lifecycleCameraB != null && (restrictedCameraControl = lifecycleCameraB.f.t) != null) {
                restrictedCameraControl.c(1.0f);
            }
        }
        this.i = true;
    }

    @Override // au.com.woolworths.foundation.barcode.reader.BarcodeScannerViewInterface
    public final void m() {
        ProcessCameraProvider processCameraProvider = this.e;
        if (processCameraProvider != null) {
            processCameraProvider.f(this.f);
        }
        this.i = false;
        this.e = null;
        this.j = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitBarcodeScannerView(Context context, AppCompatActivity appCompatActivity, int i) {
        super(context, null, 0);
        appCompatActivity = (i & 2) != 0 ? null : appCompatActivity;
        this.d = appCompatActivity;
        this.h = Executors.newSingleThreadExecutor();
        this.barcodeImageAnalysisUseCase = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 18));
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.mlkit_preview, (ViewGroup) null, false);
        PreviewView previewView = (PreviewView) ViewBindings.a(R.id.preview_view, viewInflate);
        if (previewView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.preview_view)));
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.g = new MlkitPreviewBinding(frameLayout, previewView);
        addView(frameLayout);
    }
}
