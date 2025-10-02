package au.com.woolworths.design.core.ui.foundation.typography;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode;", "", "Group", "Value", "Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode$Group;", "Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode$Value;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public abstract class TypographyNode {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode$Group;", "Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Group extends TypographyNode {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Group);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Group(name=null, nodes=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode$Value;", "Lau/com/woolworths/design/core/ui/foundation/typography/TypographyNode;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Value extends TypographyNode {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Value);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Value(name=null, textStyle=null)";
        }
    }
}
