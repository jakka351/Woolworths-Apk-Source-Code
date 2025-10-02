package ovh.plrapps.mapcompose.ui.state;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.core.Tile;
import ovh.plrapps.mapcompose.core.VisibleTiles;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TileCanvasState$renderTiles$$inlined$sortedBy$1<T> implements Comparator {
    public final /* synthetic */ VisibleTiles d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public TileCanvasState$renderTiles$$inlined$sortedBy$1(VisibleTiles visibleTiles, ArrayList arrayList, ArrayList arrayList2) {
        this.d = visibleTiles;
        this.e = arrayList;
        this.f = arrayList2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Tile tile = (Tile) obj;
        int i = tile.f26935a;
        VisibleTiles visibleTiles = this.d;
        int i2 = visibleTiles.f26939a;
        int i3 = visibleTiles.d;
        int i4 = 0;
        int i5 = (i == i2 && tile.d == i3) ? 100 : 0;
        List list = tile.e;
        ArrayList arrayList = this.e;
        boolean zEquals = arrayList.equals(list);
        ArrayList arrayList2 = this.f;
        Integer numValueOf = Integer.valueOf(i5 + ((zEquals && arrayList2.equals(tile.f)) ? 1 : 0));
        Tile tile2 = (Tile) obj2;
        int i6 = (tile2.f26935a == visibleTiles.f26939a && tile2.d == i3) ? 100 : 0;
        if (arrayList.equals(tile2.e) && arrayList2.equals(tile2.f)) {
            i4 = 1;
        }
        return ComparisonsKt.a(numValueOf, Integer.valueOf(i6 + i4));
    }
}
