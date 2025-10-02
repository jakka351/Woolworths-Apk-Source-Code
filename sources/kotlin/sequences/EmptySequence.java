package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptySequence implements Sequence, DropTakeSequence {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptySequence f24658a = new EmptySequence();

    @Override // kotlin.sequences.DropTakeSequence
    public final /* bridge */ /* synthetic */ Sequence a(int i) {
        return f24658a;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final /* bridge */ /* synthetic */ Sequence b(int i) {
        return f24658a;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return EmptyIterator.d;
    }
}
