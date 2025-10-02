package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PredefinedEnhancementInfoKt {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaTypeQualifiers f24448a = new JavaTypeQualifiers(NullabilityQualifier.e, false);
    public static final JavaTypeQualifiers b;
    public static final JavaTypeQualifiers c;
    public static final LinkedHashMap d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f;
        b = new JavaTypeQualifiers(nullabilityQualifier, false);
        c = new JavaTypeQualifiers(nullabilityQualifier, true);
        final String strConcat = "java/lang/".concat("Object");
        final String strConcat2 = "java/util/function/".concat("Predicate");
        final String strConcat3 = "java/util/function/".concat("Function");
        final String strConcat4 = "java/util/function/".concat("Consumer");
        final String strConcat5 = "java/util/function/".concat("BiFunction");
        final String strConcat6 = "java/util/function/".concat("BiConsumer");
        final String strConcat7 = "java/util/function/".concat("UnaryOperator");
        final String strConcat8 = "java/util/".concat("stream/Stream");
        final String strConcat9 = "java/util/".concat("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Iterator")).a("forEachRemaining", null, new Function1(strConcat4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$0
            public final String d;

            {
                this.d = strConcat4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.a(this.d, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/lang/".concat("Iterable")).a("spliterator", null, new PredefinedEnhancementInfoKt$$Lambda$1());
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Collection"));
        classEnhancementBuilder.a("removeIf", null, new Function1(strConcat2) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$2
            public final String d;

            {
                this.d = strConcat2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.a(this.d, javaTypeQualifiers2, javaTypeQualifiers2);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder.a("stream", null, new Function1(strConcat8) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$3
            public final String d;

            {
                this.d = strConcat8;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.b(this.d, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder.a("parallelStream", null, new Function1(strConcat8) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$4
            public final String d;

            {
                this.d = strConcat8;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.b(this.d, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("List"));
        classEnhancementBuilder2.a("replaceAll", null, new Function1(strConcat7) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$5
            public final String d;

            {
                this.d = strConcat7;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.a(this.d, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder2.a("addFirst", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$6
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder2.a("addLast", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$7
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder2.a("removeFirst", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$8
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder2.a("removeLast", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$9
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("LinkedList"));
        classEnhancementBuilder3.a("addFirst", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$10
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder3.a("addLast", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$11
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder3.a("removeFirst", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$12
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder3.a("removeLast", "2.1", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$13
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("LinkedHashSet"));
        classEnhancementBuilder4.a("addFirst", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$14
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder4.a("addLast", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$15
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder4.a("removeFirst", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$16
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder4.a("removeLast", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$17
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder4.a("getFirst", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$18
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder4.a("getLast", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$19
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("Map"));
        classEnhancementBuilder5.a("forEach", null, new Function1(strConcat6) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$20
            public final String d;

            {
                this.d = strConcat6;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.a(this.d, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("putIfAbsent", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$21
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.b(str, PredefinedEnhancementInfoKt.f24448a);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("replace", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$22
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.b(str, PredefinedEnhancementInfoKt.f24448a);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("replace", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$23
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("replaceAll", null, new Function1(strConcat5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$24
            public final String d;

            {
                this.d = strConcat5;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                function.a(this.d, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("compute", null, new Function1(strConcat, strConcat5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$25
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat5;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.f24448a;
                function.a(this.e, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3);
                function.b(str, javaTypeQualifiers3);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("computeIfAbsent", null, new Function1(strConcat, strConcat3) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$26
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(this.e, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers2);
                function.b(str, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("computeIfPresent", null, new Function1(strConcat, strConcat5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$27
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat5;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.c;
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f24448a;
                function.a(this.e, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers4);
                function.b(str, javaTypeQualifiers4);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder5.a("merge", null, new Function1(strConcat, strConcat5) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$28
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat5;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                JavaTypeQualifiers javaTypeQualifiers3 = PredefinedEnhancementInfoKt.c;
                function.a(str, javaTypeQualifiers3);
                JavaTypeQualifiers javaTypeQualifiers4 = PredefinedEnhancementInfoKt.f24448a;
                function.a(this.e, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers3, javaTypeQualifiers4);
                function.b(str, javaTypeQualifiers4);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/".concat("LinkedHashMap"));
        classEnhancementBuilder6.a("putFirst", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$29
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.b(str, PredefinedEnhancementInfoKt.f24448a);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder6.a("putLast", "2.2", new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$30
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.b(str, PredefinedEnhancementInfoKt.f24448a);
                return Unit.f24250a;
            }
        });
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat9);
        classEnhancementBuilder7.a("empty", null, new Function1(strConcat9) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$31
            public final String d;

            {
                this.d = strConcat9;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder7.a("of", null, new Function1(strConcat, strConcat9) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$32
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat9;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.c;
                function.a(this.d, javaTypeQualifiers2);
                function.b(this.e, PredefinedEnhancementInfoKt.b, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder7.a("ofNullable", null, new Function1(strConcat, strConcat9) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$33
            public final String d;
            public final String e;

            {
                this.d = strConcat;
                this.e = strConcat9;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.f24448a);
                function.b(this.e, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder7.a("get", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$34
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.c);
                return Unit.f24250a;
            }
        });
        classEnhancementBuilder7.a("ifPresent", null, new Function1(strConcat4) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$35
            public final String d;

            {
                this.d = strConcat4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b, PredefinedEnhancementInfoKt.c);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/lang/".concat("ref/Reference")).a("get", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$36
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.f24448a);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat2).a("test", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$37
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/function/".concat("BiPredicate")).a("test", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$38
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.c(JvmPrimitiveType.BOOLEAN);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat4).a("accept", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$39
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.a(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat6).a("accept", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$40
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat3).a("apply", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$41
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.b(str, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strConcat5).a("apply", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$42
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                JavaTypeQualifiers javaTypeQualifiers2 = PredefinedEnhancementInfoKt.b;
                String str = this.d;
                function.a(str, javaTypeQualifiers2);
                function.a(str, javaTypeQualifiers2);
                function.b(str, javaTypeQualifiers2);
                return Unit.f24250a;
            }
        });
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, "java/util/function/".concat("Supplier")).a("get", null, new Function1(strConcat) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$Lambda$43
            public final String d;

            {
                this.d = strConcat;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function = (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj;
                JavaTypeQualifiers javaTypeQualifiers = PredefinedEnhancementInfoKt.f24448a;
                Intrinsics.h(function, "$this$function");
                function.b(this.d, PredefinedEnhancementInfoKt.b);
                return Unit.f24250a;
            }
        });
        d = signatureEnhancementBuilder.f24451a;
    }

    public static final LinkedHashMap a() {
        return d;
    }
}
