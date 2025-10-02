package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ShapeStroke implements ContentModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f13420a;
    public final AnimatableFloatValue b;
    public final ArrayList c;
    public final AnimatableColorValue d;
    public final AnimatableIntegerValue e;
    public final AnimatableFloatValue f;
    public final LineCapType g;
    public final LineJoinType h;
    public final float i;
    public final boolean j;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13421a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f13421a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13421a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13421a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {
        public static final LineCapType d;
        public static final /* synthetic */ LineCapType[] e;

        static {
            LineCapType lineCapType = new LineCapType("BUTT", 0);
            d = lineCapType;
            e = new LineCapType[]{lineCapType, new LineCapType("ROUND", 1), new LineCapType("UNKNOWN", 2)};
        }

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {
        public static final LineJoinType d;
        public static final /* synthetic */ LineJoinType[] e;

        static {
            LineJoinType lineJoinType = new LineJoinType("MITER", 0);
            d = lineJoinType;
            e = new LineJoinType[]{lineJoinType, new LineJoinType("ROUND", 1), new LineJoinType("BEVEL", 2)};
        }

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) e.clone();
        }
    }

    public ShapeStroke(String str, AnimatableFloatValue animatableFloatValue, ArrayList arrayList, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f13420a = str;
        this.b = animatableFloatValue;
        this.c = arrayList;
        this.d = animatableColorValue;
        this.e = animatableIntegerValue;
        this.f = animatableFloatValue2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}
