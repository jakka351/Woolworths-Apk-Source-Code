package kotlin.sequences;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
    public int d;
    public Object e;
    public Iterator f;
    public Continuation g;

    @Override // kotlin.sequences.SequenceScope
    public final void a(Object obj, Continuation frame) {
        this.e = obj;
        this.d = 3;
        this.g = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Intrinsics.h(frame, "frame");
    }

    @Override // kotlin.sequences.SequenceScope
    public final Object b(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return Unit.f24250a;
        }
        this.f = it;
        this.d = 2;
        this.g = restrictedSuspendLambda;
        return CoroutineSingletons.d;
    }

    public final RuntimeException c() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    public final void d(Continuation continuation) {
        this.g = continuation;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext getF() {
        return EmptyCoroutineContext.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f;
                Intrinsics.e(it);
                if (it.hasNext()) {
                    this.d = 2;
                    return true;
                }
                this.f = null;
            }
            this.d = 5;
            Continuation continuation = this.g;
            Intrinsics.e(continuation);
            this.g = null;
            continuation.resumeWith(Unit.f24250a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.d = 1;
            Iterator it = this.f;
            Intrinsics.e(it);
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        ResultKt.b(obj);
        this.d = 4;
    }
}
