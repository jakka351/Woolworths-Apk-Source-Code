package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f24661a;
    public final Function1 b;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        public Object d;
        public int e = -2;

        public AnonymousClass1() {
        }

        public final void a() {
            Object objInvoke;
            int i = this.e;
            GeneratorSequence generatorSequence = GeneratorSequence.this;
            if (i == -2) {
                objInvoke = generatorSequence.f24661a.invoke();
            } else {
                Function1 function1 = generatorSequence.b;
                Object obj = this.d;
                Intrinsics.e(obj);
                objInvoke = function1.invoke(obj);
            }
            this.d = objInvoke;
            this.e = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.e < 0) {
                a();
            }
            return this.e == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.e < 0) {
                a();
            }
            if (this.e == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.d;
            Intrinsics.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.e = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public GeneratorSequence(Function0 function0, Function1 function1) {
        this.f24661a = function0;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
