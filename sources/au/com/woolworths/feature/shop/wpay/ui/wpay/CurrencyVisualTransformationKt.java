package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CurrencyVisualTransformationKt {
    public static final VisualTransformation a(Composer composer) {
        composer.o(1230379819);
        boolean zBooleanValue = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue();
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = zBooleanValue ? VisualTransformation.Companion.f2133a : new CurrencyVisualTransformation();
            composer.A(objG);
        }
        VisualTransformation visualTransformation = (VisualTransformation) objG;
        composer.l();
        composer.l();
        return visualTransformation;
    }
}
