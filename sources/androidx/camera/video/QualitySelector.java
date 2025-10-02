package androidx.camera.video;

import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class QualitySelector {

    /* renamed from: a, reason: collision with root package name */
    public final List f588a;
    public final FallbackStrategy b;

    public QualitySelector(List list, FallbackStrategy fallbackStrategy) {
        Preconditions.a("No preferred quality and fallback strategy.", (list.isEmpty() && fallbackStrategy == FallbackStrategy.f585a) ? false : true);
        this.f588a = Collections.unmodifiableList(new ArrayList(list));
        this.b = fallbackStrategy;
    }

    public static QualitySelector a(List list, FallbackStrategy fallbackStrategy) {
        Preconditions.e(list, "qualities cannot be null");
        Preconditions.a("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Quality quality = (Quality) it.next();
            Preconditions.a("qualities contain invalid quality: " + quality, Quality.h.contains(quality));
        }
        return new QualitySelector(list, fallbackStrategy);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f588a + ", fallbackStrategy=" + this.b + "}";
    }
}
