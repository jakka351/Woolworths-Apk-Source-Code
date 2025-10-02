package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "Empty", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutKeyIndexMap {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap$Empty;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Empty implements LazyLayoutKeyIndexMap {
        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public final int c(Object obj) {
            return -1;
        }
    }

    int c(Object obj);
}
