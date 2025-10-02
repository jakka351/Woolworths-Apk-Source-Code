package androidx.media3.common.util;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@UnstableApi
/* loaded from: classes2.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    public final Object d = new Object();
    public final HashMap e = new HashMap();
    public Set f = Collections.EMPTY_SET;
    public List g = Collections.EMPTY_LIST;

    public final int b(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int iIntValue;
        synchronized (this.d) {
            try {
                iIntValue = this.e.containsKey(eventDispatcher) ? ((Integer) this.e.get(eventDispatcher)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator<E> it;
        synchronized (this.d) {
            it = this.g.iterator();
        }
        return it;
    }
}
