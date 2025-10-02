package com.otaliastudios.opengl.texture;

import android.opengl.GLES20;
import com.otaliastudios.opengl.core.Egloo;
import com.otaliastudios.opengl.core.GlBindable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/texture/GlTexture;", "Lcom/otaliastudios/opengl/core/GlBindable;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class GlTexture implements GlBindable {

    /* renamed from: a, reason: collision with root package name */
    public final int f16807a;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.otaliastudios.opengl.texture.GlTexture$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            GLES20.glTexParameterf(36197, 10241, 9728.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            Egloo.a("glTexParameter");
            return Unit.f24250a;
        }
    }

    public GlTexture() {
        int[] iArr = {iArr[0]};
        GLES20.glGenTextures(1, iArr, 0);
        int[] iArr2 = {iArr[0]};
        Egloo.a("glGenTextures");
        this.f16807a = iArr2[0];
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0);
        a();
        anonymousClass1.invoke();
        b();
    }

    public final void a() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f16807a);
        Egloo.a("bind");
    }

    public final void b() {
        GLES20.glBindTexture(36197, 0);
        GLES20.glActiveTexture(33984);
        Egloo.a("unbind");
    }
}
