package kotlin.reflect.jvm.internal.impl.load.java.components;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JavaAnnotationTargetMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24417a = MapsKt.j(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.u, KotlinTarget.G)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.v)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.w)), new Pair("FIELD", EnumSet.of(KotlinTarget.y)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.z)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.A)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.B)), new Pair("METHOD", EnumSet.of(KotlinTarget.C, KotlinTarget.D, KotlinTarget.E)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.F)));
    public static final Object b = MapsKt.j(new Pair("RUNTIME", KotlinRetention.d), new Pair("CLASS", KotlinRetention.e), new Pair("SOURCE", KotlinRetention.f));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static ArrayValue a(List arguments) {
        Intrinsics.h(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f24417a.get(((JavaEnumValueAnnotationArgument) it.next()).d().b());
            if (iterable == null) {
                iterable = EmptySet.d;
            }
            CollectionsKt.h(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new EnumValue(ClassId.Companion.b(StandardNames.FqNames.u), Name.e(((KotlinTarget) it2.next()).name())));
        }
        return new ArrayValue(arrayList3, JavaAnnotationTargetMapper$$Lambda$0.d);
    }
}
