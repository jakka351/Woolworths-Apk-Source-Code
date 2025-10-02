package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SelectionRegistrar {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    void a(long j);

    void b(Selectable selectable);

    void c();

    boolean d(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment selectionAdjustment, boolean z);

    long e();

    LongObjectMap f();

    void g(long j);

    Selectable h(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate);

    void i(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z);
}
