package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CheckboxDefaults {
    public static CheckboxColors a(long j, long j2, Composer composer, int i, int i2) {
        long jF = (i2 & 1) != 0 ? MaterialTheme.a(composer).f() : j;
        long jB = (i2 & 2) != 0 ? Color.b(MaterialTheme.a(composer).d(), 0.6f) : j2;
        long jG = MaterialTheme.a(composer).g();
        long jB2 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer));
        long jB3 = Color.b(jF, ContentAlpha.a(0.38f, 0.38f, composer));
        boolean zS = composer.s(jF) | composer.s(jB) | composer.s(jG) | composer.s(jB2) | composer.s(jB3);
        Object objG = composer.G();
        if (zS || objG == Composer.Companion.f1624a) {
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(jG, Color.b(jG, BitmapDescriptorFactory.HUE_RED), jF, Color.b(jF, BitmapDescriptorFactory.HUE_RED), jB2, Color.b(jB2, BitmapDescriptorFactory.HUE_RED), jB3, jF, jB, jB2, jB3);
            composer.A(defaultCheckboxColors);
            objG = defaultCheckboxColors;
        }
        return (DefaultCheckboxColors) objG;
    }
}
