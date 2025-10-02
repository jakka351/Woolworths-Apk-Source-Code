package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ShapeContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    public final String b;
    public final boolean c;
    public final LottieDrawable d;
    public final ShapeKeyframeAnimation e;
    public boolean f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f13367a = new Path();
    public final CompoundTrimPathContent g = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapePath shapePath) {
        this.b = shapePath.f13419a;
        this.c = shapePath.d;
        this.d = lottieDrawable;
        ShapeKeyframeAnimation shapeKeyframeAnimationG = shapePath.c.g();
        this.e = shapeKeyframeAnimationG;
        baseLayer.c(shapeKeyframeAnimationG);
        shapeKeyframeAnimationG.a(this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void b(LottieValueCallback lottieValueCallback, Object obj) {
        if (obj == LottieProperty.K) {
            this.e.j(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void e() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // com.airbnb.lottie.animation.content.Content
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L3c
            java.lang.Object r1 = r1.get(r0)
            com.airbnb.lottie.animation.content.Content r1 = (com.airbnb.lottie.animation.content.Content) r1
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.TrimPathContent
            if (r2 == 0) goto L29
            r2 = r1
            com.airbnb.lottie.animation.content.TrimPathContent r2 = (com.airbnb.lottie.animation.content.TrimPathContent) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = r2.c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r4 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.d
            if (r3 != r4) goto L29
            com.airbnb.lottie.animation.content.CompoundTrimPathContent r1 = r5.g
            java.util.ArrayList r1 = r1.f13355a
            r1.add(r2)
            r2.b(r5)
            goto L39
        L29:
            boolean r2 = r1 instanceof com.airbnb.lottie.animation.content.ShapeModifierContent
            if (r2 == 0) goto L39
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            com.airbnb.lottie.animation.content.ShapeModifierContent r1 = (com.airbnb.lottie.animation.content.ShapeModifierContent) r1
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation r6 = r5.e
            r6.m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.ShapeContent.f(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path getPath() {
        boolean z = this.f;
        ShapeKeyframeAnimation shapeKeyframeAnimation = this.e;
        Path path = this.f13367a;
        if (z && shapeKeyframeAnimation.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) shapeKeyframeAnimation.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f = true;
        return path;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void h(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i, arrayList, keyPath2, this);
    }
}
