package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

/* loaded from: classes.dex */
public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    public final BuiltInsPackageFragmentImpl d(FqName fqName) throws IOException {
        InputStream inputStreamA;
        Intrinsics.h(fqName, "fqName");
        if (fqName.c(StandardNames.k)) {
            BuiltInSerializerProtocol.m.getClass();
            inputStreamA = BuiltInsResourceLoader.a(BuiltInSerializerProtocol.a(fqName));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return BuiltInsPackageFragmentImpl.Companion.a(fqName, this.f24563a, this.b, inputStreamA);
        }
        return null;
    }
}
