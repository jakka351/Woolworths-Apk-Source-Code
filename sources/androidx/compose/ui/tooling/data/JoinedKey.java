package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/data/JoinedKey;", "", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class JoinedKey {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof JoinedKey);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "JoinedKey(left=null, right=null)";
    }
}
