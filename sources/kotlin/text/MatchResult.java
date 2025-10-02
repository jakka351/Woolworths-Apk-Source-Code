package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/MatchResult;", "", "Destructured", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MatchResult {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static Destructured a(MatchResult matchResult) {
            return new Destructured(matchResult);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchResult$Destructured;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Destructured {

        /* renamed from: a, reason: collision with root package name */
        public final MatchResult f24678a;

        public Destructured(MatchResult matchResult) {
            this.f24678a = matchResult;
        }

        /* renamed from: a, reason: from getter */
        public final MatchResult getF24678a() {
            return this.f24678a;
        }
    }

    Destructured a();

    /* renamed from: b */
    MatcherMatchResult$groups$1 getC();

    List c();

    IntRange d();

    String getValue();

    MatchResult next();
}
