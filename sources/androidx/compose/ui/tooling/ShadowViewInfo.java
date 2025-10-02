package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/ShadowViewInfo;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ShadowViewInfo {

    /* renamed from: a, reason: collision with root package name */
    public ShadowViewInfo f2168a;
    public final ViewInfo b;
    public final ArrayList c;
    public final SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 d;

    public ShadowViewInfo(ShadowViewInfo shadowViewInfo, ViewInfo viewInfo) {
        this.f2168a = shadowViewInfo;
        this.b = viewInfo;
        ArrayList arrayList = viewInfo.e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ShadowViewInfo(this, (ViewInfo) it.next()));
        }
        this.c = CollectionsKt.J0(arrayList2);
        this.d = new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new ShadowViewInfo$allNodes$1(this, null));
    }

    public final ShadowViewInfo a() {
        ShadowViewInfo shadowViewInfo = this.f2168a;
        if (shadowViewInfo == null) {
            return this;
        }
        Intrinsics.e(shadowViewInfo);
        return shadowViewInfo.a();
    }

    public final ViewInfo b() {
        ViewInfo viewInfo = this.b;
        String str = viewInfo.f2170a;
        int i = viewInfo.b;
        IntRect intRect = viewInfo.c;
        SourceLocation sourceLocation = viewInfo.d;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ShadowViewInfo) it.next()).b());
        }
        return new ViewInfo(str, i, intRect, sourceLocation, arrayList2, viewInfo.f);
    }
}
