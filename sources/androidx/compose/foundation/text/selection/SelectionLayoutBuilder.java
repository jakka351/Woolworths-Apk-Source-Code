package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionLayoutBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final long f1212a;
    public final long b;
    public final LayoutCoordinates c;
    public final boolean d;
    public final Selection e;
    public final SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1 f;
    public final MutableLongIntMap g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Direction direction = Direction.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Direction direction2 = Direction.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SelectionLayoutBuilder(long j, long j2, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, SelectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1 selectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1) {
        this.f1212a = j;
        this.b = j2;
        this.c = layoutCoordinates;
        this.d = z;
        this.e = selection;
        this.f = selectionManager$getSelectionLayoutWko1d7g$$inlined$compareBy$1;
        int i = LongIntMapKt.f683a;
        this.g = new MutableLongIntMap(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, Direction direction, Direction direction2) {
        if (i == -1) {
            int iOrdinal = SelectionLayoutKt.b(direction, direction2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i;
    }
}
