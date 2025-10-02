package androidx.compose.ui.viewinterop;

import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.button.SparkScanViewScanButtonView;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAdvancedOverlay;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import me.oriient.ipssdk.common.utils.SdkExecutors;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ a(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Function0 function0 = this.e;
        switch (i) {
            case 0:
                Function1 function1 = AndroidViewHolder.C;
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                SparkScanViewPresenter.b(function0);
                break;
            case 5:
                SparkScanViewScanButtonView.a(function0);
                break;
            case 6:
                BarcodePick.a(function0);
                break;
            case 7:
                MainThreadHelper.a(function0);
                break;
            case 8:
                ViewExtensionsKt.a(function0);
                break;
            case 9:
                TrackedObjectAdvancedOverlay.TrackedObjectAugmenterHost.a(function0);
                break;
            case 10:
                TrackedObjectAdvancedOverlay.TrackedObjectAugmenterHost.b(function0);
                break;
            case 11:
                SdkExecutors.schedule$lambda$1(function0);
                break;
            default:
                SdkExecutors.runInBackground$lambda$0(function0);
                break;
        }
    }
}
