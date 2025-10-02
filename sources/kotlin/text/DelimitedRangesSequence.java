package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24672a;
    public final int b;
    public final Function2 c;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<IntRange>, KMappedMarker {
        public int d = -1;
        public int e;
        public int f;
        public IntRange g;
        public int h;

        public AnonymousClass1() {
            int iC = RangesKt.c(0, 0, DelimitedRangesSequence.this.f24672a.length());
            this.e = iC;
            this.f = iC;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.d = r1
                r0 = 0
                r7.g = r0
                return
            Lb:
                kotlin.text.DelimitedRangesSequence r2 = kotlin.text.DelimitedRangesSequence.this
                int r3 = r2.b
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.h
                int r6 = r6 + r5
                r7.h = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r3 = r2.f24672a
                int r3 = r3.length()
                if (r0 <= r3) goto L34
            L22:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r7.e
                java.lang.CharSequence r2 = r2.f24672a
                int r2 = kotlin.text.StringsKt.A(r2)
                r0.<init>(r1, r2, r5)
                r7.g = r0
                r7.f = r4
                goto L79
            L34:
                kotlin.jvm.functions.Function2 r0 = r2.c
                java.lang.CharSequence r3 = r2.f24672a
                int r6 = r7.f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L58
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r7.e
                java.lang.CharSequence r2 = r2.f24672a
                int r2 = kotlin.text.StringsKt.A(r2)
                r0.<init>(r1, r2, r5)
                r7.g = r0
                r7.f = r4
                goto L79
            L58:
                java.lang.Object r2 = r0.d
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.e
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.e
                kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.o(r3, r2)
                r7.g = r3
                int r2 = r2 + r0
                r7.e = r2
                if (r0 != 0) goto L76
                r1 = r5
            L76:
                int r2 = r2 + r1
                r7.f = r2
            L79:
                r7.d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.AnonymousClass1.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.d == -1) {
                a();
            }
            return this.d == 1;
        }

        @Override // java.util.Iterator
        public final IntRange next() {
            if (this.d == -1) {
                a();
            }
            if (this.d == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.g;
            Intrinsics.f(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.g = null;
            this.d = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DelimitedRangesSequence(CharSequence input, int i, Function2 function2) {
        Intrinsics.h(input, "input");
        this.f24672a = input;
        this.b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public final Iterator getF24664a() {
        return new AnonymousClass1();
    }
}
