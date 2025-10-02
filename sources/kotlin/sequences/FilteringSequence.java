package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/FilteringSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FilteringSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24659a;
    public final boolean b;
    public final Function1 c;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.FilteringSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public int e = -1;
        public Object f;

        public AnonymousClass1() {
            this.d = FilteringSequence.this.f24659a.iterator();
        }

        public final void a() {
            Object next;
            FilteringSequence filteringSequence;
            do {
                Iterator it = this.d;
                if (!it.hasNext()) {
                    this.e = 0;
                    return;
                } else {
                    next = it.next();
                    filteringSequence = FilteringSequence.this;
                }
            } while (((Boolean) filteringSequence.c.invoke(next)).booleanValue() != filteringSequence.b);
            this.f = next;
            this.e = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e == -1) {
                a();
            }
            return this.e == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.e == -1) {
                a();
            }
            if (this.e == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f;
            this.f = null;
            this.e = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FilteringSequence(Sequence sequence, boolean z, Function1 predicate) {
        Intrinsics.h(sequence, "sequence");
        Intrinsics.h(predicate, "predicate");
        this.f24659a = sequence;
        this.b = z;
        this.c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
