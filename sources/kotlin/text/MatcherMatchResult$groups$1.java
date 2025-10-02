package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.TransformingSequence;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {
    public final /* synthetic */ MatcherMatchResult d;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.d = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getF() {
        return this.d.f24679a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    public final MatchGroup d(int i) {
        Matcher matcher = this.d.f24679a;
        IntRange intRangeO = RangesKt.o(matcher.start(i), matcher.end(i));
        if (intRangeO.d < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        Intrinsics.g(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeO);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new TransformingSequence.AnonymousClass1();
    }
}
