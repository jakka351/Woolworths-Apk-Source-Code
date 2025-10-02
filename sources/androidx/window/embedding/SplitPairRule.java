package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplitPairRule extends SplitRule {
    @Override // androidx.window.embedding.SplitRule
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SplitPairRule) && super.equals(obj);
    }

    @Override // androidx.window.embedding.SplitRule
    public final int hashCode() {
        super.hashCode();
        throw null;
    }
}
