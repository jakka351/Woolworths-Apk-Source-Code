package au.com.woolworths.foundation.barcode.reader.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.processing.g;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.ui.a;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.foundation.barcode.reader.BarcodeReader;
import au.com.woolworths.foundation.barcode.reader.databinding.ActivityBarcodeScannerBinding;
import com.google.common.util.concurrent.ListenableFuture;
import com.woolworths.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/view/BarcodeReaderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BarcodeReaderActivity extends AppCompatActivity {
    public static final String[] z = (String[]) CollectionsKt.Z("android.permission.CAMERA").toArray(new String[0]);
    public ExecutorService t;
    public ActivityBarcodeScannerBinding u;
    public ResultReceiver v;
    public BarcodeReader.ScanType w;
    public BarcodeReader.BarcodeValidator x;
    public boolean y;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/view/BarcodeReaderActivity$Companion;", "", "", "REQUEST_CODE_PERMISSIONS", "I", "", "EXTRA_RESULT_BARCODE", "Ljava/lang/String;", "EXTRA_ERROR_REASON", "EXTRA_ERROR_MESSAGE", "EXTRA_USER_CANCELLED_TRIGGERING_RESOURCE", "EXTRA_SCAN_TYPE", "EXTRA_SCAN_LISTENER", "EXTRA_LAYOUT_RESOURCE_ID", "EXTRA_CLOSE_BUTTON_RESOURCE_ID", "EXTRA_RESPONSE_VALIDATOR", "", "REQUIRED_PERMISSIONS", "[Ljava/lang/String;", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final void N4(BarcodeReader.ScanErrorReason scanErrorReason, String str) {
        ResultReceiver resultReceiver = this.v;
        if (resultReceiver == null) {
            Intrinsics.p("resultReceiver");
            throw null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_error_reason", scanErrorReason);
        if (str != null) {
            bundle.putSerializable("extra_error_message", str);
        }
        resultReceiver.send(0, bundle);
        finish();
    }

    public final void O4() {
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding = this.u;
        if (activityBarcodeScannerBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityBarcodeScannerBinding.e.setVisibility(0);
        ActivityBarcodeScannerBinding activityBarcodeScannerBinding2 = this.u;
        if (activityBarcodeScannerBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityBarcodeScannerBinding2.f.setVisibility(0);
        BarcodeReader.ScanType scanType = this.w;
        if (scanType == null) {
            Intrinsics.p("scanType");
            throw null;
        }
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
        ListenableFuture listenableFutureA = ProcessCameraProvider.Companion.a(this);
        ((FutureChain) listenableFutureA).addListener(new g(13, listenableFutureA, this, scanType), ContextCompat.d(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View viewInflate;
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("scan_listener");
        Intrinsics.e(parcelableExtra);
        this.v = (ResultReceiver) parcelableExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("scan_type");
        Intrinsics.f(serializableExtra, "null cannot be cast to non-null type au.com.woolworths.foundation.barcode.reader.BarcodeReader.ScanType");
        this.w = (BarcodeReader.ScanType) serializableExtra;
        this.x = (BarcodeReader.BarcodeValidator) getIntent().getSerializableExtra("extra_response_validator");
        int i = 0;
        View viewInflate2 = getLayoutInflater().inflate(R.layout.activity_barcode_scanner, (ViewGroup) null, false);
        int i2 = R.id.overlay_view;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.a(R.id.overlay_view, viewInflate2);
        if (frameLayout != null) {
            i2 = R.id.preview_view;
            PreviewView previewView = (PreviewView) ViewBindings.a(R.id.preview_view, viewInflate2);
            if (previewView != null) {
                this.u = new ActivityBarcodeScannerBinding((ConstraintLayout) viewInflate2, frameLayout, previewView);
                int intExtra = getIntent().getIntExtra("extra_overlay_resource_id", -1);
                if (intExtra != -1 && (viewInflate = getLayoutInflater().inflate(intExtra, (ViewGroup) null)) != null) {
                    ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("extra_close_button_resource_id");
                    if (integerArrayListExtra != null) {
                        for (Integer num : integerArrayListExtra) {
                            Intrinsics.e(num);
                            View viewFindViewById = viewInflate.findViewById(num.intValue());
                            View view = viewFindViewById instanceof Button ? (Button) viewFindViewById : null;
                            if (view == null) {
                                View viewFindViewById2 = viewInflate.findViewById(num.intValue());
                                view = viewFindViewById2 instanceof ImageButton ? (ImageButton) viewFindViewById2 : null;
                            }
                            if (view != null) {
                                view.setOnClickListener(new a(14, this, num));
                            }
                        }
                    }
                    ActivityBarcodeScannerBinding activityBarcodeScannerBinding = this.u;
                    if (activityBarcodeScannerBinding == null) {
                        Intrinsics.p("viewBinding");
                        throw null;
                    }
                    activityBarcodeScannerBinding.e.addView(viewInflate);
                }
                ActivityBarcodeScannerBinding activityBarcodeScannerBinding2 = this.u;
                if (activityBarcodeScannerBinding2 == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                setContentView(activityBarcodeScannerBinding2.d);
                String[] strArr = z;
                int length = strArr.length;
                while (true) {
                    if (i >= length) {
                        O4();
                        break;
                    } else {
                        if (ContextCompat.a(getBaseContext(), strArr[i]) != 0) {
                            ActivityCompat.j(this, strArr, 10);
                            break;
                        }
                        i++;
                    }
                }
                this.t = Executors.newSingleThreadExecutor();
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.t;
        if (executorService != null) {
            executorService.shutdown();
        } else {
            Intrinsics.p("cameraExecutor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 10) {
            for (String str : z) {
                if (ContextCompat.a(getBaseContext(), str) != 0) {
                    Timber.f27013a.b("Camera permission not granted", new Object[0]);
                    N4(BarcodeReader.ScanErrorReason.d, null);
                    return;
                }
            }
            O4();
        }
    }
}
