package kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Constructor", "BoundConstructor", "AccessorForHiddenConstructor", "AccessorForHiddenBoundConstructor", "Method", "FieldGetter", "FieldSetter", "Companion", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Member f24299a;
    public final Type b;
    public final Class c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AccessorForHiddenBoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenBoundConstructor(java.lang.reflect.Constructor constructor, Object obj) {
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.g(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ArraysKt.z(1, genericParameterTypes.length - 1, genericParameterTypes)));
            this.e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f24299a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.a(this.e);
            spreadBuilder.b(args);
            spreadBuilder.a(null);
            ArrayList arrayList = spreadBuilder.f24269a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class AccessorForHiddenConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f24299a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.b(args);
            spreadBuilder.a(null);
            ArrayList arrayList = spreadBuilder.f24269a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public BoundConstructor(java.lang.reflect.Constructor constructor, Object obj) {
            Class declaringClass = constructor.getDeclaringClass();
            Intrinsics.g(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes);
            this.e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) this.f24299a;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(this.e);
            spreadBuilder.b(args);
            ArrayList arrayList = spreadBuilder.f24269a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Constructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            return ((java.lang.reflect.Constructor) this.f24299a).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FieldGetter extends CallerImpl<Field> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundInstance extends FieldGetter implements BoundCaller {
            public final Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Object obj, Field field) {
                super(field, false);
                Intrinsics.h(field, "field");
                this.e = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                return ((Field) this.f24299a).get(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Instance extends FieldGetter {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldGetter {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void d(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                e(ArraysKt.H(args));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Static extends FieldGetter {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldGetter(Field field, boolean z) {
            Type genericType = field.getGenericType();
            Intrinsics.g(genericType, "getGenericType(...)");
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) {
            Intrinsics.h(args, "args");
            d(args);
            return ((Field) this.f24299a).get(this.c != null ? ArraysKt.G(args) : null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "Static", "Instance", "JvmStaticInObject", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class FieldSetter extends CallerImpl<Field> {
        public final boolean e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundInstance extends FieldSetter implements BoundCaller {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(Field field, boolean z, Object obj) {
                super(field, z, false);
                Intrinsics.h(field, "field");
                this.f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                Intrinsics.h(args, "args");
                d(args);
                ((Field) this.f24299a).set(this.f, ArraysKt.G(args));
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
                Intrinsics.h(args, "args");
                d(args);
                ((Field) this.f24299a).set(null, ArraysKt.V(args));
                return Unit.f24250a;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Instance extends FieldSetter {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldSetter {
            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            public final void d(Object[] args) {
                Intrinsics.h(args, "args");
                super.d(args);
                e(ArraysKt.H(args));
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Static extends FieldSetter {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldSetter(Field field, boolean z, boolean z2) {
            Class TYPE = Void.TYPE;
            Intrinsics.g(TYPE, "TYPE");
            super(field, TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
            this.e = z;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException {
            Intrinsics.h(args, "args");
            d(args);
            ((Field) this.f24299a).set(this.c != null ? ArraysKt.G(args) : null, ArraysKt.V(args));
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void d(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            if (this.e && ArraysKt.V(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    public CallerImpl(Member member, Type type, Class cls, Type[] typeArr) {
        List listL0;
        this.f24299a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(cls);
            spreadBuilder.b(typeArr);
            ArrayList arrayList = spreadBuilder.f24269a;
            listL0 = CollectionsKt.R(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listL0 = ArraysKt.l0(typeArr);
        }
        this.d = listL0;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: a, reason: from getter */
    public final Member getF24299a() {
        return this.f24299a;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final boolean b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public void d(Object[] objArr) {
        Caller.DefaultImpls.a(this, objArr);
    }

    public final void e(Object obj) {
        if (obj == null || !this.f24299a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: getReturnType, reason: from getter */
    public final Type getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "Static", "Instance", "JvmStaticInObject", "BoundStatic", "BoundStaticMultiFieldValueClass", "BoundInstance", "BoundJvmStaticInObject", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Method extends CallerImpl<java.lang.reflect.Method> {
        public final boolean e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundInstance extends Method implements BoundCaller {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(java.lang.reflect.Method method, Object obj) {
                super(4, method, false);
                Intrinsics.h(method, "method");
                this.f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                return f(args, this.f);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends Method implements BoundCaller {
            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                return f(args, null);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class BoundStatic extends Method implements BoundCaller {
            public final boolean f;
            public final Object g;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStatic(java.lang.reflect.Method method, boolean z, Object obj) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.z(1, genericParameterTypes.length, genericParameterTypes)));
                this.f = z;
                this.g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.a(this.g);
                spreadBuilder.b(args);
                ArrayList arrayList = spreadBuilder.f24269a;
                return f(arrayList.toArray(new Object[arrayList.size()]), null);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class BoundStaticMultiFieldValueClass extends Method implements BoundCaller {
            public final Object[] f;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStaticMultiFieldValueClass(java.lang.reflect.Method method, Object[] boundReceiverComponents) {
                Intrinsics.h(method, "method");
                Intrinsics.h(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.g(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) ArraysKt.A(boundReceiverComponents.length, genericParameterTypes).toArray(new Type[0]));
                this.f = boundReceiverComponents;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.b(this.f);
                spreadBuilder.b(args);
                ArrayList arrayList = spreadBuilder.f24269a;
                return f(arrayList.toArray(new Object[arrayList.size()]), null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Instance extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(java.lang.reflect.Method method) {
                super(6, method, false);
                Intrinsics.h(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                return f(args.length <= 1 ? new Object[0] : ArraysKt.z(1, args.length, args), args[0]);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class JvmStaticInObject extends Method {
            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                e(ArraysKt.H(args));
                return f(args.length <= 1 ? new Object[0] : ArraysKt.z(1, args.length, args), null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Static extends Method {
            @Override // kotlin.reflect.jvm.internal.calls.Caller
            public final Object call(Object[] args) {
                Intrinsics.h(args, "args");
                Caller.DefaultImpls.a(this, args);
                return f(args, null);
            }
        }

        public /* synthetic */ Method(int i, java.lang.reflect.Method method, boolean z) {
            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
        }

        public final Object f(Object[] args, Object obj) {
            Intrinsics.h(args, "args");
            return this.e ? Unit.f24250a : ((java.lang.reflect.Method) this.f24299a).invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Method(java.lang.reflect.Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.g(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
            this.e = genericReturnType.equals(Void.TYPE);
        }
    }
}
