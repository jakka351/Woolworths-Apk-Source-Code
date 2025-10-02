package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public final class ClassicTypeCheckerStateKt {
    public static TypeCheckerState a(boolean z, SimpleClassicTypeSystemContext simpleClassicTypeSystemContext, KotlinTypePreparator kotlinTypePreparator, int i) {
        if ((i & 4) != 0) {
            simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f24629a;
        }
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext2 = simpleClassicTypeSystemContext;
        if ((i & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.f24624a;
        }
        return new TypeCheckerState(z, true, simpleClassicTypeSystemContext2, kotlinTypePreparator, KotlinTypeRefiner.Default.f24625a);
    }
}
