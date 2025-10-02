package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AnnotationConstructorCaller implements Caller {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24297a;
    public final ArrayList b;
    public final CallMode c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallMode {
        public static final CallMode d;
        public static final CallMode e;
        public static final /* synthetic */ CallMode[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            CallMode callMode = new CallMode("CALL_BY_NAME", 0);
            d = callMode;
            CallMode callMode2 = new CallMode("POSITIONAL_CALL", 1);
            e = callMode2;
            CallMode[] callModeArr = {callMode, callMode2};
            f = callModeArr;
            g = EnumEntriesKt.a(callModeArr);
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Origin {
        public static final Origin d;
        public static final Origin e;
        public static final /* synthetic */ Origin[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            Origin origin = new Origin("JAVA", 0);
            d = origin;
            Origin origin2 = new Origin("KOTLIN", 1);
            e = origin2;
            Origin[] originArr = {origin, origin2};
            f = originArr;
            g = EnumEntriesKt.a(originArr);
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) f.clone();
        }
    }

    public AnnotationConstructorCaller(Class jClass, ArrayList arrayList, CallMode callMode, Origin origin, List methods) {
        Intrinsics.h(jClass, "jClass");
        Intrinsics.h(methods, "methods");
        this.f24297a = jClass;
        this.b = arrayList;
        this.c = callMode;
        this.d = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.e(returnType);
            List list3 = ReflectClassUtilKt.f24377a;
            Class<?> cls = (Class) ReflectClassUtilKt.c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list4 = this.d;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == CallMode.e && origin == Origin.d && !CollectionsKt.X(this.b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Member getF24299a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final boolean b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: c */
    public final List getD() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getReturnType */
    public final Type getB() {
        return this.f24297a;
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode) {
        Origin origin = Origin.e;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, callMode, origin, arrayList2);
    }
}
