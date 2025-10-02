package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CalendarLocale_androidKt {
    public static final Locale a(Composer composer) {
        composer.o(-1190822718);
        Locale locale = ((Configuration) composer.x(AndroidCompositionLocals_androidKt.f1950a)).getLocales().get(0);
        composer.l();
        return locale;
    }
}
