package kotlin.sequences;

import YU.a;
import androidx.lifecycle.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt;

@Metadata(d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class SequencesKt extends SequencesKt___SequencesKt {
    public static Sequence b(final Iterator it) {
        Intrinsics.h(it, "<this>");
        return new ConstrainedOnceSequence(new Sequence<Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator, reason: from getter */
            public final Iterator getF24664a() {
                return it;
            }
        });
    }

    public static boolean c(Sequence sequence, Object obj) {
        Iterator it = sequence.getF24664a();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            if (Intrinsics.c(obj, next)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static int d(Sequence sequence) {
        Intrinsics.h(sequence, "<this>");
        Iterator it = sequence.getF24664a();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt.y0();
                throw null;
            }
        }
        return i;
    }

    public static Sequence e(Sequence sequence, int i) {
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).a(i) : new DropSequence(sequence, i);
        }
        throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
    }

    public static FilteringSequence g(Sequence sequence, Function1 predicate) {
        Intrinsics.h(sequence, "<this>");
        Intrinsics.h(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    public static FilteringSequence h(Sequence sequence, Function1 function1) {
        Intrinsics.h(sequence, "<this>");
        return new FilteringSequence(sequence, false, function1);
    }

    public static Object i(Sequence sequence) {
        Iterator it = sequence.getF24664a();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static FlatteningSequence j(Sequence sequence, Function1 function1) {
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$2.d);
    }

    public static FlatteningSequence k(Sequence sequence, Function1 function1) {
        Intrinsics.h(sequence, "<this>");
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$1.d);
    }

    public static Sequence l(coil3.gif.a aVar, Function1 function1) {
        return new GeneratorSequence(aVar, function1);
    }

    public static Sequence m(Object obj, Function1 function1) {
        return obj == null ? EmptySequence.f24658a : new GeneratorSequence(new d(obj, 12), function1);
    }

    public static Sequence n(Function0 function0) {
        return new ConstrainedOnceSequence(new GeneratorSequence(function0, new au.com.woolworths.feature.shared.instore.wifi.ui.d(function0, 7)));
    }

    public static Iterator o(Function2 function2) {
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.d(IntrinsicsKt.a(sequenceBuilderIterator, sequenceBuilderIterator, function2));
        return sequenceBuilderIterator;
    }

    public static String p(Sequence sequence, String str, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.h(sequence, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            StringsKt.l(sb, obj, function1);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object q(Sequence sequence) {
        Iterator it = sequence.getF24664a();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static TransformingSequence r(Sequence sequence, Function1 transform) {
        Intrinsics.h(sequence, "<this>");
        Intrinsics.h(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    public static FilteringSequence s(Sequence sequence, Function1 function1) {
        return h(new TransformingSequence(sequence, function1), new com.woolworths.scanlibrary.domain.productsearch.a(26));
    }

    public static FlatteningSequence t(FlatteningSequence flatteningSequence, Iterable iterable) {
        return SequencesKt__SequencesKt.a(ArraysKt.g(new Sequence[]{flatteningSequence, CollectionsKt.n(iterable)}));
    }

    public static FlatteningSequence u(Sequence sequence, final Object obj) {
        return SequencesKt__SequencesKt.a(ArraysKt.g(new Sequence[]{sequence, new Sequence<Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public final Iterator getF24664a() {
                return new SequencesKt__SequencesKt$sequenceOf$1$1(obj);
            }
        }}));
    }

    public static FlatteningSequence v(Sequence sequence, Sequence sequence2) {
        return SequencesKt__SequencesKt.a(ArraysKt.g(new Sequence[]{sequence, sequence2}));
    }

    public static Sequence w(Sequence sequence, int i) {
        if (i >= 0) {
            return i == 0 ? EmptySequence.f24658a : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).b(i) : new TakeSequence(sequence, i);
        }
        throw new IllegalArgumentException(a.e(i, "Requested element count ", " is less than zero.").toString());
    }

    public static List x(Sequence sequence) {
        Intrinsics.h(sequence, "<this>");
        Iterator it = sequence.getF24664a();
        if (!it.hasNext()) {
            return EmptyList.d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.Q(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList y(TransformingSequence transformingSequence) {
        Intrinsics.h(transformingSequence, "<this>");
        ArrayList arrayList = new ArrayList();
        TransformingSequence.AnonymousClass1 anonymousClass1 = new TransformingSequence.AnonymousClass1();
        while (anonymousClass1.d.hasNext()) {
            arrayList.add(anonymousClass1.next());
        }
        return arrayList;
    }
}
