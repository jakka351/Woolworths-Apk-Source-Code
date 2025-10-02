package au.com.woolworths.design.core.ui.component.experimental.chip.spec;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ChipSpec;", "", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/AssistChipSpec;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/InputChipSpec;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/MenuChipSpec;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ToggleChipSpec;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalCoreDesignApi
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class ChipSpec {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ChipSelectionType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChipSelectionType chipSelectionType = ChipSelectionType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ChipVariant.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChipVariant chipVariant = ChipVariant.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final BorderStroke a(boolean z, Composer composer) {
        BorderStroke borderStrokeA;
        composer.o(193683521);
        if (z || d() != ChipVariant.d) {
            borderStrokeA = null;
        } else {
            borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composer).e.b.e, 1);
        }
        composer.l();
        return borderStrokeA;
    }

    public abstract boolean b();

    public abstract ChipSelectionType c();

    public abstract ChipVariant d();

    public final long e(boolean z, Composer composer) {
        long j;
        composer.o(50840308);
        int iOrdinal = d().ordinal();
        if (iOrdinal == 0) {
            composer.o(-1539607017);
            int iOrdinal2 = c().ordinal();
            if (iOrdinal2 == 0) {
                composer.o(1612923937);
                if (b()) {
                    composer.o(-1538961566);
                    if (z) {
                        composer.o(-1538930938);
                        j = CoreTheme.b(composer).c.d.b.f4835a.f4836a;
                        composer.l();
                    } else {
                        composer.o(-1538821818);
                        j = CoreTheme.b(composer).c.d.f4831a.b.f4834a;
                        composer.l();
                    }
                    composer.l();
                } else {
                    composer.o(-1538689696);
                    if (z) {
                        composer.o(-1538659099);
                        j = CoreTheme.b(composer).c.d.b.f4835a.b;
                        composer.l();
                    } else {
                        composer.o(-1538548987);
                        j = CoreTheme.b(composer).c.d.f4831a.b.b;
                        composer.l();
                    }
                    composer.l();
                }
                composer.l();
            } else {
                if (iOrdinal2 != 1) {
                    throw a.x(composer, 1612903243);
                }
                composer.o(1612904765);
                if (b()) {
                    composer.o(-1539555836);
                    if (z) {
                        composer.o(-1539525208);
                        j = CoreTheme.b(composer).c.d.f4831a.f4832a.f4833a;
                        composer.l();
                    } else {
                        composer.o(-1539418010);
                        j = CoreTheme.b(composer).c.d.f4831a.b.f4834a;
                        composer.l();
                    }
                    composer.l();
                } else {
                    composer.o(-1539285950);
                    if (z) {
                        composer.o(-1539255353);
                        j = CoreTheme.b(composer).c.d.f4831a.f4832a.b;
                        composer.l();
                    } else {
                        composer.o(-1539147163);
                        j = CoreTheme.b(composer).c.d.f4831a.b.b;
                        composer.l();
                    }
                    composer.l();
                }
                composer.l();
            }
            composer.l();
        } else {
            if (iOrdinal != 1) {
                throw a.x(composer, 1612902927);
            }
            composer.o(-1538338993);
            int iOrdinal3 = c().ordinal();
            if (iOrdinal3 == 0) {
                composer.o(1612964965);
                if (b()) {
                    composer.o(-1537689760);
                    if (z) {
                        composer.o(-1537659194);
                        j = CoreTheme.b(composer).c.d.b.f4835a.f4836a;
                        composer.l();
                    } else {
                        composer.o(-1537550012);
                        j = CoreTheme.b(composer).c.d.b.b.f4837a;
                        composer.l();
                    }
                    composer.l();
                } else {
                    composer.o(-1537415906);
                    if (z) {
                        composer.o(-1537385371);
                        j = CoreTheme.b(composer).c.d.b.f4835a.b;
                        composer.l();
                    } else {
                        composer.o(-1537275197);
                        j = CoreTheme.b(composer).c.d.b.b.b;
                        composer.l();
                    }
                    composer.l();
                }
                composer.l();
            } else {
                if (iOrdinal3 != 1) {
                    throw a.x(composer, 1612944147);
                }
                composer.o(1612945665);
                if (b()) {
                    composer.o(-1538287998);
                    if (z) {
                        composer.o(-1538257432);
                        j = CoreTheme.b(composer).c.d.f4831a.f4832a.f4833a;
                        composer.l();
                    } else {
                        composer.o(-1538150172);
                        j = CoreTheme.b(composer).c.d.b.b.f4837a;
                        composer.l();
                    }
                    composer.l();
                } else {
                    composer.o(-1538016128);
                    if (z) {
                        composer.o(-1537985593);
                        j = CoreTheme.b(composer).c.d.f4831a.f4832a.b;
                        composer.l();
                    } else {
                        composer.o(-1537877341);
                        j = CoreTheme.b(composer).c.d.b.b.b;
                        composer.l();
                    }
                    composer.l();
                }
                composer.l();
            }
            composer.l();
        }
        composer.l();
        return j;
    }
}
