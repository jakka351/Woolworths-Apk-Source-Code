package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Pools.Pool f13814a;
    public final List b;
    public final String c;

    public LoadPath(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f13814a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[LOOP:0: B:3:0x000c->B:21:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[EDGE_INSN: B:34:0x0053->B:22:0x0053 BREAK  A[LOOP:0: B:3:0x000c->B:21:0x0050], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bumptech.glide.load.engine.Resource a(com.bumptech.glide.load.data.DataRewinder r14, com.bumptech.glide.load.Options r15, int r16, int r17, com.bumptech.glide.load.engine.DecodeJob.DecodeCallback r18, java.util.List r19) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r13 = this;
            r1 = r19
            java.util.List r2 = r13.b
            int r3 = r2.size()
            r0 = 0
            r4 = 0
            r5 = r4
            r4 = r0
        Lc:
            if (r5 >= r3) goto L53
            java.lang.Object r0 = r2.get(r5)
            r6 = r0
            com.bumptech.glide.load.engine.DecodePath r6 = (com.bumptech.glide.load.engine.DecodePath) r6
            androidx.core.util.Pools$Pool r12 = r6.d     // Catch: com.bumptech.glide.load.engine.GlideException -> L47
            java.lang.Object r0 = r12.a()     // Catch: com.bumptech.glide.load.engine.GlideException -> L47
            java.lang.String r7 = "Argument must not be null"
            com.bumptech.glide.util.Preconditions.c(r0, r7)     // Catch: com.bumptech.glide.load.engine.GlideException -> L47
            r11 = r0
            java.util.List r11 = (java.util.List) r11     // Catch: com.bumptech.glide.load.engine.GlideException -> L47
            r7 = r14
            r10 = r15
            r8 = r16
            r9 = r17
            com.bumptech.glide.load.engine.Resource r0 = r6.a(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3e
            r12.b(r11)     // Catch: com.bumptech.glide.load.engine.GlideException -> L47
            r7 = r18
            com.bumptech.glide.load.engine.Resource r0 = r7.a(r0)     // Catch: com.bumptech.glide.load.engine.GlideException -> L45
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder r6 = r6.c     // Catch: com.bumptech.glide.load.engine.GlideException -> L45
            com.bumptech.glide.load.engine.Resource r0 = r6.a(r0, r15)     // Catch: com.bumptech.glide.load.engine.GlideException -> L45
            r4 = r0
            goto L4d
        L3e:
            r0 = move-exception
            r7 = r18
            r12.b(r11)     // Catch: com.bumptech.glide.load.engine.GlideException -> L45
            throw r0     // Catch: com.bumptech.glide.load.engine.GlideException -> L45
        L45:
            r0 = move-exception
            goto L4a
        L47:
            r0 = move-exception
            r7 = r18
        L4a:
            r1.add(r0)
        L4d:
            if (r4 == 0) goto L50
            goto L53
        L50:
            int r5 = r5 + 1
            goto Lc
        L53:
            if (r4 == 0) goto L56
            return r4
        L56:
            com.bumptech.glide.load.engine.GlideException r14 = new com.bumptech.glide.load.engine.GlideException
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r1)
            java.lang.String r0 = r13.c
            r14.<init>(r0, r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.LoadPath.a(com.bumptech.glide.load.data.DataRewinder, com.bumptech.glide.load.Options, int, int, com.bumptech.glide.load.engine.DecodeJob$DecodeCallback, java.util.List):com.bumptech.glide.load.engine.Resource");
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
