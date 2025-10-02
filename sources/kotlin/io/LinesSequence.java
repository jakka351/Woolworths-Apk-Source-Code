package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LinesSequence implements Sequence<String> {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f24263a;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.io.LinesSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<String>, KMappedMarker {
        public String d;
        public boolean e;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.d == null && !this.e) {
                String line = LinesSequence.this.f24263a.readLine();
                this.d = line;
                if (line == null) {
                    this.e = true;
                }
            }
            return this.d != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.d;
            this.d = null;
            Intrinsics.e(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public LinesSequence(BufferedReader bufferedReader) {
        this.f24263a = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new AnonymousClass1();
    }
}
