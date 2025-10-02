package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class SharedValues {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f2377a;

    public interface SharedValuesListener {
    }

    public final void a(int i, SharedValuesListener sharedValuesListener) {
        HashMap map = this.f2377a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(sharedValuesListener));
    }
}
