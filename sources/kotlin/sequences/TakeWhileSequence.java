package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f24668a;
    public final Function1 b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.TakeWhileSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public final Iterator d;
        public int e = -1;
        public Object f;

        public AnonymousClass1() {
            this.d = TakeWhileSequence.this.f24668a.iterator();
        }

        public final void a() {
            Iterator it = this.d;
            if (it.hasNext()) {
                Object next = it.next();
                if (((Boolean) TakeWhileSequence.this.b.invoke(next)).booleanValue()) {
                    this.e = 1;
                    this.f = next;
                    return;
                }
            }
            this.e = 0;
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

    public TakeWhileSequence(Sequence sequence, Function1 function1) {
        Intrinsics.h(sequence, "sequence");
        this.f24668a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
