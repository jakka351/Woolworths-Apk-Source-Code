package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes.dex */
public final class LazyWrappedType extends WrappedType {
    public final StorageManager e;
    public final Function0 f;
    public final NotNullLazyValue g;

    public LazyWrappedType(StorageManager storageManager, Function0 function0) {
        Intrinsics.h(storageManager, "storageManager");
        this.e = storageManager;
        this.f = function0;
        this.g = storageManager.d(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: L0 */
    public final KotlinType O0(final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.e, new Function0(kotlinTypeRefiner, this) { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$$Lambda$0
            public final KotlinTypeRefiner d;
            public final LazyWrappedType e;

            {
                this.d = kotlinTypeRefiner;
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.d.a((KotlinTypeMarker) this.e.f.invoke());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final KotlinType N0() {
        return (KotlinType) this.g.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final boolean O0() {
        return this.g.j();
    }
}
