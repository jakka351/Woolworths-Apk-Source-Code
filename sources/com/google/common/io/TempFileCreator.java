package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.io.TempFileCreator;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
abstract class TempFileCreator {

    /* renamed from: a, reason: collision with root package name */
    public static final TempFileCreator f14926a;

    public static final class JavaIoCreator extends TempFileCreator {
        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return File.createTempFile("FileBackedOutputStream", null, null);
        }
    }

    @IgnoreJRERequirement
    public static final class JavaNioCreator extends TempFileCreator {
        public static final PermissionSupplier b;
        public static final PermissionSupplier c = null;

        @IgnoreJRERequirement
        public interface PermissionSupplier {
            FileAttribute get();
        }

        static {
            PermissionSupplier permissionSupplier;
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                b = new a(1);
                return;
            }
            if (!setSupportedFileAttributeViews.contains("acl")) {
                b = new a(2);
                return;
            }
            try {
                final ImmutableList immutableListW = ImmutableList.w(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(b())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public final String name() {
                        return "acl:acl";
                    }

                    @Override // java.nio.file.attribute.FileAttribute
                    public final ImmutableList<AclEntry> value() {
                        return immutableListW;
                    }
                };
                final int i = 0;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        int i2 = i;
                        Object obj = fileAttribute;
                        switch (i2) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            } catch (IOException e) {
                final int i2 = 1;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        int i22 = i2;
                        Object obj = e;
                        switch (i22) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            }
            b = permissionSupplier;
        }

        public static String b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            String property = System.getProperty("user.name");
            Objects.requireNonNull(property);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod("info", null);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), property);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return property;
            } catch (InvocationTargetException e) {
                Throwables.a(e.getCause());
                return property;
            }
        }

        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return java.nio.file.Files.createTempFile(Paths.get(System.getProperty("java.io.tmpdir"), new String[0]), "FileBackedOutputStream", null, b.get()).toFile();
        }
    }

    public static final class ThrowingCreator extends TempFileCreator {
        @Override // com.google.common.io.TempFileCreator
        public final File a() throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    static {
        TempFileCreator throwingCreator;
        try {
            try {
                throwingCreator = new JavaNioCreator();
            } catch (ClassNotFoundException unused) {
                throwingCreator = new ThrowingCreator();
            } catch (IllegalAccessException unused2) {
                throwingCreator = new ThrowingCreator();
            } catch (NoSuchFieldException unused3) {
                throwingCreator = new ThrowingCreator();
            }
        } catch (ClassNotFoundException unused4) {
            throwingCreator = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator() : new JavaIoCreator();
        }
        f14926a = throwingCreator;
    }

    public abstract File a();
}
