package androidx.compose.ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f2062a;
    public CacheTextLayoutInput b;
    public TextLayoutResult c;

    public TextLayoutCache(int i) {
        this.f2062a = i != 1 ? new LruCache(i) : null;
    }
}
