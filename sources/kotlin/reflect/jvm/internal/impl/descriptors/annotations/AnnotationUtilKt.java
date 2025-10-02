package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
public final class AnnotationUtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Name f24349a = Name.e("message");
    public static final Name b = Name.e("replaceWith");
    public static final Name c = Name.e("level");
    public static final Name d = Name.e("expression");
    public static final Name e = Name.e("imports");

    public static final BuiltInAnnotationDescriptor a(final KotlinBuiltIns kotlinBuiltIns, String message, String replaceWith, String str) {
        Intrinsics.h(kotlinBuiltIns, "<this>");
        Intrinsics.h(message, "message");
        Intrinsics.h(replaceWith, "replaceWith");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.o, MapsKt.j(new Pair(d, new StringValue((Object) replaceWith)), new Pair(e, new ArrayValue(EmptyList.d, new Function1(kotlinBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$$Lambda$0
            public final KotlinBuiltIns d;

            {
                this.d = kotlinBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor module = (ModuleDescriptor) obj;
                Name name = AnnotationUtilKt.f24349a;
                Intrinsics.h(module, "module");
                KotlinBuiltIns kotlinBuiltInsP = module.p();
                Variance variance = Variance.f;
                return kotlinBuiltInsP.h(this.d.v());
            }
        }))));
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.m, MapsKt.j(new Pair(f24349a, new StringValue((Object) message)), new Pair(b, new AnnotationValue((Object) builtInAnnotationDescriptor)), new Pair(c, new EnumValue(ClassId.Companion.b(StandardNames.FqNames.n), Name.e(str)))));
    }
}
