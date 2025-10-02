package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes7.dex */
class AbstractTypeChecker$$Lambda$1 implements Function0 {
    public final TypeCheckerState d;
    public final TypeSystemContext e;
    public final RigidTypeMarker f;
    public final RigidTypeMarker g;

    public AbstractTypeChecker$$Lambda$1(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.d = typeCheckerState;
        this.e = typeSystemContext;
        this.f = rigidTypeMarker;
        this.g = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RigidTypeMarker rigidTypeMarker = this.g;
        return Boolean.valueOf(AbstractTypeChecker.h(this.d, this.e.S(this.f), rigidTypeMarker));
    }
}
