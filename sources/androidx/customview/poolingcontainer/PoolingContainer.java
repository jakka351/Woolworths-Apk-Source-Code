package androidx.customview.poolingcontainer;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.k;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class PoolingContainer {
    public static final void a(AbstractComposeView abstractComposeView, k kVar) {
        d(abstractComposeView).f2543a.add(kVar);
    }

    public static final void b(View view) {
        Intrinsics.h(view, "<this>");
        Iterator it = ViewKt.a(view).getF24664a();
        while (it.hasNext()) {
            ArrayList arrayList = d((View) it.next()).f2543a;
            for (int I = CollectionsKt.I(arrayList); -1 < I; I--) {
                ((PoolingContainerListener) arrayList.get(I)).a();
            }
        }
    }

    public static final void c(RecyclerView recyclerView) {
        Iterator it = ViewGroupKt.a(recyclerView).getF24664a();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            }
            ArrayList arrayList = d((View) viewGroupKt$iterator$1.next()).f2543a;
            for (int I = CollectionsKt.I(arrayList); -1 < I; I--) {
                ((PoolingContainerListener) arrayList.get(I)).a();
            }
        }
    }

    public static final PoolingContainerListenerHolder d(View view) {
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(com.woolworths.R.id.pooling_container_listener_holder_tag);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(com.woolworths.R.id.pooling_container_listener_holder_tag, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final void e(View view, k kVar) {
        d(view).f2543a.remove(kVar);
    }
}
