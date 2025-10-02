package au.com.woolworths.design.core.ui.component.experimental.chip.spec;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@ExperimentalCoreDesignApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/AssistChipSpec;", "Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ChipSpec;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AssistChipSpec extends ChipSpec {

    /* renamed from: a, reason: collision with root package name */
    public final ChipVariant f4718a;
    public final ChipSelectionType b;
    public final boolean c;

    public AssistChipSpec(ChipVariant variant) {
        Intrinsics.h(variant, "variant");
        this.f4718a = variant;
        this.b = ChipSelectionType.e;
        this.c = true;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    /* renamed from: b, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    /* renamed from: c, reason: from getter */
    public final ChipSelectionType getB() {
        return this.b;
    }

    @Override // au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec
    /* renamed from: d, reason: from getter */
    public final ChipVariant getF4718a() {
        return this.f4718a;
    }
}
