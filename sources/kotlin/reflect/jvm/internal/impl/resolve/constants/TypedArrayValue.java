package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public final class TypedArrayValue extends ArrayValue {
    public final KotlinType c;

    public TypedArrayValue(List list, final KotlinType kotlinType) {
        super(list, new Function1(kotlinType) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$$Lambda$0
            public final KotlinType d;

            {
                this.d = kotlinType;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor it = (ModuleDescriptor) obj;
                Intrinsics.h(it, "it");
                return this.d;
            }
        });
        this.c = kotlinType;
    }

    public final KotlinType c() {
        return this.c;
    }
}
