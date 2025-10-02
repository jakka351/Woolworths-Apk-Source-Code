package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes7.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReferenceImpl implements Function1<KotlinTypeMarker, UnwrappedType> {
    public KotlinTypePreparator$prepareType$1(KotlinTypePreparator kotlinTypePreparator) {
        super(1, kotlinTypePreparator, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinTypeMarker p0 = (KotlinTypeMarker) obj;
        Intrinsics.h(p0, "p0");
        return ((KotlinTypePreparator) this.receiver).a(p0);
    }
}
