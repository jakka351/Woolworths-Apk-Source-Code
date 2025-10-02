package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TypefaceRequestCache {

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedObject f2107a = new SynchronizedObject();
    public final LruCache b = new LruCache(16);
}
