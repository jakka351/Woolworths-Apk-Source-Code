package kotlin.sequences;

import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24662a;
    public final Sequence b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public final Iterator e;

        public AnonymousClass1(MergingSequence mergingSequence) {
            this.d = mergingSequence.f24662a.iterator();
            this.e = mergingSequence.b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext() && this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return new Pair(this.d.next(), this.e.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public MergingSequence(Sequence sequence, Sequence sequence2, b bVar) {
        this.f24662a = sequence;
        this.b = sequence2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }
}
