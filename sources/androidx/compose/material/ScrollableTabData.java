package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ScrollableTabData {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollState f1320a;
    public final CoroutineScope b;
    public Integer c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        this.f1320a = scrollState;
        this.b = coroutineScope;
    }
}
