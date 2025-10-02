package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f1973a;
    public Matrix b;
    public boolean e;
    public boolean f;
    public final float[] c = androidx.compose.ui.graphics.Matrix.a();
    public final float[] d = androidx.compose.ui.graphics.Matrix.a();
    public boolean g = true;
    public boolean h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(Function2 function2) {
        this.f1973a = (Lambda) function2;
    }

    public final float[] a(Object obj) {
        boolean z = this.f;
        float[] fArr = this.d;
        if (z) {
            this.g = InvertMatrixKt.a(b(obj), fArr);
            this.f = false;
        }
        if (this.g) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    public final float[] b(Object obj) {
        boolean z = this.e;
        float[] fArr = this.c;
        if (!z) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.f1973a.invoke(obj, matrix);
        AndroidMatrixConversions_androidKt.b(matrix, fArr);
        this.e = false;
        this.h = MatrixKt.a(fArr);
        return fArr;
    }

    public final void c() {
        this.e = true;
        this.f = true;
    }

    public final void d(Object obj, MutableRect mutableRect) {
        float[] fArrB = b(obj);
        if (this.h) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.c(fArrB, mutableRect);
    }

    public final long e(long j, Object obj) {
        return !this.h ? androidx.compose.ui.graphics.Matrix.b(b(obj), j) : j;
    }

    public final void f(Object obj, MutableRect mutableRect) {
        float[] fArrA = a(obj);
        if (fArrA != null) {
            if (this.h) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.c(fArrA, mutableRect);
        } else {
            mutableRect.f1750a = BitmapDescriptorFactory.HUE_RED;
            mutableRect.b = BitmapDescriptorFactory.HUE_RED;
            mutableRect.c = BitmapDescriptorFactory.HUE_RED;
            mutableRect.d = BitmapDescriptorFactory.HUE_RED;
        }
    }

    public final long g(long j, Object obj) {
        float[] fArrA = a(obj);
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return !this.h ? androidx.compose.ui.graphics.Matrix.b(fArrA, j) : j;
    }

    public final void h() {
        this.e = false;
        this.f = false;
        this.h = true;
        this.g = true;
        androidx.compose.ui.graphics.Matrix.d(this.c);
        androidx.compose.ui.graphics.Matrix.d(this.d);
    }
}
