package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StickyItemsPlacement {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final StickyItemsPlacement$Companion$StickToTopPlacement$1 f1065a = new StickyItemsPlacement$Companion$StickToTopPlacement$1();
    }

    int a(ArrayList arrayList, int i, int i2, int i3, int i4);

    MutableIntList b(int i, int i2, IntList intList);
}
