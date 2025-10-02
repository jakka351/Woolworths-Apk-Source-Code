package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    public final SafeIterableMap l;

    public static class Source<V> implements Observer<V> {
        public final LiveData d;
        public final Observer e;
        public int f = -1;

        public Source(LiveData liveData, Observer observer) {
            this.d = liveData;
            this.e = observer;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = this.f;
            int i2 = this.d.g;
            if (i != i2) {
                this.f = i2;
                this.e.onChanged(obj);
            }
        }
    }

    public MediatorLiveData(Object obj) {
        super(obj);
        this.l = new SafeIterableMap();
    }

    @Override // androidx.lifecycle.LiveData
    public void h() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            Source source = (Source) ((Map.Entry) it.next()).getValue();
            source.d.g(source);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void i() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            Source source = (Source) ((Map.Entry) it.next()).getValue();
            source.d.k(source);
        }
    }

    public void n(LiveData liveData, Observer observer) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        Source source = new Source(liveData, observer);
        Source source2 = (Source) this.l.d(liveData, source);
        if (source2 != null && source2.e != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (source2 == null && this.c > 0) {
            liveData.g(source);
        }
    }

    public final void o(LiveData liveData) {
        Source source = (Source) this.l.g(liveData);
        if (source != null) {
            source.d.k(source);
        }
    }

    public MediatorLiveData() {
        this.l = new SafeIterableMap();
    }
}
