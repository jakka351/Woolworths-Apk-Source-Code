package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
final class SubtypePathNode {

    /* renamed from: a, reason: collision with root package name */
    public final KotlinType f24630a;
    public final SubtypePathNode b;

    public SubtypePathNode(KotlinType type, SubtypePathNode subtypePathNode) {
        Intrinsics.h(type, "type");
        this.f24630a = type;
        this.b = subtypePathNode;
    }
}
