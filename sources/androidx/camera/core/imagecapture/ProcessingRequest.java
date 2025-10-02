package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class ProcessingRequest {

    /* renamed from: a, reason: collision with root package name */
    public final int f450a;
    public final ImageCapture.OutputFileOptions b;
    public final Rect c;
    public final int d;
    public final int e;
    public final Matrix f;
    public final RequestWithCallback g;
    public final String h;
    public final ListenableFuture j;
    public int k = -1;
    public final ArrayList i = new ArrayList();

    public ProcessingRequest(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i, int i2, Matrix matrix, RequestWithCallback requestWithCallback, ListenableFuture listenableFuture, int i3) {
        this.f450a = i3;
        this.b = outputFileOptions;
        this.e = i2;
        this.d = i;
        this.c = rect;
        this.f = matrix;
        this.g = requestWithCallback;
        this.h = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> listA = captureBundle.a();
        Objects.requireNonNull(listA);
        for (CaptureStage captureStage : listA) {
            ArrayList arrayList = this.i;
            captureStage.getClass();
            arrayList.add(0);
        }
        this.j = listenableFuture;
    }
}
