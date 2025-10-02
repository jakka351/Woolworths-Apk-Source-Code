package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.parser.DropShadowEffect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class ShapeLayer extends BaseLayer {
    public final ContentGroup D;
    public final CompositionLayer E;

    public ShapeLayer(LottieDrawable lottieDrawable, Layer layer, CompositionLayer compositionLayer, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        this.E = compositionLayer;
        ContentGroup contentGroup = new ContentGroup(lottieDrawable, this, new ShapeGroup("__container", false, layer.f13426a), lottieComposition);
        this.D = contentGroup;
        List list = Collections.EMPTY_LIST;
        contentGroup.f(list, list);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.D.a(rectF, this.n, z);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.D.d(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final BlurEffect k() {
        BlurEffect blurEffect = this.p.w;
        return blurEffect != null ? blurEffect : this.E.p.w;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final DropShadowEffect l() {
        DropShadowEffect dropShadowEffect = this.p.x;
        return dropShadowEffect != null ? dropShadowEffect : this.E.p.x;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void p(KeyPath keyPath, int i, ArrayList arrayList, KeyPath keyPath2) {
        this.D.h(keyPath, i, arrayList, keyPath2);
    }
}
