package me.oriient.internal.services.uploadingManager.models;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f25641a;
    public final File b;
    public final DataUploaderItem c;
    public byte[] d;
    public int e;
    public Long f;
    public long g;
    public long h;

    public a(String id, String sessionId, int i, File fileHandle, DataUploaderItem item, byte[] currentChunk, long j) {
        Intrinsics.h(id, "id");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(fileHandle, "fileHandle");
        Intrinsics.h(item, "item");
        Intrinsics.h(currentChunk, "currentChunk");
        this.f25641a = i;
        this.b = fileHandle;
        this.c = item;
        this.d = currentChunk;
        this.e = 0;
        this.f = null;
        this.g = j;
    }

    public final void a() throws IOException {
        if (this.d.length == 0) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.b, true);
        try {
            fileOutputStream.write(this.d);
            fileOutputStream.close();
            this.d = new byte[0];
            this.e = 0;
        } finally {
        }
    }
}
