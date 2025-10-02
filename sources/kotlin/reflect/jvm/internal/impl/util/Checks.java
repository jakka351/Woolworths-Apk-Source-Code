package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class Checks {

    /* renamed from: a, reason: collision with root package name */
    public final Name f24640a;
    public final Regex b;
    public final Collection c;
    public final Function1 d;
    public final Check[] e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2, reason: invalid class name */
    final class AnonymousClass2 implements Function1 {
        public static final AnonymousClass2 d = new AnonymousClass2();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.h((FunctionDescriptor) obj, "<this>");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3, reason: invalid class name */
    final class AnonymousClass3 implements Function1 {
        public static final AnonymousClass3 d = new AnonymousClass3();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.h((FunctionDescriptor) obj, "<this>");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4, reason: invalid class name */
    final class AnonymousClass4 implements Function1 {
        public static final AnonymousClass4 d = new AnonymousClass4();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.h((FunctionDescriptor) obj, "<this>");
            return null;
        }
    }

    public Checks(Name name, Regex regex, Collection collection, Function1 function1, Check... checkArr) {
        this.f24640a = name;
        this.b = regex;
        this.c = collection;
        this.d = function1;
        this.e = checkArr;
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr) {
        this(name, checkArr, AnonymousClass2.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checkArr, Function1 function1) {
        this(name, null, null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.h(name, "name");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr) {
        this(collection, checkArr, AnonymousClass4.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection nameList, Check[] checkArr, Function1 function1) {
        this(null, null, nameList, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.h(nameList, "nameList");
    }
}
