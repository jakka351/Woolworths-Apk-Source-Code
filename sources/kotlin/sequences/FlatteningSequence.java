package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "E", "Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24660a;
    public final Function1 b;
    public final Function1 c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/sequences/FlatteningSequence$State;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public Iterator e;
        public int f;

        public AnonymousClass1() {
            this.d = FlatteningSequence.this.f24660a.iterator();
        }

        public final boolean a() {
            Iterator it;
            Iterator it2 = this.e;
            if (it2 != null && it2.hasNext()) {
                this.f = 1;
                return true;
            }
            do {
                Iterator it3 = this.d;
                if (!it3.hasNext()) {
                    this.f = 2;
                    this.e = null;
                    return false;
                }
                Object next = it3.next();
                FlatteningSequence flatteningSequence = FlatteningSequence.this;
                it = (Iterator) flatteningSequence.c.invoke(flatteningSequence.b.invoke(next));
            } while (!it.hasNext());
            this.e = it;
            this.f = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.f;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f = 0;
            Iterator it = this.e;
            Intrinsics.e(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FlatteningSequence(Sequence sequence, Function1 transformer, Function1 function1) {
        Intrinsics.h(sequence, "sequence");
        Intrinsics.h(transformer, "transformer");
        this.f24660a = sequence;
        this.b = transformer;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
