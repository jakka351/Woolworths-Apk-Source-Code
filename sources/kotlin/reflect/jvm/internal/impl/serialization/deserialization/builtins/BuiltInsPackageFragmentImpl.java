package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes7.dex */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {

    public static final class Companion {
        public static BuiltInsPackageFragmentImpl a(FqName fqName, LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module, InputStream inputStream) throws IOException {
            ProtoBuf.PackageFragment packageFragment;
            MessageLite messageLite;
            Intrinsics.h(fqName, "fqName");
            Intrinsics.h(module, "module");
            try {
                BuiltInsBinaryVersion builtInsBinaryVersion = BuiltInsBinaryVersion.f;
                BuiltInsBinaryVersion builtInsBinaryVersionA = BuiltInsBinaryVersion.Companion.a(inputStream);
                BuiltInsBinaryVersion ourVersion = BuiltInsBinaryVersion.f;
                int i = builtInsBinaryVersionA.c;
                Intrinsics.h(ourVersion, "ourVersion");
                int i2 = ourVersion.c;
                int i3 = ourVersion.b;
                int i4 = builtInsBinaryVersionA.b;
                if (i4 == 0) {
                    if (i3 == 0 && i == i2) {
                        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
                        BuiltInsProtoBuf.a(extensionRegistryLite);
                        AbstractParser abstractParser = (AbstractParser) ProtoBuf.PackageFragment.n;
                        abstractParser.getClass();
                        CodedInputStream codedInputStream = new CodedInputStream(inputStream);
                        messageLite = (MessageLite) abstractParser.b(codedInputStream, extensionRegistryLite);
                        try {
                            codedInputStream.a(0);
                            AbstractParser.c(messageLite);
                            packageFragment = (ProtoBuf.PackageFragment) messageLite;
                        } catch (InvalidProtocolBufferException e) {
                            e.d = messageLite;
                            throw e;
                        }
                    }
                    packageFragment = null;
                } else if (i4 != i3 || i > i2) {
                    packageFragment = null;
                } else {
                    ExtensionRegistryLite extensionRegistryLite2 = new ExtensionRegistryLite();
                    BuiltInsProtoBuf.a(extensionRegistryLite2);
                    AbstractParser abstractParser2 = (AbstractParser) ProtoBuf.PackageFragment.n;
                    abstractParser2.getClass();
                    CodedInputStream codedInputStream2 = new CodedInputStream(inputStream);
                    messageLite = (MessageLite) abstractParser2.b(codedInputStream2, extensionRegistryLite2);
                    codedInputStream2.a(0);
                    AbstractParser.c(messageLite);
                    packageFragment = (ProtoBuf.PackageFragment) messageLite;
                }
                ProtoBuf.PackageFragment packageFragment2 = packageFragment;
                inputStream.close();
                if (packageFragment2 != null) {
                    return new BuiltInsPackageFragmentImpl(fqName, lockBasedStorageManager, module, packageFragment2, builtInsBinaryVersionA);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + builtInsBinaryVersionA + ". Please update Kotlin");
            } finally {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "builtins package fragment for " + this.h + " from " + DescriptorUtilsKt.j(this);
    }
}
