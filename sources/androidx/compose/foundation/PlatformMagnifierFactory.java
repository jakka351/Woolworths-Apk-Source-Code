package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlatformMagnifierFactory {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static PlatformMagnifierFactory a() {
            SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.f839a;
            return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.f845a : PlatformMagnifierFactoryApi29Impl.f847a;
        }
    }

    PlatformMagnifier a(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3);

    boolean b();
}
