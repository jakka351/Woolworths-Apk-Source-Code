package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {
    public static final /* synthetic */ KProperty[] i = {Reflection.f24268a.h(new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};
    public Function0 g;
    public final NotNullLazyValue h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final /* synthetic */ Kind[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            Kind[] kindArr = {new Kind("FROM_DEPENDENCIES", 0), new Kind("FROM_CLASS_LOADER", 1), new Kind("FALLBACK", 2)};
            d = kindArr;
            e = EnumEntriesKt.a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) d.clone();
        }
    }

    /* loaded from: classes7.dex */
    public static final class Settings {

        /* renamed from: a, reason: collision with root package name */
        public final ModuleDescriptorImpl f24324a;

        public Settings(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f24324a = moduleDescriptorImpl;
        }

        public final ModuleDescriptor a() {
            return this.f24324a;
        }
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Kind[] kindArr = Kind.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Kind[] kindArr2 = Kind.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final LockBasedStorageManager lockBasedStorageManager) {
        super(lockBasedStorageManager);
        Kind[] kindArr = Kind.d;
        this.h = lockBasedStorageManager.d(new Function0(this, lockBasedStorageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$0
            public final JvmBuiltIns d;
            public final LockBasedStorageManager e;

            {
                this.d = this;
                this.e = lockBasedStorageManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JvmBuiltIns.i;
                final JvmBuiltIns jvmBuiltIns = this.d;
                ModuleDescriptorImpl moduleDescriptorImplL = jvmBuiltIns.l();
                Intrinsics.g(moduleDescriptorImplL, "getBuiltInsModule(...)");
                return new JvmBuiltInsCustomizer(moduleDescriptorImplL, this.e, new Function0(jvmBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$2
                    public final JvmBuiltIns d;

                    {
                        this.d = jvmBuiltIns;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        JvmBuiltIns jvmBuiltIns2 = this.d;
                        Function0 function0 = jvmBuiltIns2.g;
                        if (function0 == null) {
                            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                        }
                        JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
                        jvmBuiltIns2.g = null;
                        return settings;
                    }
                });
            }
        });
    }

    public final JvmBuiltInsCustomizer M() {
        return (JvmBuiltInsCustomizer) StorageKt.a(this.h, i[0]);
    }

    public final void N(final ModuleDescriptorImpl moduleDescriptorImpl) {
        this.g = new Function0(moduleDescriptorImpl) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$1
            public final ModuleDescriptorImpl d;

            {
                this.d = moduleDescriptorImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JvmBuiltIns.i;
                return new JvmBuiltIns.Settings(this.d);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final AdditionalClassPartsProvider d() {
        return M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final Iterable m() {
        Iterable iterableM = super.m();
        ModuleDescriptorImpl moduleDescriptorImplL = l();
        Intrinsics.g(moduleDescriptorImplL, "getBuiltInsModule(...)");
        return CollectionsKt.b0(iterableM, new JvmBuiltInClassDescriptorFactory(this.e, moduleDescriptorImplL));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter q() {
        return M();
    }
}
