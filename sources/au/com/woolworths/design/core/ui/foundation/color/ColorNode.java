package au.com.woolworths.design.core.ui.foundation.color;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.InternalCoreDesignApi;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/color/ColorNode;", "", "Group", "Value", "Lau/com/woolworths/design/core/ui/foundation/color/ColorNode$Group;", "Lau/com/woolworths/design/core/ui/foundation/color/ColorNode$Value;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalCoreDesignApi
/* loaded from: classes3.dex */
public abstract class ColorNode {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/color/ColorNode$Group;", "Lau/com/woolworths/design/core/ui/foundation/color/ColorNode;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Group extends ColorNode {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/foundation/color/ColorNode$Value;", "Lau/com/woolworths/design/core/ui/foundation/color/ColorNode;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Value extends ColorNode {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && Color.c(0L, 0L);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return YU.a.h("Value(name=null, color=", Color.i(0L), ", comment=null)");
        }
    }
}
