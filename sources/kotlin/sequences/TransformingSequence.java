package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/TransformingSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24670a;
    public final Function1 b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.TransformingSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;

        public AnonymousClass1() {
            this.d = TransformingSequence.this.f24670a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return TransformingSequence.this.b.invoke(this.d.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TransformingSequence(Sequence sequence, Function1 transformer) {
        Intrinsics.h(sequence, "sequence");
        Intrinsics.h(transformer, "transformer");
        this.f24670a = sequence;
        this.b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
