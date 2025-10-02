package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DarkThemeKt {
    public static final boolean a(Composer composer) {
        return (((Configuration) composer.x(AndroidCompositionLocals_androidKt.f1950a)).uiMode & 48) == 32;
    }
}
