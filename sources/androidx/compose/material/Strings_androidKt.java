package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Strings_androidKt {
    public static final String a(Composer composer, int i) {
        composer.x(AndroidCompositionLocals_androidKt.f1950a);
        Resources resources = ((Context) composer.x(AndroidCompositionLocals_androidKt.b)).getResources();
        return i == 0 ? resources.getString(com.woolworths.R.string.navigation_menu) : i == 1 ? resources.getString(com.woolworths.R.string.close_drawer) : i == 2 ? resources.getString(com.woolworths.R.string.close_sheet) : i == 3 ? resources.getString(com.woolworths.R.string.default_error_message) : i == 4 ? resources.getString(com.woolworths.R.string.dropdown_menu) : i == 5 ? resources.getString(com.woolworths.R.string.range_start) : i == 6 ? resources.getString(com.woolworths.R.string.range_end) : i == 7 ? resources.getString(com.woolworths.R.string.mc2_snackbar_pane_title) : "";
    }
}
