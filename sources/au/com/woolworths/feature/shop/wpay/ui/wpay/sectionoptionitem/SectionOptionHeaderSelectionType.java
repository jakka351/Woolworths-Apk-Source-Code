package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType;", "", "Radio", "CheckBox", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType$CheckBox;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType$Radio;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionOptionHeaderSelectionType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType$CheckBox;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckBox implements SectionOptionHeaderSelectionType {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8395a;
        public final Function1 b;

        public CheckBox(Function1 onCheckedChange, boolean z) {
            Intrinsics.h(onCheckedChange, "onCheckedChange");
            this.f8395a = z;
            this.b = onCheckedChange;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckBox)) {
                return false;
            }
            CheckBox checkBox = (CheckBox) obj;
            return this.f8395a == checkBox.f8395a && Intrinsics.c(this.b, checkBox.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f8395a) * 31);
        }

        public final String toString() {
            return "CheckBox(checked=" + this.f8395a + ", onCheckedChange=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType$Radio;", "Lau/com/woolworths/feature/shop/wpay/ui/wpay/sectionoptionitem/SectionOptionHeaderSelectionType;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Radio implements SectionOptionHeaderSelectionType {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8396a;
        public final boolean b;
        public final Function0 c;

        public Radio(boolean z, boolean z2, Function0 onClick) {
            Intrinsics.h(onClick, "onClick");
            this.f8396a = z;
            this.b = z2;
            this.c = onClick;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Radio)) {
                return false;
            }
            Radio radio = (Radio) obj;
            return this.f8396a == radio.f8396a && this.b == radio.b && Intrinsics.c(this.c, radio.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + androidx.camera.core.impl.b.e(Boolean.hashCode(this.f8396a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("Radio(selected=", ", active=", ", onClick=", this.f8396a, this.b);
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
