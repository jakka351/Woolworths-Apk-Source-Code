package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Node", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IntervalTree<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Node f1771a = new Node(1);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Node extends Interval<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Node f1772a;
        public final Node b;
        public final Node c;

        public Node(int i) {
            Node node = IntervalTree.this.f1771a;
            this.f1772a = node;
            this.b = node;
            this.c = node;
        }
    }

    public IntervalTree() {
        new ArrayList();
    }
}
