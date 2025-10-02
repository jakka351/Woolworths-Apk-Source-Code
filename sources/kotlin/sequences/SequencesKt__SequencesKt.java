package kotlin.sequences;

import com.woolworths.scanlibrary.domain.productsearch.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes.dex */
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static final FlatteningSequence a(Sequence sequence) {
        a aVar = new a(24);
        if (!(sequence instanceof TransformingSequence)) {
            return new FlatteningSequence(sequence, new a(25), aVar);
        }
        TransformingSequence transformingSequence = (TransformingSequence) sequence;
        return new FlatteningSequence(transformingSequence.f24670a, transformingSequence.b, aVar);
    }
}
