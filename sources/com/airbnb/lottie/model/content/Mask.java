package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* loaded from: classes4.dex */
public class Mask {

    /* renamed from: a, reason: collision with root package name */
    public final MaskMode f13410a;
    public final AnimatableShapeValue b;
    public final AnimatableIntegerValue c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {
        public static final MaskMode d;
        public static final MaskMode e;
        public static final MaskMode f;
        public static final MaskMode g;
        public static final /* synthetic */ MaskMode[] h;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            d = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            e = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            f = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            g = maskMode4;
            h = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) h.clone();
        }
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.f13410a = maskMode;
        this.b = animatableShapeValue;
        this.c = animatableIntegerValue;
        this.d = z;
    }
}
