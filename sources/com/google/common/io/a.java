package com.google.common.io;

import com.google.common.io.Closer;
import com.google.common.io.TempFileCreator;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Closer.Suppressor, TempFileCreator.JavaNioCreator.PermissionSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14928a;

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public FileAttribute get() throws IOException {
        switch (this.f14928a) {
            case 1:
                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier = TempFileCreator.JavaNioCreator.b;
                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
            default:
                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.b;
                throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
        }
    }
}
