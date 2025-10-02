package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.parser.DropShadowEffect;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Layer {

    /* renamed from: a, reason: collision with root package name */
    public final List f13426a;
    public final LottieComposition b;
    public final String c;
    public final long d;
    public final LayerType e;
    public final long f;
    public final String g;
    public final List h;
    public final AnimatableTransform i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final AnimatableTextFrame q;
    public final AnimatableTextProperties r;
    public final AnimatableFloatValue s;
    public final List t;
    public final MatteType u;
    public final boolean v;
    public final BlurEffect w;
    public final DropShadowEffect x;
    public final LBlendMode y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {
        public static final LayerType d;
        public static final LayerType e;
        public static final LayerType f;
        public static final /* synthetic */ LayerType[] g;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            d = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            LayerType layerType3 = new LayerType("IMAGE", 2);
            e = layerType3;
            LayerType layerType4 = new LayerType("NULL", 3);
            LayerType layerType5 = new LayerType("SHAPE", 4);
            LayerType layerType6 = new LayerType("TEXT", 5);
            LayerType layerType7 = new LayerType("UNKNOWN", 6);
            f = layerType7;
            g = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {
        public static final MatteType d;
        public static final MatteType e;
        public static final /* synthetic */ MatteType[] f;

        static {
            MatteType matteType = new MatteType("NONE", 0);
            d = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            MatteType matteType3 = new MatteType("INVERT", 2);
            e = matteType3;
            f = new MatteType[]{matteType, matteType2, matteType3, new MatteType("LUMA", 3), new MatteType("LUMA_INVERTED", 4), new MatteType("UNKNOWN", 5)};
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) f.clone();
        }
    }

    public Layer(List list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, String str2, List list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, float f3, float f4, AnimatableTextFrame animatableTextFrame, AnimatableTextProperties animatableTextProperties, List list3, MatteType matteType, AnimatableFloatValue animatableFloatValue, boolean z, BlurEffect blurEffect, DropShadowEffect dropShadowEffect, LBlendMode lBlendMode) {
        this.f13426a = list;
        this.b = lottieComposition;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = animatableTransform;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = animatableTextFrame;
        this.r = animatableTextProperties;
        this.t = list3;
        this.u = matteType;
        this.s = animatableFloatValue;
        this.v = z;
        this.w = blurEffect;
        this.x = dropShadowEffect;
        this.y = lBlendMode;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbS = YU.a.s(str);
        sbS.append(this.c);
        sbS.append("\n");
        long j = this.f;
        LottieComposition lottieComposition = this.b;
        Layer layer = (Layer) lottieComposition.i.c(j);
        if (layer != null) {
            sbS.append("\t\tParents: ");
            sbS.append(layer.c);
            for (Layer layer2 = (Layer) lottieComposition.i.c(layer.f); layer2 != null; layer2 = (Layer) lottieComposition.i.c(layer2.f)) {
                sbS.append("->");
                sbS.append(layer2.c);
            }
            sbS.append(str);
            sbS.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbS.append(str);
            sbS.append("\tMasks: ");
            sbS.append(list.size());
            sbS.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbS.append(str);
            sbS.append("\tBackground: ");
            sbS.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.f13426a;
        if (!list2.isEmpty()) {
            sbS.append(str);
            sbS.append("\tShapes:\n");
            for (Object obj : list2) {
                sbS.append(str);
                sbS.append("\t\t");
                sbS.append(obj);
                sbS.append("\n");
            }
        }
        return sbS.toString();
    }

    public final String toString() {
        return a("");
    }
}
