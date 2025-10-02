package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WeakCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f1987a = new MutableVector(new Reference[16], 0);
    public final ReferenceQueue b = new ReferenceQueue();
}
