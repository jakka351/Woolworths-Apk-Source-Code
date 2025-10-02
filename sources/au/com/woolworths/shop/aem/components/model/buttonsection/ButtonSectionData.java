package au.com.woolworths.shop.aem.components.model.buttonsection;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/buttonsection/ButtonSectionData;", "", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonSectionData {

    /* renamed from: a, reason: collision with root package name */
    public final CoreButtonModel f10146a;

    public ButtonSectionData(CoreButtonModel coreButtonModel) {
        this.f10146a = coreButtonModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ButtonSectionData) && Intrinsics.c(this.f10146a, ((ButtonSectionData) obj).f10146a);
    }

    public final int hashCode() {
        return this.f10146a.hashCode();
    }

    public final String toString() {
        return "ButtonSectionData(coreButton=" + this.f10146a + ")";
    }
}
