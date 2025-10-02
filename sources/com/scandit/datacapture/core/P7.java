package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f18359a;
    private final ArrayList b;
    private final ArrayList c;
    private NativeCopiedCameraTexture d;
    private NativeCopiedCameraTexture e;

    public P7(Function0 textureProducer) {
        Intrinsics.h(textureProducer, "textureProducer");
        this.f18359a = textureProducer;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(NativeCopiedCameraTexture texture) {
        Intrinsics.h(texture, "texture");
        if (texture.equals(this.d)) {
            return;
        }
        NativeCopiedCameraTexture nativeCopiedCameraTexture = this.d;
        this.d = texture;
        if (nativeCopiedCameraTexture == null || nativeCopiedCameraTexture.equals(this.e) || nativeCopiedCameraTexture.equals(this.d)) {
            return;
        }
        this.b.add(nativeCopiedCameraTexture);
    }

    public final void b(NativeCopiedCameraTexture texture) {
        Intrinsics.h(texture, "texture");
        if (texture.equals(this.e)) {
            return;
        }
        NativeCopiedCameraTexture nativeCopiedCameraTexture = this.e;
        this.e = texture;
        if (nativeCopiedCameraTexture == null || nativeCopiedCameraTexture.equals(texture) || nativeCopiedCameraTexture.equals(this.d)) {
            return;
        }
        this.b.add(nativeCopiedCameraTexture);
    }

    public final NativeCopiedCameraTexture c() {
        return this.d;
    }

    public final NativeCopiedCameraTexture d() {
        return this.e;
    }

    public final NativeCopiedCameraTexture e() {
        ArrayList arrayList = this.b;
        Intrinsics.h(arrayList, "<this>");
        NativeCopiedCameraTexture nativeCopiedCameraTexture = (NativeCopiedCameraTexture) (arrayList.isEmpty() ? null : arrayList.remove(CollectionsKt.I(arrayList)));
        if (nativeCopiedCameraTexture != null) {
            return nativeCopiedCameraTexture;
        }
        NativeCopiedCameraTexture nativeCopiedCameraTexture2 = (NativeCopiedCameraTexture) this.f18359a.invoke();
        this.c.add(nativeCopiedCameraTexture2);
        return nativeCopiedCameraTexture2;
    }

    public /* synthetic */ P7() {
        this(O7.f18353a);
    }

    public final boolean b() {
        return this.e != null;
    }

    public final void a() {
        this.b.clear();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((NativeCopiedCameraTexture) it.next()).releaseGlResources();
        }
        this.c.clear();
        this.d = null;
        this.e = null;
    }
}
