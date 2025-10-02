package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontScaleConverterFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f2207a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile SparseArrayCompat b = new SparseArrayCompat(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d((int) 115.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d((int) 130.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d((int) 150.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d((int) 180.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d((int) 200.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        InlineClassHelperKt.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static FontScaleConverter a(float f) {
        float fC;
        FontScaleConverter fontScaleConverterTable;
        float[] fArr = f2207a;
        if (f < 1.03f) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = b;
        int i = (int) (f * 100.0f);
        sparseArrayCompat.getClass();
        FontScaleConverter fontScaleConverter = (FontScaleConverter) SparseArrayCompatKt.b(sparseArrayCompat, i);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        SparseArrayCompat sparseArrayCompat2 = b;
        if (sparseArrayCompat2.d) {
            SparseArrayCompatKt.a(sparseArrayCompat2);
        }
        int iA = ContainerHelpersKt.a(sparseArrayCompat2.g, i, sparseArrayCompat2.e);
        if (iA >= 0) {
            return (FontScaleConverter) b.f(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            b(f, fontScaleConverterTable2);
            return fontScaleConverterTable2;
        }
        if (i3 < 0) {
            fontScaleConverterTable = new FontScaleConverterTable(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = b.c(i3) / 100.0f;
            fontScaleConverterTable = (FontScaleConverter) b.f(i3);
        }
        float fA = MathUtils.a(BitmapDescriptorFactory.HUE_RED, 1.0f, fC, b.c(i2) / 100.0f, f);
        FontScaleConverter fontScaleConverter2 = (FontScaleConverter) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = MathUtils.b(fontScaleConverterTable.b(f2), fontScaleConverter2.b(f2), fA);
        }
        FontScaleConverterTable fontScaleConverterTable3 = new FontScaleConverterTable(fArr, fArr2);
        b(f, fontScaleConverterTable3);
        return fontScaleConverterTable3;
    }

    public static void b(float f, FontScaleConverterTable fontScaleConverterTable) {
        synchronized (c) {
            SparseArrayCompat sparseArrayCompatClone = b.clone();
            sparseArrayCompatClone.d((int) (f * 100.0f), fontScaleConverterTable);
            b = sparseArrayCompatClone;
        }
    }
}
