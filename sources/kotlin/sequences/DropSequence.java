package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import io.jsonwebtoken.JwtParser;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/DropSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24657a;
    public final int b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.DropSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public int e;

        public AnonymousClass1(DropSequence dropSequence) {
            this.d = dropSequence.f24657a.iterator();
            this.e = dropSequence.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                int i = this.e;
                it = this.d;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Iterator it;
            while (true) {
                int i = this.e;
                it = this.d;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DropSequence(Sequence sequence, int i) {
        Intrinsics.h(sequence, "sequence");
        this.f24657a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + JwtParser.SEPARATOR_CHAR).toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new DropSequence(this, i) : new DropSequence(this.f24657a, i2);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new TakeSequence(this, i) : new SubSequence(this.f24657a, i2, i3);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }
}
