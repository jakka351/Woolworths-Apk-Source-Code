package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import android.util.Log;
import com.otaliastudios.opengl.core.Egloo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation;", "", "Companion", "Type", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class GlProgramLocation {

    /* renamed from: a, reason: collision with root package name */
    public final int f16805a;
    public final int b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation$Companion;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation$Type;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;

        static {
            Type type = new Type("ATTRIB", 0);
            d = type;
            Type type2 = new Type("UNIFORM", 1);
            e = type2;
            f = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Type.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    public GlProgramLocation(int i, Type type, String str) {
        int iGlGetAttribLocation;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iGlGetAttribLocation = GLES20.glGetUniformLocation(i, str);
        }
        this.f16805a = iGlGetAttribLocation;
        float[] fArr = Egloo.f16798a;
        if (iGlGetAttribLocation >= 0) {
            this.b = iGlGetAttribLocation;
            return;
        }
        String str2 = "Unable to locate " + str + " in program";
        Log.e("Egloo", str2);
        throw new RuntimeException(str2);
    }
}
