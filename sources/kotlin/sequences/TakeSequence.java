package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/TakeSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24667a;
    public final int b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.TakeSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public int d;
        public final Iterator e;

        public AnonymousClass1(TakeSequence takeSequence) {
            this.d = takeSequence.b;
            this.e = takeSequence.f24667a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d > 0 && this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.d;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.d = i - 1;
            return this.e.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TakeSequence(Sequence sequence, int i) {
        this.f24667a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + JwtParser.SEPARATOR_CHAR).toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i) {
        int i2 = this.b;
        return i >= i2 ? EmptySequence.f24658a : new SubSequence(this.f24667a, i, i2);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i) {
        return i >= this.b ? this : new TakeSequence(this.f24667a, i);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }
}
