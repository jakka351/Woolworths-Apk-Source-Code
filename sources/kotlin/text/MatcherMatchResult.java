package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class MatcherMatchResult implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f24679a;
    public final CharSequence b;
    public final MatcherMatchResult$groups$1 c;
    public MatcherMatchResult$groupValues$1 d;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.h(input, "input");
        this.f24679a = matcher;
        this.b = input;
        this.c = new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult.Destructured a() {
        return MatchResult.DefaultImpls.a(this);
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: b, reason: from getter */
    public final MatcherMatchResult$groups$1 getC() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatcherMatchResult$groupValues$1] */
    @Override // kotlin.text.MatchResult
    public final List c() {
        if (this.d == null) {
            this.d = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection
                /* renamed from: b */
                public final int getF() {
                    return this.d.f24679a.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return super.contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final Object get(int i) {
                    String strGroup = this.d.f24679a.group(i);
                    return strGroup == null ? "" : strGroup;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return super.lastIndexOf((String) obj);
                    }
                    return -1;
                }
            };
        }
        MatcherMatchResult$groupValues$1 matcherMatchResult$groupValues$1 = this.d;
        Intrinsics.e(matcherMatchResult$groupValues$1);
        return matcherMatchResult$groupValues$1;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange d() {
        Matcher matcher = this.f24679a;
        return RangesKt.o(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f24679a.group();
        Intrinsics.g(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f24679a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.g(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new MatcherMatchResult(matcher2, charSequence);
        }
        return null;
    }
}
