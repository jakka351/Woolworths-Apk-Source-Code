package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {
    public final NotNullLazyValue b;

    public LazyScopeAdapter(StorageManager storageManager, final Function0 function0) {
        Intrinsics.h(storageManager, "storageManager");
        this.b = storageManager.d(new Function0(function0) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$$Lambda$0
            public final Function0 d;

            {
                this.d = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MemberScope memberScope = (MemberScope) this.d.invoke();
                return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).h() : memberScope;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public final MemberScope i() {
        return (MemberScope) this.b.invoke();
    }
}
