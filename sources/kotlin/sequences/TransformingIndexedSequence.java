package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24669a;
    public final Function2 b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.TransformingIndexedSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public int e;

        public AnonymousClass1() {
            this.d = TransformingIndexedSequence.this.f24669a.getF24664a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Function2 function2 = TransformingIndexedSequence.this.b;
            int i = this.e;
            this.e = i + 1;
            if (i >= 0) {
                return function2.invoke(Integer.valueOf(i), this.d.next());
            }
            CollectionsKt.z0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TransformingIndexedSequence(Sequence sequence, Function2 function2) {
        this.f24669a = sequence;
        this.b = function2;
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public final Iterator getF24664a() {
        return new AnonymousClass1();
    }
}
