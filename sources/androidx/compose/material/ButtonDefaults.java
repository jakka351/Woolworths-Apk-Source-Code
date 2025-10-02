package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ButtonDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f1248a;
    public static final float b = 64;
    public static final float c = 36;
    public static final PaddingValuesImpl d;

    static {
        float f = 16;
        float f2 = 8;
        f1248a = new PaddingValuesImpl(f, f2, f, f2);
        d = new PaddingValuesImpl(f2, f2, f2, f2);
    }

    public static ButtonColors a(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = MaterialTheme.a(composer).e();
        }
        if ((i2 & 2) != 0) {
            j2 = ColorsKt.b(j, composer);
        }
        if ((i2 & 4) != 0) {
            j3 = ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.12f), MaterialTheme.a(composer).g());
        }
        if ((i2 & 8) != 0) {
            j4 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer));
        }
        return new DefaultButtonColors(j, j2, j3, j4);
    }

    public static ButtonElevation b(float f, int i, int i2, Composer composer) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            f = 2;
        }
        float f2 = f;
        float f3 = 8;
        float f4 = 0;
        float f5 = 4;
        float f6 = 4;
        if ((((i & 14) ^ 6) <= 4 || !composer.q(f2)) && (i & 6) != 4) {
            z = false;
        }
        boolean zQ = composer.q(f3) | z | composer.q(f4) | composer.q(f5) | composer.q(f6);
        Object objG = composer.G();
        if (zQ || objG == Composer.Companion.f1624a) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f2, f3, f4, f5, f6);
            composer.A(defaultButtonElevation);
            objG = defaultButtonElevation;
        }
        return (DefaultButtonElevation) objG;
    }

    public static ButtonColors c(long j, long j2, long j3, Composer composer, int i) {
        if ((i & 1) != 0) {
            j = MaterialTheme.a(composer).g();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = MaterialTheme.a(composer).e();
        }
        return new DefaultButtonColors(j4, j2, j4, (i & 4) != 0 ? Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer)) : j3);
    }

    public static ButtonColors d(long j, long j2, long j3, Composer composer, int i) {
        if ((i & 1) != 0) {
            j = Color.j;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = MaterialTheme.a(composer).e();
        }
        return new DefaultButtonColors(j4, j2, j4, (i & 4) != 0 ? Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer)) : j3);
    }
}
