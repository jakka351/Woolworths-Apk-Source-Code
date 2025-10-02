package au.com.woolworths.design.core.ui.component.experimental.chip.spec;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ToggleChipSpec;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ChipSpec;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleChipSpec extends ChipSpec {

    /* renamed from: a, reason: collision with root package name */
    public final ChipSelectionType f4719a;
    public final ChipVariant b;

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
        }
    }

    public ToggleChipSpec(ChipSelectionType chipSelectionType, ChipVariant chipVariant) {
        this.f4719a = chipSelectionType;
        this.b = chipVariant;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    public final boolean b() {
        return true;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    /* renamed from: c, reason: from getter */
    public final ChipSelectionType getF4719a() {
        return this.f4719a;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    /* renamed from: d, reason: from getter */
    public final ChipVariant getB() {
        return this.b;
    }
}
