package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class MemberScope$Companion$$Lambda$0 implements Function1 {
    public static final MemberScope$Companion$$Lambda$0 d = new MemberScope$Companion$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Name it = (Name) obj;
        MemberScope.Companion companion = MemberScope.Companion.f24558a;
        Intrinsics.h(it, "it");
        return Boolean.TRUE;
    }
}
