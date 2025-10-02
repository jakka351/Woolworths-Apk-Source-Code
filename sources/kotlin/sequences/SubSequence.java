package kotlin.sequences;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/SubSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24666a;
    public final int b;
    public final int c;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public int e;

        public AnonymousClass1() {
            this.d = SubSequence.this.f24666a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            SubSequence subSequence;
            Iterator it;
            while (true) {
                int i = this.e;
                subSequence = SubSequence.this;
                int i2 = subSequence.b;
                it = this.d;
                if (i >= i2 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e++;
            }
            return this.e < subSequence.c && it.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            SubSequence subSequence;
            Iterator it;
            while (true) {
                int i = this.e;
                subSequence = SubSequence.this;
                int i2 = subSequence.b;
                it = this.d;
                if (i >= i2 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.e++;
            }
            int i3 = this.e;
            if (i3 >= subSequence.c) {
                throw new NoSuchElementException();
            }
            this.e = i3 + 1;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SubSequence(Sequence sequence, int i, int i2) {
        Intrinsics.h(sequence, "sequence");
        this.f24666a = sequence;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.d(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(b.i(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? EmptySequence.f24658a : new SubSequence(this.f24666a, i3 + i, i2);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final Sequence b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new SubSequence(this.f24666a, i3, i + i3);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
