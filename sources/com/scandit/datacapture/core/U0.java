package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.TorchListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U0 implements T0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet f18379a = new CopyOnWriteArraySet();
    private final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    @Override // com.scandit.datacapture.core.T0
    public final void a(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArraySet) {
            if (Intrinsics.c(((WeakReference) obj).get(), listener)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.remove((WeakReference) it.next());
        }
    }

    @Override // com.scandit.datacapture.core.T0
    public final void b(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        CopyOnWriteArraySet copyOnWriteArraySet = this.b;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((WeakReference) it.next()).get(), listener)) {
                    return;
                }
            }
        }
        this.b.add(new WeakReference(listener));
    }

    @Override // com.scandit.datacapture.core.T0
    public final void c(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.f18379a.add(listener);
    }

    @Override // com.scandit.datacapture.core.T0
    public final void d(TorchListener listener) {
        Intrinsics.h(listener, "listener");
        this.f18379a.remove(listener);
    }

    @Override // com.scandit.datacapture.core.T0
    public final Collection c() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.T0
    public final Collection a() {
        return this.f18379a;
    }
}
